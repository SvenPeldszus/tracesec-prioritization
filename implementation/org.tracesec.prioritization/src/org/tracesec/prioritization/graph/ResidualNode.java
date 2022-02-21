package org.tracesec.prioritization.graph;

import java.util.LinkedList;
import java.util.List;

public class ResidualNode {

	private final String id;
	private final List<ResidualEdge> out;

	public ResidualNode(final String id) {
		this.id = id;
		this.out = new LinkedList<>();
	}

	public List<ResidualEdge> getOut() {
		return this.out;
	}

	protected void addOut(final ResidualEdge edge){
		this.out.add(edge);
	}

	public String getId() {
		return id;
	}

}
