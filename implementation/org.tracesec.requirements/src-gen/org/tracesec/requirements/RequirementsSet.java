/**
 */
package org.tracesec.requirements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.requirements.RequirementsSet#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link org.tracesec.requirements.RequirementsSet#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @see org.tracesec.requirements.RequirementsPackage#getRequirementsSet()
 * @model
 * @generated
 */
public interface RequirementsSet extends AbstractRequirement {
	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered</em>' attribute.
	 * @see #setOrdered(boolean)
	 * @see org.tracesec.requirements.RequirementsPackage#getRequirementsSet_Ordered()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link org.tracesec.requirements.RequirementsSet#isOrdered <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.tracesec.requirements.AbstractRequirement}.
	 * It is bidirectional and its opposite is '{@link org.tracesec.requirements.AbstractRequirement#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see org.tracesec.requirements.RequirementsPackage#getRequirementsSet_Requirements()
	 * @see org.tracesec.requirements.AbstractRequirement#getSet
	 * @model opposite="set" containment="true"
	 * @generated
	 */
	EList<AbstractRequirement> getRequirements();

} // RequirementsSet
