package org.tracesec.eval.prioritization.experiments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.math3.stat.correlation.SpearmansCorrelation;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding;
import org.tracesec.eval.prioritization.CountingPriorizitation;
import org.tracesec.eval.prioritization.StandalonePrioritize;
import org.tracesec.prioritization.Priorizitation;
import org.tracesec.prioritization.prioritization.prioritization.Finding;
import org.tracesec.prioritization.tracegraph.Edge;
import org.tracesec.qualitymodel.Priority;
import org.tracesec.qualitymodel.QualityModel;

public class InternalVsExternalEdges {

	public static void runIntVsExtEdges(final List<String> arguments, final String project, final File path,
			final ResourceSet set, final QualityModel qualityModel, final StandalonePrioritize.Traces mode,
			final int iterations, final File output)
			throws IOException, FileNotFoundException {
		final var weights = arguments.remove(0);

		final Map<Priority, Integer> map = null;
		if (arguments.size() > 1) {
			StandalonePrioritize.createMap(weights);
		}

		List<SonarlintFinding> findings = new ArrayList<>();
		final var graph = StandalonePrioritize.loadAll(map, set, qualityModel, path, project, findings);
		final var manualPrio = StandalonePrioritize.onlyManuallyPrioritizedIssues(path, project, set, findings);

		findings = new Priorizitation().prioritize(findings, qualityModel.getRoot(), graph).entrySet()
				.parallelStream().filter(e -> e.getKey() > 0).flatMap(e -> e.getValue().stream()).toList();

		final var ids = IntStream.rangeClosed(1, findings.size())
				.boxed().toList();
		StandalonePrioritize.write("FNs", new File(output, "internalUsedEdges.csv"), ids);
		StandalonePrioritize.write("FNs", new File(output, "externalUsedEdges.csv"), ids);
		StandalonePrioritize.write("FNs", new File(output, "internalUsedEdgeCapacities.csv"),
				ids);
		StandalonePrioritize.write("FNs", new File(output, "externalUsedEdgeCapacities.csv"),
				ids);
		Files.write(new File(output, "overview.csv").toPath(),
				"FNs,averageInternalEdges,averageExternalEdges,averageInternalCapacity,averageExternalCapacity\n"
						.getBytes(),
				StandardOpenOption.CREATE_NEW);

		final var changesPercent = arguments.stream().map(Double::parseDouble).toList();
		for (var n = 0; n < iterations; n++) {
			System.out.println("Run " + (n + 1) + "/" + iterations);

			final var seed = System.currentTimeMillis();
			final var rnd = new Random(seed);

			final var tpEdges = StandalonePrioritize.getRelevantEdges(mode, graph);

			try (var stream = new FileOutputStream(new File(output, "correlations-" + seed + ".csv"));
					var timesStream = new FileOutputStream(new File(output, "times.csv"), true)) {
				stream.write(
						changesPercent.stream().map(Object::toString)
								.collect(Collectors.joining("%,", "fp\\fn,", "\n"))
								.getBytes());

				final List<Object[]> deleted = new ArrayList<>();
				for (final double fn : changesPercent) {
					System.out.println("Prioritize with " + fn + "% false negatives");
					final List<Edge> delete = new ArrayList<>();
					while (deleted.size() < fn * tpEdges.size() / 100) {
						final var edge = tpEdges.remove(rnd.nextInt(tpEdges.size()));
						delete.add(edge);
						deleted.add(new Object[] { edge.getSrc(), edge.getTrg(), edge.getCapacity() });
					}
					EcoreUtil.deleteAll(delete, false);

					System.out.println("Start prioritization");
					final var start = System.currentTimeMillis();
					final var priorizitation = new CountingPriorizitation();
					final var results = priorizitation.prioritize(findings, qualityModel.getRoot(),
							graph);
					final var prioritization = StandalonePrioritize.aggregatePrioritizations(manualPrio, results);
					final var timeSeconds = (System.currentTimeMillis() - start) / 1000;
					System.out.println("Prioritization took " + timeSeconds + " seconds");
					timesStream.write((timeSeconds + "\n").getBytes());

					StandalonePrioritize.calculateInternalVsExternalTracelinks(priorizitation, graph, output,
							Double.toString(fn));

					final var manualArray = prioritization.getFindings().stream()
							.mapToDouble(Finding::getManualPriority).toArray();
					final var tracesecArray = prioritization.getFindings().stream()
							.mapToDouble(Finding::getPriority)
							.toArray();
					final var corr = new SpearmansCorrelation().correlation(tracesecArray, manualArray);
					System.out.println("Correlation: " + corr);
					stream.write(',');
					stream.write(Double.toString(corr).getBytes());

				}
				stream.write('\n');

				StandalonePrioritize.restoreDeleted(graph, deleted);
			}
		}
	}

}
