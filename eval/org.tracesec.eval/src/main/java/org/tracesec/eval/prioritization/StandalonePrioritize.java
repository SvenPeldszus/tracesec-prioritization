package org.tracesec.eval.prioritization;

import static org.tracesec.eval.prioritization.StandalonePrioritize.Experiment.INTERNAL_EXTERNAL;
import static org.tracesec.eval.prioritization.StandalonePrioritize.Experiment.TRACES;
import static org.tracesec.eval.prioritization.StandalonePrioritize.Traces.LINKS;
import static org.tracesec.eval.prioritization.StandalonePrioritize.Traces.MODELS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.SortedMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.math3.stat.correlation.SpearmansCorrelation;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintPackage;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TypeGraph;
import org.gravity.typegraph.sonarlint.SonarLintProcessor;
import org.tracesec.eval.prioritization.experiments.InternalVsExternalEdges;
import org.tracesec.graph.dsl.GraphConfigurationStandaloneSetup;
import org.tracesec.graph.dsl.graphConfiguration.Configuration;
import org.tracesec.graph.dsl.graphConfiguration.GraphConfigurationPackage;
import org.tracesec.prioritization.GraphBuilder;
import org.tracesec.prioritization.Priorizitation;
import org.tracesec.prioritization.prioritization.prioritization.Finding;
import org.tracesec.prioritization.prioritization.prioritization.Prioritization;
import org.tracesec.prioritization.prioritization.prioritization.PrioritizationFactory;
import org.tracesec.prioritization.prioritization.prioritization.PrioritizationPackage;
import org.tracesec.prioritization.tracegraph.Edge;
import org.tracesec.prioritization.tracegraph.Graph;
import org.tracesec.prioritization.tracegraph.Node;
import org.tracesec.prioritization.tracegraph.TracegraphFactory;
import org.tracesec.prioritization.tracegraph.TracegraphPackage;
import org.tracesec.qualitymodel.Aspect;
import org.tracesec.qualitymodel.FindingLinker;
import org.tracesec.qualitymodel.Priority;
import org.tracesec.qualitymodel.Quality;
import org.tracesec.qualitymodel.QualityModel;
import org.tracesec.qualitymodel.QualityModelFactory;
import org.tracesec.qualitymodel.QualityModelPackage;
import org.tracesec.requirements.RequirementsPackage;

public class StandalonePrioritize {

	private static final String MODEL = "--model";

//	public static void main(final String[] args) throws IOException {
//		main2(new String[] { "itrust", "projects/itrust-old", INTERNAL_EXTERNAL.command, "25-50-75-100", "--iterations",
//				"25", "0", "0.1", "0.2", "0.5", "1", "2", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50" });
//	}

	public static void main(final String[] args) throws IOException {
		if (args.length < 2) {
			System.out.println(
					"Not all arguments specified! Please specify the arguments as follows: <project-name> <path-to-project> <experiment> <experiment-args>*");
			System.out.println("The possible experiments are \"" + Experiment.TREE + "\", \"" + Experiment.WEIGHTS
					+ "\", and \"" + Experiment.INTERNAL_EXTERNAL + "\"");
			return;
		}

		final List<String> arguments = new ArrayList<>(Arrays.asList(args));
		final var project = arguments.remove(0);

		final var path = new File(arguments.remove(0));
		if (!path.exists()) {
			System.out.println(
					"The second argument should point to the project folder but \"" + project + "\" does not exist.");
			return;
		}

		final var set = init();
		final Collection<String> models = new LinkedList<>();
		var modelIndex = -1;
		while ((modelIndex = arguments.indexOf(MODEL)) != -1) {
			final var model = arguments.remove(modelIndex + 1);
			arguments.remove(modelIndex);
			models.add(model);

			loadModel(set, project, model, path);
		}
		final var qualityModel = loadQM(path, project, set);

		final var experiments = Stream.of(Experiment.values())
				.filter(e -> arguments.indexOf(e.command) >= 0)
				.toList();
		if (experiments.isEmpty()) {
			System.out.println(Stream.of(Experiment.values()).map(Experiment::toString).collect(Collectors.joining(", ",
					"Not specified which experiment should be executed. Available options are: ", "")));
			return;
		}
		if (experiments.size() > 1) {
			System.out.println("Only one experiment can be selected!");
			return;
		}
		final var experiment = experiments.get(0);
		final var i = arguments.indexOf(experiment.command);
		arguments.remove(i);
		Traces mode = null;
		if (experiment == TRACES) {
			mode = Traces.valueOf(arguments.remove(i).toUpperCase());
		} else if (experiment == INTERNAL_EXTERNAL) {
			mode = MODELS;
		}

		int iterations;
		final var nIndex = arguments.indexOf("--iterations");
		if (nIndex >= 0) {
			arguments.remove(nIndex);
			iterations = Integer.parseInt(arguments.remove(nIndex));
		} else {
			iterations = 1;
		}

		var output = switch (experiment) {
			case WEIGHTS -> new File(path, "weights");
			case TREE -> new File(path, "trees");
			case TRACES -> new File(new File(path, "traces"), mode.name());
			case INTERNAL_EXTERNAL -> new File(path, "intVsExt");
			default -> throw new IllegalStateException();
		};
		output = new File(output, new Date().toString());
		if (!output.exists()) {
			output.mkdirs();
		}

		switch (experiment) {
			case WEIGHTS:
				for (var n = 0; n < iterations; n++) {
					System.out.println("Run " + (n + 1) + "/" + iterations);
					runWeights(arguments, project, path, qualityModel, output);
				}
				break;
			case TREE:
				for (var n = 0; n < iterations; n++) {
					System.out.println("Run " + (n + 1) + "/" + iterations);
					runTree(arguments, project, path, set, qualityModel, output);
				}
				break;
			case TRACES:
				runTraces(arguments, project, path, set, qualityModel, mode, iterations, output);
				break;
			case INTERNAL_EXTERNAL:
				InternalVsExternalEdges.runIntVsExtEdges(arguments, project, path, set, qualityModel, mode, iterations,
						output);
				break;

		}
	}

