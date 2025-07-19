package org.tracesec.prioritization.ui.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gravity.eclipse.ui.handler.UISelectionHelper;
import org.gravity.eclipse.util.EMFUtil;
import org.tracesec.prioritization.prioritization.prioritization.Prioritization;
import org.tracesec.prioritization.ui.view.IssuesView;

public class OpenViewerHandler extends AbstractHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final var selection = UISelectionHelper.getSelection(event);
		if (selection.size() == 1) {
			final var object = selection.get(0);
			if (object instanceof final IFile file) {
				final var contents = new ResourceSetImpl().getResource(EMFUtil.getPlatformResourceURI(file), true)
						.getContents();
				if (contents.size() == 1) {
					final var content = contents.get(0);
					if (content instanceof final Prioritization prioritization) {
						IssuesView.getIssuesView().populate(prioritization, file.getProject());
					}
				}
			}
		}
		return null;
	}
}
