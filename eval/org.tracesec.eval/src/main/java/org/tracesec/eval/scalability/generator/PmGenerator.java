package org.tracesec.eval.scalability.generator;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.gravity.security.annotations.requirements.RequirementsPackage;
import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TypeGraph;
import org.tracesec.eval.scalability.Distribution;

public class PmGenerator {

	private static final float LLOC_PER_ELEMENT = 200000/2300f;

	private final Random rnd = new SecureRandom();

	private final ResourceSet set;

	public static void main(final String[] args) throws IOException {
		final var pm = new PmGenerator(new ResourceSetImpl()).generate(URI.createFileURI("pm.xmi"), 50000);
		pm.eResource().save(Collections.emptyMap());
	}

	public PmGenerator(final ResourceSet set) {
		this.set = set;
		getSet().getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		getSet().getPackageRegistry().put(RequirementsPackage.eNS_URI, RequirementsPackage.eINSTANCE);
		getSet().getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
	}

	public static int expectedPMElements(final int lloc) {
		return (int) (lloc/LLOC_PER_ELEMENT);
	}

	public TypeGraph generate(final URI uri, final int size) {
		final var resource = getSet().createResource(uri);
		final var pm = BasicFactory.eINSTANCE.createTypeGraph();
		resource.getContents().add(pm);

		for (var i = 0; i < (Distribution.instance.distribution.get(BasicPackage.eINSTANCE.getTPackage())
				* size); i++) {
			createPackage(pm);
		}

		for (var i = 0; i < (Distribution.instance.distribution.get(BasicPackage.eINSTANCE.getTClass()) * size); i++) {
			createClass(pm);
		}

		for (var i = 0; i < (Distribution.instance.distribution.get(BasicPackage.eINSTANCE.getTInterface())
				* size); i++) {
			createInterface(pm);
		}

		final var types = pm.getAllTypes();

		final var fieldDefs = createFields(size, pm, types);
		final var methodDefs = createMethods(size, pm, types);
		createAccesses(size, fieldDefs, methodDefs);

		System.out.println("PM with "+size+" nodes (~"+((size)*LLOC_PER_ELEMENT)+"lloc)");
		return pm;
	}

	/**
	 * @param size
	 * @param fieldDefs
	 * @param methodDefs
	 */
	private void createAccesses(final int size, final ArrayList<TFieldDefinition> fieldDefs,
			final ArrayList<TMethodDefinition> methodDefs) {
		final var members = new ArrayList<TMember>(fieldDefs.size()+methodDefs.size());
		members.addAll(fieldDefs);
		members.addAll(methodDefs);
		createMethodAccesses(methodDefs, members,size);
		createFieldAccesses(fieldDefs, members,size);
	}

	/**
	 * @param size
	 * @param pm
	 * @param types
	 * @return
	 */
	private ArrayList<TMethodDefinition> createMethods(final int size, final TypeGraph pm,
			final EList<TAbstractType> types) {
		final var numOfMethods = (int) (Distribution.instance.distribution.get(BasicPackage.eINSTANCE.getTMethod())
				* size);
		final var numOfMethodSigs = (int) (Distribution.instance.distribution
				.get(BasicPackage.eINSTANCE.getTMethodSignature()) * size);
		final var numOfMethodDefs = (int) (Distribution.instance.distribution
				.get(BasicPackage.eINSTANCE.getTMethodDefinition()) * size);


		final var methodSigs = new ArrayList<TMethodSignature>(numOfMethodSigs);
		final var methodDefs = new ArrayList<TMethodDefinition>(numOfMethodDefs);

		for (var i = 0; i < numOfMethods; i++) {
			final var name = BasicFactory.eINSTANCE.createTMethod();
			name.setTName(nextName("m"));
			pm.getMethods().add(name);

			final var sig = createMethodSignature(types, name);
			methodSigs.add(sig);
			methodDefs.add(createMethodDefinition(types, sig));
		}
		for (var i = numOfMethods; i < numOfMethodSigs; i++) {
			final var name = pm.getMethods().get(this.rnd.nextInt(pm.getMethods().size()));
			final var sig = createMethodSignature(types, name);
			methodSigs.add(sig);
			methodDefs.add(createMethodDefinition(types, sig));
		}
		for (var i = numOfMethodSigs; i < numOfMethodDefs; i++) {
			methodDefs.add(createMethodDefinition(types, methodSigs.get(this.rnd.nextInt(methodSigs.size()))));
		}
		addParameters(types, methodSigs,size);
		return methodDefs;
	}

