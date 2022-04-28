package org.tracesec.prioritization.ui;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.ISourceReference;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.texteditor.AbstractTextEditor;
import org.gravity.eclipse.util.JavaASTUtil;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.tracesec.prioritization.prioritization.prioritization.Finding;

public class OpenJavaFileDoubleClickListener implements IDoubleClickListener {
	private static final Logger LOGGER = Logger.getLogger(OpenJavaFileDoubleClickListener.class);
	private final IProject project;

	public OpenJavaFileDoubleClickListener(final IProject project) {
		this.project = project;
	}

	@Override
	public void doubleClick(final DoubleClickEvent event) {
		final var finding = getSelectedCorrespondence(event);
		if (finding != null) {
			final EObject pmElement = finding.getTAnnotated();
			final var javaElement = getJavaElement(pmElement);
			if (javaElement != null) {
				try {
					open(javaElement);
				} catch (final CoreException e) {
					LOGGER.log(Level.ERROR, e);
				}
			} else {
				LOGGER.log(Level.ERROR, "AstTypes does not include general library types (String).");
			}
		} else {
			LOGGER.log(Level.ERROR, "Correspondence is null - something is wrong.");
		}

	}

	/**
	 * @param javaElement
	 * @throws JavaModelException
	 * @throws PartInitException
	 */
	private void open(final IJavaElement javaElement) throws JavaModelException, PartInitException {
		final var file = (IFile) javaElement.getUnderlyingResource();
		final var page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		final var editor = IDE.openEditor(page, file, "org.eclipse.jdt.ui.CompilationUnitEditor", true);
		((AbstractTextEditor) editor).selectAndReveal(((ISourceReference) javaElement).getSourceRange().getOffset(), 0);
	}

	/**
	 * @param pmElement An element from the program model
	 * @return The corresponding element from the AST
	 * @throws JavaModelException
	 */
	private IJavaElement getJavaElement(final EObject pmElement) {
		try {
			final var astTypes = JavaASTUtil.getTypesForProject(JavaCore.create(this.project));

			IJavaElement javaElement = null;
			if (pmElement instanceof TMethodDefinition) {
				final var member = (TMethodDefinition) pmElement;
				final var type = member.getDefinedBy();
				javaElement = JavaASTUtil.getIMethod(member.getSignature(), astTypes.get(type.getFullyQualifiedName()));
			} else if (pmElement instanceof TAbstractType) {
				final var type = (TAbstractType) pmElement;
				javaElement = astTypes.get(type.getFullyQualifiedName());
			} else {
				LOGGER.log(Level.ERROR, "pmElement is not the correct instance type. (double click)");
				return null;
			}
			return javaElement;
		} catch (final JavaModelException e) {
			LOGGER.log(Level.ERROR, e);
			return null;
		}
	}

	private SonarlintFinding getSelectedCorrespondence(final DoubleClickEvent event) {
		final var s = event.getSelection();
		if (s instanceof StructuredSelection) {
			final var selection = ((IStructuredSelection) s).getFirstElement();
			if (selection instanceof Finding) {
				return ((Finding)selection).getRepresents();
			}
			// else root element was double clicked
		}
		return null;
	}
}