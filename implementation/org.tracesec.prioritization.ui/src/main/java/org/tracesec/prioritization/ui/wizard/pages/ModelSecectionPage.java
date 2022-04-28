package org.tracesec.prioritization.ui.wizard.pages;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.gravity.eclipse.GravityActivator;
import org.gravity.eclipse.io.ExtensionFileVisitor;
import org.gravity.eclipse.util.EMFUtil;
import org.gravity.typegraph.basic.BasicPackage;
import org.moflon.tgg.runtime.CorrespondenceModel;

public class ModelSecectionPage extends WizardPage {

	private final class ModelFileLabelProvider extends LabelProvider implements ITableLabelProvider {

		@Override
		public Image getColumnImage(final Object element, final int columnIndex) {
			return null;
		}

		@Override
		public String getColumnText(final Object element, final int columnIndex) {
			if (element instanceof IFile) {
				final var path = (IFile) element;
				switch (columnIndex) {
				case 0:
					return path.getParent().getProjectRelativePath().toString();
				case 1:
					return path.getName();
				case 2:
					return getModelString(path);
				default:
					break;
				}
			}
			return null;
		}

		private String getModelString(final IFile path) {
			try {
				final var xmlif = XMLInputFactory.newInstance();
				final var xmlr = xmlif.createXMLStreamReader(path.getContents());
				while (xmlr.hasNext()) {
					xmlr.next();
					if (xmlr.isStartElement() || xmlr.isEndElement()) {
						return xmlr.getLocalName();
					}
				}
			} catch (XMLStreamException | CoreException e) {
				// In case of exception or not finding name fallback to EMF
			}

			final var model = getModel(path);
			if (model != null) {
				return model.toString();
			}
			return "Cannot load model preview";
		}
	}

	private final class ModelOrderLabelProvider extends LabelProvider implements ITableLabelProvider {

		@Override
		public Image getColumnImage(final Object element, final int columnIndex) {
			return null;
		}

		@Override
		public String getColumnText(final Object element, final int columnIndex) {
			EPackage ePackage = null;
			if (element instanceof EPackage) {
				ePackage = (EPackage) element;
			} else if (element instanceof EObject) {
				ePackage = ((EObject) element).eClass().getEPackage();
			} else if (element instanceof IFile) {
				final var eObject = getModel((IFile) element);
				if (eObject != null) {
					ePackage = eObject.eClass().getEPackage();
				}
			} else {
				return "Unknown element kind";
			}

			if (ePackage == null) {
				return null;
			}

			switch (columnIndex) {
			case 0:
				return Integer.toString(ModelSecectionPage.this.order.indexOf(ePackage));
			case 1:
				return ePackage.getNsURI();
			default:
				return null;
			}
		}
	}

	private final Map<IFile, EObject> models = new HashMap<>();

	private EObject getModel(final IFile path) {
		if (this.models.containsKey(path)) {
			return this.models.get(path);
		}

		final var uri = EMFUtil.getPlatformResourceURI(path);
		Resource resource;
		try {
			if ("uml".equalsIgnoreCase(path.getFileExtension())) {
				resource = UMLResource.Factory.INSTANCE.createResource(uri);
				resource.load(path.getContents(), Collections.emptyMap());
				this.set.getResources().add(resource);
			} else {
				resource = this.set.getResource(uri, true);
			}
		} catch (final IOException | CoreException e) {
			return null;
		}

		final var contents = resource.getContents();
		if (contents.isEmpty()) {
			return null;
		}
		final var eObject = contents.get(0);
		this.models.put(path, eObject);
		return eObject;

	}

	private final ExtensionFileVisitor modelVisitor;
	private final ExtensionFileVisitor configurationVisitor;
	private final List<IFile> files;
	private final IFile pm;
	private CheckboxTableViewer modelSelectionTableViewer;
	private TableViewer modelOrderTableViewer;

	private final List<EPackage> order = new LinkedList<>();
	private final ResourceSetImpl set;
	private Text selectionConfigurationText;
	private final IProject project;
	private Button recalculateFindings;

	public ModelSecectionPage(final IProject project) throws CoreException, IOException {
		super("Model selection");
		this.project = project;
		this.modelVisitor = new ExtensionFileVisitor("xmi", "uml");
		project.accept(this.modelVisitor);
		this.files = getIFiles(project, this.modelVisitor.getFiles());
		this.pm = GravityActivator.getProgramModelFolder(project, null).getFile("pm.xmi");
		this.set = new ResourceSetImpl();
		this.configurationVisitor = new ExtensionFileVisitor("tracesec");
		project.accept(this.configurationVisitor);
	}

