package org.gravity.typegraph.sonarlint;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.Initializer;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.NodeFinder;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.util.JavaASTUtil;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintFactory;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.sonarlint.eclipse.core.internal.SonarLintCorePlugin;
import org.sonarlint.eclipse.core.internal.TriggerType;
import org.sonarlint.eclipse.core.internal.jobs.AnalyzeProjectJob;
import org.sonarlint.eclipse.core.internal.jobs.AnalyzeProjectRequest;
import org.sonarlint.eclipse.core.internal.jobs.AnalyzeProjectRequest.FileWithDocument;
import org.sonarlint.eclipse.core.internal.markers.MarkerUtils;
import org.sonarlint.eclipse.core.resource.ISonarLintProject;

@SuppressWarnings("restriction")
public class SonarLintProcessor {

	private SonarLintProcessor() {
		// This class should not be instantiated
	}

	public static List<SonarlintFinding> getFindings(final TypeGraph pm) {
		return getParallelStream(pm).filter(SonarlintFinding.class::isInstance).map(SonarlintFinding.class::cast)
				.toList();
	}

	public static List<SonarlintFinding> addSonarLintFindingsToPM(final IProject project,
			final IProgressMonitor monitor) throws CoreException, NoConverterRegisteredException, IOException {

		// Initialize SonarQube for IDE and run a full project analysis.
		final var sonarProject = Adapters.adapt(project, ISonarLintProject.class);
		if (sonarProject == null) {
			throw new CoreException(Status.error("Couldn't adapt project to a SonarQube for IDE project"));
		}
		final Collection<FileWithDocument> files = sonarProject.files().stream()
				.map(file -> new FileWithDocument(file, null)).toList();

		final var request = new AnalyzeProjectRequest(sonarProject, files, TriggerType.MANUAL, true);
		final var job = new AnalyzeProjectJob(request);
		job.schedule();

		// Create PM while SonarQube for IDE is running.
		final var converter = GravityActivator.getDefault().getConverter(project);
		if (!converter.convertProject(monitor)) {
			throw new CoreException(Status.error("Couldn't create program model"));
		}
		final var pm = converter.getPG();

		// Wait for the analysis to finish if it has not already completed.
		try {
			job.join();
		} catch (final InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new CoreException(Status.error(e.getMessage()));
		}
		final var result = job.getResult();
		if (result != null && !result.isOK()) {
			throw new CoreException(result);
		}

		final var findings = addResultsToPM(sonarProject, pm);

		pm.eResource().save(Collections.emptyMap());

		return findings;
	}

	/**
	 * Adds the SonarQube for IDE results to the program model.
	 *
	 * @param sonarProject The SonarQube for IDE project for which results are present
	 * @param pm           The corresponding program model
	 * @return the added findings
	 * @throws CoreException if markers cannot be read
	 */
	private static List<SonarlintFinding> addResultsToPM(final ISonarLintProject sonarProject, final TypeGraph pm)
			throws CoreException {
		final var markers = sonarProject.getResource().findMarkers(SonarLintCorePlugin.MARKER_REPORT_ID, true,
				IResource.DEPTH_INFINITE);

		deleteOldMarkers(pm);

		final Map<IResource, Collection<IMarker>> map = new HashMap<>();
		for (final IMarker marker : markers) {
			final var resource = marker.getResource();
			map.compute(resource, (k, v) -> v == null ? new LinkedList<>() : v).add(marker);
		}

		return map.entrySet().parallelStream().flatMap(entry -> {
			final var resource = entry.getKey();
			if (!"java".equals(resource.getFileExtension())) {
				return Stream.empty();
			}
			final var parser = ASTParser.newParser(AST.JLS17);
			parser.setKind(ASTParser.K_COMPILATION_UNIT);
			final var icu = resource.getAdapter(IJavaElement.class);
			if (!(icu instanceof ICompilationUnit compilationUnit)) {
				return Stream.empty();
			}
			parser.setSource(compilationUnit);
			final var ast = parser.createAST(null);

			return entry.getValue().stream().map(marker -> {
				try {
					final var base = getAnnotatedPMElement(marker, pm, ast);
					final var attributes = marker.getAttributes();
					final var annotation = SonarlintFactory.eINSTANCE.createSonarlintFinding();

					final var ruleKey = stringValue(attributes.get(MarkerUtils.SONAR_MARKER_RULE_KEY_ATTR));
					annotation.setRulekey(ruleKey);
					final var ruleName = stringValue(attributes.get("rulename"));
					annotation.setRulename(ruleName != null ? ruleName : ruleKey);
					annotation.setDescription(marker.getAttribute(IMarker.MESSAGE, ""));
					annotation.setCreationdate(getCreationDate(marker, attributes));
					annotation.setSeverity(getSeverity(attributes));
					annotation.setKind(getKind(attributes));
					annotation.setMarker(marker);
					annotation.setTAnnotated(base);
					annotation.setLine(marker.getAttribute(IMarker.LINE_NUMBER, -1));
					annotation.setStartChar(marker.getAttribute(IMarker.CHAR_START, -1));
					annotation.setEndChar(marker.getAttribute(IMarker.CHAR_END, -1));

					return annotation;
				} catch (final CoreException e) {
					e.printStackTrace();
					return null;
				}
			}).filter(Objects::nonNull);
		}).toList();
	}

