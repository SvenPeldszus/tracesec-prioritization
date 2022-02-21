package org.tracesec.prioritization;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.moflon.tgg.runtime.AbstractCorrespondence;
import org.moflon.tgg.runtime.CorrespondenceModel;
import org.tracesec.graph.dsl.graphConfiguration.AttributeWeight;
import org.tracesec.graph.dsl.graphConfiguration.Configuration;
import org.tracesec.graph.dsl.graphConfiguration.Consider;
import org.tracesec.graph.dsl.graphConfiguration.Namespace;
import org.tracesec.graph.dsl.graphConfiguration.NumberWeight;
import org.tracesec.graph.dsl.graphConfiguration.Type;
import org.tracesec.prioritization.tracegraph.Edge;
import org.tracesec.prioritization.tracegraph.Graph;
import org.tracesec.prioritization.tracegraph.Node;
import org.tracesec.prioritization.tracegraph.TracegraphFactory;

public class GraphBuilder {

	private final Configuration configuration;
	private final Graph graph;

	private final Map<EObject, Node> map;
	private final List<Node> nodes;
	private final List<Edge> edges;
	private final List<Resource> models;

	public GraphBuilder(final Configuration configuration, final List<EObject> models) {
		this.configuration = configuration;
		this.models = models.stream().map(EObject::eResource).collect(Collectors.toList());
		this.map = new ConcurrentHashMap<>();
		this.graph = TracegraphFactory.eINSTANCE.createGraph();
		this.nodes = this.graph.getNodes();
		this.edges = this.graph.getEdges();
	}

	public Graph getGraph() {
		return this.graph;
	}

	private Node node(final EObject object) {
		var node = this.map.get(object);
		if (node != null) {
			return node;
		}
		node = TracegraphFactory.eINSTANCE.createNode();
		node.setRepresents(object);
		node.setId(object.toString());
		this.nodes.add(node);
		this.map.put(object, node);
		return node;
	}

	private Edge edge(final Node src, final Node trg, final int capacity) {
		final var result = src.getOut().stream().filter(e -> trg.equals(e.getTrg())).findAny();
		Edge edge = null;
		if (result.isPresent()) {
			edge = result.get();
			edge.setCapacity(capacity + edge.getCapacity());
		} else {
			edge = TracegraphFactory.eINSTANCE.createEdge();
			edge.setSrc(src);
			edge.setTrg(trg);
			edge.setCapacity(capacity);
			this.edges.add(edge);
		}
		return edge;
	}

	public Node add(final EObject root) {
		final var node = node(root);
		add(getRelations(root));
		return node;
	}

	public void add(final CorrespondenceModel traces) {
		add(addCorrespondences(traces));
	}

	private void add(final Collection<Relation> relations) {
		final var relationStack = new LinkedList<>(relations);
		final Set<Object> seen = new HashSet<>();
		while (!relationStack.isEmpty()) {
			final var relation = relationStack.pop();
			if (!seen.contains(relation)) {
				seen.add(relation);
				relationStack.addAll(add(relation));
			}
		}
	}

	private Collection<Relation> addCorrespondences(final CorrespondenceModel traces) {
		final List<Relation> stack = new LinkedList<>();
		for (final AbstractCorrespondence corr : traces.getCorrespondences()) {
			final var src = getSource(corr);
			final var trg = getTarget(corr);

			if (!ignored(src.eClass()) && !ignored(trg.eClass())) {
				final var srcNode = node(src);
				stack.addAll(getRelations(src));

				final var trgNode = node(trg);
				stack.addAll(getRelations(trg));

				final var srcIdx = this.models.indexOf(src.eResource());
				final var trgIdx = this.models.indexOf(trg.eResource());
				if (srcIdx < trgIdx) {
					edge(srcNode, trgNode, trgIdx - srcIdx);
				} else if (srcIdx == trgIdx) {
					edge(srcNode, trgNode, 1);
					edge(trgNode, srcNode, 1);
				} else {
					edge(trgNode, srcNode, srcIdx - trgIdx);
				}
			}
		}
		return stack;
	}

	private EObject getTarget(final AbstractCorrespondence corr) {
		try {
			return (EObject) corr.getClass().getMethod("getTarget").invoke(corr);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			throw new IllegalStateException(e);
		}
	}

	private EObject getSource(final AbstractCorrespondence corr) {
		try {
			return (EObject) corr.getClass().getMethod("getSource").invoke(corr);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			throw new IllegalStateException(e);
		}
	}

	private List<Relation> add(final Relation relation) {
		final List<Relation> newRelations = new LinkedList<>();
		final var reference = relation.getReference();
		final var defaultWeight = getDefaultWeight(reference);

		final var src = node(relation.getSrc());
		for (final EObject trg : relation.getTrg()) {
			if (!ignored(trg.eClass())) {
				newRelations.addAll(add(src, reference, trg, defaultWeight));
			}
		}
		return newRelations;
	}