	/**
	 * @param size
	 * @param pm
	 * @param types
	 * @return
	 */
	private ArrayList<TFieldDefinition> createFields(final int size, final TypeGraph pm,
			final EList<TAbstractType> types) {
		final var numOfFields = (int) (Distribution.instance.distribution.get(BasicPackage.eINSTANCE.getTField())
				* size);
		final var numOfFieldSigs = (int) (Distribution.instance.distribution
				.get(BasicPackage.eINSTANCE.getTFieldSignature()) * size);
		final var numOfFieldDefs = (int) (Distribution.instance.distribution
				.get(BasicPackage.eINSTANCE.getTFieldDefinition()) * size);


		final var fieldSigs = new ArrayList<TFieldSignature>(numOfFieldSigs);
		final var fieldDefs = new ArrayList<TFieldDefinition>(numOfFieldDefs);

		for (var i = 0; i < numOfFields; i++) {
			final var field = BasicFactory.eINSTANCE.createTField();
			field.setTName(nextName("f"));
			pm.getFields().add(field);

			final var sig = createFieldSignature(types, field);
			fieldSigs.add(sig);
			fieldDefs.add(createFieldDefinition(types, sig));
		}
		for (var i = numOfFields; i < numOfFieldSigs; i++) {
			final var field = pm.getFields().get(this.rnd.nextInt(pm.getFields().size()));
			final var sig = createFieldSignature(types, field);
			fieldSigs.add(sig);
			fieldDefs.add(createFieldDefinition(types, sig));
		}
		for (var i = numOfFieldSigs; i < numOfFieldDefs; i++) {
			fieldDefs.add(createFieldDefinition(types, fieldSigs.get(this.rnd.nextInt(fieldSigs.size()))));
		}
		return fieldDefs;
	}

	private void addParameters(final EList<TAbstractType> types, final ArrayList<TMethodSignature> sigs, final int size) {
		for(var i = 0; i < (Distribution.instance.distribution.get(BasicPackage.eINSTANCE.getTParameter())*size); i++){
			final var sig = sigs.get(this.rnd.nextInt(sigs.size()));
			TParameter prev = null;
			var next = sig.getFirstParameter();
			while(next != null) {
				prev = next;
				next = prev.getNext();
			}
			next = BasicFactory.eINSTANCE.createTParameter();
			if(prev == null) {
				sig.setFirstParameter(next);
			}
			else {
				next.setPrevious(prev);
			}
			next.setType(types.get(this.rnd.nextInt(types.size())));
			sig.getParameters().add(next);
		}
	}

	private void createFieldAccesses(final ArrayList<TFieldDefinition> fieldDefs, final ArrayList<TMember> members, final int size) {
		for(var i = 0; i < (Distribution.instance.distribution.get(BasicPackage.eINSTANCE.getTRead())*size); i++){
			final var read = BasicFactory.eINSTANCE.createTReadWrite();
			read.setSource(members.get(this.rnd.nextInt(members.size())));
			read.setTarget(fieldDefs.get(this.rnd.nextInt(fieldDefs.size())));
		}
	}

