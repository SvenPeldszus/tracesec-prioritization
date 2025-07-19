package org.tracesec.prioritization.graph;

public class AugmentedResidualEdge extends ResidualEdge {

	public AugmentedResidualEdge(final ResidualEdge edge, final int capacity) {
		super(edge.getTrg(), edge.getSrc(), capacity);
	}

}
