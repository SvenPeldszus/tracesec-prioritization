/**
 */
package org.tracesec.requirements;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.requirements.RequirementRelation#getSource <em>Source</em>}</li>
 *   <li>{@link org.tracesec.requirements.RequirementRelation#getTarget <em>Target</em>}</li>
 *   <li>{@link org.tracesec.requirements.RequirementRelation#getType <em>Type</em>}</li>
 *   <li>{@link org.tracesec.requirements.RequirementRelation#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.tracesec.requirements.RequirementsPackage#getRequirementRelation()
 * @model
 * @generated
 */
public interface RequirementRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.tracesec.requirements.AbstractRequirement#getOutgoingReferences <em>Outgoing References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(AbstractRequirement)
	 * @see org.tracesec.requirements.RequirementsPackage#getRequirementRelation_Source()
	 * @see org.tracesec.requirements.AbstractRequirement#getOutgoingReferences
	 * @model opposite="outgoingReferences" required="true" transient="false"
	 * @generated
	 */
	AbstractRequirement getSource();

	/**
	 * Sets the value of the '{@link org.tracesec.requirements.RequirementRelation#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AbstractRequirement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.tracesec.requirements.AbstractRequirement#getIncomingReferences <em>Incoming References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AbstractRequirement)
	 * @see org.tracesec.requirements.RequirementsPackage#getRequirementRelation_Target()
	 * @see org.tracesec.requirements.AbstractRequirement#getIncomingReferences
	 * @model opposite="incomingReferences"
	 * @generated
	 */
	AbstractRequirement getTarget();

	/**
	 * Sets the value of the '{@link org.tracesec.requirements.RequirementRelation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractRequirement value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"USAGE"</code>.
	 * The literals are from the enumeration {@link org.tracesec.requirements.ReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.tracesec.requirements.ReferenceType
	 * @see #setType(ReferenceType)
	 * @see org.tracesec.requirements.RequirementsPackage#getRequirementRelation_Type()
	 * @model default="USAGE" required="true"
	 * @generated
	 */
	ReferenceType getType();

	/**
	 * Sets the value of the '{@link org.tracesec.requirements.RequirementRelation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.tracesec.requirements.ReferenceType
	 * @see #getType()
	 * @generated
	 */
	void setType(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.tracesec.requirements.RequirementsPackage#getRequirementRelation_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.tracesec.requirements.RequirementRelation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // RequirementRelation
