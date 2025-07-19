package org.tracesec.eval.scalability.generator;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Model;
import org.moflon.tgg.runtime.CorrespondenceModel;
import org.moflon.tgg.runtime.RuntimeFactory;
import org.tracesec.eval.scalability.generator.helpers.EMFHelper;
import org.tracesec.prioritization.tracelinks.TracelinksFactory;
import org.tracesec.requirements.Requirement;
import org.tracesec.requirements.RequirementsFactory;
import org.tracesec.requirements.RequirementsSet;

public class RequirementsGenerator {

	private static final float SET_RATIO = 0.02f;
	private static final float REQ_RATIO = 0.4f;
	private static final float REF_RATIO = 1.5f * REQ_RATIO;
	private static final int TRACE_AVG = 4;
	private static final int TRACE_VAR = 2;

	private final Random rnd = new SecureRandom();
	private final ResourceSet set;

	public RequirementsGenerator(final ResourceSet set) {
		this.set = set;
	}

	public CorrespondenceModel generate(final Model model, final URI modelURI, final URI corrURI) {

		final var elements = EMFHelper.getElements(model).stream().filter(Classifier.class::isInstance)
				.collect(Collectors.toList());

		final var size = elements.size();

		final var root = RequirementsFactory.eINSTANCE.createRequirementsSet();
		this.set.createResource(modelURI).getContents().add(root);

		final var corr = RuntimeFactory.eINSTANCE.createCorrespondenceModel();
		corr.setSource(root);
		corr.setTarget(model);
		this.set.createResource(corrURI).getContents().add(corr);

		final var containers = createRequirementsTree(size, root);

		var numOfTraces = 0;
		final var numOfReqs = 1 + (int) (REQ_RATIO * size);
		final List<Requirement> requirements = new ArrayList<>(numOfReqs);
		for (var i = 0; i < numOfReqs; i++) {
			final var parent = containers.get(this.rnd.nextInt(containers.size()));
			final var req = RequirementsFactory.eINSTANCE.createRequirement();
			parent.getRequirements().add(req);
			requirements.add(req);
			final var number = (TRACE_AVG - TRACE_VAR) + this.rnd.nextInt(TRACE_VAR * 2);
			for (var j = 0; j < number; j++) {
				final var link = TracelinksFactory.eINSTANCE.createTraceLink();
				link.setSource(req);
				link.setTarget(elements.get(this.rnd.nextInt(size)));
				corr.getCorrespondences().add(link);
			}
		}

		for (var i = 0; i < (REF_RATIO * size); i++) {
			final var rel = RequirementsFactory.eINSTANCE.createRequirementRelation();
			rel.setSource(requirements.get(this.rnd.nextInt(requirements.size())));
			rel.setTarget(requirements.get(this.rnd.nextInt(requirements.size())));
			numOfTraces++;
		}

		System.out.println(numOfTraces + " between requirments and UML model");
		System.out.println(numOfReqs + " requirements");

		return corr;
	}

	private List<RequirementsSet> createRequirementsTree(final int size, final RequirementsSet root) {
		final var numOfContainers = (int) SET_RATIO * size;
		final List<RequirementsSet> containers = new ArrayList<>(numOfContainers);
		containers.add(root);
		for (var i = 1; i < numOfContainers; i++) {
			final var parent = containers.get(this.rnd.nextInt(containers.size()));
			final var child = RequirementsFactory.eINSTANCE.createRequirementsSet();
			parent.getRequirements().add(child);
			containers.add(child);
		}
		return containers;
	}
}
