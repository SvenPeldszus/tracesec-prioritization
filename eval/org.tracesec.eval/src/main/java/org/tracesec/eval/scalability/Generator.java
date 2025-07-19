package org.tracesec.eval.scalability;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TypeGraph;
import org.moflon.tgg.runtime.CorrespondenceModel;
import org.tracesec.eval.scalability.generator.PmGenerator;
import org.tracesec.eval.scalability.generator.QualityModelGenerator;
import org.tracesec.eval.scalability.generator.RequirementsGenerator;
import org.tracesec.eval.scalability.generator.UMLModelGenerator;
import org.tracesec.graph.dsl.GraphConfigurationStandaloneSetup;
import org.tracesec.graph.dsl.graphConfiguration.Configuration;
import org.tracesec.prioritization.GraphBuilder;
import org.tracesec.qualitymodel.Quality;
import org.tracesec.qualitymodel.QualityModelPackage;
import org.tracesec.requirements.RequirementsPackage;
import org.tracesec.requirements.RequirementsSet;

public class Generator {

	private static int MAX = 5000000;
	private static int STEP = 100000;
	private static int MIN = 200000;
	private static int LOOPS = 10;

	public static void main(final String[] args) throws IOException {
		if (args.length != 4) {
			System.out.println(
					"Execute with the following arguments: <MIN_LLOC> <MAX_LLOC> <STEP_SIZE> <LOOPS> if you don't want to use default values!");
		} else {
			MIN = Integer.parseInt(args[0]);
			MAX = Integer.parseInt(args[1]);
			STEP = Integer.parseInt(args[2]);
			LOOPS = Integer.parseInt(args[3]);
		}
		System.out.println("Running with MIN_LLOC = " + MIN + ", MAX_LLOC = " + MAX + ", STEP_SIZE = " + STEP
				+ ", LOOPS = " + LOOPS);

		GraphConfigurationStandaloneSetup.doSetup();

		File base;
		if (args.length > 0) {
			base = new File(args[0]);
		} else {
			base = new File("");
		}
		final var measurementFolder = new File(base, "measurements");
		if (!measurementFolder.mkdirs()) {
			System.err.println("Couldn't create output folder: " + measurementFolder.toString());
		}

		final Map<String, String> averages = new HashMap<>();
		for (var i = MIN; i <= MAX; i += STEP) {
			final var out = new File(measurementFolder, i + ".csv");

			final List<Long> times = new ArrayList<>(LOOPS);
			final List<List<String>> values = new ArrayList<>(LOOPS + 1);
			values.add(Arrays.asList("nodes", "edges", "time"));
			while (times.size() <= LOOPS) {
				System.out.println(
						"\n\n### Generate with " + i + "lloc (" + (times.size() + 1) + "/" + LOOPS + ") ###\n");
				final var set = new XtextResourceSet();

				final var resources = generate(set, i, false);

				final var resource = set.createResource(URI.createURI("instance/test.xmi"));
				resource.load(Generator.class.getClassLoader().getResourceAsStream("instance/test.xmi"),
						Collections.emptyMap());
				final var configuration = (Configuration) resource.getContents().get(0);

				final var startGraphConstruction = System.currentTimeMillis();
				final var builder = new GraphBuilder(configuration, Arrays.asList(BasicPackage.eINSTANCE,
						UMLPackage.eINSTANCE, RequirementsPackage.eINSTANCE, QualityModelPackage.eINSTANCE));
				for (final EObject e : resources) {
					builder.add(e);
				}
				final var stopGraphConstruction = System.currentTimeMillis();
				final var time = stopGraphConstruction - startGraphConstruction;
				times.add(time);

				final var graph = builder.getGraph();
				final var flowGraphNodes = graph.getNodes().size();
				final var flowGraphEdges = builder.getGraph().getEdges().size();
				values.add(Arrays.asList(Integer.toString(flowGraphNodes), Integer.toString(flowGraphEdges),
						Long.toString(time)));

				System.out.println("\nGraph construction: " + time + "ms");
				System.out.println("Nodes: " + flowGraphNodes + ", edges: " + flowGraphEdges);
			}
			Files.write(out.toPath(), times.stream().map(l -> l.toString()).collect(Collectors.joining(",")).getBytes(),
					StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
			averages.put(Long.toString(i),
					Double.toString(times.stream().mapToLong(Long::valueOf).average().getAsDouble()));
		}
		Files.write(
				new File(base, "average-times-per-lloc.csv").toPath(), averages.entrySet().stream()
				.map(e -> e.getKey() + "," + e.getValue()).collect(Collectors.joining("\n")).getBytes(),
				StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
	}

	private static List<EObject> generate(final ResourceSet set, final int lloc, final boolean save)
			throws IOException {
		final var folder = "instance/" + lloc;
		if (save) {
			new File(folder).mkdirs();
		}

		final var pm = new PmGenerator(set).generate(URI.createURI(folder + "/pm.xmi"),
				PmGenerator.expectedPMElements(lloc));
		final var uml2pm = new UMLModelGenerator(set).generate(pm, URI.createURI(folder + "/model.uml"),
				URI.createURI(folder + "/uml2pm.xmi"));
		final var req2uml = new RequirementsGenerator(set).generate((Model) uml2pm.getSource(),
				URI.createURI(folder + "/requirements.xmi"), URI.createURI(folder + "/req2uml.xmi"));
		final var qm = new QualityModelGenerator(set).generate((RequirementsSet) req2uml.getSource(),
				URI.createURI(folder + "/qm.xmi"));

		if (save) {
			save(folder, pm, uml2pm, req2uml, qm);
		}

		return Arrays.asList(pm, uml2pm, req2uml, qm);
	}

	private static void save(final String folder, final TypeGraph pm, final CorrespondenceModel uml2pm,
			final CorrespondenceModel req2uml, final Quality qm) throws IOException {
		pm.eResource().save(Collections.emptyMap());
		uml2pm.getSource().eResource().save(Collections.emptyMap());
		req2uml.getSource().eResource().save(Collections.emptyMap());
		qm.eResource().save(Collections.emptyMap());

		uml2pm.eResource().save(Collections.emptyMap());
		req2uml.eResource().save(Collections.emptyMap());
	}
}
