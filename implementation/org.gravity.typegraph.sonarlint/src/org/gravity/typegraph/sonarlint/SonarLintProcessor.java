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
import org.sonarlint.eclipse.core.resource.ISonarLintProject;
import org.sonarsource.sonarlint.core.rpc.protocol.common.RuleType;

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

		// Initialize SonarLint and run analysis job
		final var sonarProject = Adapters.adapt(project, ISonarLintProject.class);
		final Collection<FileWithDocument> files = sonarProject.files().stream()
				.map(file -> new FileWithDocument(file, null)).toList();

		final var request = new AnalyzeProjectRequest(sonarProject, files, TriggerType.MANUAL, true);
		final var job = new AnalyzeProjectJob(request);
		job.schedule();

		// Create PM while SonarLint is running
		final var converter = GravityActivator.getDefault().getConverter(project);
		if (!converter.convertProject(monitor)) {
			throw new CoreException(Status.error("Couldn't create program model"));
		}
		final var pm = converter.getPG();

		// Wait for SonarLint to finish if not already finished
		try {
			job.join();
		} catch (final InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new CoreException(Status.error(e.getMessage()));
		}

		final var findings = addResultsToPM(sonarProject, pm);

		pm.eResource().save(Collections.emptyMap());

		return findings;
	}

	/**
	 * Adds the sonar lint results to the program model
	 *
	 * @param sonarProject The sonar lint project for which results are present
	 * @param pm           The corresponding program model
	 * @return the added findings
	 * @throws CoreException
	 */
	private static List<SonarlintFinding> addResultsToPM(final ISonarLintProject sonarProject, final TypeGraph pm)
			throws CoreException {
		// Get SonarLint results
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
			parser.setSource((ICompilationUnit) icu);
			final var ast = parser.createAST(null);

			return entry.getValue().stream().map(marker -> {
				try {
					final var base = getAnnotatedPMElement(marker, pm, ast);

					final var attributes = marker.getAttributes();
					final var annotation = SonarlintFactory.eINSTANCE.createSonarlintFinding();
					annotation.setRulekey((String) attributes.get("rulekey"));
					annotation.setRulename((String) attributes.get("rulename"));
					annotation.setDescription((String) attributes.get("message"));
					annotation.setCreationdate(marker.getCreationTime());
					annotation.setSeverity(Integer.toString((int) attributes.get("severity")));
					final var issuetype = attributes.get("issuetype");
					if (issuetype instanceof final String string) {
						annotation.setKind(string);
					} else if (issuetype instanceof final RuleType ruletype) {
						annotation.setKind(ruletype.toString());
					}
					annotation.setMarker(marker);
					annotation.setTAnnotated(base);
					annotation.setLine((int) attributes.get("lineNumber"));
					annotation.setStartChar((int) attributes.get("charStart"));
					annotation.setEndChar((int) attributes.get("charEnd"));

					return annotation;
				} catch (final CoreException e) {
					e.printStackTrace();
					return null;
				}
			}).filter(Objects::nonNull);
		}).toList();
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
		final var attributes2 = marker.getAttributes();
		final var start = (int) attributes2.get("charStart");
		final var end = (int) attributes2.get("charEnd");

		final var finder = new NodeFinder(ast, start, end - start);
		var node = finder.getCoveredNode();
		if (node == null) {
			node = finder.getCoveringNode();
		}
		while (!(node instanceof BodyDeclaration) && !(node instanceof TypeDeclaration)
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
		} else if (node instanceof final CompilationUnit cu) {
			base = JavaASTUtil.getType((TypeDeclaration) cu.types().get(0), pm);
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
