package org.tracesec.prioritization.ui.wizard;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.util.EMFUtil;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.sonarlint.SonarLintProcessor;
import org.tracesec.graph.dsl.graphConfiguration.Configuration;
import org.tracesec.graph.dsl.graphConfiguration.GraphConfigurationPackage;
import org.tracesec.prioritization.GraphBuilder;
import org.tracesec.prioritization.Priorizitation;
import org.tracesec.prioritization.prioritization.prioritization.Prioritization;
import org.tracesec.prioritization.prioritization.prioritization.PrioritizationFactory;
import org.tracesec.prioritization.tracegraph.Graph;
import org.tracesec.prioritization.tracegraph.Node;
import org.tracesec.prioritization.ui.view.IssuesView;
import org.tracesec.prioritization.ui.wizard.pages.ContinuePage;
import org.tracesec.prioritization.ui.wizard.pages.ModelSecectionPage;
import org.tracesec.qualitymodel.FindingLinker;
import org.tracesec.qualitymodel.Quality;
import org.tracesec.qualitymodel.QualityModel;

public class TraceSecWizard extends Wizard {

	private static final String FLOW_NETWORK = "tracesec-flowgraph.xmi";

	private static final Logger LOGGER = Logger.getLogger(TraceSecWizard.class);

	private final IProject project;

	private TypeGraph pm;
	private QualityModel qm;

	private Graph graph;

	private ModelSecectionPage selectionPage;

	public TraceSecWizard(final IProject project) throws CoreException, IOException {
		this.project = project;
		final var network = this.project.getFile(FLOW_NETWORK);
		if (network.exists()) {
			this.addPage(new ContinuePage(this));
			this.setForcePreviousAndNextButtons(true);
		} else {
			this.addSelectionPage();
		}
	}

	public ModelSecectionPage addSelectionPage() throws CoreException, IOException {
		this.selectionPage = new ModelSecectionPage(this.project);
		this.addPage(this.selectionPage);
		return this.selectionPage;
	}

	@Override
	public boolean performFinish() {
		try {
			if (this.selectionPage == null) {
				if (!this.loadFlowNetwork()) {
					return false;
				}
			} else if (!this.createFlowNetwork()) {
				return false;
			}

			final Collection<SonarlintFinding> findings = SonarLintProcessor.getFindings(this.pm);

			final var start = System.currentTimeMillis();
			final var result = new Priorizitation().prioritize(findings, this.qm.getRoot(), this.graph);
			final var stop = System.currentTimeMillis();
			System.out.println("Prioritization: " + (stop - start) + "ms");

			final var prioritization = this.createResults(result);

			IssuesView.getIssuesView().populate(prioritization, this.project);
			return true;

		} catch (CoreException | NoConverterRegisteredException | IOException e) {
			LOGGER.error(e);
		}
		return false;
	}

