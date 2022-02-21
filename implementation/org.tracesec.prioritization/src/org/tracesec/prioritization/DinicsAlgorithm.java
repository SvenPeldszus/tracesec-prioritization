package org.tracesec.prioritization;

import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.tracesec.prioritization.graph.ResidualEdge;
import org.tracesec.prioritization.graph.ResidualNode;
import org.tracesec.prioritization.tracegraph.Edge;
import org.tracesec.prioritization.tracegraph.Graph;
import org.tracesec.prioritization.tracegraph.Node;

public class DinicsAlgorithm {

	private final Map<Node, ResidualNode> nodes = new HashMap<>();

	public DinicsAlgorithm(final Graph graph) {
		for (final Node node : graph.getNodes()) {
			this.nodes.put(node, new ResidualNode(node.getId()));
		}
		for (final Edge edge : graph.getEdges()) {
			final var source = this.nodes.get(edge.getSrc());
			final var target = this.nodes.get(edge.getTrg());
			final var created = new ResidualEdge(source, target, edge.getCapacity());
			final var result = target.getOut().stream().filter(e -> target.equals(e.getTrg())).findAny();
			if(result.isPresent()) {
				created.setOpposite(result.get());
			}
		}
	}

	public int maxFlow(final Node src, final Node trg) {
		final var source = this.nodes.get(src);
		final var target = this.nodes.get(trg);

		var maxFlow = 0;

		Map<ResidualEdge, Integer> flow;
		while (!(flow = blockingFlow(source, target)).isEmpty()) {
			final var values = flow;
			final var value = source.getOut().stream().mapToInt(e -> values.getOrDefault(e, 0)).sum();
			System.out.println("The blocking flow is of "+value+" units.");
			maxFlow += value;
			augment(flow);
		}

		System.out.println("The maximal flow between "+source.getId() +" and "+ target.getId()+"  is "+maxFlow+" units.");
		return maxFlow;
	}

	private void augment(final Map<ResidualEdge, Integer> flow) {
		for(final Entry<ResidualEdge, Integer> entry : flow.entrySet()) {
			final var edge = entry.getKey();
			final var fwd = edge.getUsedCapacity();
			var opposite = edge.getOppisite();
			if(opposite != null) {
				opposite.augmentCapacity(fwd);
			}
			else {
				opposite = new ResidualEdge(edge.getTrg(), edge.getSrc(), fwd);
				opposite.setOpposite(edge);
			}
			edge.augmentCapacity(opposite.getUsedCapacity());
		}
	}

	private Map<ResidualEdge, Integer> blockingFlow(final ResidualNode source, final ResidualNode target) {
		final Map<ResidualEdge, Integer> flows = new HashMap<>();
		List<ResidualEdge> path;
		while (!(path = bfs(source, target)).isEmpty()) {
			final var flow = min(path);
			if (flow > 0) {
				for (final ResidualEdge next : path) {
					flows.compute(next, (k, v) -> v != null ? v + flow : flow);
					next.useCapacity(flow);
				}
				System.out.println("Found path {\n" + path.stream().map(ResidualEdge::toString).collect(Collectors.joining(",\n"))
						+ "\n} with " + flow + " units of flow.");
			}
		}
		return flows;
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

	private List<ResidualEdge> bfs(final ResidualNode src, final ResidualNode trg) {
		final var time = System.nanoTime();
		final Map<ResidualEdge, ResidualEdge> parents = new HashMap<>();
		final Deque<ResidualEdge> fifo = new LinkedList<>(src.getOut());
		while (!fifo.isEmpty()) {
			final var next = fifo.removeFirst();
			if (next.notSeen(time) && next.hasCapacity()) {
				next.visit(time);
				if (trg.equals(next.getTrg())) {
					return constructPath(next, parents);
				}
				final var parentMap = next.getTrg().getOut().stream().filter(out -> out.notSeen(time)).collect(Collectors.toMap(out -> out, out -> next));
				parents.putAll(parentMap);
				fifo.addAll(parentMap.keySet());
			}
		}
		return Collections.emptyList();
	}

	private List<ResidualEdge> constructPath(final ResidualEdge last, final Map<ResidualEdge, ResidualEdge> parents) {
		final List<ResidualEdge> path = new LinkedList<>();
		var parent = last;
		do {
			path.add(0, parent);
		} while ((parent = parents.get(parent)) != null);
		return path;
	}
}
