package org.gravity.requirements;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class WikiPageParser {

	private int current;

	private final Map<String, UseCase> useCaseMap = new HashMap<>();
	private final Map<UseCase, Map<String, IdentifyableObject>> flowMap = new HashMap<>();

	private final Map<LoggingRequirement, String> logRefs = new HashMap<>();

	private static final boolean INCLUDE_NOT_IMPLEMENTED = false;

	private static final List<String> IMPLEMENTED = Arrays.asList("UC1", "UC2", "UC3", "UC4", "UC5", "UC6", "UC7",
			"UC8", "UC9", "UC10", "UC11", "UC12", "UC13", "UC14", "UC15", "UC18", "UC19", "UC21", "UC22", "UC23",
			"UC26", "UC27", "UC28", "UC29", "UC30", "UC40", "UC42", "UC43", "UC46", "UC47", "UC50", "UC51", "UC52",
			"UC53", "UC57", "UC58", "UC59", "UC67");

	private static final List<String> NOT_IMPLEMENTED = Arrays.asList("UC16", "UC17", "UC24", "UC25", "UC31", "UC32",
			"UC33", "UC34", "UC35", "UC36", "UC37", "UC38", "UC44", "UC45", "UC49", "UC54", "UC55", "UC56", "UC60",
			"UC63", "UC64", "UC65", "UC66", "UC68", "UC69", "UC70", "UC71", "UC72", "UC73", "UC74", "UC75", "UC76",
			"UC77", "UC78", "UC79", "UC80", "UC81", "UC82", "UC83", "UC84", "UC85", "UC86", "UC87");

	private static final Pattern externalReference = Pattern
			.compile("\\[\\[requirements\\:((\\w|\\d)+)\\|([\\w\\ds\\(\\)]+)\\]\\]");

	public static void main(final String[] args) throws IOException {
		final RequirementsModel model = new WikiPageParser().parse(new File("requirements/iTrustWiki/requirements"));
		final ResourceSet set = new ResourceSetImpl();
		set.getPackageRegistry().put(RequirementsPackage.eNS_URI, RequirementsPackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		final Resource resource = set.createResource(URI.createFileURI("requirements/iTrust/requirements.xmi"));
		resource.getContents().add(model);
		resource.save(Collections.emptyMap());
	}

	private RequirementsModel parse(final File folder) throws IOException {
		final LinkedList<UseCase> useCases = new LinkedList<>();
		for (final File ucFile : folder.listFiles((FilenameFilter) (dir, name) -> {
			final boolean filePattern = name.startsWith("uc") && name.endsWith(".txt");
			if (filePattern && !INCLUDE_NOT_IMPLEMENTED) {
				final String ID = name.substring(0, name.length() - 4).toUpperCase();
				return IMPLEMENTED.contains(ID);
			}
			return filePattern;
		})) {
			final List<String> lines = Files.readAllLines(ucFile.toPath());
			if (lines.get(0).charAt(0) == '=') {
				useCases.add(parseSupportetUseCase(lines));
			} else {
				System.err.println("Use case is not following expected formatting: " + ucFile.getName());
			}
		}
		final RequirementsModel model = RequirementsFactory.eINSTANCE.createRequirementsModel();
		model.getUsecases().addAll(useCases);
		for (final UseCase uc : useCases) {
			final TreeIterator<EObject> iterator = uc.eAllContents();
			while (iterator.hasNext()) {
				final EObject next = iterator.next();
				if (next instanceof Element) {
					resolveInternalReferences(this.flowMap.get(uc), (Element) next);
					resolveExternalReferences((Element) next);

				}
			}
		}
		for (final Entry<LoggingRequirement, String> entry : this.logRefs.entrySet()) {
			final LoggingRequirement l = entry.getKey();
			for (final String uc : entry.getValue().split("\\"
					+ "\\"
					+ "\\"
					+ "\\")) {
				String ref = uc.trim().toLowerCase();
				if(!ref.startsWith("uc")) {
					ref = "uc"+ref;
				}
				final UseCase useCase = this.useCaseMap.get(ref);
				if (useCase != null) {
					l.getReferences().add(useCase);
				} else if(!"N/A".equalsIgnoreCase(uc.trim())) {
					System.err.println("Didn't find referenced use case \""+uc.trim()
					+ "\" in logging requirement of "+l.getUsecase().getId()+".");
				}
			}
		}
		return model;
	}

	private void resolveInternalReferences(final Map<String, IdentifyableObject> map, final Element element) {
		final String value = element.getValue();
		final Matcher matcher = Pattern.compile("\\[([\\w,\\s\\d]+)\\]").matcher(value);
		while (matcher.find()) {
			final String id = matcher.group(1).trim().toLowerCase();
			if(id.startsWith("uc") || id.startsWith("s")|| id.startsWith("e")) {
				if(!id.contains(",")) {
					addReference(element, id, map);
				}
				else if(!id.startsWith("uc")) {
					for(final String idx : id.split(",")) {
						addReference(element, idx.trim(), map);
					}
				}
				else {
					final int index = id.indexOf(',');
					final UseCase uc = this.useCaseMap.get(id.substring(0, index).trim());
					final String next = id.substring(index+1).trim();
					final Optional<IdentifyableObject> result = Stream.concat(uc.getAlternativeflows().stream(), uc.getSubflows().stream()).filter(e -> next.equalsIgnoreCase(e.getId())).findAny();
					if(result.isPresent()) {
						element.getReferences().add(result.get());
					}

				}}
			else {
				System.err.println("Skip unknown reference \""+id+"\" in "+element.getUsecase().getId());
			}
		}
		element.setValue(value);
	}

	private void addReference(final Element element, final String id, final Map<String, IdentifyableObject> map) {
		final IdentifyableObject flow = map.get(id.toLowerCase());
		if (flow != null) {
			element.getReferences().add(flow);
		} else {
			final EClass eClass = element.eClass();
			System.err.println("Couldn't resolve reference [" + id + "] in " + eClass.getName()
			+ (RequirementsPackage.eINSTANCE.getIdentifyableObject().isSuperTypeOf(eClass)
					? " " + ((IdentifyableObject) element).getId()
							: "")
			+ " of " + ((UseCase) element.eContainer()).getId());
		}
	}

	private void resolveExternalReferences(final Element element) {
		String value = element.getValue();
		Matcher matcher = externalReference.matcher(value);
		while (matcher.find()) {
			final String match = matcher.group();
			final String id = matcher.group(1);
			final String text = matcher.group(3);
			value = value.replace(match, text);
			final UseCase referenced = this.useCaseMap.get(id.toLowerCase());
			if (referenced != null) {
				element.getReferences().add(referenced);
			} else {
				System.err.println("Didn't find referenced element \"" + id + "\" in " + element.getUsecase().getId());
			}
			matcher = externalReference.matcher(value);
		}
		element.setValue(value);
	}

	private UseCase parseSupportetUseCase(final List<String> lines) {
		this.current = 0;
		final UseCase uc = parseUseCase(lines);
		uc.setDescription(getCurrentTextParagraph(lines));
		uc.setSupportet(true);
		uc.getPreconditons().addAll(parsePreconditions(uc, lines));
		uc.getMainflows().addAll(parseMainFlows(uc, lines));
		uc.getSubflows().addAll(parseSubFlows(uc, lines));
		uc.getAlternativeflows().addAll(parseAlternativeFlows(uc, lines));
		uc.getLoggingRequirements().addAll(parseLoggingRequirements(uc, lines));
		this.useCaseMap.put(uc.getId().toLowerCase(), uc);
		return uc;
	}

	@SuppressWarnings("unchecked")
	private Collection<? extends AlternativeFlow> parseAlternativeFlows(final UseCase uc, final List<String> lines) {
		return (Collection<AlternativeFlow>) parseFlows(uc, lines, "Alternat(e|ive) Flows(\\:)?\\s*=+",
				RequirementsPackage.eINSTANCE.getAlternativeFlow());
	}

	@SuppressWarnings("unchecked")
	private Collection<? extends SubFlow> parseSubFlows(final UseCase uc, final List<String> lines) {
		return (Collection<SubFlow>) parseFlows(uc, lines, "Sub-?flows(\\:)?\\s*=+",
				RequirementsPackage.eINSTANCE.getSubFlow());
	}

	private Collection<? extends IdentifyableObject> parseFlows(final UseCase uc, final List<String> lines,
			final String suffix, final EClass eClass) {
		if (!goToLineAfterSuffix(lines, suffix)) {
			return Collections.emptyList();
		}
		final String[] flowStrings = getCurrentTextParagraph(lines).split("\\*\\s*\\[");
		final LinkedList<IdentifyableObject> flows = new LinkedList<>();
		for (String flowString : flowStrings) {
			flowString = flowString.trim();
			if (!flowString.isEmpty() && !flowString.equalsIgnoreCase("none")) {
				int close = flowString.indexOf(']');
				if (close == -1) {
					close = 0;
				}
				final String id = flowString.substring(0, close);
				final String value = flowString.substring(close + 1).trim();
				final IdentifyableObject flow = (IdentifyableObject) RequirementsFactory.eINSTANCE.create(eClass);
				flow.setUsecase(uc);
				flow.setId(id);
				flow.setValue(value);
				flows.add(flow);
				this.flowMap.computeIfAbsent(uc, x -> new HashMap<>()).put(id.toLowerCase(), flow);
			}
		}
		return flows;
	}

	private Collection<? extends LoggingRequirement> parseLoggingRequirements(final UseCase uc,
			final List<String> lines) {
		if (!goToLineAfterSuffix(lines, "Logging(\\:)?\\s*=+")) {
			return Collections.emptyList();
		}

		final List<String> paragraph = getCurrentParagraph(lines);
		if (paragraph.size() < 2) {
			return Collections.emptyList();
		}
		int i = 0;
		final List<String> keys = Arrays.asList(paragraph.get(i).split("\\^")).stream().map(String::trim)
				.collect(Collectors.toList());
		final int description = keys.indexOf("Verbose Description");
		final int info = keys.indexOf("Additional Information");
		final int code = keys.indexOf("Transaction Code");
		final int ucs = keys.indexOf("Use Case(s) Involved");
		if ((description >= 0) && (info >= 0) && (code >= 0)) {
			final Collection<LoggingRequirement> reqs = new ArrayList<>(paragraph.size() - 1);
			while (++i < paragraph.size()) {
				final String line = paragraph.get(i);
				if (line.isBlank()) {
					continue;
				}
				final String[] values = line.split("\\|");
				final LoggingRequirement req = RequirementsFactory.eINSTANCE.createLoggingRequirement();
				req.setUsecase(uc);
				req.setId(values[code].trim());
				req.setValue(values[description].trim());
				req.setAdditionalInformation(values[info].trim());
				reqs.add(req);
				if (ucs >= 0) {
					this.logRefs.put(req, values[ucs]);
				}
			}
			return reqs;
		} else {
			final Collection<LoggingRequirement> reqs = new ArrayList<>(paragraph.size());
			int id = 0;
			for (final String line : paragraph) {
				final LoggingRequirement req = RequirementsFactory.eINSTANCE.createLoggingRequirement();
				req.setUsecase(uc);
				req.setId("L" + id++);
				req.setValue(line.trim());
				reqs.add(req);
			}
			return reqs;
		}
	}

	private Collection<? extends MainFlow> parseMainFlows(final UseCase uc, final List<String> lines) {
		if (!goToLineAfterSuffix(lines, "Main Flow(\\:)?\\s*=+")) {
			return Collections.emptyList();
		}

		final String paragraph = getCurrentTextParagraph(lines);

		final MainFlow flow = RequirementsFactory.eINSTANCE.createMainFlow();
		flow.setUsecase(uc);
		flow.setValue(paragraph);

		return Collections.singleton(flow);
	}

	private Collection<? extends PreConditon> parsePreconditions(final UseCase uc, final List<String> lines) {
		if (!goToLineAfterSuffix(lines, "Precondition(s)?(\\:)?\\s*=+$")) {
			return Collections.emptyList();
		}

		final String[] sentences = getSentences(lines);

		final LinkedList<PreConditon> conditions = new LinkedList<>();
		for (final String condition : sentences) {
			if (!condition.trim().isEmpty()) {
				final PreConditon pre = RequirementsFactory.eINSTANCE.createPreConditon();
				pre.setUsecase(uc);
				pre.setValue(condition + '.');
				conditions.add(pre);
			}
		}
		return conditions;
	}

	private boolean goToLineAfterSuffix(final List<String> lines, final String suffix) {
		final Pattern pattern = Pattern.compile(suffix);
		String line = lines.get(this.current++);
		while (!pattern.matcher(line).find()) {
			if (this.current >= lines.size()) {
				this.current = 0;
				return false;
			}
			line = lines.get(this.current++);
		}
		return true;
	}

	private String[] getSentences(final List<String> lines) {
		return getCurrentTextParagraph(lines).split("\\.");
	}

	private String getCurrentTextParagraph(final List<String> lines) {
		final List<String> paragraph = getCurrentParagraph(lines);
		return String.join("", paragraph);
	}

	private List<String> getCurrentParagraph(final List<String> lines) {
		final List<String> paragraph = new LinkedList<>();
		String line = lines.get(this.current++).trim();
		while ((this.current < lines.size()) && (line.isBlank() || (line.charAt(0) != '='))) {
			paragraph.add(line);
			line = lines.get(this.current++).trim();
		}
		this.current--;
		return paragraph;
	}

	private UseCase parseUseCase(final List<String> lines) {
		final UseCase uc = RequirementsFactory.eINSTANCE.createUseCase();
		String ucLine;
		do {
			ucLine = lines.get(this.current++).trim();
		} while (!ucLine.startsWith("=") || !ucLine.endsWith("="));
		ucLine = ucLine.replace('=', ' ').trim();
		int wsIndex = ucLine.indexOf(':');
		if (wsIndex == -1) {
			wsIndex = ucLine.indexOf(' ');
		}
		uc.setId(ucLine.substring(0, wsIndex));
		uc.setValue(ucLine.substring(wsIndex + 1).trim());
		return uc;
	}
}
