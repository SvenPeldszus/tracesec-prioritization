/**
 */
package org.tracesec.qualitymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.qualitymodel.QualityAspect#getDescription <em>Description</em>}</li>
 *   <li>{@link org.tracesec.qualitymodel.QualityAspect#getRelevantElements <em>Relevant Elements</em>}</li>
 * </ul>
 *
 * @see org.tracesec.qualitymodel.QualityModelPackage#getQualityAspect()
 * @model
 * @generated
 */
public interface QualityAspect extends AbstractQualityNode {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.tracesec.qualitymodel.QualityModelPackage#getQualityAspect_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.tracesec.qualitymodel.QualityAspect#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Relevant Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relevant Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relevant Elements</em>' reference list.
	 * @see org.tracesec.qualitymodel.QualityModelPackage#getQualityAspect_RelevantElements()
	 * @model
	 * @generated
	 */
	EList<EObject> getRelevantElements();

} // QualityAspect
