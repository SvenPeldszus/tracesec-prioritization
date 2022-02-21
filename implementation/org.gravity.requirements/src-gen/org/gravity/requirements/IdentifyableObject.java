/**
 */
package org.gravity.requirements;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifyable Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.requirements.IdentifyableObject#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.gravity.requirements.RequirementsPackage#getIdentifyableObject()
 * @model abstract="true"
 * @generated
 */
public interface IdentifyableObject extends Element {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.gravity.requirements.RequirementsPackage#getIdentifyableObject_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.gravity.requirements.IdentifyableObject#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // IdentifyableObject
