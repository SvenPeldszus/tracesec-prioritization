package org.tracesec.eval.prioritization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.regex.Pattern;

import org.apache.commons.math3.stat.correlation.SpearmansCorrelation;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.tracesec.prioritization.prioritization.prioritization.Finding;
import org.tracesec.prioritization.prioritization.prioritization.Prioritization;

public class PrioritizationCompareWithAutomatedBase {

	private static final int SELECTED = 1;

	private static final String[] PROJECTS = {"itrust", "cwa"};
	private static final String LOCATION = "projects/" + PROJECTS[SELECTED]+'/';

	public static void main(final String[] args) throws IOException {
		final var inputfolder = new File(LOCATION+"/weights");

		final var set = StandalonePrioritize.init();

		final var pm = set.createResource(URI.createURI("platform:/resource/"
				+ PROJECTS[SELECTED]+ "/.gravity/pm/pm.xmi"));
		pm.load(new FileInputStream(LOCATION+"pm.xmi"), Collections.emptyMap());

		final var prios = set.createResource(URI.createURI("platform:/resource/"
				+ PROJECTS[SELECTED]+ "/expected.xmi"));
		final var base = "25-50-75-100";
		prios.load(new FileInputStream(new File(inputfolder, "tracesec-prioritization" + base + ".xmi")),
				Collections.emptyMap());
		final var expectedArray = getArray(prios);

		final var pattern = Pattern.compile("tracesec-prioritization(\\d+-\\d+-\\d+-\\d+)\\.xmi");
		try (var stream = new FileOutputStream(new File(inputfolder, "correlations-with-" + base + ".csv"))) {
			for (final File next : inputfolder.listFiles()) {
				final var matcher = pattern.matcher(next.getName());
				if (matcher.find()) {
					final var resource = set
							.createResource(URI.createURI("platform:/resource/iTrust/" + next.getName()));
					resource.load(new FileInputStream(next), null);
					final var corrTraceSec = new SpearmansCorrelation().correlation(expectedArray, getArray(resource));

					final var group = matcher.group(1);
					System.out.println("Correlation for " + group + ": " + corrTraceSec);

					stream.write(group.getBytes());
					stream.write(',');
					stream.write(Double.toString(corrTraceSec).getBytes());
					stream.write('\n');

				}
			}
		}
	}

	private static double[] getArray(final Resource prios) {
		final var findings = ((Prioritization) prios.getContents().get(0)).getFindings();
		return findings.stream().mapToDouble(Finding::getPriority).toArray();
	}
}