	private static String getSeverity(final Map<String, Object> attributes) {
		// Standard Experience uses IssueSeverity; MQR mode uses the highest impact severity.
		var severity = attributes.get(MarkerUtils.SONAR_MARKER_ISSUE_SEVERITY_ATTR);
		if (severity == null) {
			severity = attributes.get(MarkerUtils.SONAR_MARKER_ISSUE_HIGHEST_IMPACT_ATTR);
		}
		if (severity == null) {
			severity = attributes.get(IMarker.PRIORITY);
		}
		return stringValue(severity);
	}

	private static String getKind(final Map<String, Object> attributes) {
		// Standard Experience exposes the issue type; MQR mode exposes the Clean Code attribute.
		var kind = attributes.get(MarkerUtils.SONAR_MARKER_ISSUE_TYPE_ATTR);
		if (kind == null) {
			kind = attributes.get(MarkerUtils.SONAR_MARKER_ISSUE_ATTRIBUTE_ATTR);
		}
		return stringValue(kind);
	}

	private static long getCreationDate(final IMarker marker, final Map<String, Object> attributes) throws CoreException {
		final var creationDate = attributes.get(MarkerUtils.SONAR_MARKER_CREATION_DATE_ATTR);
		if (creationDate instanceof final Number number) {
			return number.longValue();
		}
		if (creationDate instanceof final String string) {
			try {
				return Long.parseLong(string);
			} catch (final NumberFormatException ignored) {
				// Fall back to the Eclipse marker timestamp.
			}
		}
		return marker.getCreationTime();
	}

	private static String stringValue(final Object value) {
		return value == null ? null : value.toString();
	}

	private static void deleteOldMarkers(final TypeGraph pm) {
		final var oldFindings = getFindings(pm);
		EcoreUtil.deleteAll(oldFindings, false);
	}

	private static Stream<EObject> getParallelStream(final TypeGraph pm) {
		final Spliterator<EObject> it = Spliterators.spliteratorUnknownSize(pm.eAllContents(), Spliterator.IMMUTABLE);
		return StreamSupport.stream(it, true);
	}

	private static TAnnotatable getAnnotatedPMElement(final IMarker marker, final TypeGraph pm, final ASTNode ast)
			throws CoreException {
		final var start = marker.getAttribute(IMarker.CHAR_START, 0);
		final var end = marker.getAttribute(IMarker.CHAR_END, start);

		final var finder = new NodeFinder(ast, start, Math.max(0, end - start));
		var node = finder.getCoveredNode();
		if (node == null) {
			node = finder.getCoveringNode();
		}
		while (node != null && !(node instanceof BodyDeclaration) && !(node instanceof TypeDeclaration)
				&& !(node instanceof CompilationUnit)) {
			node = node.getParent();
		}

		TAnnotatable base = pm;
		if (node instanceof final MethodDeclaration method) {
			base = JavaASTUtil.getTMethodDefinition(method, pm);
		} else if (node instanceof final FieldDeclaration field) {
			base = JavaASTUtil.getTFieldDefinition(field, pm);
		} else if (node instanceof final AbstractTypeDeclaration type) {
			base = JavaASTUtil.getType(type, pm);
		} else if (node instanceof final CompilationUnit cu && !cu.types().isEmpty()
				&& cu.types().get(0) instanceof final TypeDeclaration type) {
			base = JavaASTUtil.getType(type, pm);
		} else if (node instanceof final EnumConstantDeclaration constant) {
			final var type = JavaASTUtil.getType((AbstractTypeDeclaration) constant.getParent(), pm);
			final var result = type.getSignature().stream().filter(TFieldSignature.class::isInstance).filter(
					s -> constant.getName().getFullyQualifiedName().equals(((TFieldSignature) s).getField().getTName()))
					.findAny();
			if (result.isPresent()) {
				base = result.get().getTDefinition(type);
			}
		} else if (node instanceof Initializer) {
			final var type = JavaASTUtil.getType((AbstractTypeDeclaration) node.getParent(), pm);
			base = type.getTDefinition(type.getTName() + ".initializer()");
		}
		return base;
	}
}
