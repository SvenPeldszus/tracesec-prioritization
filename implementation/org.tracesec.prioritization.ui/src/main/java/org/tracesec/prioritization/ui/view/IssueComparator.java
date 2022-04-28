package org.tracesec.prioritization.ui.view;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.tracesec.prioritization.prioritization.prioritization.Finding;
import org.tracesec.prioritization.prioritization.prioritization.Prioritization;

public class IssueComparator extends ViewerComparator {
	private static final int DESCENDING = 1;
	private int direction = DESCENDING;
	private int propertyIndex;

	public IssueComparator() {
		this.propertyIndex = 0;
		this.direction = DESCENDING;
	}

	@Override
	public int compare(final Viewer viewer, final Object e1, final Object e2) {
		final var p1 = (Finding) e1;
		final var p2 = (Finding) e2;
		var rc = 0;
		switch (this.propertyIndex) {
		case 0:
			final var findings = ((Prioritization)p1.eContainer()).getFindings();
			rc = findings.indexOf(p1) - findings.indexOf(p2);
			break;
		case 1:
			rc = p1.getRepresents().getTAnnotated().eClass().getName().compareTo(p2.getRepresents().getTAnnotated().eClass().getName());
			break;
		case 2:
			rc = p1.getRepresents().getTAnnotated().toString().compareTo(p2.getRepresents().getTAnnotated().toString());
			break;
		case 3:
			rc = p1.getPriority() - (p2.getPriority());
			break;
		case 4:
			rc = p1.getManualPriority() - (p2.getManualPriority());
			break;
		case 5:
			rc = p1.getRepresents().getRulekey().compareTo(p2.getRepresents().getRulekey());
			break;
		case 6:
			rc = p1.getRepresents().getDescription().compareTo(p2.getRepresents().getDescription());
			break;
		default:
			rc = 0;
		}
		// If descending order, flip the direction
		if (this.direction == DESCENDING) {
			rc = -rc;
		}
		return rc;
	}

	public void setColumn(final int column) {
		if (column == this.propertyIndex) {
			// Same column as last sort; toggle the direction
			this.direction = 1 - this.direction;
		} else {
			// New column; do an ascending sort
			this.propertyIndex = column;
			this.direction = DESCENDING;
		}
	}
	public int getDirection() {
		return this.direction == 1 ? SWT.DOWN : SWT.UP;
	}
}
