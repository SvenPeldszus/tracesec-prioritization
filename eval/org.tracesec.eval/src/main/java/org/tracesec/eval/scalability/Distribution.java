package org.tracesec.eval.scalability;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.gravity.typegraph.basic.BasicPackage;

public class Distribution {

	public static Distribution instance = new Distribution();

	public final Map<EClass, Float> distribution = new HashMap<>();

	private Distribution() {
		this.distribution.put(BasicPackage.eINSTANCE.getTClass(), (float) 1176 / 111237);
		this.distribution.put(BasicPackage.eINSTANCE.getTMethodDefinition(), (float) 6799 / 111237);
		this.distribution.put(BasicPackage.eINSTANCE.getTCall(), (float) 65578 / 111237);
		this.distribution.put(BasicPackage.eINSTANCE.getTRead(), (float) 18510 / 111237);
		this.distribution.put(BasicPackage.eINSTANCE.getTFieldDefinition(), (float) 3110 / 111237);
		this.distribution.put(BasicPackage.eINSTANCE.getTFieldSignature(), (float) 1714 / 111237);
		this.distribution.put(BasicPackage.eINSTANCE.getTPackage(), (float) 171 / 111237);
		this.distribution.put(BasicPackage.eINSTANCE.getTMethodSignature(), (float) 5192 / 111237);
		this.distribution.put(BasicPackage.eINSTANCE.getTMethod(), (float) 4538 / 111237);
		this.distribution.put(BasicPackage.eINSTANCE.getTypeGraph(), (float) 1 / 111237);
		this.distribution.put(BasicPackage.eINSTANCE.getTParameter(), (float) 2890 / 111237);
		this.distribution.put(BasicPackage.eINSTANCE.getTField(), (float) 1442 / 111237);
		this.distribution.put(BasicPackage.eINSTANCE.getTInterface(), (float) 116 / 111237);
	}
}