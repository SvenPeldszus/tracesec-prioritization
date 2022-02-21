package org.tracesec.prioritizatiion.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintPackage;
import org.gravity.tgg.pm.uml.UmlPackage;
import org.gravity.typegraph.basic.BasicPackage;
import org.moflon.tgg.runtime.CorrespondenceModel;
import org.moflon.tgg.runtime.RuntimePackage;
import org.tracesec.graph.dsl.GraphConfigurationStandaloneSetup;
import org.tracesec.graph.dsl.graphConfiguration.Configuration;
import org.tracesec.prioritization.DinicsAlgorithm;
import org.tracesec.prioritization.GraphBuilder;
import org.tracesec.qualitymodel.QualityCategory;
import org.tracesec.qualitymodel.QualityModelPackage;

public class TraceSecTests {

	public static void main(final String[] args) throws FileNotFoundException, IOException {
		final var set = initResourceSet();

		final var uml = set.createResource(URI.createURI("uml/classdiagram.uml"));
		uml.load(new FileInputStream("test/.gravity/uml/classdiagram.uml"), null);
		final var pm = set.createResource(URI.createURI("pm/pm.xmi"));
		pm.load(new FileInputStream("test/.gravity/pm/pm.xmi"), null);
		final var corr = set.createResource(URI.createURI("bi_corr.xmi"));
		corr.load(new FileInputStream("test/.gravity/bi_corr.xmi"), null);
		final var quality = set.createResource(URI.createURI("QualityModel.xmi"));
		quality.load(new FileInputStream("test/.gravity/QualityModel.xmi"), null);

		final var configuration = loadConfiguration(set);

		final var qualityModel = (QualityCategory) quality.getContents().get(0);
		final var umlModel = uml.getContents().get(0);
		final var programModel = pm.getContents().get(0);

		final var modelOrder = Arrays.asList(qualityModel, umlModel, programModel);

		final var startGraphConstruction = System.currentTimeMillis();
		final var builder = new GraphBuilder(configuration, modelOrder);
		builder.add((CorrespondenceModel) corr.getContents().get(0));
		builder.add(qualityModel);
		final var stopGraphConstruction = System.currentTimeMillis();
		System.out.println("Graph construction: "+(stopGraphConstruction-startGraphConstruction)+"ms\n");

		System.out.println("Nodes: "+builder.getGraph().getNodes().size()+", edges: "+builder.getGraph().getEdges().size());

		save(set, builder);

		final var findings = getFindings(pm);

		final var start = System.currentTimeMillis();
		final var result = prioritize(findings, qualityModel, builder);
		final var stop = System.currentTimeMillis();
		System.out.println("Prioritization: "+(stop-start)+"ms");

		for (final Entry<Integer, List<SonarlintFinding>> entry : result.entrySet()) {
			System.out.println("Priority: " + entry.getKey() + " -- " + entry.getValue().stream()
					.map(f -> f.getRulekey() + " at " + f.getTAnnotated()).collect(Collectors.joining(", ", "[",  "]")));
		}
	}

	private static Configuration loadConfiguration(final ResourceSet set) {
		return (Configuration) set.getResource(URI.createFileURI("test/test.tracesec"), true).getContents().get(0);
	}

	private static ResourceSet initResourceSet() {
		GraphConfigurationStandaloneSetup.doSetup();

		final ResourceSet set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
				UMLResource.Factory.INSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		set.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		set.getPackageRegistry().put(AntipatterngraphPackage.eNS_URI, AntipatterngraphPackage.eINSTANCE);
		set.getPackageRegistry().put(SonarlintPackage.eNS_URI, SonarlintPackage.eINSTANCE);
		set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		set.getPackageRegistry().put(RuntimePackage.eNS_URI, RuntimePackage.eINSTANCE);
		set.getPackageRegistry().put(UmlPackage.eNS_URI, UmlPackage.eINSTANCE);
		set.getPackageRegistry().put(QualityModelPackage.eNS_URI, QualityModelPackage.eINSTANCE);
		return set;
	}

	private static List<SonarlintFinding> getFindings(final Resource pm) {
		final List<SonarlintFinding> findings = new LinkedList<>();
		final var it = pm.getAllContents();
		while (it.hasNext()) {
			final var next = it.next();
			if (next instanceof SonarlintFinding) {
				findings.add((SonarlintFinding) next);

			}
		}
		return findings;
	}

	private static void save(final ResourceSet set, final GraphBuilder builder)
			throws IOException, FileNotFoundException {
		final var graph = set.createResource(URI.createURI("graph.xmi"));
		graph.getContents().add(builder.getGraph());
		graph.save(new FileOutputStream("test/.gravity/graph.xmi"), Collections.emptyMap());
	}

	public static SortedMap<Integer, List<SonarlintFinding>> prioritize(final Collection<SonarlintFinding> findings,
			final QualityCategory root, final GraphBuilder builder) {
		final var source = builder.get(root);
		final var algo = new DinicsAlgorithm(builder.getGraph());
		final SortedMap<Integer, List<SonarlintFinding>> map = new TreeMap<>();
		for (final SonarlintFinding finding : findings) {
			System.out.println("\n\nCompute flow for finding: "+finding);
			map.computeIfAbsent(algo.maxFlow(source, builder.get(finding)), k -> new LinkedList<>()).add(finding);
		}
		return map;

	}

}
