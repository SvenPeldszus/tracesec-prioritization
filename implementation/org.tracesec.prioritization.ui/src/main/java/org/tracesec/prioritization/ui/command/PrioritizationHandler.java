package org.tracesec.prioritization.ui.command;

import java.io.IOException;
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
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.gravity.eclipse.ui.handler.UISelectionHelper;
import org.tracesec.prioritization.ui.wizard.TraceSecWizard;

public class PrioritizationHandler extends AbstractHandler {

	private static final Logger LOGGER = Logger.getLogger(PrioritizationHandler.class);

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final List<IProject> selection = UISelectionHelper.getSelection(event).stream().map(r -> {
			if (r instanceof IJavaProject) {
				return ((IJavaProject) r).getProject();
			}
			if (r instanceof IResource) {
				while ((r != null) && !(r instanceof IProject)) {
					r = ((IResource) r).getParent();
				}
				return (IProject) r;
			}
			return null;
		}).filter(Objects::nonNull).collect(Collectors.toList());
		for (final IProject project : selection) {
			try {
				final var dialog = new WizardDialog(Display.getDefault().getActiveShell(), new TraceSecWizard(project));
				dialog.open();
			} catch (final CoreException | IOException e) {
				LOGGER.error(e);
			}
		}
		return null;
	}
}
