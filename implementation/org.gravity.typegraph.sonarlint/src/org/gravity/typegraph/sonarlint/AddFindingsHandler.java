package org.gravity.typegraph.sonarlint;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobGroup;
import org.eclipse.jdt.core.IJavaProject;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.ui.handler.UISelectionHelper;

public class AddFindingsHandler extends AbstractHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final List<IJavaProject> selection = UISelectionHelper.getSelection(event).stream()
				.filter(IJavaProject.class::isInstance).map(IJavaProject.class::cast).collect(Collectors.toList());
		if (selection.isEmpty()) {
			return null;
		}
		final var jobgroup = new JobGroup("Add SonarLint Findings to selected PMs", 0, 0);
		for (final IJavaProject project : selection) {
			final var name = project.getProject().getName();
			final Job job = new Job("Add SonarLint Findings to PM of " + name) {

				@Override
				protected IStatus run(final IProgressMonitor monitor) {
					try {
						if (SonarLintProcessor.addSonarLintFindingsToPM(project.getProject(), null) != null) {
							return Status.OK_STATUS;
						}
					} catch (CoreException | NoConverterRegisteredException | IOException e) {
						return new Status(IStatus.ERROR, this.getClass(),
								"Adding SonarLint findings to PM failed for project " + name + " due to an Exception!",
								e);
					}
					return new Status(IStatus.ERROR, this.getClass(),
							"Adding SonarLint findings to PM failed for project " + name + "!");
				}
			};
			job.setJobGroup(jobgroup);
			job.schedule();
		}
		return null;
	}

}
