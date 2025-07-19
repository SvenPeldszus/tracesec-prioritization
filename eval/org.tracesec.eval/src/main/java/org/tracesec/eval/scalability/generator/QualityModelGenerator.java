package org.tracesec.eval.scalability.generator;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.tracesec.eval.scalability.generator.helpers.EMFHelper;
import org.tracesec.qualitymodel.Priority;
import org.tracesec.qualitymodel.Quality;
import org.tracesec.qualitymodel.QualityModelFactory;
import org.tracesec.requirements.RequirementsSet;

public class QualityModelGenerator {

	private static final float QUALITY_RELATION = 0.6f;
	private static final int TRACE_AVG = 3;
	private static final int TRACE_VAR = 1;

	private static final Random rnd = new SecureRandom();
	private final ResourceSet set;

	public QualityModelGenerator(final ResourceSet set) {
		this.set = set;
	}

	public Quality generate(final RequirementsSet requiremnts, final URI uri) {
		final var elements = EMFHelper.getElements(requiremnts);

		var numOfTraces = 0;
		final var nodes = new ArrayList<Quality>();
		final var root = QualityModelFactory.eINSTANCE.createQuality();
		this.set.createResource(uri).getContents().add(root);
		nodes.add(root);
		for (var i = 0; i < (elements.size() * QUALITY_RELATION); i++) {
			final var parent = nodes.get(rnd.nextInt(nodes.size()));
			final var child = QualityModelFactory.eINSTANCE.createQuality();
			final var aspect = QualityModelFactory.eINSTANCE.createAspect();
			aspect.setPriority(Priority.ESSENTIAL);
			aspect.setQuality(child);
			parent.getAspects().add(aspect);
			nodes.add(child);
			for (var j = 0; j < ((TRACE_AVG - TRACE_VAR) + (rnd.nextInt(TRACE_VAR) * 2)); j++) {
				numOfTraces++;
				child.getRelevantElements().add(elements.get(rnd.nextInt(elements.size())));
			}
		}

		System.out.println(numOfTraces+ " traces between qualities and requirements");
		System.out.println(nodes.size()+ " qualities");

		return root;
	}

}
