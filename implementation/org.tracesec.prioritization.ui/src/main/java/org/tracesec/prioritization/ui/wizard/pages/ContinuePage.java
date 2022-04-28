package org.tracesec.prioritization.ui.wizard.pages;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.tracesec.prioritization.ui.wizard.TraceSecWizard;

public class ContinuePage extends WizardPage {

	private final TraceSecWizard wizard;

	public ContinuePage(final TraceSecWizard wizard) {
		super("Use existing flow network");
		this.wizard = wizard;
	}

	@Override
	public void createControl(final Composite parent) {

		final var composite = new Composite(parent, SWT.NONE);
		final var layout = new GridLayout();
		composite.setLayout(layout);
		layout.numColumns = 1;

		final var label = new Label(composite, SWT.NONE);
		label.setText("There is already an existing flow network, you can use this network by pressing finish or construct a new network by going to the next page.");

		setControl(composite);
		setPageComplete(true);
	}

	@Override
	public boolean canFlipToNextPage() {
		return true;
	}

	@Override
	public IWizardPage getNextPage() {
		try {
			return this.wizard.addSelectionPage();
		} catch (CoreException | IOException e) {
			return null;
		}
	}
}
