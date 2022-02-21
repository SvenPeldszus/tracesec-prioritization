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
	 * Example from: https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/Simpe_flow_network.svg/1024px-Simpe_flow_network.svg.png
	 */
	@Test
	public void test0() {
		this.graph = TracegraphFactory.eINSTANCE.createGraph();

		final var s = node("s");
		final var u = node("u");
		final var v = node("v");
		final var t = node("t");

		edge(s, u, 10);
		edge(s, v, 5);
		edge(u, v, 15);
		edge(u, t, 5);
		edge(v, t, 10);

		final var maxFlow = new DinicsAlgorithm(this.graph).maxFlow(s, t);
		assertEquals(15, maxFlow);
	}

	/**
	 * Example from: https://en.wikipedia.org/wiki/Ford%E2%80%93Fulkerson_algorithm#Integral_example
	 */
	@Test
	public void test1() {
		this.graph = TracegraphFactory.eINSTANCE.createGraph();

		final var a = node("A");
		final var b = node("B");
		final var c = node("C");
		final var d = node("D");

		edge(a, b, 1000);
		edge(a, c, 1000);
		edge(b, c, 1);
		edge(b, d, 1000);
		edge(c, d, 1000);

		final var maxFlow = new DinicsAlgorithm(this.graph).maxFlow(a, d);
		assertEquals(2000, maxFlow);
	}

	/**
	 * Example from: https://en.wikipedia.org/wiki/Dinic%27s_algorithm#Example
	 */
	@Test
	public void test2() {
		this.graph = TracegraphFactory.eINSTANCE.createGraph();

		final var ns = node("s");
		final var n1 = node("1");
		final var n2 = node("2");
		final var n3 = node("3");
		final var n4 = node("4");
		final var nt = node("t");

		edge(ns, n1, 10);
		edge(ns, n2, 10);
		edge(n1, n2, 2);
		edge(n1, n4, 8);
		edge(n1, n3, 4);
		edge(n2, n4, 9);
		edge(n3, nt, 10);
		edge(n4, n3, 6);
		edge(n4, nt, 10);

		final var maxFlow = new DinicsAlgorithm(this.graph).maxFlow(ns, nt);
		assertEquals(19, maxFlow);
	}

	/**
	 * Example from: https://en.wikipedia.org/wiki/Edmonds%E2%80%93Karp_algorithm#Example
	 */
	@Test
	public void test3() {
		this.graph = TracegraphFactory.eINSTANCE.createGraph();

		final var a = node("A");
		final var b = node("B");
		final var c = node("C");
		final var d = node("D");
		final var e = node("E");
		final var f = node("F");
		final var g = node("G");

		edge(a, b, 3);
		edge(a, d, 3);
		edge(c, a, 3);
		edge(b, c, 4);
		edge(c, d, 1);
		edge(c, e, 2);
		edge(e, b, 1);
		edge(e, g, 1);
		edge(d, e, 2);
		edge(d, f, 6);
		edge(f, g, 9);

		final var maxFlow = new DinicsAlgorithm(this.graph).maxFlow(a, g);
		assertEquals(5, maxFlow);
	}

	/**
	 * Example from: https://en.wikipedia.org/wiki/Push%E2%80%93relabel_maximum_flow_algorithm#Example
	 */
	@Test
	public void test4() {
		this.graph = TracegraphFactory.eINSTANCE.createGraph();

		final var s = node("S");
		final var a = node("A");
		final var b = node("B");
		final var c = node("C");
		final var d = node("D");
		final var t = node("t");


		edge(s, a, 15);
		edge(s, c, 4);
		edge(a, b, 12);
		edge(c, d, 10);
		edge(b, t, 7);
		edge(b, c, 3);
		edge(d, t, 10);
		edge(d, a, 5);

		final var maxFlow = new DinicsAlgorithm(this.graph).maxFlow(s, t);
		assertEquals(14, maxFlow);
	}

	private Node node(final String id) {
		final var node = TracegraphFactory.eINSTANCE.createNode();
		node.setId(id);
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
