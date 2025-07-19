package org.tracesec.eval.scalability;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.gravity.security.annotations.requirements.RequirementsPackage;
import org.gravity.typegraph.basic.BasicPackage;

public class GetDistribution {
	public static void main(final String[] args) {
		final var set = new ResourceSetImpl();
		set.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		set.getPackageRegistry().put(RequirementsPackage.eNS_URI, RequirementsPackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		final Map<EClass, Integer> occurrences = new HashMap<>();
		final var resource = set.getResource(URI.createFileURI("pm.xmi"), true).getAllContents();
		var elements = 0;
		while(resource.hasNext()) {
			final var type = resource.next().eClass();
			if((type != BasicPackage.eINSTANCE.getTModifier()) && (type.getEPackage() == BasicPackage.eINSTANCE)) {
				elements++;
				occurrences.compute(type, (k,v) -> v == null ? 1 : v+1);
			}
		}
		for(final Entry<EClass, Integer> entry : occurrences.entrySet()) {
			System.out.println(entry.getKey().getName()+"="+entry.getValue()+ "("+((entry.getValue()/(float)elements)*100)+"%)");
		}
	}
}
