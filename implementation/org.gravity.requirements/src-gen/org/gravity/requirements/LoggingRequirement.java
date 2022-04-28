/**
 */
package org.gravity.requirements;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logging Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.requirements.LoggingRequirement#getAdditionalInformation <em>Additional Information</em>}</li>
 * </ul>
 *
 * @see org.gravity.requirements.RequirementsPackage#getLoggingRequirement()
 * @model
 * @generated
 */
public interface LoggingRequirement extends IdentifyableObject {

	/**
	 * Returns the value of the '<em><b>Additional Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Information</em>' attribute.
	 * @see #setAdditionalInformation(String)
	 * @see org.gravity.requirements.RequirementsPackage#getLoggingRequirement_AdditionalInformation()
	 * @model
	 * @generated
	 */
	String getAdditionalInformation();

	/**
	 * Sets the value of the '{@link org.gravity.requirements.LoggingRequirement#getAdditionalInformation <em>Additional Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Information</em>' attribute.
	 * @see #getAdditionalInformation()
	 * @generated
	 */
	void setAdditionalInformation(String value);
} // LoggingRequirement
