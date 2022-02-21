package org.gravity.typegraph.sonarlint;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.NodeFinder;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.util.JavaASTUtil;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintFactory;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.sonarlint.eclipse.core.internal.SonarLintCorePlugin;
import org.sonarlint.eclipse.core.internal.TriggerType;
import org.sonarlint.eclipse.core.internal.jobs.AbstractAnalyzeProjectJob;
import org.sonarlint.eclipse.core.internal.jobs.AnalyzeProjectRequest;
import org.sonarlint.eclipse.core.internal.jobs.AnalyzeProjectRequest.FileWithDocument;
import org.sonarlint.eclipse.core.internal.jobs.SonarLintMarkerUpdater;
import org.sonarlint.eclipse.core.resource.ISonarLintProject;

@SuppressWarnings("restriction")
public class SonarLintProcessor {

	private SonarLintProcessor() {
		// This class should not be instantiated
	}

	public static boolean addSonarLintFindingsToPM(final IProject project, final IProgressMonitor monitor)
			throws CoreException, NoConverterRegisteredException {

		// Initialize SonarLint and run analysis job
		final var sonarProject = Adapters.adapt(project, ISonarLintProject.class);
		final Collection<FileWithDocument> files = sonarProject.files().stream()
				.map(file -> new FileWithDocument(file, null)).collect(Collectors.toList());
		final var req = new AnalyzeProjectRequest(sonarProject, files, TriggerType.MANUAL, true);
		final var job = AbstractAnalyzeProjectJob.create(req);
		job.schedule();

		// Create PM while SonarLint is running
		final var converter = GravityActivator.getDefault().getConverter(project);
		if (!converter.convertProject(monitor)) {
			return false;
		}
		final var pm = converter.getPG();

		// Wait for SonarLint to finish if not already finished
		try {
			job.join();
		} catch (final InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
			return false;
		}

		// Get SonarLint results
		final var resources = SonarLintMarkerUpdater.getResourcesWithMarkers(sonarProject);
		for (final IResource resource : resources) {
			final var markers = resource.findMarkers(SonarLintCorePlugin.MARKER_ON_THE_FLY_ID, false,
					IResource.DEPTH_ZERO);

			if (markers.length > 0) {
				final var parser = ASTParser.newParser(AST.JLS17);
				parser.setKind(ASTParser.K_COMPILATION_UNIT);
				final var icu = resource.getAdapter(IJavaElement.class);
				parser.setSource((ICompilationUnit)icu);
				final var ast = parser.createAST(null);

				for (final IMarker marker : markers) {
					final var base = getAnnotatedPMElement(marker, pm, ast);

					final var attributes = marker.getAttributes();
					final var annotation = SonarlintFactory.eINSTANCE.createSonarlintFinding();
					annotation.setRulekey((String) attributes.get("rulekey"));
					annotation.setRulename((String) attributes.get("rulename"));
					annotation.setDescription((String) attributes.get("message"));
					annotation.setCreationdate(Long.parseLong((String) attributes.get("creationdate")));
					annotation.setSeverity(Integer.toString((int) attributes.get("severity")));
					annotation.setKind((String) attributes.get("issuetype"));
					annotation.setMarker(marker);
					annotation.setTAnnotated(base);

				}
			}
		}

		try {
			pm.eResource().save(Collections.emptyMap());
		} catch (final IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private static TAnnotatable getAnnotatedPMElement(final IMarker marker, final TypeGraph pm, final ASTNode ast)
			throws CoreException {
		final var attributes2 = marker.getAttributes();
		final var start = (int) attributes2.get("charStart");
		final var end = (int) attributes2.get("charEnd");

		final var finder = new NodeFinder(ast, start, end - start);
		var node = finder.getCoveredNode();
		while (!(node instanceof BodyDeclaration) && !(node instanceof TypeDeclaration)) {
			node = node.getParent();
		}

		TAnnotatable base = pm;
		if (node instanceof MethodDeclaration) {
			base = JavaASTUtil.getTMethodDefinition((MethodDeclaration) node, pm);
		} else if (node instanceof FieldDeclaration) {
			base = JavaASTUtil.getTFieldDefinition((FieldDeclaration) node, pm);
		} else if (node instanceof TypeDeclaration) {
			base = JavaASTUtil.getType((TypeDeclaration) node, pm);
		}
		return base;
	}
}
