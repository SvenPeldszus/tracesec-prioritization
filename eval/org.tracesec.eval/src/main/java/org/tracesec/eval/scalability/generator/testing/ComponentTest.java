package org.tracesec.eval.scalability.generator.testing;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TypeGraph;

public class ComponentTest {
	private static TypeGraph generate() {
		final var pm = BasicFactory.eINSTANCE.createTypeGraph();

		final var a = vertex(pm, "a");
		final var b = vertex(pm, "b");
		final var c = vertex(pm, "c");
		final var d = vertex(pm, "d");
		final var e = vertex(pm, "e");
		final var f = vertex(pm, "f");
		final var g = vertex(pm, "g");
		final var h = vertex(pm, "h");

		edge(a, b);
		edge(b, c);
		edge(c, a);
		edge(d, c);
		edge(d, b);
		edge(d, e);
		edge(e, d);
		edge(e, f);
		edge(f, g);
		edge(f, c);
		edge(g, f);
		edge(h, e);
		edge(h, g);
		edge(h, h);

		return pm;
	}

	private static TMethodDefinition vertex(final TypeGraph pm, final String label) {
		final var a = BasicFactory.eINSTANCE.createTClass();
		a.setTName(label);
		pm.getClasses().add(a);
		pm.getAllTypes().add(a);
		final var da = BasicFactory.eINSTANCE.createTMethodDefinition();
		a.getDefines().add(da);
		return da;
	}

	private static void edge(final TMethodDefinition da, final TMethodDefinition db) {
		final var call = BasicFactory.eINSTANCE.createTCall();
		da.getAccessing().add(call);
		call.setTarget(db);
	}
}