	public static void calculateInternalVsExternalTracelinks(final CountingPriorizitation priorizitation,
			final Graph graph, final File folder, final String label) {
		write(label, new File(folder, "internalUsedEdges.csv"), priorizitation.getInternalUsedEdges());
		write(label, new File(folder, "externalUsedEdges.csv"), priorizitation.getExternalUsedEdges());
		write(label, new File(folder, "internalUsedEdgeCapacities.csv"),
				priorizitation.getInternalUsedEdgeCapacities());
		write(label, new File(folder, "externalUsedEdgeCapacities.csv"),
				priorizitation.getExternalUsedEdgeCapacities());

		final var averageInternalEdges = priorizitation.getInternalUsedEdges().stream()
				.collect(Collectors.averagingDouble(Integer::intValue));
		final var averageExternalEdges = priorizitation.getExternalUsedEdges().stream()
				.collect(Collectors.averagingDouble(Integer::intValue));
		final var averageInternalCapacity = priorizitation.getInternalUsedEdgeCapacities().stream()
				.collect(Collectors.averagingDouble(Integer::intValue));
		final var averageExternalCapacities = priorizitation.getExternalUsedEdgeCapacities().stream()
				.collect(Collectors.averagingDouble(Integer::intValue));
		write(label, new File(folder, "overview.csv"), Arrays.asList(averageInternalEdges, averageExternalEdges,
				averageInternalCapacity, averageExternalCapacities));
	}

