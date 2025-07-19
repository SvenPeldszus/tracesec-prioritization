package org.tracesec.eval.prioritization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EPackage;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding;
import org.tracesec.prioritization.DinicsAlgorithm;
import org.tracesec.prioritization.Priorizitation;
import org.tracesec.prioritization.graph.ResidualEdge;
import org.tracesec.prioritization.graph.ResidualNode;
import org.tracesec.prioritization.tracegraph.Graph;
import org.tracesec.prioritization.tracegraph.Node;

public class CountingPriorizitation extends Priorizitation {

	private final List<Integer> internalUsedEdges = new ArrayList<>();
	private final List<Integer> externalUsedEdges = new ArrayList<>();
	private final List<Integer> internalUsedEdgeCapacities = new ArrayList<>();
	private final List<Integer> externalUsedEdgeCapacities = new ArrayList<>();

	@Override
	protected Integer prioritize(final Collection<SonarlintFinding> findings, final Graph graph, final Node sourceNode,
			final SonarlintFinding finding, final DinicsAlgorithm algo) {
		final var priority = super.prioritize(findings, graph, sourceNode, finding, algo);
		final var partions = algo.getEdges().parallelStream().filter(e -> e.getFlow() > 0)
				.collect(Collectors.partitioningBy(p -> getEPackage(p.getSrc(), graph.getNodes())
						.equals(getEPackage(p.getTrg(), graph.getNodes()))));

		final var internal = partions.get(true);
//		System.out.println("Intenral edges: " + internal.size());
		final var external = partions.get(false);
//		System.out.println("External edges: " + external.size());

		final var internalUsedEdges = internal.parallelStream().filter(e -> e.getOppisite() != null).toList();
		this.getInternalUsedEdges().add(internalUsedEdges.size());
//		System.out.println("Internal edges on flow: " + internalUsedEdges.size());
		final var externalUsedEdges = external.parallelStream().filter(e -> e.getOppisite() != null).toList();
		this.getExternalUsedEdges().add(externalUsedEdges.size());
//		System.out.println("External edges on flow: " + externalUsedEdges.size());

		final var internalFlowCapacity = internalUsedEdges.parallelStream().mapToInt(ResidualEdge::getFlow)
				.sum();
//		System.out.println("Internal used flow capacity: " + internalFlowCapacity);
		this.getInternalUsedEdgeCapacities().add(internalFlowCapacity);
		final var externalFlowCapacity = externalUsedEdges.parallelStream()
				.mapToInt(ResidualEdge::getFlow)
				.sum();
//		System.out.println("External used flow capacity: " + externalFlowCapacity);
		this.getExternalUsedEdgeCapacities().add(externalFlowCapacity);
		return priority;
	}

	private static EPackage getEPackage(final ResidualNode src, final List<Node> nodes) {
		return nodes.get(src.getId()).getRepresents().eClass().getEPackage();
	}

	public List<Integer> getInternalUsedEdges() {
		return this.internalUsedEdges;
	}

	public List<Integer> getExternalUsedEdges() {
		return this.externalUsedEdges;
	}

	public List<Integer> getInternalUsedEdgeCapacities() {
		return this.internalUsedEdgeCapacities;
	}

	public List<Integer> getExternalUsedEdgeCapacities() {
		return this.externalUsedEdgeCapacities;
	}
}
