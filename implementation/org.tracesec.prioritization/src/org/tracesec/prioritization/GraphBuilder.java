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
import org.tracesec.qualitymodel.Priority;

public class GraphBuilder {

	private static final int TRACELINK_FACTOR = 3;

	private final Configuration configuration;
	private final Graph graph;

	private final Map<EObject, Node> map;
	private final List<Edge> edges;
	private final List<EPackage> order;
	private final Set<EObject> seenRelations;
	private Map<Priority, Integer> priorityMap;

	public GraphBuilder(final Configuration configuration, final List<EPackage> order) {
		this.configuration = configuration;
		this.order = order;
		this.map = new ConcurrentHashMap<>();
		this.graph = TracegraphFactory.eINSTANCE.createGraph();
		this.edges = Collections.synchronizedList(this.graph.getEdges());
		this.seenRelations = new HashSet<>();
	}

	public GraphBuilder(final Graph graph, final Configuration configuration, final List<EPackage> order) {
		this.graph = graph;
		this.configuration = configuration;
		this.order = order;
		this.map = new ConcurrentHashMap<>(
				graph.getNodes().parallelStream().collect(Collectors.toMap(Node::getRepresents, node -> node)));
		this.edges = graph.getEdges();
		this.seenRelations = new HashSet<>(this.map.keySet());
	}

	public void setPriorityMap(final Map<Priority, Integer> map) {
		this.priorityMap = map;
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
		this.map.put(object, node);
		this.graph.getNodes().add(node);
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
		if (root instanceof final CorrespondenceModel corr) {
			this.add(corr);
			return null;
		}
		final var node = this.node(root);
		this.add(this.getRelations(root));
		return node;
	}

	public void add(final CorrespondenceModel traces) {
		this.add(this.addCorrespondences(traces));
	}

	private void add(final Collection<Relation> relations) {
		final var relationStack = new LinkedList<>(relations);
		while (!relationStack.isEmpty()) {
			relationStack.addAll(this.add(relationStack.pop()));
		}
	}

	private Collection<Relation> addCorrespondences(final CorrespondenceModel traces) {
		return traces.getCorrespondences().stream().map(AbstractCorrespondence.class::cast).flatMap(this::createEdge)
				.distinct().flatMap(node -> this.getRelations(node).stream()).collect(Collectors.toList());
	}

	/**
	 * Creates an edge representing a trace link
	 *
	 * @param corr The trace link
	 * @return The nodes involved
	 */
	private Stream<EObject> createEdge(final AbstractCorrespondence corr) {
		try {
			final var src = this.getSource(corr);
			final var trg = this.getTarget(corr);

			if (!this.ignored(src.eClass()) && !this.ignored(trg.eClass())) {
				final var srcNode = this.node(src);
				final var trgNode = this.node(trg);

				final var srcIdx = this.order.indexOf(src.eClass().getEPackage());
				final var trgIdx = this.order.indexOf(trg.eClass().getEPackage());
				if (srcIdx > trgIdx) {
					this.edge(srcNode, trgNode, (srcIdx - trgIdx) * TRACELINK_FACTOR);
				} else if (srcIdx == trgIdx) {
					this.edge(srcNode, trgNode, TRACELINK_FACTOR);
					this.edge(trgNode, srcNode, TRACELINK_FACTOR);
				} else {
					this.edge(trgNode, srcNode, (trgIdx - srcIdx) * TRACELINK_FACTOR);
				}
				return Stream.of(src, trg);
			}
		} catch (final NullPointerException e) {
			e.printStackTrace();
		}
		return Stream.empty();
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
		final var defaultWeight = this.getDefaultWeight(reference);

		final var src = this.node(relation.getSrc());
		for (final EObject trg : relation.getTrg()) {
			newRelations.addAll(this.add(src, reference, trg, defaultWeight));
		}
		return newRelations;
	}

	private Collection<Relation> add(final Node src, final EReference reference, final EObject trg,
			final int defaultWeight) {
		final var configurationEdges = this.get(reference);

		// There is no configuration for the edge -> create a edge with default capacity
		if (configurationEdges.isEmpty()) {
			if (!this.ignored(trg.eClass())) {
				this.edge(src, this.node(trg), defaultWeight);
				return this.getRelations(trg);
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
			final var weight = configurationEdges.stream().filter(e -> e.getType() == null)
					.map(e -> this.getWeight(e, trg)).findAny().orElse(defaultWeight);
			this.edge(src, this.node(trg), weight);
			return this.getRelations(trg);
		}

		// Create edges according to the configured association classes
		final List<Relation> newRelations = new LinkedList<>();
		final var associationClass = result.get();

		final var target = associationClass.getTarget();
		if (target == null) {
			this.edge(src, this.node(trg), this.getWeight(associationClass, trg));
			return this.getRelations(trg);
		}

		for (final EObject newTrg : Relation.getValueAsCollection(trg, target)) {
			if (!this.ignored(newTrg.eClass())) {
				this.edge(src, this.node(newTrg), this.getWeight(associationClass, trg));
				newRelations.addAll(this.getRelations(newTrg));
			}
		}
		return newRelations;
	}

	private Integer getWeight(final org.tracesec.graph.dsl.graphConfiguration.Edge edge, final EObject trg) {
		final var w = edge.getWeight();
		if (w instanceof NumberWeight) {
			return ((NumberWeight) w).getValue();
		}
		final var value = trg.eGet(((AttributeWeight) w).getValue());
		if (value instanceof Number) {
			return ((Number) value).intValue();
		}
		if ((value instanceof Priority) && (this.priorityMap != null)) {
			return this.priorityMap.get(value);
		}
		return ((Enumerator) value).getValue();
	}

	private int getDefaultWeight(final EReference reference) {
		var weight = 0;
		final var type = this.get(reference.getEContainingClass());
		if (type != null) {
			weight = type.getDefault();
		}
		if (weight == 0) {
			final var namespace = this.getNamespace(reference.getEContainingClass());
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
		if (!this.seenRelations.contains(node)) {
			for (final EReference ref : node.eClass().getEAllReferences()) {
				if (!this.ignored(ref)) {
					final var relation = new Relation(node, ref);
					if (!relation.getTrg().isEmpty()) {
						relations.add(relation);
					}
				}
			}
		}
		this.seenRelations.add(node);
		return relations;
	}

	private boolean ignored(final EReference reference) {
		final var eclass = reference.getEContainingClass();
		if (this.ignored(eclass)) {
			return true;
		}
		final var type = this.get(eclass);
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
		final var namespace = this.getNamespace(eclass);
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
		final var type = this.get(reference.getEContainingClass());
		if (type != null) {
			return type.getInlcude().stream().filter(e -> e.getReference() == reference).collect(Collectors.toList());
		}
		return Collections.emptyList();
	}

	private Type get(final EClass eclass) {
		final var namespace = this.getNamespace(eclass);
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
}
