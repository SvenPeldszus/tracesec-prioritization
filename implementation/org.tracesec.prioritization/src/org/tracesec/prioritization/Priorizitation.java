package org.tracesec.prioritization;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding;
import org.tracesec.prioritization.tracegraph.Graph;
import org.tracesec.prioritization.tracegraph.Node;
import org.tracesec.qualitymodel.Quality;

public class Priorizitation {

	private static final Logger LOGGER = Logger.getLogger(Priorizitation.class);

	private static int index = 1;

	public SortedMap<Integer, List<SonarlintFinding>> prioritize(final Collection<SonarlintFinding> findings,
			final Quality root, final Graph graph) {
		final var source = getNode(graph, root);
		if (source.isEmpty()) {
			LOGGER.error("Root object is not in flow network: " + root);
			return null;
		}
		final var sourceNode = source.get();

		final var flows = findings.parallelStream()
				.collect(Collectors.toMap(k -> k,
						finding -> this.prioritize(findings, graph, sourceNode, finding,
								new DinicsAlgorithm(graph))));

		final SortedMap<Integer, List<SonarlintFinding>> map = new TreeMap<>();
		for (final Entry<SonarlintFinding, Integer> entry : flows.entrySet()) {
			map.computeIfAbsent(entry.getValue(), k -> new LinkedList<>()).add(entry.getKey());
		}
		return map;

	}

	protected Integer prioritize(final Collection<SonarlintFinding> findings, final Graph graph, final Node sourceNode,
			final SonarlintFinding finding, final DinicsAlgorithm algo) {
		final var node = getNode(graph, finding);
		if (node.isPresent()) {
			final var maxFlow = algo.maxFlow(sourceNode, node.get());
			System.out.println(index++ + "/" + findings.size());
			return maxFlow;
		}
		LOGGER.error("Finding is not in flow network: " + finding);
		return -1;
	}

	private static Optional<Node> getNode(final Graph graph, final EObject object) {
		return graph.getNodes().parallelStream().filter(node -> object.equals(node.getRepresents())).findAny();
	}
}
