/**
 */
package org.tracesec.qualitymodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.qualitymodel.Aspect#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.tracesec.qualitymodel.Aspect#getQuality <em>Quality</em>}</li>
 *   <li>{@link org.tracesec.qualitymodel.Aspect#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see org.tracesec.qualitymodel.QualityModelPackage#getAspect()
 * @model
 * @generated
 */
public interface Aspect extends EObject {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tracesec.qualitymodel.Priority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see org.tracesec.qualitymodel.Priority
	 * @see #setPriority(Priority)
	 * @see org.tracesec.qualitymodel.QualityModelPackage#getAspect_Priority()
	 * @model
	 * @generated
	 */
	Priority getPriority();

	/**
	 * Sets the value of the '{@link org.tracesec.qualitymodel.Aspect#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see org.tracesec.qualitymodel.Priority
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Priority value);

	/**
	 * Returns the value of the '<em><b>Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality</em>' reference.
	 * @see #setQuality(Quality)
	 * @see org.tracesec.qualitymodel.QualityModelPackage#getAspect_Quality()
	 * @model
	 * @generated
	 */
	Quality getQuality();

	/**
	 * Sets the value of the '{@link org.tracesec.qualitymodel.Aspect#getQuality <em>Quality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality</em>' reference.
	 * @see #getQuality()
	 * @generated
	 */
	void setQuality(Quality value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.tracesec.qualitymodel.Quality#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Quality)
	 * @see org.tracesec.qualitymodel.QualityModelPackage#getAspect_Owner()
	 * @see org.tracesec.qualitymodel.Quality#getAspects
	 * @model opposite="aspects" transient="false"
	 * @generated
	 */
	Quality getOwner();

	/**
	 * Sets the value of the '{@link org.tracesec.qualitymodel.Aspect#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Quality value);

} // Aspect
