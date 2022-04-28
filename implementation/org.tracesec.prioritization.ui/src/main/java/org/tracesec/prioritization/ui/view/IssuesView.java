package org.tracesec.prioritization.ui.view;

import java.io.IOException;
import java.util.Collections;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TypeGraph;
import org.tracesec.prioritization.prioritization.prioritization.Finding;
import org.tracesec.prioritization.prioritization.prioritization.Prioritization;
import org.tracesec.prioritization.ui.OpenJavaFileDoubleClickListener;

public class IssuesView extends ViewPart {
	private static final String POPULATE_TEXT = "Please wait while this view is populated";

	/**
	 * The ID of this view
	 */
	public static final String VIEW_ID = "org.tracesec.prioritization.ui.issuesview";

	/**
	 * The logger of this class
	 */
	static final Logger LOGGER = Logger.getLogger(IssuesView.class);

	private IssueComparator comparator;


	private Label label;
	private TableViewer viewer;
	private Composite parent;

	@Override
	public void createPartControl(final Composite parent) {
		this.parent = parent;
		this.label = new Label(parent, SWT.NONE);
		this.label.setText(POPULATE_TEXT);

		final var viewSite = getViewSite();
		final var bars = viewSite.getActionBars();
		final var tm = bars.getToolBarManager(); // Buttons on top
		final var mm = bars.getMenuManager(); // Drop down menu

		tm.add(new Action("save") {

			@Override
			public void run() {
				try {
					if((IssuesView.this.viewer != null) && (IssuesView.this.viewer.getInput() != null)) {
						((Prioritization)IssuesView.this.viewer.getInput()).eResource().save(Collections.emptyMap());
					}
				} catch (final IOException e) {
					LOGGER.error(e);
				}
			}
		});
	}

	@Override
	public void setFocus() {
		if (!this.label.isDisposed()) {
			this.label.setFocus();
		}
	}

	/**
	 * Populates the view with the given content
	 *
	 * @param prioritization the p
	 * @param project
	 * @throws CoreException
	 * @throws IOException
	 */
	public void populate(final Prioritization prioritization, final IProject project) {
		if (!this.label.isDisposed()) {
			this.label.dispose();
			createTable(project);
		}

		this.viewer.setInput(prioritization);
		this.viewer.refresh();
		this.parent.pack();
		this.parent.layout(true);

		final var table = this.viewer.getTable();
		for (int i = 0, n = table.getColumnCount(); i < n; i++) {
			table.getColumn(i).pack();
		}
	}

	/**
	 * @param project The project the table should be linked to
	 */
	private void createTable(final IProject project) {
		this.parent.setLayout(new GridLayout(1, false));
		this.viewer = new TableViewer(this.parent, SWT.BORDER);
		this.viewer.addDoubleClickListener(new OpenJavaFileDoubleClickListener(project));
		this.viewer.setContentProvider(new IssueContentProvider());
		final var table = this.viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		createColumn("Index", new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				return Integer
						.toString(((Prioritization) ((Finding) element).eContainer()).getFindings().indexOf(element));
			}
		});

		createColumn("Scope", new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				final var annotated = ((Finding) element).getRepresents().getTAnnotated();
				if (annotated instanceof TMethodDefinition) {
					return "method";
				}
				if (annotated instanceof TFieldDefinition) {
					return "field";
				}
				if (annotated instanceof TAbstractType) {
					return "type";
				}
				if (annotated instanceof TypeGraph) {
					return "global";
				}
				return annotated.eClass().getName();
			}
		});

		createColumn("Element", new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				final var annotated = ((Finding) element).getRepresents().getTAnnotated();
				if (annotated instanceof TMember) {
					final var member = (TMember) annotated;
					return member.getDefinedBy().getFullyQualifiedName() + '.' + member.getSignatureString();
				}
				if (annotated instanceof TSignature) {
					return ((TSignature) annotated).getSignatureString();
				}
				if (annotated instanceof TMethod) {
					return ((TMethod) annotated).getTName();
				}
				if (annotated instanceof TField) {
					return ((TField) annotated).getTName();
				}
				if (annotated instanceof TAbstractType) {
					return ((TAbstractType) annotated).getFullyQualifiedName();
				}
				if (annotated instanceof TypeGraph) {
					return "";
				}
				return annotated.toString();
			}
		});

		createColumn("Priority", new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				return Integer.toString(((Finding) element).getPriority());
			}
		});

		final var manual = createColumn("Manual Priority", new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				final var priority = ((Finding) element).getManualPriority();
				if ((priority < 1) || (10 < priority)) {
					return "";
				}
				return Integer.toString(priority);
			}
		});
		manual.setEditingSupport(new EditingSupport(this.viewer) {

			@Override
			protected void setValue(final Object element, final Object value) {
				if (element instanceof Finding) {
					final var finding = (Finding) element;
					if (value instanceof String) {
						finding.setManualPriority(Integer.parseInt((String) value));
					}
					if (value instanceof Integer) {
						finding.setManualPriority((Integer) value);
					}
					IssuesView.this.viewer.update(element, null);
				}
			}

			@Override
			protected Object getValue(final Object element) {
				return ((Finding) element).getManualPriority();
			}

			@Override
			protected CellEditor getCellEditor(final Object element) {
				return new ComboBoxCellEditor(IssuesView.this.viewer.getTable(),
						new String[] { "","1", "2", "3", "4", "5", "6", "7", "8", "9", "10" });
			}

			@Override
			protected boolean canEdit(final Object element) {
				return true;
			}
		});

		createColumn("ID", new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				return ((Finding) element).getRepresents().getRulekey();
			}
		});

		createColumn("Description", new ColumnLabelProvider() {
			@Override
			public String getText(final Object element) {
				return ((Finding) element).getRepresents().getDescription();
			}
		});
		final var layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.widthHint = this.parent.getSize().x - 10;
		layoutData.heightHint = this.parent.getSize().y - 10;
		this.viewer.getControl().setLayoutData(layoutData);
		this.comparator = new IssueComparator();
		this.viewer.setComparator(this.comparator);
	}

	private SelectionAdapter getSelectionAdapter(final TableColumn column,
			final int index) {
		return new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				IssuesView.this.comparator.setColumn(index);
				final var dir = IssuesView.this.comparator.getDirection();
				IssuesView.this.viewer.getTable().setSortDirection(dir);
				IssuesView.this.viewer.getTable().setSortColumn(column);
				IssuesView.this.viewer.refresh();
			}
		};
	}

	int i = 0;

	private TableViewerColumn createColumn(final String name, final CellLabelProvider provider) {
		final var column = new TableViewerColumn(this.viewer, SWT.NONE);
		column.getColumn().setText(name);
		column.setLabelProvider(provider);
		column.getColumn().addSelectionListener(getSelectionAdapter(column.getColumn(), this.i++));
		return column;
	}

	/**
	 * A getter for the mapping view
	 *
	 * @return The mapping view
	 */
	public static IssuesView getIssuesView() {
		try {
			return (IssuesView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(VIEW_ID);
		} catch (final PartInitException e) {
			LOGGER.log(Level.ERROR, e);
			return null;
		}
	}
}