	public static void write(final String label, final File out, final List<? extends Number> values) {
		try {
			Files.write(out.toPath(), values.stream().map(Number::toString)
					.collect(Collectors.joining(",", label + ",", "\n")).getBytes(), StandardOpenOption.APPEND,
					StandardOpenOption.CREATE);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private static void runTraces(final List<String> arguments, final String project, final File path,
			final ResourceSet set, final QualityModel qualityModel, final Traces mode, final int iterations,
			final File output)
			throws IOException {
		final var weights = arguments.remove(0);

		final Map<Priority, Integer> map = null;
		if (arguments.size() > 1) {
			createMap(weights);
		}
		final var findings = new ArrayList<SonarlintFinding>();
		final var graph = loadAll(map, set, qualityModel, path, project, findings);
		final var manualPrio = onlyManuallyPrioritizedIssues(path, project, set, findings);

		final var changes = arguments.stream().map(Double::parseDouble).toList();
		for (var n = 0; n < iterations; n++) {
			System.out.println("Run " + (n + 1) + "/" + iterations);
			runTraces(mode, changes, output, graph, findings, qualityModel, manualPrio);
		}
	}

	private static void runTraces(final Traces mode, final List<Double> changesPercent, final File output,
			final Graph graph,
			final Collection<SonarlintFinding> findings, final QualityModel qualityModel,
			final Prioritization manualPrio)
			throws IOException {

		final var seed = System.currentTimeMillis();
		final var rnd = new Random(seed);

		final var tpNodes = getRelevantNodes(graph);
		final var tpEdges = getRelevantEdges(mode, graph);

		try (var stream = new FileOutputStream(new File(output, "correlations-" + seed + ".csv"));
				var timesStream = new FileOutputStream(new File(output, "times.csv"), true)) {
			stream.write(
					changesPercent.stream().map(Object::toString).collect(Collectors.joining("%,", "fp\\fn,", "\n"))
							.getBytes());

			final List<Edge> added = new ArrayList<>();
			for (final double fp : changesPercent) {
				System.out.print("Run with " + fp + "% false positives ");
				stream.write((fp + "%").getBytes());

				while (added.size() < fp * tpEdges.size() / 100) {
					added.add(addRandomEdge(graph, rnd, tpNodes, mode));
				}

				final List<Object[]> deleted = new ArrayList<>();
				for (final double fn : changesPercent) {
					System.out.println("and " + fn + "% false negatives");
					final List<Edge> delete = new ArrayList<>();
					while (deleted.size() < fn * tpEdges.size() / 100) {
						final var edge = tpEdges.remove(rnd.nextInt(tpEdges.size()));
						delete.add(edge);
						deleted.add(new Object[] { edge.getSrc(), edge.getTrg(), edge.getCapacity() });
					}
					EcoreUtil.deleteAll(delete, false);

					System.out.println("Start prioritization");
					final var start = System.currentTimeMillis();
					final var results = new Priorizitation().prioritize(findings, qualityModel.getRoot(), graph);
					final var prioritization = aggregatePrioritizations(manualPrio, results);
					final var timeSeconds = (System.currentTimeMillis() - start) / 1000;
					System.out.println("Prioritization took " + timeSeconds + " seconds");
					timesStream.write((timeSeconds + "\n").getBytes());

					final var manualArray = prioritization.getFindings().stream()
							.mapToDouble(Finding::getManualPriority).toArray();
					final var tracesecArray = prioritization.getFindings().stream().mapToDouble(Finding::getPriority)
							.toArray();
					final var corr = new SpearmansCorrelation().correlation(tracesecArray, manualArray);
					System.out.println("Correlation: " + corr);
					stream.write(',');
					stream.write(Double.toString(corr).getBytes());

				}
				stream.write('\n');

				restoreDeleted(graph, deleted);
			}

			// Delete created false positives
			EcoreUtil.deleteAll(added, false);
		}
	}

	public static void restoreDeleted(final Graph graph, final List<Object[]> deleted) {
		// Restore deleted false negatives
		for (final Object[] o : deleted) {
			final var edge = TracegraphFactory.eINSTANCE.createEdge();
			edge.setSrc((Node) o[0]);
			edge.setTrg((Node) o[1]);
			edge.setCapacity((int) o[2]);
			graph.getEdges().add(edge);
		}
	}

	/**
	 * All non code nodes
	 *
	 * @param graph
	 * @return an immutable list
	 */
	private static List<Node> getRelevantNodes(final Graph graph) {
		return graph.getNodes().parallelStream()
				.filter(n -> !BasicPackage.eINSTANCE.equals(n.getRepresents().eClass().getEPackage())).toList();
	}

	/**
	 * All edges either representing trace links or model edges
	 *
	 * @param mode  trace links or model edges
	 * @param graph
	 * @return a mutable list
	 */
	public static List<Edge> getRelevantEdges(final Traces mode, final Graph graph) {
		return new ArrayList<>(graph.getEdges().parallelStream().filter(e -> {
			final var srcPackage = getEPackage(e.getSrc());
			if (BasicPackage.eINSTANCE.getNsURI().equals(srcPackage)) {
				return false;
			}
			final var trgPackage = getEPackage(e.getTrg());
			final var equals = srcPackage.equals(trgPackage);
			return switch (mode) {
				case LINKS -> !equals;
				case MODELS -> equals;
			};
		}).toList());
	}

	private static Edge addRandomEdge(final Graph graph, final Random rnd, final List<Node> tpNodes,
			final Traces mode) {
		final var src = tpNodes.get(rnd.nextInt(tpNodes.size()));
		Node trg;
		while ((trg = tpNodes.get(rnd.nextInt(tpNodes.size()))) == src || !mode.valid(src, trg)) {

		}
		final var edge = TracegraphFactory.eINSTANCE.createEdge();
		if (mode == LINKS) {
			edge.setCapacity(25);
		} else if (mode == MODELS) {
			edge.setCapacity(1);
		}
		edge.setSrc(src);
		edge.setTrg(trg);
		graph.getEdges().add(edge);
		return edge;
	}

	private static void runTree(final List<String> arguments, final String project, final File path,
			final ResourceSet set, final QualityModel qualityModel, final File output) throws IOException {
		try (var stream = new FileOutputStream(new File(output, "correlations.csv"))) {
			String id;
			double corr;
			final var qms = setSingleSubtreeToEssential(qualityModel);
			final var res = qualityModel.eResource();
			for (var i = 0; i < qms.size(); i++) {
				id = "subtree-" + i;
				final Map<Priority, Integer> map = null;
				if (arguments.size() > 1) {
					createMap(arguments.get(0));
				}
				final var qm = qms.get(i);
				res.getContents().clear();
				res.getContents().add(qm);
				corr = run(id, map, set, qm, path, project);
				append(stream, id, corr);
			}
		}
	}

	private static void runWeights(final List<String> arguments, final String project, final File path,
			final QualityModel qualityModel, final File output) throws IOException {

		try (var stream = new FileOutputStream(new File(output, "correlations.csv"))) {
			String id;
			for (final String argument : arguments) {
				id = argument;
				runWeights(id, path, stream, project, qualityModel);
			}
		}
	}

	private static void runWeights(final String id, final File folder, final FileOutputStream stream,
			final String project, final QualityModel qm) throws IOException {
		double corr;
		System.out.println("Run with weights: " + id);
		final var map = createMap(id);
		corr = run(id, map, qm.eResource().getResourceSet(), qm, folder, project);
		append(stream, id, corr);
	}

	private static double run(final String id, final Map<Priority, Integer> priorities, final ResourceSet set,
			final QualityModel qm, final File folder, final String project) throws IOException {
		final var findings = new ArrayList<SonarlintFinding>();
		final var graph = loadAll(priorities, set, qm, folder, project, findings);

		final var manualPrio = onlyManuallyPrioritizedIssues(folder, project, set, findings);

		final var results = new Priorizitation().prioritize(findings, qm.getRoot(), graph);

		final var prioritization = aggregatePrioritizations(manualPrio, results);

		savePrioritization(set, prioritization, id, folder, project);

		graph.eResource().unload();

		final var manualArray = prioritization.getFindings().stream().mapToDouble(Finding::getManualPriority).toArray();
		final var tracesecArray = prioritization.getFindings().stream().mapToDouble(Finding::getPriority).toArray();
		final var corr = new SpearmansCorrelation().correlation(tracesecArray, manualArray);
		System.out.println("Correlation: " + corr);
		return corr;
	}

	private static Resource loadModel(final ResourceSet set, final String project, final String model, final File path)
			throws IOException {
		final var res = set.createResource(URI.createPlatformResourceURI(project + "/" + model, true));
		res.load(new FileInputStream(new File(path, model)), Collections.emptyMap());
		return res;
	}

	public static Graph loadAll(final Map<Priority, Integer> priorities, final ResourceSet set, final QualityModel qm,
			final File folder, final String project, final List<SonarlintFinding> findings) throws IOException {
		final var configuration = loadConfiguration(folder, project, set);
		EcoreUtil.resolveAll(configuration);

		final var pm = loadPm(folder, project, set);
		findings.addAll(SonarLintProcessor.getFindings((TypeGraph) pm.getContents().get(0)));

		final var flownetwork = loadPreFlownetwork(folder, project, set);
		final var graph = (Graph) flownetwork.getContents().get(0);
		EcoreUtil.resolveAll(set);

		final var order = new ArrayList<EPackage>();
		order.add(BasicPackage.eINSTANCE);
		order.add(UMLPackage.eINSTANCE);
		if (qm.getQualities().stream().flatMap(q -> q.getRelevantElements().stream()).map(e -> e.eClass().getEPackage())
				.anyMatch(e -> e.equals(RequirementsPackage.eINSTANCE))) {
			order.add(RequirementsPackage.eINSTANCE);
		}
		order.add(QualityModelPackage.eINSTANCE);
		final var builder = new GraphBuilder(graph, configuration, order);
		if (priorities != null) {
			builder.setPriorityMap(priorities);
		}

		FindingLinker.linkFindings(qm, SonarLintProcessor.getFindings((TypeGraph) pm.getContents().get(0)));
		builder.add(qm.getRoot());
		return graph;
	}

	private static void append(final FileOutputStream stream, final String id, final double corr) throws IOException {
		stream.write(id.getBytes());
		stream.write(',');
		stream.write(Double.toString(corr).getBytes());
		stream.write('\n');
	}

	private static List<QualityModel> setSingleSubtreeToEssential(final QualityModel qm) {
		final var aspects = qm.getRoot().getAspects();
		final var size = aspects.size();
		final List<QualityModel> models = new ArrayList<>(size);
		for (var i = 0; i < size; i++) {
			final var next = QualityModelFactory.eINSTANCE.createQualityModel();
			final var root = QualityModelFactory.eINSTANCE.createQuality();
			next.setRoot(root);
			next.getQualities().add(root);
			for (var j = 0; j < size; j++) {
				if (i == j) {
					next.getQualities().addAll(cloneSubtree(aspects.get(j), root, Priority.ESSENTIAL));
				} else {
					next.getQualities().addAll(cloneSubtree(aspects.get(j), root, Priority.LOW));
				}
			}
			models.add(next);
		}
		return models;
	}

	private static List<Quality> cloneSubtree(final Aspect aspect, final Quality clonedOwner, final Priority priority) {
		final var originalQuality = aspect.getQuality();

		final var clonedAspect = QualityModelFactory.eINSTANCE.createAspect();
		clonedAspect.setPriority(priority);
		clonedAspect.setOwner(clonedOwner);
		final var clonedQuality = QualityModelFactory.eINSTANCE.createQuality();
		clonedQuality.getRelevantElements().addAll(originalQuality.getRelevantElements());
		clonedQuality.setTitle(originalQuality.getTitle());
		clonedQuality.setDescription(originalQuality.getDescription());
		clonedAspect.setQuality(clonedQuality);

		final List<Quality> qualities = new LinkedList<>();
		qualities.add(clonedQuality);
		for (final Aspect nextAspect : aspect.getQuality().getAspects()) {
			qualities.addAll(cloneSubtree(nextAspect, clonedQuality, priority));
		}
		return qualities;
	}

	public static Map<Priority, Integer> createMap(final String id) {
		final var values = id.split("-");
		if (values.length != 4) {
			throw new IllegalStateException("Illegal fromat, AA-BB-CC-DD is expected but got: " + id);
		}
		final var low = Integer.parseInt(values[0]);
		final var medium = Integer.parseInt(values[1]);
		final var high = Integer.parseInt(values[2]);
		final var essential = Integer.parseInt(values[3]);

		final Map<Priority, Integer> map = new EnumMap<>(Priority.class);
		map.put(Priority.LOW, low);
		map.put(Priority.MEDIUM, medium);
		map.put(Priority.HIGH, high);
		map.put(Priority.ESSENTIAL, essential);
		return map;
	}

	/**
	 * @param manualPrio
	 * @param results
	 * @return
	 */
	public static Prioritization aggregatePrioritizations(final Prioritization manualPrio,
			final SortedMap<Integer, List<SonarlintFinding>> results) {
		final var prioritization = PrioritizationFactory.eINSTANCE.createPrioritization();
		for (final Entry<Integer, List<SonarlintFinding>> entry : results.entrySet()) {
			System.out.println("Priority: " + entry.getKey() + " -- " + entry.getValue().stream()
					.map(f -> f.getRulekey() + " at " + f.getTAnnotated()).collect(Collectors.joining(", ", "[", "]")));
			for (final SonarlintFinding finding : entry.getValue()) {
				final var priority = PrioritizationFactory.eINSTANCE.createFinding();
				priority.setPriority(entry.getKey());
				priority.setRepresents(finding);
				prioritization.getFindings().add(priority);
				if (manualPrio != null) {
					final var result = manualPrio.getFindings().parallelStream()
							.filter(n -> finding.equals(n.getRepresents())).findAny();
					if (result.isPresent()) {
						priority.setManualPriority(result.get().getManualPriority());
					}
				}
			}
		}
		return prioritization;
	}

	private static void savePrioritization(final ResourceSet set, final Prioritization prioritization, final String id,
			final File folder, final String project) throws IOException {
		final var prios = set.createResource(
				URI.createURI("platform:/resource/" + project + "/tracesec-prioritization" + id + ".xmi"));
		prios.getContents().add(prioritization);
		prios.save(new FileOutputStream(new File(folder, "tracesec-prioritization" + id + ".xmi")),
				Collections.emptyMap());
	}

	public static Prioritization onlyManuallyPrioritizedIssues(final File folder, final String project,
			final ResourceSet set, final List<SonarlintFinding> findings) throws IOException {
		final var manual = new File(folder, "manual.xmi");
		Prioritization manualPrio = null;
		if (manual.exists()) {
			final var man = set.createResource(URI.createPlatformResourceURI(project + "/manual.xmi", true));
			man.load(new FileInputStream(manual), Collections.emptyMap());
			findings.clear();
			manualPrio = (Prioritization) man.getContents().get(0);
			findings.addAll(
					manualPrio.getFindings().parallelStream().map(Finding::getRepresents).toList());
		}
		return manualPrio;
	}

	private static Configuration loadConfiguration(final File folder, final String project, final ResourceSet set)
			throws IOException {
		final var config = set.createResource(URI.createURI("platform:/resource/" + project + "/test.xmi"));
		config.load(new FileInputStream(new File(folder, "test.xmi")), Collections.emptyMap());
		return (Configuration) config.getContents().get(0);
	}

	/**
	 * @param project
	 * @param folder
	 * @param set
	 * @return
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	private static Resource loadPreFlownetwork(final File folder, final String project, final ResourceSet set)
			throws IOException {
		System.out.println("Load trace network");
		final var flownetwork = set
				.createResource(URI.createURI("platform:/resource/" + project + "/pre-flowgraph.xmi"));
		flownetwork.load(new FileInputStream(new File(folder, "pre-flowgraph.xmi")), Collections.emptyMap());
		return flownetwork;
	}

	/**
	 * Loads the quality model from the default location
	 *
	 * @param project
	 *
	 * @param set
	 * @return
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	private static QualityModel loadQM(final File folder, final String project, final ResourceSet set)
			throws IOException {
		System.out.println("Load Quality Model");
		final var qm = set.createResource(URI.createURI("platform:/resource/" + project + "/QualityModel.xmi"));
		qm.load(new FileInputStream(new File(folder, "QualityModel.xmi")), Collections.emptyMap());
		return (QualityModel) qm.getContents().get(0);
	}

	private static Resource loadPm(final File folder, final String project, final ResourceSet set) throws IOException {
		System.out.println("Load PM");
		final var pm = set.createResource(URI.createPlatformResourceURI(project + "/.gravity/pm/pm.xmi", true));
		pm.load(new FileInputStream(new File(folder, "pm.xmi")), Collections.emptyMap());
		return pm;
	}

	/**
	 * @return
	 */
	public static ResourceSet init() {
		new GraphConfigurationStandaloneSetup().createInjectorAndDoEMFRegistration();
		final var set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
				UMLResource.Factory.INSTANCE);

		set.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		set.getPackageRegistry().put(SonarlintPackage.eNS_URI, SonarlintPackage.eINSTANCE);
		set.getPackageRegistry().put(TracegraphPackage.eNS_URI, TracegraphPackage.eINSTANCE);
		set.getPackageRegistry().put(PrioritizationPackage.eNS_URI, PrioritizationPackage.eINSTANCE);
		set.getPackageRegistry().put(QualityModelPackage.eNS_URI, QualityModelPackage.eINSTANCE);
		set.getPackageRegistry().put(GraphConfigurationPackage.eNS_URI, GraphConfigurationPackage.eINSTANCE);
		set.getPackageRegistry().put(RequirementsPackage.eNS_URI, RequirementsPackage.eINSTANCE);
		set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		return set;
	}

	private static String getEPackage(final Node node) {
		final var represents = node.getRepresents();
		if (represents.eIsProxy()) {
			return ((org.eclipse.emf.ecore.impl.EObjectImpl) represents).eProxyURI().trimFragment().toString();
		}
		return represents.eClass().getEPackage().getNsURI();
	}

	enum Experiment {

		WEIGHTS("--weights"), TREE("--tree"), TRACES("--traces"), INTERNAL_EXTERNAL("--internal-vs-external");

		String command;

		private Experiment(final String command) {
			this.command = command;
		}

		@Override
		public String toString() {
			return this.command;
		}
	}

	public enum Traces {
		LINKS, MODELS;

		boolean valid(final Node src, final Node trg) {
			// There is not an edge between the nodes already
			if (src.getOut().stream().noneMatch(e -> trg.equals(e.getTrg()))) {
				final var srcPackage = getEPackage(src);
				final var trgPackage = getEPackage(trg);
				final var equal = srcPackage.equals(trgPackage);
				return switch (this) {
					case LINKS -> /* For trace links the nodes have to be from different models */ !equal;
					case MODELS -> /* For model links the nodes have to be from the same model */ equal;
				};
			}
			return false;
		}
	}
}
