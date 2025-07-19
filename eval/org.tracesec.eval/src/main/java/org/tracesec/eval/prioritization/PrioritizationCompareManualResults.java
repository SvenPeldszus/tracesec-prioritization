package org.tracesec.eval.prioritization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.math3.stat.correlation.SpearmansCorrelation;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMember;
import org.tracesec.prioritization.prioritization.prioritization.Finding;
import org.tracesec.prioritization.prioritization.prioritization.Prioritization;

public class PrioritizationCompareManualResults {

	private static final int SELECTED = 0;

	private static final String[] PROJECTS = {"itrust", "cwa"};
	private static final String LOCATION = "projects/" + PROJECTS[SELECTED]+'/';

	public static void main(final String[] args) throws IOException {
		final var set = StandalonePrioritize.init();

		final var pm = set.createResource(URI.createURI("platform:/resource/"+PROJECTS[SELECTED]+"/.gravity/pm/pm.xmi"));
		pm.load(new FileInputStream(LOCATION+"pm.xmi"), Collections.emptyMap());

		final var prios = set
				.createResource(URI.createURI("platform:/resource/"+PROJECTS[SELECTED]+"/tracesec-prioritization-man.xmi"));
		prios.load(new FileInputStream(LOCATION+"tracesec-prioritization-man.xmi"), Collections.emptyMap());

		final var findings = ((Prioritization) prios.getContents().get(0)).getFindings();
		getSonarArray(findings);
		System.out.println("Checking correlation for "+findings.size()+" findings.");

		final List<Finding> manual = new ArrayList<>(findings);
		manual.sort((o1, o2) -> o1.getManualPriority() - o2.getManualPriority());
		final List<Finding> tracesec = new ArrayList<>(findings);
		tracesec.sort((o1, o2) -> o1.getPriority() - o2.getPriority());

		final Map<Finding, Long> diff = new HashMap<>();
		try (final var stream = new FileOutputStream(LOCATION+"manual-prioritization-results.csv")) {
			stream.write("file,line,index,manualPriority,automatedPriority,rulePriority,rulePriorityName,ruleID,ruleDescription\n".getBytes());
			for (final Finding f : findings) {
				final var countMan = findings.parallelStream()
						.filter(n -> n.getManualPriority() < f.getManualPriority()).count();
				final var countTS = findings.parallelStream().filter(n -> n.getPriority() < f.getPriority()).count();
				final var d = Math.abs(countMan - countTS);
				diff.put(f, d);
				System.out.println(f.getRepresents().getRulekey() + ", diff = " + d);

				EObject element = f.getRepresents().getTAnnotated();
				while (!(element instanceof TAbstractType)) {
					if (element instanceof TMember) {
						element = ((TMember) element).getDefinedBy();
					}
					else {
						System.out.println("Element not found: "+element);
					}
				}
				final var path = ((TAbstractType) element).getFullyQualifiedName().replace(".", "/") + ".java";
				stream.write(path.getBytes());
				stream.write(',');
				stream.write(Integer.toString(f.getRepresents().getLine()).getBytes());
				stream.write(',');
				stream.write(Integer.toString(f.getRepresents().getStartChar()).getBytes());
				stream.write(',');
				stream.write(Integer.toString(f.getManualPriority()).getBytes());
				stream.write(',');
				stream.write(Integer.toString(f.getPriority()).getBytes());
				stream.write(',');
				stream.write(f.getRepresents().getSeverity().getBytes());
				stream.write(',');
				stream.write(getSeverityNumber(f.getRepresents().getSeverity()).getBytes());
				stream.write(',');
				stream.write((f.getRepresents().getRulekey()).getBytes());
				stream.write(',');
				stream.write(('"'+f.getRepresents().getDescription()+'"').getBytes());
				stream.write('\n');
			}
		}
		System.out.println("Average diff = " + diff.values().parallelStream().mapToLong(Long::valueOf).average());
		final var manualArray = findings.stream().mapToDouble(Finding::getManualPriority).toArray();
		final var tracesecArray = findings.stream().mapToDouble(Finding::getPriority).toArray();
		final var corrTraceSec = new SpearmansCorrelation().correlation(tracesecArray, manualArray);
		final var corrSonar = new SpearmansCorrelation().correlation(getSonarArray(findings), manualArray);

		System.out.println("Correlation: tracesec=" + corrTraceSec+", sonar="+corrSonar);
	}

	private static String getSeverityNumber(String severity) {
		switch (severity) {
		case "Blocker":
			return "4";
		case "Critical":
			return "3";
		case "Major":
			return "2";
		case "Minor":
			return "1";
		case "Info":
			return "0";
		default:
			throw new IllegalArgumentException();
		}
	}

	private static double[] getSonarArray(final List<Finding> findings) {
		return findings.stream().map(Finding::getRepresents).mapToDouble(s -> {
			final var key = s.getRulekey();
			if("java:S1845".equals(key)) {
				s.setSeverity("Blocker");
				return 4;
			}
			else if ("java:S115".equals(key) || "java:S1192".equals(key) || "java:S1186".equals(key)
					|| "java:S3776".equals(key)) {
				s.setSeverity("Critical");
				System.out.println("Critical");
				return 3;
			} else if ("java:S4144".equals(key) || "java:S1700".equals(key) || "java:S1172".equals(key) || "java:S5993".equals(key) || "java:S5869".equals(key) || "java:S1068".equals(key) || "java:S110".equals(key)||"java:S5738".equals(key) || "java:S6355".equals(key) || "java:S1123".equals(key) || "java:S2259".equals(key) || "java:S3864".equals(key)||"java:S1118".equals(key) || "java:S3740".equals(key) || "java:S2629".equals(key) || "java:S2139".equals(key) || "java:S107".equals(key) ||"java:S6019".equals(key) || "java:S112".equals(key) || "java:S1161".equals(key) || "java:S125".equals(key)
					|| "java:S2226".equals(key) || "java:S5960".equals(key) || "java:S1854".equals(key)
					|| "java:S1141".equals(key) || "java:S1149".equals(key)) {
				s.setSeverity("Major");
				return 2;
			} else if ("java:S5411".equals(key) || "java:S1301".equals(key) || "java:S4276".equals(key)||"java:S1611".equals(key) || "java:S1612".equals(key) || "java:S1128".equals(key) || "java:S120".equals(key) || "java:S1989".equals(key) || "java:S116".equals(key)
					|| "java:S1450".equals(key) || "java:S1130".equals(key) || "java:S1488".equals(key)
					|| "java:S100".equals(key) || "java:S2293".equals(key) || "java:S1124".equals(key)
					|| "java:S117".equals(key) || "java:S1874".equals(key) || "java:S2065".equals(key)
					|| "java:S1155".equals(key) || "java:S1858".equals(key)) {
				s.setSeverity("Minor");
				return 1;
			} else if ("java:S1133".equals(key) || "java:S1135".equals(key)) {
				s.setSeverity("Info");
				return 0;
			} else {
				System.err.println("Unknown severity: "+key);
				return -1;
			}
		}).toArray();
	}
}
