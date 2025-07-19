package org.tracesec.eval.scalability.generator.helpers;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

public class EMFHelper {

	public static List<EObject> getElements(final EObject root) {
		final List<EObject> elements = new LinkedList<>();
		final var it = root.eAllContents();
		while(it.hasNext()) {
			elements.add(it.next());
		}
		return elements;
	}

}
