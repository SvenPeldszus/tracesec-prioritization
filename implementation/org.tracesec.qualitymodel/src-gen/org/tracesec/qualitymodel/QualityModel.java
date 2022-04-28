/**
 */
package org.tracesec.qualitymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.qualitymodel.QualityModel#getQualities <em>Qualities</em>}</li>
 *   <li>{@link org.tracesec.qualitymodel.QualityModel#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see org.tracesec.qualitymodel.QualityModelPackage#getQualityModel()
 * @model
 * @generated
 */
public interface QualityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualities</b></em>' containment reference list.
	 * The list contents are of type {@link org.tracesec.qualitymodel.Quality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualities</em>' containment reference list.
	 * @see org.tracesec.qualitymodel.QualityModelPackage#getQualityModel_Qualities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Quality> getQualities();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(Quality)
	 * @see org.tracesec.qualitymodel.QualityModelPackage#getQualityModel_Root()
	 * @model
	 * @generated
	 */
	Quality getRoot();

	/**
	 * Sets the value of the '{@link org.tracesec.qualitymodel.QualityModel#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Quality value);

} // QualityModel