	private void createMethodAccesses(final ArrayList<TMethodDefinition> methodDefs, final ArrayList<TMember> members, final int size) {
		for (var i = 0; i < (Distribution.instance.distribution.get(BasicPackage.eINSTANCE.getTCall())*size); i++) {
			final var call = BasicFactory.eINSTANCE.createTCall();
			call.setSource(members.get(this.rnd.nextInt(members.size())));
			call.setTarget(methodDefs.get(this.rnd.nextInt(methodDefs.size())));
		}
	}

	private TMethodDefinition createMethodDefinition(final List<TAbstractType> types, final TMethodSignature sig) {
		final var def = BasicFactory.eINSTANCE.createTMethodDefinition();
		def.setReturnType(sig.getReturnType());
		addDefinition(types, sig, def);
		return def;
	}

	private TFieldDefinition createFieldDefinition(final List<TAbstractType> types, final TFieldSignature sig) {
		final var def = BasicFactory.eINSTANCE.createTFieldDefinition();
		addDefinition(types, sig, def);
		return def;
	}

	private void addDefinition(final List<TAbstractType> types, final TSignature sig, final TMember def) {
		def.setSignature(sig);

		var type = types.get(this.rnd.nextInt(types.size()));
		while (type.getSignature().contains(sig)) {
			type = types.get(this.rnd.nextInt(types.size()));
		}
		type.getDefines().add(def);
		type.getSignature().add(sig);
	}

	private TMethodSignature createMethodSignature(final List<TAbstractType> types, final TMethod name) {
		final var sig = BasicFactory.eINSTANCE.createTMethodSignature();
		sig.setMethod(name);
		sig.setReturnType(types.get(this.rnd.nextInt(types.size())));
		return sig;
	}

	private TFieldSignature createFieldSignature(final EList<TAbstractType> types, final TField field) {
		final var sig = BasicFactory.eINSTANCE.createTFieldSignature();
		sig.setField(field);
		sig.setType(types.get(this.rnd.nextInt(types.size())));
		return sig;
	}

	private void createClass(final TypeGraph pm) {
		final var root = getRandomPackage();
		final var tClass = BasicFactory.eINSTANCE.createTClass();
		tClass.setTName(nextName("c"));
		root.getAllTypes().add(tClass);
		root.getClasses().add(tClass);
		pm.getClasses().add(tClass);
		pm.getAllTypes().add(tClass);
	}

	/**
	 * @param pm
	 */
	private void createInterface(final TypeGraph pm) {
		final var root = getRandomPackage();
		final var iface = BasicFactory.eINSTANCE.createTInterface();
		iface.setTName(nextName("i"));
		root.getAllTypes().add(iface);
		root.getInterfaces().add(iface);
		pm.getInterfaces().add(iface);
		pm.getAllTypes().add(iface);

		for (var j = 0; j < this.rnd.nextInt(3); j++) {
			pm.getClasses().get(this.rnd.nextInt(pm.getClasses().size())).getImplements().add(iface);
		}
	}

	/**
	 * @return
	 */
	private TPackage getRandomPackage() {
		return (TPackage) this.packageRoots.get(1 + this.rnd.nextInt(this.packageRoots.size() - 1));
	}

	private final List<EObject> packageRoots = new LinkedList<>();

	private TPackage createPackage(final TypeGraph pm) {
		if (this.packageRoots.isEmpty()) {
			this.packageRoots.add(pm);
		}
		final var root = this.packageRoots.get(this.rnd.nextInt(this.packageRoots.size()));
		final var p = BasicFactory.eINSTANCE.createTPackage();
		p.setTName(nextName("p"));
		if (root instanceof TypeGraph) {
			((TypeGraph) root).getPackages().add(p);
		} else {
			((TPackage) root).getSubpackages().add(p);
		}
		this.packageRoots.add(p);
		return p;
	}

	private final Map<String, Integer> ids = new HashMap<>();

	private String nextName(final String prefix) {
		return prefix + this.ids.compute(prefix, (k, v) -> v == null ? 0 : v + 1);
	}

	public ResourceSet getSet() {
		return this.set;
	}
}
