package org.tracesec.prioritization.graph;

import java.util.ArrayList;
import java.util.List;

public class ResidualNode {

	private final int id;
	private final List<ResidualEdge> out;
	private long lastVisited;

	public ResidualNode(final int id) {
		this.id = id;
		this.out = new ArrayList<>();
	}

	public List<ResidualEdge> getOut() {
		return this.out;
	}

	public int getId() {
		return this.id;
	}

	public void visit(final long time) {
		this.lastVisited = time;
	}

	public boolean notSeen(final long time) {
		return time > this.lastVisited;
	}

	public void addOut(final ResidualEdge edge) {
		this.out.add(edge);
	}
}
