/**
 */
package org.gravity.requirements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gravity.requirements.LoggingRequirement;
import org.gravity.requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logging Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.requirements.impl.LoggingRequirementImpl#getAdditionalInformation <em>Additional Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoggingRequirementImpl extends IdentifyableObjectImpl implements LoggingRequirement {
	/**
	 * The default value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_INFORMATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation()
	 * @generated
	 * @ordered
	 */
	protected String additionalInformation = ADDITIONAL_INFORMATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoggingRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.LOGGING_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalInformation() {
		return additionalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalInformation(String newAdditionalInformation) {
		String oldAdditionalInformation = additionalInformation;
		additionalInformation = newAdditionalInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RequirementsPackage.LOGGING_REQUIREMENT__ADDITIONAL_INFORMATION, oldAdditionalInformation,
					additionalInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RequirementsPackage.LOGGING_REQUIREMENT__ADDITIONAL_INFORMATION:
			return getAdditionalInformation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RequirementsPackage.LOGGING_REQUIREMENT__ADDITIONAL_INFORMATION:
			setAdditionalInformation((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RequirementsPackage.LOGGING_REQUIREMENT__ADDITIONAL_INFORMATION:
			setAdditionalInformation(ADDITIONAL_INFORMATION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RequirementsPackage.LOGGING_REQUIREMENT__ADDITIONAL_INFORMATION:
			return ADDITIONAL_INFORMATION_EDEFAULT == null ? additionalInformation != null
					: !ADDITIONAL_INFORMATION_EDEFAULT.equals(additionalInformation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (additionalInformation: ");
		result.append(additionalInformation);
		result.append(')');
		return result.toString();
	}

} //LoggingRequirementImpl
