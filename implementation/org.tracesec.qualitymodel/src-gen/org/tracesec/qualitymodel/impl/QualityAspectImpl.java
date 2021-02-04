/**
 */
package org.tracesec.qualitymodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.tracesec.qualitymodel.QualityAspect;
import org.tracesec.qualitymodel.QualityCategory;
import org.tracesec.qualitymodel.QualityModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.qualitymodel.impl.QualityAspectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.tracesec.qualitymodel.impl.QualityAspectImpl#getRelevantElements <em>Relevant Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityAspectImpl extends AbstractQualityNodeImpl implements QualityAspect {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelevantElements() <em>Relevant Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevantElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> relevantElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityAspectImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityModelPackage.Literals.QUALITY_ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return this.description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(final String newDescription) {
		final String oldDescription = this.description;
		this.description = newDescription;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, QualityModelPackage.QUALITY_ASPECT__DESCRIPTION, oldDescription, this.description));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getRelevantElements() {
		if (this.relevantElements == null) {
			this.relevantElements = new EObjectResolvingEList<>(EObject.class, this, QualityModelPackage.QUALITY_ASPECT__RELEVANT_ELEMENTS);
		}
		return this.relevantElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case QualityModelPackage.QUALITY_ASPECT__DESCRIPTION:
			return getDescription();
		case QualityModelPackage.QUALITY_ASPECT__RELEVANT_ELEMENTS:
			return getRelevantElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case QualityModelPackage.QUALITY_ASPECT__DESCRIPTION:
			setDescription((String)newValue);
			return;
		case QualityModelPackage.QUALITY_ASPECT__RELEVANT_ELEMENTS:
			getRelevantElements().clear();
			getRelevantElements().addAll((Collection<? extends EObject>)newValue);
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
	public void eUnset(final int featureID) {
		switch (featureID) {
		case QualityModelPackage.QUALITY_ASPECT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case QualityModelPackage.QUALITY_ASPECT__RELEVANT_ELEMENTS:
			getRelevantElements().clear();
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
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case QualityModelPackage.QUALITY_ASPECT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? this.description != null : !DESCRIPTION_EDEFAULT.equals(this.description);
		case QualityModelPackage.QUALITY_ASPECT__RELEVANT_ELEMENTS:
			return (this.relevantElements != null) && !this.relevantElements.isEmpty();
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
		if (eIsProxy()) {
			return super.toString();
		}

		final StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description: ");
		result.append(this.description);
		result.append(')');
		return result.toString();
	}

	@Override
	public void setOwner(final QualityCategory newOwner) {
		newOwner.getAspects().add(this);
	}
} //QualityAspectImpl
