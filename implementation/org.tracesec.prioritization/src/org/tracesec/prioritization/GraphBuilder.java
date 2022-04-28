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
import java.util.stream.Stream;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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
	private final List<Edge> edges;
	private final List<EPackage> order;
	private final Set<Relation> seenRelations;

	public GraphBuilder(final Configuration configuration, final List<EPackage> order) {
		this.configuration = configuration;
		this.order = order;
		this.map = new ConcurrentHashMap<>();
		this.graph = TracegraphFactory.eINSTANCE.createGraph();
		this.edges = Collections.synchronizedList(this.graph.getEdges());
		this.seenRelations = new HashSet<>();
	}

	public Graph getGraph() {
		if(this.graph.getNodes().isEmpty()) {
			this.graph.getNodes().addAll(this.map.values());
		}
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
		if (root instanceof CorrespondenceModel) {
			add((CorrespondenceModel) root);
			return null;
		}
		final var node = node(root);
		add(getRelations(root));
		return node;
	}

	public void add(final CorrespondenceModel traces) {
		add(addCorrespondences(traces));
	}

	private void add(final Collection<Relation> relations) {
		final var relationStack = new LinkedList<>(relations);
		while (!relationStack.isEmpty()) {
			final var relation = relationStack.pop();
			if (this.seenRelations.add(relation)) {
				relationStack.addAll(add(relation));
			}
		}
	}

	private Collection<Relation> addCorrespondences(final CorrespondenceModel traces) {
		return traces.getCorrespondences().stream().flatMap(corr -> {
			try {
				final var src = getSource(corr);
				final var trg = getTarget(corr);

				if (!ignored(src.eClass()) && !ignored(trg.eClass())) {
					final var srcNode = node(src);
					final var trgNode = node(trg);

					final var srcIdx = this.order.indexOf(src.eClass().getEPackage());
					final var trgIdx = this.order.indexOf(trg.eClass().getEPackage());
					if (srcIdx > trgIdx) {
						edge(srcNode, trgNode,  srcIdx- trgIdx);
					} else if (srcIdx == trgIdx) {
						edge(srcNode, trgNode, 1);
						edge(trgNode, srcNode, 1);
					} else {
						edge(trgNode, srcNode, trgIdx - srcIdx);
					}
					return Stream.of(src, trg);
				}
			} catch (final NullPointerException e) {
				e.printStackTrace();
			}
			return Stream.empty();
		}).distinct().flatMap(node -> getRelations(node).stream()).collect(Collectors.toList());
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
			newRelations.addAll(add(src, reference, trg, defaultWeight));
		}
		return newRelations;
	}

	private Collection<Relation> add(final Node src, final EReference reference, final EObject trg,
			final int defaultWeight) {
		final var configurationEdges = get(reference);

		// There is no configuration for the edge -> create a edge with default capacity
		if (configurationEdges.isEmpty()) {
			if (!ignored(trg.eClass())) {
				edge(src, node(trg), defaultWeight);
				return getRelations(trg);
			}
			return Collections.emptyList();
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
		if (target == null) {
			edge(src, node(trg), getWeight(associationClass, trg));
			return getRelations(trg);
		}

		for (final EObject newTrg : Relation.getValueAsCollection(trg, target)) {
			if (!ignored(newTrg.eClass())) {
				edge(src, node(newTrg), getWeight(associationClass, trg));
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
			final var value = trg.eGet(((AttributeWeight) w).getValue());
			if (value instanceof Number) {
				return ((Number) value).intValue();
			} else {
				return ((Enumerator) value).getValue();
			}
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
		final List<Relation> relations = new LinkedList<>();
		for (final EReference ref : node.eClass().getEAllReferences()) {
			if (!ignored(ref)) {
				final var relation = new Relation(node, ref);
				if (!relation.getTrg().isEmpty()) {
					relations.add(relation);
				}
			}
		}
		return relations;
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
			if (namespace.getInclude().stream().anyMatch(i -> i.getType() == eclass)) {
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
		while (ePackage != null) {
			uris.add(ePackage.getNsURI());
			ePackage = ePackage.getESuperPackage();
		}
		return this.configuration.getNamespaces().stream().filter(n -> uris.contains(n.getPackage())).findAny()
				.orElse(null);
	}

	public Node get(final EObject object) {
		return this.map.get(object);
	}
}