	private Collection<Relation> add(final Node src, final EReference reference, final EObject trg,
			final int defaultWeight) {
		final var configurationEdges = get(reference);

		// There is no configuration for the edge -> create a edge with default capacity
		if (configurationEdges.isEmpty()) {
			edge(src, node(trg), defaultWeight);
			return getRelations(trg);
		}

		// Search if there are association classes configured
		final var result = configurationEdges.stream().filter(e -> e.getType() != null)
				.filter(e -> e.getType().isInstance(trg))
				.reduce((e1, e2) -> (e1.getType().isSuperTypeOf(e2.getType()) ? e2 : e1));

		// There is no association class associated -> search for the weight of the
		// reference
		if (result.isEmpty()) {
			final var weight = configurationEdges.stream().filter(e -> e.getType() == null).map(e -> getWeight(e, trg))
					.findAny().orElse(defaultWeight);
			edge(src, node(trg), weight);
			return getRelations(trg);
		}

		// Create edges according to the configured association classes
		final List<Relation> newRelations = new LinkedList<>();
		final var associationClass = result.get();

		final var target = associationClass.getTarget();
		if(target == null) {
			edge(src, node(trg), getWeight(associationClass, trg));
			return getRelations(trg);
		}

		for (final EObject newTrg : Relation.getValueAsCollection(trg, target)) {
			if (!ignored(newTrg.eClass())) {
				edge(src, node(newTrg), getWeight(associationClass, newTrg));
				newRelations.addAll(getRelations(newTrg));
			}
		}
		return newRelations;
	}

	private Integer getWeight(final org.tracesec.graph.dsl.graphConfiguration.Edge edge, final EObject trg) {
		final var w = edge.getWeight();
		if (w instanceof NumberWeight) {
			return ((NumberWeight) w).getValue();
		} else {
			return ((Number) trg.eGet(((AttributeWeight) w).getValue())).intValue();
		}
	}

	private int getDefaultWeight(final EReference reference) {
		var weight = 0;
		final var type = get(reference.getEContainingClass());
		if (type != null) {
			weight = type.getDefault();
		}
		if (weight == 0) {
			final var namespace = getNamespace(reference.getEContainingClass());
			if (namespace != null) {
				weight = namespace.getDefault();
			}
		}
		if (weight == 0) {
			weight = this.configuration.getDefault();
		}
		if (weight == 0) {
			weight = 1;
		}
		return weight;
	}

	private Collection<Relation> getRelations(final EObject node) {
		return node.eClass().getEAllReferences().stream().filter(ref -> !ignored(ref))
				.map(ref -> new Relation(node, ref)).filter(r -> !r.getTrg().isEmpty()).collect(Collectors.toList());
	}

	private boolean ignored(final EReference reference) {
		final var eclass = reference.getEContainingClass();
		if (ignored(eclass)) {
			return true;
		}
		final var type = get(eclass);
		if (type != null) {
			if (type.getExclude().contains(reference)) {
				return true;
			}
			if (type.getInlcude().stream().anyMatch(i -> i.getReference() == reference)) {
				return false;
			}
			return type.getConsider() == Consider.NONE;
		}
		return false;
	}

	private boolean ignored(final EClass eclass) {
		final var namespace = getNamespace(eclass);
		if (namespace != null) {
			if (namespace.getExclude().contains(eclass)) {
				return true;
			}
			if (namespace.getInclude().parallelStream().anyMatch(i -> i.getType() == eclass)) {
				return false;
			}
			return namespace.getConsider() == Consider.NONE;
		}
		return this.configuration.getConsider() == Consider.NONE;
	}

	private Collection<org.tracesec.graph.dsl.graphConfiguration.Edge> get(final EReference reference) {
		final var type = get(reference.getEContainingClass());
		if (type != null) {
			return type.getInlcude().stream().filter(e -> e.getReference() == reference).collect(Collectors.toList());
		}
		return Collections.emptyList();
	}

	private Type get(final EClass eclass) {
		final var namespace = getNamespace(eclass);
		if (namespace != null) {
			return namespace.getInclude().stream().filter(i -> i.getType().equals(eclass)).findAny().orElse(null);
		}
		return null;
	}

	private Namespace getNamespace(final EClass eclass) {
		final Set<String> uris = new HashSet<>();
		var ePackage = eclass.getEPackage();
		while(ePackage != null) {
			uris.add(ePackage.getNsURI());
			ePackage = ePackage.getESuperPackage();
		}
		return this.configuration.getNamespaces().stream().filter(n -> uris.contains(n.getPackage())).findAny()
				.orElse(null);
	}

	public Node get(final EObject finding) {
		return this.nodes.stream().filter(n -> finding.equals(n.getRepresents())).findAny().orElse(null);
	}
}
