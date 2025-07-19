package org.tracesec.prioritizatiion.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.tracesec.prioritization.DinicsAlgorithm;
import org.tracesec.prioritization.tracegraph.Edge;
import org.tracesec.prioritization.tracegraph.Graph;
import org.tracesec.prioritization.tracegraph.Node;
import org.tracesec.prioritization.tracegraph.TracegraphFactory;

public class MaxFlowTest {

	private Graph graph;

	/**
	 * Example from:
	 * https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/Simpe_flow_network.svg/1024px-Simpe_flow_network.svg.png
	 */
	@Test
	public void test0() {
		this.graph = TracegraphFactory.eINSTANCE.createGraph();

		final var s = this.node("s");
		final var u = this.node("u");
		final var v = this.node("v");
		final var t = this.node("t");

		this.edge(s, u, 10);
		this.edge(s, v, 5);
		this.edge(u, v, 15);
		this.edge(u, t, 5);
		this.edge(v, t, 10);

		final var maxFlow = new DinicsAlgorithm(this.graph).maxFlow(s, t);
		assertEquals(15, maxFlow);
	}

	/**
	 * Example from:
	 * https://en.wikipedia.org/wiki/Ford%E2%80%93Fulkerson_algorithm#Integral_example
	 */
	@Test
	public void test1() {
		this.graph = TracegraphFactory.eINSTANCE.createGraph();

		final var a = this.node("A");
		final var b = this.node("B");
		final var c = this.node("C");
		final var d = this.node("D");

		this.edge(a, b, 1000);
		this.edge(a, c, 1000);
		this.edge(b, c, 1);
		this.edge(b, d, 1000);
		this.edge(c, d, 1000);

		final var maxFlow = new DinicsAlgorithm(this.graph).maxFlow(a, d);
		assertEquals(2000, maxFlow);
	}

	/**
	 * Example from: https://en.wikipedia.org/wiki/Dinic%27s_algorithm#Example
	 */
	@Test
	public void test2() {
		this.graph = TracegraphFactory.eINSTANCE.createGraph();

		final var ns = this.node("s");
		final var n1 = this.node("1");
		final var n2 = this.node("2");
		final var n3 = this.node("3");
		final var n4 = this.node("4");
		final var nt = this.node("t");

		this.edge(ns, n1, 10);
		this.edge(ns, n2, 10);
		this.edge(n1, n2, 2);
		this.edge(n1, n4, 8);
		this.edge(n1, n3, 4);
		this.edge(n2, n4, 9);
		this.edge(n3, nt, 10);
		this.edge(n4, n3, 6);
		this.edge(n4, nt, 10);

		final var maxFlow = new DinicsAlgorithm(this.graph).maxFlow(ns, nt);
		assertEquals(19, maxFlow);
	}

	/**
	 * Example from:
	 * https://en.wikipedia.org/wiki/Edmonds%E2%80%93Karp_algorithm#Example
	 */
	@Test
	public void test3() {
		this.graph = TracegraphFactory.eINSTANCE.createGraph();

		final var a = this.node("A");
		final var b = this.node("B");
		final var c = this.node("C");
		final var d = this.node("D");
		final var e = this.node("E");
		final var f = this.node("F");
		final var g = this.node("G");

		this.edge(a, b, 3);
		this.edge(a, d, 3);
		this.edge(c, a, 3);
		this.edge(b, c, 4);
		this.edge(c, d, 1);
		this.edge(c, e, 2);
		this.edge(e, b, 1);
		this.edge(e, g, 1);
		this.edge(d, e, 2);
		this.edge(d, f, 6);
		this.edge(f, g, 9);

		final var maxFlow = new DinicsAlgorithm(this.graph).maxFlow(a, g);
		assertEquals(5, maxFlow);
	}

	/**
	 * Example from:
	 * https://en.wikipedia.org/wiki/Push%E2%80%93relabel_maximum_flow_algorithm#Example
	 */
	@Test
	public void test4() {
		this.graph = TracegraphFactory.eINSTANCE.createGraph();

		final var s = this.node("S");
		final var a = this.node("A");
		final var b = this.node("B");
		final var c = this.node("C");
		final var d = this.node("D");
		final var t = this.node("t");

		this.edge(s, a, 15);
		this.edge(s, c, 4);
		this.edge(a, b, 12);
		this.edge(c, d, 10);
		this.edge(b, t, 7);
		this.edge(b, c, 3);
		this.edge(d, t, 10);
		this.edge(d, a, 5);

		final var maxFlow = new DinicsAlgorithm(this.graph).maxFlow(s, t);
		assertEquals(14, maxFlow);
	}

	private Node node(final String id) {
		final var node = TracegraphFactory.eINSTANCE.createNode();
		this.graph.getNodes().add(node);
		return node;
	}

	private Edge edge(final Node source, final Node target, final int capacity) {
		final var edge = TracegraphFactory.eINSTANCE.createEdge();
		edge.setSrc(source);
		edge.setTrg(target);
		edge.setCapacity(capacity);
		this.graph.getEdges().add(edge);
		return edge;
	}

}
