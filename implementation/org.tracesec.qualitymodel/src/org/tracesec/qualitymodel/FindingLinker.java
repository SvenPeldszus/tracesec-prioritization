package org.tracesec.qualitymodel;

import java.util.List;

import org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding;
import org.sonarlint.eclipse.core.internal.SonarLintCorePlugin;
import org.sonarsource.sonarlint.core.client.api.common.RuleDetails;

@SuppressWarnings("restriction")
public class FindingLinker {

	public static boolean linkFindings(final QualityModel qm, final List<SonarlintFinding> findings) {

		final var client = SonarLintCorePlugin.getInstance().getDefaultSonarLintClientFacade();
		for(final SonarlintFinding finding : findings) {
			final RuleDetails desc = client.getRuleDescription(finding.getRulekey());
		}

		return true;
	}
}
