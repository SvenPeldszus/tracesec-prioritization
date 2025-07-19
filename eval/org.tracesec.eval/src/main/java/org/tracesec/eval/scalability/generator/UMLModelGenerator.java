package org.tracesec.eval.scalability.generator;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.gravity.tgg.pm.uml.UmlFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TypeGraph;
import org.moflon.tgg.runtime.CorrespondenceModel;
import org.moflon.tgg.runtime.RuntimeFactory;

public class UMLModelGenerator {

	private static final int MIN_COMPONENTS = 4;
	private static final int COMPONENT_VAR = 4;
	private static final int COMPONENT_SIZE = 8;
	private static final float TRACED_CLASSES = 0.6f;

	private static final Random rnd = new SecureRandom();
	private final ResourceSet set;

	public UMLModelGenerator(final ResourceSet set) {
		this.set = set;
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
				UMLResource.Factory.INSTANCE);
	}

	public CorrespondenceModel generate(final TypeGraph pm, final URI modelURI, final URI corrURI) {
		final var model = UMLFactory.eINSTANCE.createModel();
		this.set.createResource(modelURI).getContents().add(model);

		final var corr = RuntimeFactory.eINSTANCE.createCorrespondenceModel();
		corr.setSource(model);
		corr.setTarget(pm);
		this.set.createResource(corrURI).getContents().add(corr);

		final Map<TAbstractType, Component> type2component = new HashMap<>();
		final Map<Component, List<TAbstractType>> component2types = new HashMap<>();
		final var components = components(pm, MIN_COMPONENTS, TRACED_CLASSES, COMPONENT_SIZE, COMPONENT_VAR);
		for (final List<TAbstractType> types : components) {
			final var component = UMLFactory.eINSTANCE.createComponent();
			model.getPackagedElements().add(component);

			component2types.put(component, types);
			for (final TAbstractType type : types) {
				final var c = UmlFactory.eINSTANCE.createElement2TAnnotatable();
				c.setSource(component);
				c.setTarget(type);
				corr.getCorrespondences().add(c);
				type2component.put(type, component);
			}
		}
		for (final Entry<Component, List<TAbstractType>> entry : component2types.entrySet()) {
			entry.getValue().stream().map(UMLModelGenerator::getNeighbours).flatMap(Set::stream)
			.map(type2component::get).filter(Objects::nonNull).forEach(target -> {
				entry.getKey().createDependency(target);
			});
		}

		final var m2p = UmlFactory.eINSTANCE.createModel2TypeGraph();
		m2p.setSource(model);
		m2p.setTarget(pm);
		corr.getCorrespondences().add(m2p);

		System.out.println(corr.getCorrespondences().size()+" tracelinks betwen UML and PM");
		System.out.println("UML model with "+components.size()+" components");

		return corr;
	}

	private static List<List<TAbstractType>> components(final TypeGraph pm, final int min, final float consider, final int size, final int var) {
		final var types = new ArrayList<>(pm.getAllTypes());
		Collections.shuffle(types);
		var max = (int) (consider * types.size());
		int tmpSize;
		if((max/size) < min) {
			tmpSize = max/min;
		}
		else {
			tmpSize = size;
		}
		final List<List<TAbstractType>> comps = new LinkedList<>();
		while (max > 0) {
			final var compsize = (tmpSize - var) + rnd.nextInt(var * 2);
			var low = max - compsize;
			if (low < 0) {
				low = 0;
			}
			comps.add(types.subList(low, max));
			max = low;
		}
		return comps;
	}

	private static Set<TAbstractType> getNeighbours(final TAbstractType vertex) {
		return vertex.getDefines().stream().flatMap(d -> d.getAccessing().stream())
				.map(m -> m.getTarget().getDefinedBy()).collect(Collectors.toSet());
	}
}
