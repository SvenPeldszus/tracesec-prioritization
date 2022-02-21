package org.gravity.requirements;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.tracesec.requirements.AbstractRequirement;
import org.tracesec.requirements.ReferenceType;
import org.tracesec.requirements.Requirement;
import org.tracesec.requirements.RequirementRelation;
import org.tracesec.requirements.RequirementsFactory;
import org.tracesec.requirements.RequirementsSet;

public class RequirementsModelCreator {

	Map<UseCase, AbstractRequirement> useCaseMap = new HashMap<>();
	Map<Element, AbstractRequirement> map = new HashMap<>();

	public static void main(final String[] args) throws IOException {
		final ResourceSet set = new ResourceSetImpl();
		set.getPackageRegistry().put(RequirementsPackage.eNS_URI, RequirementsPackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		final RequirementsModel model = (RequirementsModel) set
				.getResource(URI.createFileURI("requirements/iTrust/requirements.xmi"), true).getContents().get(0);
		final RequirementsSet rs = new RequirementsModelCreator().createRequirementsModel(model);
		final Resource rsResource = set.createResource(URI.createFileURI("requirements/iTrust/requirementsSet.xmi"));
		rsResource.getContents().add(rs);
		rsResource.save(Collections.emptyMap());
	}

	public RequirementsSet createRequirementsModel(final RequirementsModel model) {
		final RequirementsSet root = RequirementsFactory.eINSTANCE.createRequirementsSet();
		root.setId(model.getName());

		for (final UseCase uc : model.getUsecases()) {
			final RequirementsSet set = RequirementsFactory.eINSTANCE.createRequirementsSet();
			final String id = uc.getId();
			set.setId(id);
			set.setTitle(uc.getValue());
			set.setWording(uc.getDescription());
			set.setSet(root);
			this.useCaseMap.put(uc, set);

			addRequirements(uc.getSubflows(), set);
			addRequirements(uc.getAlternativeflows(), set);
			addMainFlows(uc, set);

		}
		this.map.putAll(this.useCaseMap);

		for (final Entry<Element, AbstractRequirement> entry : this.map.entrySet()) {
			final AbstractRequirement requirement = entry.getValue();
			for (final IdentifyableObject referenced : entry.getKey().getReferences()) {
				final AbstractRequirement value = this.map.get(referenced);
				if (value != null) {
					final RequirementRelation reference = RequirementsFactory.eINSTANCE.createRequirementRelation();
					reference.setSource(requirement);
					reference.setTarget(value);
					reference.setType(getReferenceType(referenced));
				} else {
					System.err.println("Cannot resolve refeence to : " + referenced);
				}
			}
		}
		for (final Entry<UseCase, AbstractRequirement> entry : this.useCaseMap.entrySet()) {
			final AbstractRequirement useCaseSet = entry.getValue();
			for (final PreConditon pre : entry.getKey().getPreconditons()) {
				final EList<IdentifyableObject> preconditionReferences = pre.getReferences();
				if (preconditionReferences.size() > 1) {
					System.out.println("Precodition of " + useCaseSet.getId() + " references multiple elements: "
							+ pre.getValue());
				}
				for (final IdentifyableObject referenced : preconditionReferences) {
					final AbstractRequirement value = this.map.get(referenced);
					if (value == null) {
						System.err.println("Cannot resolve refeence to : " + referenced);
					} else {
						final RequirementRelation reference = RequirementsFactory.eINSTANCE.createRequirementRelation();
						reference.setSource(value);
						reference.setTarget(useCaseSet);
						reference.setType(ReferenceType.PRECONDITION);
					}
				}
			}
		}
		return root;
	}

	private <T extends IdentifyableObject> Map<T, Requirement> addRequirements(final List<T> objects,
			final RequirementsSet set) {
		return objects.stream().collect(Collectors.toMap(sub -> sub, sub -> {
			final Requirement req = createRequirement(set, sub.getValue(), sub.getId());
			this.map.put(sub, req);
			return req;
		}));
	}

	private Map<MainFlow, Requirement> addMainFlows(final UseCase uc, final RequirementsSet ucSet) {
		final RequirementsSet main = RequirementsFactory.eINSTANCE.createRequirementsSet();
		main.setId(ucSet.getId() + ".2");
		main.setOrdered(true);
		main.setTitle("MainFlow");
		main.setSet(ucSet);
		int i = 1;
		final Map<MainFlow, Requirement> reqs = new HashMap<>();
		for (final MainFlow flow : uc.getMainflows()) {
			final String value = flow.getValue();
			final Requirement req = createRequirement(main, value, "M" + i++);
			reqs.put(flow, req);
			this.map.put(flow, req);
		}
		return reqs;
	}

	private ReferenceType getReferenceType(final IdentifyableObject element) {
		if (element instanceof SubFlow) {
			return (ReferenceType.REFINEMENT);
		} else if (element instanceof AlternativeFlow) {
			return (ReferenceType.COMPLEMENT);
		} else if (element instanceof PreConditon) {
			return ReferenceType.PRECONDITION;
		} else {
			return ReferenceType.USAGE;
		}
	}

	private Requirement createRequirement(final RequirementsSet main, final String value, final String id) {
		final Requirement req = RequirementsFactory.eINSTANCE.createRequirement();
		req.setId(id);
		req.setWording(value);
		req.setSet(main);
		return req;
	}
}
