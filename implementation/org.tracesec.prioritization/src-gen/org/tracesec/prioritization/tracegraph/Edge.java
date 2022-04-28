/**
 */
package org.tracesec.prioritization.tracegraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.prioritization.tracegraph.Edge#getSrc <em>Src</em>}</li>
 *   <li>{@link org.tracesec.prioritization.tracegraph.Edge#getTrg <em>Trg</em>}</li>
 *   <li>{@link org.tracesec.prioritization.tracegraph.Edge#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @see org.tracesec.prioritization.tracegraph.TracegraphPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.tracesec.prioritization.tracegraph.Node#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Node)
	 * @see org.tracesec.prioritization.tracegraph.TracegraphPackage#getEdge_Src()
	 * @see org.tracesec.prioritization.tracegraph.Node#getOut
	 * @model opposite="out" required="true"
	 * @generated
	 */
	Node getSrc();

	/**
	 * Sets the value of the '{@link org.tracesec.prioritization.tracegraph.Edge#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Node value);

	/**
	 * Returns the value of the '<em><b>Trg</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.tracesec.prioritization.tracegraph.Node#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trg</em>' reference.
	 * @see #setTrg(Node)
	 * @see org.tracesec.prioritization.tracegraph.TracegraphPackage#getEdge_Trg()
	 * @see org.tracesec.prioritization.tracegraph.Node#getIn
	 * @model opposite="in" required="true"
	 * @generated
	 */
	Node getTrg();

	/**
	 * Sets the value of the '{@link org.tracesec.prioritization.tracegraph.Edge#getTrg <em>Trg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trg</em>' reference.
	 * @see #getTrg()
	 * @generated
	 */
	void setTrg(Node value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see org.tracesec.prioritization.tracegraph.TracegraphPackage#getEdge_Capacity()
	 * @model default="1"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link org.tracesec.prioritization.tracegraph.Edge#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

} // Edge