	/**
	 * @param project
	 * @param files
	 * @return
	 */
	private List<IFile> getIFiles(final IProject project, final List<Path> files) {
		final var location = project.getLocation().toFile().toPath();
		final var collect = files.stream().map(location::relativize).map(Path::toString).map(project::getFile)
				.collect(Collectors.toList());
		return collect;
	}

	@Override
	public void createControl(final Composite parent) {
		final var composite = new SashForm(parent, SWT.VERTICAL);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));

		final var modelSelcectionComposite = createModelSelectionComposite(composite);
		createModelSelectionControl(modelSelcectionComposite);

		final var modelOrderComposite = createModelOrderComposite(composite);
		createModelOrderControl(modelOrderComposite);

		createConfiguationControl(composite);

		composite.setWeights(50, 35, 15);
		this.recalculateFindings = new Button(composite, SWT.CHECK);
		this.recalculateFindings.setText("Recalculate SonarQube findings.");

		setControl(composite);
	}

	private Composite createConfiguationControl(final SashForm parent) {
		final var configurationComposite = new Composite(parent, SWT.NONE);
		final var orderLayout = new GridLayout();
		orderLayout.verticalSpacing = 12;
		configurationComposite.setLayout(orderLayout);
		configurationComposite.setLayoutData(new GridData(GridData.FILL_BOTH | GridData.GRAB_VERTICAL));

		final var rowComposite = new Composite(configurationComposite, SWT.NONE);
		final var row = new RowLayout();
		rowComposite.setLayout(row);
		row.marginTop = 10;
		final var packagesLabel = new Label(rowComposite, SWT.LEFT);
		packagesLabel.setText("Select the import configuration");

		final var composite = new Composite(configurationComposite, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		final var layout = new GridLayout(2, false);
		composite.setLayout(layout);

		this.selectionConfigurationText = new Text(composite, SWT.BORDER);
		this.selectionConfigurationText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		final var configurationFiles = this.configurationVisitor.getFiles();
		if (configurationFiles.size() == 1) {
			this.selectionConfigurationText
			.setText(getIFiles(this.project, configurationFiles).get(0).getProjectRelativePath().toString());
		}

		final var browseButton = new Button(composite, SWT.PUSH);
		browseButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		browseButton.setText("Browse");
		browseButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				// final var dialog = new FileDialog(null, "Select a TraceSec Configuration
				// file");
			}
		});

		return composite;
	}

	private Composite createModelSelectionComposite(final SashForm composite) {
		final var modelSelcectionComposite = new Composite(composite, SWT.NONE);
		final var orderLayout = new GridLayout();
		orderLayout.verticalSpacing = 12;
		modelSelcectionComposite.setLayout(orderLayout);
		modelSelcectionComposite.setLayoutData(new GridData(GridData.FILL_BOTH | GridData.GRAB_VERTICAL));
		return modelSelcectionComposite;
	}

	private void createModelSelectionControl(final Composite parent) {
		final var composite = generalLayout(parent);
		final var label = tableTitle(composite, "Models within the project");

		final var modelsTable = new Table(composite, SWT.CHECK | SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);
		modelsTable.setHeaderVisible(true);
		createColumn(modelsTable, "Path");
		createColumn(modelsTable, "File");
		createColumn(modelsTable, "Root Element");

		this.modelSelectionTableViewer = new CheckboxTableViewer(modelsTable);
		this.modelSelectionTableViewer.setLabelProvider(new ModelFileLabelProvider());
		this.modelSelectionTableViewer.add(this.files.toArray());
		this.modelSelectionTableViewer.setChecked(getPm(), true);
		this.modelSelectionTableViewer.setGrayed(getPm(), true);

		layoutTable(modelsTable, label);

		final var selectionComposite = createButtonArea(composite, label);

		final var selectAllButton = new Button(selectionComposite, SWT.PUSH);
		selectAllButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		selectAllButton.setText("Select All");
		selectAllButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				ModelSecectionPage.this.modelSelectionTableViewer
				.setCheckedElements(ModelSecectionPage.this.modelVisitor.getFiles().toArray());
				selectionCheckStateChanged();
			}
		});

		final var deselectAllButton = new Button(selectionComposite, SWT.PUSH);
		deselectAllButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		deselectAllButton.setText("Deselect All");
		deselectAllButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				ModelSecectionPage.this.modelOrderTableViewer
				.remove(ModelSecectionPage.this.modelSelectionTableViewer.getCheckedElements());
				ModelSecectionPage.this.modelSelectionTableViewer.setCheckedElements(new Object[0]);
				selectionCheckStateChanged();
			}
		});

		modelsTable.setLinesVisible(true);
		modelsTable.setLayout(new TableLayout());

		this.modelSelectionTableViewer.addCheckStateListener(event -> {
			final var element = event.getElement();
			if (event.getChecked()) {
				addToSelected(element);
			} else {
				removeFromSelected(element);
			}
		});
	}

	private Composite createButtonArea(final Composite parent, final Label label) {
		final var selectionComposite = new Composite(parent, SWT.NONE);
		final var data = new FormData();
		data.top = new FormAttachment(label, 0, SWT.CENTER);
		data.right = new FormAttachment(100);
		selectionComposite.setLayoutData(data);

		final var layout = new GridLayout(2, true);
		layout.marginLeft = -5;
		layout.marginRight = -5;
		layout.marginTop = -5;
		layout.marginBottom = -5;
		selectionComposite.setLayout(layout);
		return selectionComposite;
	}

	private void removeFromSelected(final Object element) {
		final var eObject = getEObject(element);
		if (eObject instanceof CorrespondenceModel) {
			final var corr = (CorrespondenceModel) eObject;
			final var keep = getEPackagesToKeep(element);
			if (!keep.contains(corr.getSource().eClass().getEPackage())) {
				removeFromSelected(corr.getSource());
			}
			if (!keep.contains(corr.getTarget().eClass().getEPackage())) {
				removeFromSelected(corr.getTarget());
			}
		} else {
			final var ePackage = eObject.eClass().getEPackage();
			removeFromOrder(ePackage);
		}
	}

	private void removeFromOrder(final EPackage ePackage) {
		this.order.remove(ePackage);
		ModelSecectionPage.this.modelOrderTableViewer.remove(ePackage);
	}

	private Set<EObject> getEPackagesToKeep(final Object element) {
		final Set<EObject> keep = new HashSet<>();
		for (final Object checked : this.modelSelectionTableViewer.getCheckedElements()) {
			if (checked != element) {
				final var checkedEObject = getEObject(checked);
				keep.add(checkedEObject.eClass().getEPackage());
				if (checkedEObject instanceof CorrespondenceModel) {
					keep.add(((CorrespondenceModel) checkedEObject).getSource().eClass().getEPackage());
					keep.add(((CorrespondenceModel) checkedEObject).getTarget().eClass().getEPackage());
				}
			}
		}
		return keep;
	}

	private EObject getEObject(final Object element) {
		if (element instanceof EObject) {
			return (EObject) element;
		} else if (element instanceof IFile) {
			return getModel((IFile) element);
		}
		System.err.println("ERROR");

		return null;
	}

	private void addToSelected(final Object element) {
		final var eObject = getEObject(element);
		if (eObject instanceof CorrespondenceModel) {
			final var corr = (CorrespondenceModel) eObject;
			addToSelected(corr.getSource());
			addToSelected(corr.getTarget());
		} else {
			EPackage ePackage;
			if (eObject instanceof EPackage) {
				ePackage = (EPackage) eObject;
			} else {
				ePackage = eObject.eClass().getEPackage();
			}
			if (!this.order.contains(ePackage)) {
				addToOrder(ePackage);
			}
		}
	}

	private void addToOrder(final EPackage ePackage) {
		this.order.add(ePackage);
		ModelSecectionPage.this.modelOrderTableViewer.add(ePackage);
	}

	private void layoutTable(final Table modelsTable, final Label label) {
		final var data = new FormData();
		data.top = new FormAttachment(label, 5);
		data.bottom = new FormAttachment(100);
		data.left = new FormAttachment(0);
		data.right = new FormAttachment(100);
		data.height = 90;
		modelsTable.setLayoutData(data);
	}

	private Label tableTitle(final Composite composite, final String title) {
		final var packagesLabel = new Label(composite, SWT.LEFT);
		packagesLabel.setText(title);
		final var data = new FormData();
		data.left = new FormAttachment(0);
		packagesLabel.setLayoutData(data);
		return packagesLabel;
	}

	private Composite generalLayout(final Composite parent) {
		final var composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		final var layout = new FormLayout();
		layout.marginTop = 10;
		layout.spacing = 10;
		composite.setLayout(layout);
		return composite;
	}

	private Composite createModelOrderComposite(final SashForm composite) {
		final var modelOrderComposite = new Composite(composite, SWT.NONE);
		final var layout = new GridLayout();
		layout.verticalSpacing = 12;
		modelOrderComposite.setLayout(layout);
		modelOrderComposite.setLayoutData(new GridData(GridData.FILL_BOTH | GridData.GRAB_VERTICAL));
		return modelOrderComposite;
	}

	private void createModelOrderControl(final Composite parent) {
		final var composite = generalLayout(parent);
		final var label = tableTitle(composite, "Model order");

		final var modelsTable = new Table(composite, SWT.CHECK | SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);
		modelsTable.setHeaderVisible(true);
		createColumn(modelsTable, "Position");
		createColumn(modelsTable, "Root Element");

		layoutTable(modelsTable, label);

		this.modelOrderTableViewer = new TableViewer(modelsTable);
		this.modelOrderTableViewer.setLabelProvider(new ModelOrderLabelProvider());

		final var selectionComposite = createButtonArea(composite, label);

		final var upButton = new Button(selectionComposite, SWT.PUSH);
		upButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		upButton.setText("move upwards");
		upButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				final var selection = (IStructuredSelection) ModelSecectionPage.this.modelOrderTableViewer
						.getSelection();
				for (final Object element : selection) {
					if (!BasicPackage.eINSTANCE.equals(element)) {
						final var index = ModelSecectionPage.this.order.indexOf(element);
						if (index > 1) {
							ModelSecectionPage.this.order.remove(element);
							ModelSecectionPage.this.order.add(index - 1, (EPackage) element);
							final List<EPackage> add = new LinkedList<>();
							for (var i = index - 1; i < ModelSecectionPage.this.order.size(); i++) {
								final var entry = ModelSecectionPage.this.order.get(i);
								ModelSecectionPage.this.modelOrderTableViewer.remove(entry);
								add.add(entry);
							}
							for (final EPackage entry : add) {
								ModelSecectionPage.this.modelOrderTableViewer.add(entry);
							}
						}
					}
				}
			}
		});

		final var downButton = new Button(selectionComposite, SWT.PUSH);
		downButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		downButton.setText("move downwards");
		downButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				final var selection = (IStructuredSelection) ModelSecectionPage.this.modelOrderTableViewer
						.getSelection();
				for (final Object element : selection) {
					if (!BasicPackage.eINSTANCE.equals(element)) {
						final var index = ModelSecectionPage.this.order.indexOf(element);
						if (index < ModelSecectionPage.this.order.size()) {
							ModelSecectionPage.this.order.remove(element);
							ModelSecectionPage.this.order.add(index + 1, (EPackage) element);
							final List<EPackage> add = new LinkedList<>();
							for (var i = index; i < ModelSecectionPage.this.order.size(); i++) {
								final var entry = ModelSecectionPage.this.order.get(i);
								ModelSecectionPage.this.modelOrderTableViewer.remove(entry);
								add.add(entry);
							}
							for (final EPackage entry : add) {
								ModelSecectionPage.this.modelOrderTableViewer.add(entry);
							}
						}
					}
				}
			}
		});

		addToOrder(BasicPackage.eINSTANCE);
	}

	private void createColumn(final Table table, final String label) {
		final var tcFile = new TableColumn(table, SWT.BORDER);
		tcFile.setText(label);
		tcFile.pack();
		tcFile.setMoveable(true);
	}

	private void selectionCheckStateChanged() {
		getContainer().updateButtons();
	}

	@Override
	public boolean isPageComplete() {
		return !this.selectionConfigurationText.getText().isBlank();
	}

	public IFile getConfigurationFile() {
		return this.project.getFile(this.selectionConfigurationText.getText());
	}

	public List<EPackage> getOrder() {
		return this.order;
	}

	public List<IFile> getModels() {
		return Stream.of(this.modelSelectionTableViewer.getCheckedElements()).map(IFile.class::cast)
				.collect(Collectors.toList());
	}

	public IFile getPm() {
		return this.pm;
	}

	public boolean recalculateFindings() {
		return this.recalculateFindings.getSelection();
	}
}
