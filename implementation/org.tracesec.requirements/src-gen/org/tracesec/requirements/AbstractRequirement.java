/**
 */
package org.tracesec.requirements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.requirements.AbstractRequirement#getWording <em>Wording</em>}</li>
 *   <li>{@link org.tracesec.requirements.AbstractRequirement#getId <em>Id</em>}</li>
 *   <li>{@link org.tracesec.requirements.AbstractRequirement#getTitle <em>Title</em>}</li>
 *   <li>{@link org.tracesec.requirements.AbstractRequirement#getSet <em>Set</em>}</li>
 *   <li>{@link org.tracesec.requirements.AbstractRequirement#getOutgoingReferences <em>Outgoing References</em>}</li>
 *   <li>{@link org.tracesec.requirements.AbstractRequirement#getIncomingReferences <em>Incoming References</em>}</li>
 * </ul>
 *
 * @see org.tracesec.requirements.RequirementsPackage#getAbstractRequirement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractRequirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Wording</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wording</em>' attribute.
	 * @see #setWording(String)
	 * @see org.tracesec.requirements.RequirementsPackage#getAbstractRequirement_Wording()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getWording();

	/**
	 * Sets the value of the '{@link org.tracesec.requirements.AbstractRequirement#getWording <em>Wording</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wording</em>' attribute.
	 * @see #getWording()
	 * @generated
	 */
	void setWording(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.tracesec.requirements.RequirementsPackage#getAbstractRequirement_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.tracesec.requirements.AbstractRequirement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.tracesec.requirements.RequirementsPackage#getAbstractRequirement_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.tracesec.requirements.AbstractRequirement#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.tracesec.requirements.RequirementsSet#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' container reference.
	 * @see #setSet(RequirementsSet)
	 * @see org.tracesec.requirements.RequirementsPackage#getAbstractRequirement_Set()
	 * @see org.tracesec.requirements.RequirementsSet#getRequirements
	 * @model opposite="requirements" required="true" transient="false"
	 * @generated
	 */
	RequirementsSet getSet();

	/**
	 * Sets the value of the '{@link org.tracesec.requirements.AbstractRequirement#getSet <em>Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set</em>' container reference.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(RequirementsSet value);

	/**
	 * Returns the value of the '<em><b>Outgoing References</b></em>' containment reference list.
	 * The list contents are of type {@link org.tracesec.requirements.RequirementRelation}.
	 * It is bidirectional and its opposite is '{@link org.tracesec.requirements.RequirementRelation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing References</em>' containment reference list.
	 * @see org.tracesec.requirements.RequirementsPackage#getAbstractRequirement_OutgoingReferences()
	 * @see org.tracesec.requirements.RequirementRelation#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<RequirementRelation> getOutgoingReferences();

	/**
	 * Returns the value of the '<em><b>Incoming References</b></em>' reference list.
	 * The list contents are of type {@link org.tracesec.requirements.RequirementRelation}.
	 * It is bidirectional and its opposite is '{@link org.tracesec.requirements.RequirementRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming References</em>' reference list.
	 * @see org.tracesec.requirements.RequirementsPackage#getAbstractRequirement_IncomingReferences()
	 * @see org.tracesec.requirements.RequirementRelation#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<RequirementRelation> getIncomingReferences();

} // AbstractRequirement
