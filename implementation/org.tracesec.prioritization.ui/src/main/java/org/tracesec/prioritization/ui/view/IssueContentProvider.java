package org.tracesec.prioritization.ui.view;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding;
import org.gravity.typegraph.basic.TypeGraph;
import org.tracesec.prioritization.prioritization.prioritization.Prioritization;

public class IssueContentProvider implements ITreeContentProvider {

	@Override
	public Object[] getElements(final Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(final Object parentElement) {
		if (parentElement instanceof Prioritization) {
			return ((Prioritization) parentElement).getFindings().toArray();
		}
		return new Object[0];
	}

	@Override
	public Object getParent(final Object element) {
		if (element instanceof SonarlintFinding) {
			EObject root = ((SonarlintFinding) element);
			while((root != null) && !(root instanceof TypeGraph)) {
				root = root.eContainer();
			}
			return root;
		}
		return null;
	}

	@Override
	public boolean hasChildren(final Object element) {
		return element instanceof Prioritization;
	}



}
