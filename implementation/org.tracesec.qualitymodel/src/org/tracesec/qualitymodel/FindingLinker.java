package org.tracesec.qualitymodel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding;

public class FindingLinker {

	public static boolean linkFindings(final QualityModel qm, final List<SonarlintFinding> findings) {
		final Map<String, String> issues = new HashMap<>();
		issues.put("MSC11-J", "java:S2226"); // Secrecy
		issues.put("CWE-600", "java:S1989"); // Secrecy
		issues.put("ERR01-J", "java:S1989"); // Secrecy
		issues.put("OWASP Top 10 2017 Category A3", "java:S1989"); // Secrecy
		// issues.put("CWE-477", "java:S1874");
		// issues.put("MET02-J", "java:S1874");
		// issues.put("CWE-563", "java:S1854");
		// issues.put("MSC13-C", "java:S1854");
		// issues.put("MSC56-J", "java:S1854");
		// issues.put("CWE-546", "java:S1135");

		final var result = qm.getRoot().getAspects().stream().map(Aspect::getQuality)
				.filter(quality -> "secrecy".equalsIgnoreCase(quality.getTitle())).findAny();
		if (result.isPresent()) {
			final var secrecy = result.get();
			for (final SonarlintFinding finding : findings) {
				for(final Entry<String, String> entry : issues.entrySet()) {
					if(entry.getValue().equals(finding.getRulekey())) {
						secrecy.getRelevantElements().add(finding);
					}
				}
			}
		}

		return true;
	}
}
