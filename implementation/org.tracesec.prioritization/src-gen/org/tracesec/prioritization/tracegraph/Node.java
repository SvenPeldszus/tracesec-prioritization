/**
 */
package org.tracesec.prioritization.tracegraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.prioritization.tracegraph.Node#getOut <em>Out</em>}</li>
 *   <li>{@link org.tracesec.prioritization.tracegraph.Node#getIn <em>In</em>}</li>
 *   <li>{@link org.tracesec.prioritization.tracegraph.Node#getRepresents <em>Represents</em>}</li>
 * </ul>
 *
 * @see org.tracesec.prioritization.tracegraph.TracegraphPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link org.tracesec.prioritization.tracegraph.Edge}.
	 * It is bidirectional and its opposite is '{@link org.tracesec.prioritization.tracegraph.Edge#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see org.tracesec.prioritization.tracegraph.TracegraphPackage#getNode_Out()
	 * @see org.tracesec.prioritization.tracegraph.Edge#getSrc
	 * @model opposite="src"
	 * @generated
	 */
	EList<Edge> getOut();

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link org.tracesec.prioritization.tracegraph.Edge}.
	 * It is bidirectional and its opposite is '{@link org.tracesec.prioritization.tracegraph.Edge#getTrg <em>Trg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see org.tracesec.prioritization.tracegraph.TracegraphPackage#getNode_In()
	 * @see org.tracesec.prioritization.tracegraph.Edge#getTrg
	 * @model opposite="trg"
	 * @generated
	 */
	EList<Edge> getIn();

	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' reference.
	 * @see #setRepresents(EObject)
	 * @see org.tracesec.prioritization.tracegraph.TracegraphPackage#getNode_Represents()
	 * @model required="true"
	 * @generated
	 */
	EObject getRepresents();

	/**
	 * Sets the value of the '{@link org.tracesec.prioritization.tracegraph.Node#getRepresents <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(EObject value);

} // Node