	/**
	 * Loads the flow network from the standard location
	 */
	private boolean loadFlowNetwork() {
		final var set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
				UMLResource.Factory.INSTANCE);
		final var resource = set.getResource(EMFUtil.getPlatformResourceURI(this.project.getFile(FLOW_NETWORK)), true);
		EcoreUtil.resolveAll(resource);
		this.graph = (Graph) resource.getContents().get(0);
		return this.graph.getNodes().parallelStream().map(Node::getRepresents).anyMatch(node -> {
			if (node instanceof final TypeGraph model) {
				this.pm = model;
			} else if (node instanceof final QualityModel model) {
				this.qm = model;
			} else if (node instanceof final Quality quality) {
				this.qm = (QualityModel) quality.eContainer();
			}
			return this.qm != null && this.pm != null;
		});
	}

	/**
	 * Creates a prioritization result representation
	 *
	 * @param result The prioritized issues
	 * @return An prioritization instance
	 * @throws IOException
	 */
	private Prioritization createResults(final SortedMap<Integer, List<SonarlintFinding>> result) throws IOException {
		final var prioritization = PrioritizationFactory.eINSTANCE.createPrioritization();
		for (final Entry<Integer, List<SonarlintFinding>> entry : result.entrySet()) {
			System.out.println("Priority: " + entry.getKey() + " -- " + entry.getValue().stream()
					.map(f -> f.getRulekey() + " at " + f.getTAnnotated()).collect(Collectors.joining(", ", "[", "]")));
			for (final SonarlintFinding finding : entry.getValue()) {
				final var priority = PrioritizationFactory.eINSTANCE.createFinding();
				priority.setPriority(entry.getKey());
				priority.setRepresents(finding);
				prioritization.getFindings().add(priority);
			}
		}
		final var prios = this.graph.eResource().getResourceSet()
				.createResource(EMFUtil.getPlatformResourceURI(this.project.getFile("tracesec-prioritization.xmi")));
		prios.getContents().add(prioritization);
		prios.save(Collections.emptyMap());
		return prioritization;
	}

	private boolean createFlowNetwork() throws CoreException, NoConverterRegisteredException, IOException {
		if (this.selectionPage.recalculateFindings()) {
			SonarLintProcessor.addSonarLintFindingsToPM(this.project, new NullProgressMonitor());
		}

		final var set = this.initResourceSet(this.selectionPage);

		final var configuration = (Configuration) set
				.getResource(EMFUtil.getPlatformResourceURI(this.selectionPage.getConfigurationFile()), true)
				.getContents().get(0);

		final var builder = this.buildGraph(set, configuration, this.selectionPage.getModels(),
				this.selectionPage.getOrder());

		if (this.qm == null) {
			return false;
		}
		this.graph = builder.getGraph();

		final var uri = EMFUtil.getPlatformResourceURI(this.project.getFile(FLOW_NETWORK));
		var resource = this.graph.eResource();
		if (resource == null) {
			resource = set.createResource(uri);
			resource.getContents().add(this.graph);
		} else {
			resource.setURI(uri);
		}
		resource.save(Collections.emptyMap());

		return true;
	}

	private void exportRandomFindings(final Collection<SonarlintFinding> findings, final ResourceSet set)
			throws IOException {
		final var prio = org.tracesec.prioritization.prioritization.prioritization.PrioritizationFactory.eINSTANCE
				.createPrioritization();
		final List<SonarlintFinding> selected = new java.util.ArrayList<>();
		final List<SonarlintFinding> source = new java.util.ArrayList<>(findings);
		final java.util.Random rnd = new java.security.SecureRandom();
		for (var i = 0; i < 100; i++) {
			SonarlintFinding n;
			do {
				n = source.get(rnd.nextInt(source.size()));
			} while (selected.contains(n));
			selected.add(n);
		}
		for (var i = 0; i < selected.size(); i++) {
			final var f = org.tracesec.prioritization.prioritization.prioritization.PrioritizationFactory.eINSTANCE
					.createFinding();
			prio.getFindings().add(f);
			final var s = selected.get(i);
			f.setRepresents(s);
		}
		final var res = set.createResource(EMFUtil.getPlatformResourceURI(this.project.getFile("manual.xmi")));
		res.getContents().add(prio);
		res.save(null);
	}

	private GraphBuilder buildGraph(final ResourceSet set, final Configuration configuration, final List<IFile> models,
			final List<EPackage> order) {
		final var startGraphConstruction = System.currentTimeMillis();
		final var builder = new GraphBuilder(configuration, order);

		for (final IFile selected : models) {
			final var resource = set.getResource(EMFUtil.getPlatformResourceURI(selected), true);
			for (final EObject object : resource.getContents()) {
				if (object instanceof QualityModel) {
					this.qm = (QualityModel) object;
				} else {
					if (object instanceof TypeGraph) {
						this.pm = (TypeGraph) object;
					}
					builder.add(object);
				}
			}
		}
		try {
			final var resource = set.createResource(org.eclipse.emf.common.util.URI
					.createPlatformResourceURI(models.get(0).getProject().getName() + "/pre-flowgraph.xmi", true));
			resource.getContents().add(builder.getGraph());
			resource.save(Collections.emptyMap());
		} catch (final IOException e) {
			e.printStackTrace();
		}

		FindingLinker.linkFindings(this.qm, SonarLintProcessor.getFindings(this.pm));
		builder.add(this.qm.getRoot());

		final var stopGraphConstruction = System.currentTimeMillis();

		System.out.println("Graph construction: " + (stopGraphConstruction - startGraphConstruction) + "ms\n");
		System.out.println(
				"Nodes: " + builder.getGraph().getNodes().size() + ", edges: " + builder.getGraph().getEdges().size());

		return builder;
	}

	/**
	 * Initializes the resource set
	 *
	 * @param page The page for which a resource set should be initialized
	 * @return the set
	 */
	private ResourceSet initResourceSet(final ModelSecectionPage page) {
		final ResourceSet set = new XtextResourceSet();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
				UMLResource.Factory.INSTANCE);

		final var packageRegistry = set.getPackageRegistry();
		for (final EPackage ePackage : page.getOrder()) {
			packageRegistry.put(ePackage.getNsURI(), ePackage);
		}
		packageRegistry.put(GraphConfigurationPackage.eNS_URI, GraphConfigurationPackage.eINSTANCE);
		// set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("tracesec",
		// GraphConfigurationFactory.eINSTANCE);
		return set;
	}
}
