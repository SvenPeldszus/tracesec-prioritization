package org.gravity.requirements;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.resource.UMLResource;

public class UseCaseExtractor {

	public static final List<String> ACTOR_NAMES = Arrays.asList("User", "HCP", "Patient", "Administrator", "LHCP",
			"DLHCP", "ER", "UAP", "Software Tester", "Personel Representative", "PHA", "LT");

	private final Map<String, UseCase> useCases = new HashMap<>();
	private final Map<String, Actor> actors = new HashMap<>();

	public static void main(String[] args) throws IOException {
		ResourceSet rs = initRS();

		String name = "iTrust";
		RequirementsModel requirements = (RequirementsModel) rs
				.getResource(URI.createFileURI("requirements/iTrust/requirements.xmi"), true).getContents().get(0);

		Model model = new UseCaseExtractor().buildModel(name, requirements);

		Resource umlResource = rs.createResource(URI.createFileURI("requirements/iTrust/useCases.uml"));
		umlResource.getContents().add(model);
		umlResource.save(Collections.emptyMap());
	}

	private Model buildModel(String name, RequirementsModel requirements) {
		Model model = UMLFactory.eINSTANCE.createModel();
		model.setName("requirements");
		Classifier system = model.createOwnedClass(name, false);
		for (org.gravity.requirements.UseCase uc : requirements.getUsecases()) {
			String caseID = uc.getId();
			UseCase useCase = useCases.computeIfAbsent(caseID,
					id -> system.createOwnedUseCase(id + ": " + uc.getValue()));
			for (String actorName : ACTOR_NAMES) {
				uc.getMainflows().forEach(main -> linkActors(actorName, main, useCase, model));
				uc.getSubflows().forEach(main -> linkActors(actorName, main, useCase, model));
				uc.getAlternativeflows().forEach(main -> linkActors(actorName, main, useCase, model));
			}
		}
		return model;
	}

	private void linkActors(String actorName, Element element, UseCase useCase, Model model) {
		if (Pattern.compile("\\b"+actorName.toLowerCase()+"\\b").matcher(element.getValue().toLowerCase()).find()) {
			Actor actor = actors.computeIfAbsent(actorName, n -> {
				Actor a = UMLFactory.eINSTANCE.createActor();
				a.setName(n);
				model.getPackagedElements().add(a);
				return a;
			});
			if (useCase.getAssociations().parallelStream().noneMatch(a -> a.getEndTypes().contains(actor))) {
				useCase.createAssociation(false, AggregationKind.NONE_LITERAL, null, 0, 0, actor, false,
						AggregationKind.NONE_LITERAL, null, 0, 0);
			}

		}
	}

	private static ResourceSet initRS() {
		ResourceSet rs = new ResourceSetImpl();
		rs.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		rs.getPackageRegistry().put(RequirementsPackage.eNS_URI, RequirementsPackage.eINSTANCE);
		Map<String, Object> factories = rs.getResourceFactoryRegistry().getExtensionToFactoryMap();
		factories.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		factories.put("xmi", new XMIResourceFactoryImpl());
		return rs;
	}
}
