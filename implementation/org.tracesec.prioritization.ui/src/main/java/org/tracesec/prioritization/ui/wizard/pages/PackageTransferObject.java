package org.tracesec.prioritization.ui.wizard.pages;

import org.eclipse.gef.dnd.SimpleObjectTransfer;

public class PackageTransferObject  extends SimpleObjectTransfer {

	public static final PackageTransferObject INSTANCE = new PackageTransferObject();

	private PackageTransferObject() {
	}

	@Override
	protected String[] getTypeNames() {
		return new String[] {"PACKAGE_TRANSFER_OBJECT"};
	}

	@Override
	protected int[] getTypeIds() {
		return new int[] {61};
	}
}
