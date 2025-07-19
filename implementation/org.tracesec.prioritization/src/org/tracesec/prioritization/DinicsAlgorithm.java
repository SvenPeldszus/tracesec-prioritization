package org.tracesec.prioritization;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.tracesec.prioritization.graph.AugmentedResidualEdge;
import org.tracesec.prioritization.graph.ResidualEdge;
import org.tracesec.prioritization.graph.ResidualNode;
import org.tracesec.prioritization.tracegraph.Graph;
import org.tracesec.prioritization.tracegraph.Node;

public class DinicsAlgorithm {

	private final Map<Node, ResidualNode> nodes;
	private final List<ResidualEdge> edges;

	public DinicsAlgorithm(final Graph graph) {
		this.nodes = new HashMap<>();
		final var nodes = graph.getNodes();
		for (var i = 0; i < nodes.size(); i++) {
			this.nodes.put(nodes.get(i), new ResidualNode(i));
		}
		this.edges = graph.getEdges().stream().map(edge -> {
			final var source = this.nodes.get(edge.getSrc());
			final var target = this.nodes.get(edge.getTrg());
			return new ResidualEdge(source, target, edge.getCapacity());
		}).toList();
		this.edges.forEach(edge -> {
			final var target = edge.getTrg();
			final var result = target.getOut().stream().filter(e -> target.equals(e.getTrg())).findAny();
			if (result.isPresent()) {
				edge.setOpposite(result.get());
			}
		});
	}

	public int maxFlow(final Node src, final Node trg) {
		final var source = this.nodes.get(src);
		final var target = this.nodes.get(trg);

		var maxFlow = 0;

		Map<ResidualEdge, Integer> flow;
		while (!(flow = this.blockingFlow(source, target)).isEmpty()) {
			final var values = flow;
			final var value = source.getOut().stream().mapToInt(e -> values.getOrDefault(e, 0)).sum();
			System.out.println("The blocking flow is of " + value + " units.");
			maxFlow += value;
			this.augment(flow);
		}

		System.out.println("The maximal flow between " + source.getId() + " and " + target.getId() + "  is " + maxFlow
				+ " units.");
		return maxFlow;
	}

	private void augment(final Map<ResidualEdge, Integer> flow) {
		for (final Entry<ResidualEdge, Integer> entry : flow.entrySet()) {
			final var edge = entry.getKey();
			final var fwd = edge.getUsedCapacity();
			var opposite = edge.getOppisite();
			if (opposite != null) {
				opposite.augmentCapacity(fwd);
			} else {
				opposite = new AugmentedResidualEdge(edge, fwd);
				opposite.setOpposite(edge);
			}
			edge.augmentCapacity(opposite.getUsedCapacity());
		}
	}

	private Map<ResidualEdge, Integer> blockingFlow(final ResidualNode source, final ResidualNode target) {
		final Map<ResidualEdge, Integer> flows = new HashMap<>();
		ResidualEdge path;
		while ((path = this.bfs(source, target)) != null) {
			final var flow = this.min(path);
			if (flow > 0) {
				var next = path;
				do {
					flows.compute(next, (k, v) -> v != null ? v + flow : flow);
					next.useCapacity(flow);
				} while ((next = next.getPrevioulyVisited()) != null);
			}
		}
		return flows;
	}

	private int min(final ResidualEdge lastEdge) {
		var min = Integer.MAX_VALUE;
		var parent = lastEdge;
		do {
			final var capacity = parent.getRemainingCapacity();
			if (capacity == 0) {
				return 0;
			}
			if (capacity < min) {
				min = capacity;
			}
		} while ((parent = parent.getPrevioulyVisited()) != null);
		return min;
	}

	private int min(final List<ResidualEdge> path) {
		if (path.isEmpty()) {
			return 0;
		}
		var min = Integer.MAX_VALUE;
		for (final ResidualEdge next : path) {
			min = Math.min(min, next.getRemainingCapacity());
		}
		return min;
	}

	private ResidualEdge bfs(final ResidualNode src, final ResidualNode trg) {
		final var time = System.nanoTime();
		final Deque<ResidualEdge> fifo = new LinkedList<>();
		fifo.addAll(src.getOut());
		src.visit(time);
		while (!fifo.isEmpty()) {
			final var nextEdge = fifo.removeFirst();
			if (nextEdge.hasCapacity()) {
				final var nextNode = nextEdge.getTrg();
				if (trg.equals(nextNode)) {
					return nextEdge;
				}
				if (nextNode.notSeen(time)) {
					nextNode.visit(time);
					for (final ResidualEdge out : nextNode.getOut()) {
						out.setPreviouslyVisited(nextEdge);
						fifo.add(out);
					}
				}
			}
		}
		return null;
	}

	public List<ResidualEdge> getEdges() {
		return this.edges;
	}
}
