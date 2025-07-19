package org.tracesec.eval.scalability.generator.testing;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TypeGraph;
import org.tracesec.eval.scalability.generator.PmGenerator;

public class StronglyConnectedComponents {

	public static void main(final String[] args) {
		final var pm = new PmGenerator(new ResourceSetImpl()).generate(URI.createFileURI("pm.xmi"), 5000);

		final var comps = new StronglyConnectedComponents().components(pm);
		for (final Set<TAbstractType> c : comps) {
			System.out.println(c.stream().map(TAbstractType::getTName).collect(Collectors.toList()));
		}
	}

	int index = 0;
	Map<TAbstractType, Integer> indices = new HashMap<>();
	Map<TAbstractType, Integer> low = new HashMap<>();
	Deque<TAbstractType> stack = new LinkedList<>();

	final Set<Set<TAbstractType>> components = new HashSet<>();

	private Set<Set<TAbstractType>> components(final TypeGraph pm) {
		for (final TAbstractType vertex : pm.getAllTypes()) {
			if (!this.indices.containsKey(vertex)) {
				strongconnect(vertex);
			}
		}
		return this.components;
	}

	private void strongconnect(final TAbstractType vertex) {
		this.indices.put(vertex, this.index);
		this.low.put(vertex, this.index);
		this.index++;

		this.stack.push(vertex);
		for (final TAbstractType suc : getNeighbours(vertex)) {
			if (!this.indices.containsKey(suc)) {
				strongconnect(suc);
				this.low.put(vertex, Math.min(this.low.get(vertex), this.low.get(suc)));
			} else if (this.stack.contains(suc)) {
				this.low.put(vertex, Math.min(this.low.get(vertex), this.indices.get(suc)));
			}
		}

		if (this.low.get(vertex).equals(this.indices.get(vertex))) {
			final Set<TAbstractType> component = new HashSet<>();
			TAbstractType w;
			do {
				w = this.stack.pop();
				component.add(w);
			} while (w != vertex);
			this.components.add(component);
		}
	}

	private static void visit(final List<TAbstractType> list, final Set<TAbstractType> seen,
			final TAbstractType vertex) {
		if (seen.add(vertex)) {
			for (final TAbstractType acccess : getNeighbours(vertex)) {
				visit(list, seen, acccess);
			}
			list.add(vertex);
		}
	}

	private static Set<TAbstractType> getNeighbours(final TAbstractType vertex) {
		return vertex.getDefines().stream().flatMap(d -> d.getAccessing().stream())
				.map(m -> m.getTarget().getDefinedBy()).collect(Collectors.toSet());
	}
}
