package org.tracesec.prioritization.ui.command;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.gravity.eclipse.exceptions.NoConverterRegisteredException;
import org.gravity.eclipse.ui.GravityUiActivator;
import org.gravity.typegraph.sonarlint.SonarLintProcessor;

public class Handler extends AbstractHandler {

	private static final Logger LOGGER = Logger.getLogger(Handler.class);

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final List<IProject> selection = GravityUiActivator.getSelection(event).stream().filter(IResource.class::isInstance).map(r -> {
			while((r!=null) && !(r instanceof IProject)) {
				r = ((IResource)r).getParent();
			}
			return (IProject) r;
		}).filter(Objects::nonNull).collect(Collectors.toList());
		final IProgressMonitor monitor = new NullProgressMonitor();
		for(final IProject project : selection) {
			try {
				if(SonarLintProcessor.addSonarLintFindingsToPM(project, monitor)) {
					//TODO: Search models and show to user
				}
			} catch (CoreException | NoConverterRegisteredException e) {LOGGER.error(e);
			}
		}
		return null;
	}
}
