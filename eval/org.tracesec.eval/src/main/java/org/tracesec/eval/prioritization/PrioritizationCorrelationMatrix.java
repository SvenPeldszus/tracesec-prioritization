package org.tracesec.eval.prioritization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.stream.Stream;

import org.apache.commons.math3.stat.correlation.SpearmansCorrelation;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.tracesec.prioritization.prioritization.prioritization.Finding;
import org.tracesec.prioritization.prioritization.prioritization.Prioritization;

public class PrioritizationCorrelationMatrix {

	private static final int PROJECT = 1;
	private static final String[] PROJECTS = { "iTrust", "server" };
	private static final String[] LOCATIONS = { "itrust", "cwa" };
	private static final String NAME = PROJECTS[PROJECT];
	private static final File LOCATION = new File("projects", LOCATIONS[PROJECT]);

	private static final String INPUT = "trees";
	private static final String BASE = "weights/tracesec-prioritization25-50-75-100.xmi";

	public static void main(final String[] args) throws IOException {
		final var inputfolder = new File(LOCATION, INPUT);

		final var set = StandalonePrioritize.init();

		final var pm = set.createResource(URI.createPlatformResourceURI(NAME
				+ "/.gravity/pm/pm.xmi", true));
		pm.load(new FileInputStream(new File(LOCATION, "pm.xmi")), Collections.emptyMap());

		final var prios = set.createResource(URI.createPlatformResourceURI(NAME
				+ "/expected.xmi", true));
		prios.load(new FileInputStream(new File(LOCATION, BASE)), Collections.emptyMap());
		final var basePrios = getArray(prios);

		final var files = Stream.of(inputfolder.listFiles()).filter(f -> f.getName().endsWith(".xmi")).toList();

		final var arrays = new double[1 + files.size()][basePrios.length];
		arrays[0] = basePrios;

		for (var i = 0; i < files.size(); i++) {
			final var next = files.get(i);
			final var resource = set.createResource(URI.createPlatformResourceURI(NAME
					+ "/" + next.getName(), true));
			resource.load(new FileInputStream(next), null);
			arrays[i + 1] = getArray(resource);
		}
		try (var stream = new FileOutputStream(new File(inputfolder, "correlation-matrix.csv"))) {

			for (var i = 0; i < arrays.length; i++) {
				stream.write(',');
				stream.write(Integer.toString(i).getBytes());
			}
			for (var i = 0; i < arrays.length; i++) {
				stream.write('\n');
				stream.write(Integer.toString(i).getBytes());
				for (final double[] array : arrays) {
					final var corr = new SpearmansCorrelation().correlation(arrays[i], array);
					stream.write(',');
					stream.write(Double.toString(corr).getBytes());
				}

			}
		}
	}

	/**
	 * @param prios
	 * @return
	 */
	private static double[] getArray(final Resource prios) {
		final var findings = ((Prioritization) prios.getContents().get(0)).getFindings();
		return findings.stream().mapToDouble(Finding::getPriority).toArray();
	}
}
