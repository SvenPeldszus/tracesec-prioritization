package org.tracesec.eval.scalability.generator.testing;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.RuleApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Node;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.gravity.typegraph.basic.BasicPackage;
import org.tracesec.eval.scalability.Distribution;

public class HenshinPmGenerator {

	private static final int LIMIT = 50000;
	private static final byte[] SEED = new byte[0];

	public static void main(final String[] args) throws IOException {
		final var set = new HenshinResourceSet(".");
		set.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		final var module = set.getModule("rules/pm/generate-pm.henshin");

		final var creates = getCreates(module);
		final var requires = getRequires(module);

		final var target = set.createResource("out/pm.xmi");
		final var graph = new EGraphImpl(target);

		final var created = new HashSet<>();
		final var rnd = new SecureRandom(SEED);
		final var units = module.getUnits();

		final List<Unit> applicible = units.stream().filter(u -> requires.get(u).isEmpty())
				.collect(Collectors.toList());
		final List<Unit> notApplicible = units.stream().filter(u -> !requires.get(u).isEmpty())
				.collect(Collectors.toList());

		final Engine engine = new EngineImpl();
		final Map<EClass, Integer> amounts = new HashMap<>();
		for (var i = 0; i < LIMIT; i++) {
			if((i %500) == 0) {
				System.out.println(i+"/"+LIMIT+" ");
				//engine = new EngineImpl();
			}

			boolean success;
			Unit unit;
			do {
				final var select = rnd.nextInt(applicible.size());
				unit = applicible.get(select);
				success = new RuleApplicationImpl(engine, graph, (Rule) unit, null).execute(null);
				if (!success) {
					applicible.remove(select);
					notApplicible.add(unit);
				} else {
					for (final EClass clazz : creates.get(unit)) {
						amounts.compute(clazz, (k, v) -> v == null ? 1 : v + 1);
					}
				}
			} while (!success && !applicible.isEmpty());

			final var createdTypes = creates.get(unit);
			created.addAll(createdTypes);
			for (var j = notApplicible.size() - 1; j >= 0; j--) {
				final var n = notApplicible.get(j);
				if (created.containsAll(requires.get(n))) {
					notApplicible.remove(j);
					applicible.add(n);
				}
			}
			for (var j = applicible.size() - 1; j >= 0; j--) {
				final var n = applicible.get(j);
				var remove = true;
				for (final EClass clazz : creates.get(n)) {
					final var relativeExpect = Distribution.instance.distribution.get(clazz);
					if (relativeExpect != null) {
						final var expect = relativeExpect * (i + 1);
						final var is = amounts.getOrDefault(clazz, 0);
						if (is <= (expect + 2)) {
							remove = false;
							break;
						}
					}
				}
				if(remove) {
					applicible.remove(j);
					notApplicible.add(n);
					break;
				}
			}
		}

		final var amount = amounts.values().stream().mapToInt(Integer::intValue).sum();
		for (final Entry<EClass, Integer> entry : amounts.entrySet()) {
			final var type = entry.getKey();
			final var number = entry.getValue();
			final var expected = Distribution.instance.distribution.get(type);
			if(expected != null) {
				System.out.println(type.getName() + "=" + number + "(" + ((number / (float) amount) * 100) + "%) expected "
						+ (expected * 100) + "%");
			}
		}

		target.getContents().addAll(graph.getRoots());
		target.save(Collections.emptyMap());
	}

	private static Map<Rule, List<EClass>> getCreates(final Module module) {
		final Map<Rule, List<EClass>> creates = new HashMap<>();
		for (final Unit unit : module.getUnits()) {
			if (unit instanceof Rule) {
				final var rule = (Rule) unit;
				final var list = creates.computeIfAbsent(rule, x -> new LinkedList<>());
				for (final Node node : rule.getRhs().getNodes()) {
					if (rule.getMappings().getOrigin(node) == null) {
						final var type = node.getType();
						list.add(type);
						list.addAll(type.getEAllSuperTypes());
					}
				}
			}
		}
		return creates;
	}

	private static Map<Rule, List<EClass>> getRequires(final Module module) {
		final Map<Rule, List<EClass>> requires = new HashMap<>();
		for (final Unit unit : module.getUnits()) {
			if (unit instanceof Rule) {
				final var rule = (Rule) unit;
				final List<EClass> types = new LinkedList<>();
				requires.put(rule, types);
				for (final Node node : rule.getLhs().getNodes()) {
					if (rule.getMappings().getImage(node, rule.getRhs()) != null) {
						types.add(node.getType());
					}
				}
			}
		}
		return requires;
	}
}
