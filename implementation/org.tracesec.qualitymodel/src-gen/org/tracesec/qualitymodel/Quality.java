/**
 */
package org.tracesec.qualitymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.qualitymodel.Quality#getAspects <em>Aspects</em>}</li>
 *   <li>{@link org.tracesec.qualitymodel.Quality#getTitle <em>Title</em>}</li>
 *   <li>{@link org.tracesec.qualitymodel.Quality#getDescription <em>Description</em>}</li>
 *   <li>{@link org.tracesec.qualitymodel.Quality#getRelevantElements <em>Relevant Elements</em>}</li>
 * </ul>
 *
 * @see org.tracesec.qualitymodel.QualityModelPackage#getQuality()
 * @model
 * @generated
 */
public interface Quality extends EObject {
	/**
	 * Returns the value of the '<em><b>Aspects</b></em>' containment reference list.
	 * The list contents are of type {@link org.tracesec.qualitymodel.Aspect}.
	 * It is bidirectional and its opposite is '{@link org.tracesec.qualitymodel.Aspect#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspects</em>' containment reference list.
	 * @see org.tracesec.qualitymodel.QualityModelPackage#getQuality_Aspects()
	 * @see org.tracesec.qualitymodel.Aspect#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Aspect> getAspects();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.tracesec.qualitymodel.QualityModelPackage#getQuality_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.tracesec.qualitymodel.Quality#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

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
	 * @see org.tracesec.qualitymodel.QualityModelPackage#getQuality_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.tracesec.qualitymodel.Quality#getDescription <em>Description</em>}' attribute.
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
	 * @see org.tracesec.qualitymodel.QualityModelPackage#getQuality_RelevantElements()
	 * @model
	 * @generated
	 */
	EList<EObject> getRelevantElements();

} // Quality
