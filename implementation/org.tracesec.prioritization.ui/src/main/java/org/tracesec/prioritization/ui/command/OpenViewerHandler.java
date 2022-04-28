package org.tracesec.prioritization.ui.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gravity.eclipse.ui.GravityUiActivator;
import org.gravity.eclipse.util.EMFUtil;
import org.tracesec.prioritization.prioritization.prioritization.Prioritization;
import org.tracesec.prioritization.ui.view.IssuesView;

public class OpenViewerHandler extends AbstractHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final var selection = GravityUiActivator.getSelection(event);
		if(selection.size() == 1) {
			final var object = selection.get(0);
			if (object instanceof IFile) {
				final var file = (IFile) object;
				final var contents = new ResourceSetImpl().getResource(EMFUtil.getPlatformResourceURI( file),true).getContents();
				if(contents.size() == 1) {
					final var content = contents.get(0);
					if (content instanceof Prioritization) {
						IssuesView.getIssuesView().populate((Prioritization) content, file.getProject());
					}
				}
			}
		}
		return null;
	}
}
