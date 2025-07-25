/*
 * generated by Xtext 2.25.0
 */
package org.tracesec.graph.dsl.scoping;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.tracesec.graph.dsl.graphConfiguration.AttributeWeight;
import org.tracesec.graph.dsl.graphConfiguration.Configuration;
import org.tracesec.graph.dsl.graphConfiguration.Edge;
import org.tracesec.graph.dsl.graphConfiguration.GraphConfigurationPackage;
import org.tracesec.graph.dsl.graphConfiguration.Namespace;
import org.tracesec.graph.dsl.graphConfiguration.Type;

/**
 * This class contains custom scoping description.
 *
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class GraphConfigurationScopeProvider extends AbstractGraphConfigurationScopeProvider {

	@Override
	public IScope getScope(final EObject context, final EReference reference) {
		if (context instanceof Edge) {
			final var edge = (Edge) context;
			if (reference == GraphConfigurationPackage.eINSTANCE.getEdge_Reference()) {
				final var type = (Type) edge.eContainer();
				final var references = type.getType().getEAllReferences();
				return Scopes.scopeFor(references);
			} else if (reference == GraphConfigurationPackage.eINSTANCE.getEdge_Type()) {
				final var type = edge.getReference().getEReferenceType();
				final List<EObject> list = new ArrayList<>();
				for (final Namespace name : ((Configuration) context.eContainer().eContainer().eContainer())
						.getNamespaces()) {
					for (final EClass e : getElements(name, EClass.class)) {
						if (type.isSuperTypeOf(e)) {
							list.add(e);
						}
					}
				}
				return Scopes.scopeFor(list);
			} else if (reference == GraphConfigurationPackage.eINSTANCE.getEdge_Target()) {
				return Scopes.scopeFor(edge.getType().getEAllReferences());
			} else if (reference == GraphConfigurationPackage.eINSTANCE.getEdge_Weight()) {

			} else if (reference == GraphConfigurationPackage.eINSTANCE.getAttributeWeight_Value()) {
				final List<EAttribute> attributes = edge.getReference().getEReferenceType().getEAllAttributes().stream()
						.filter(attribute -> {
							final var type = attribute.getEAttributeType();
							return (int.class.isAssignableFrom(type.getInstanceClass()))
									|| (type instanceof EEnum);
						})
						.collect(Collectors.toList());
				return Scopes.scopeFor(attributes);
			}
		} else if ((context instanceof Type)) {
			if (reference == GraphConfigurationPackage.eINSTANCE.getType_Type()) {
				return Scopes.scopeFor(getElements((Namespace) context.eContainer(), EClass.class));
			} else if (reference == GraphConfigurationPackage.eINSTANCE.getEdge_Type()) {

			}
		} else if (context instanceof AttributeWeight) {
			final var referenceType = ((Edge) context.eContainer()).getReference().getEReferenceType();
			if (referenceType != null) {
				final List<EAttribute> attributes = referenceType.getEAllAttributes().stream()
						.filter(a -> {
							final var eAttributeType = a.getEAttributeType();
							return (eAttributeType instanceof EEnum) || (eAttributeType.getInstanceClass() == int.class);
						})
						.collect(Collectors.toList());
				return Scopes.scopeFor(attributes);
			}
		}
		return super.getScope(context, reference);
	}

	private <T extends EObject> List<T> getElements(final Namespace namespace, final Class<T> type) {
		final List<T> elements = new LinkedList<>();
		final var it = namespace.eResource().getResourceSet().getResource(URI.createURI(namespace.getPackage()), true)
				.getAllContents();
		while (it.hasNext()) {
			final var next = it.next();
			if ((type.isInstance(next))) {
				elements.add(type.cast(next));
			}
		}
		return elements;
	}
}
