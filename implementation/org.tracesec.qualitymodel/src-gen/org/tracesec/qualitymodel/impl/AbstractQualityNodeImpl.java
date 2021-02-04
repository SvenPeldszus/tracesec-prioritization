/**
 */
package org.tracesec.qualitymodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.tracesec.qualitymodel.AbstractQualityNode;
import org.tracesec.qualitymodel.QualityCategory;
import org.tracesec.qualitymodel.QualityModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Quality Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.qualitymodel.impl.AbstractQualityNodeImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.tracesec.qualitymodel.impl.AbstractQualityNodeImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractQualityNodeImpl extends MinimalEObjectImpl.Container implements AbstractQualityNode {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractQualityNodeImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityModelPackage.Literals.ABSTRACT_QUALITY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public QualityCategory getOwner() {
		final QualityCategory owner = basicGetOwner();
		return (owner != null) && owner.eIsProxy() ? (QualityCategory)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityCategory basicGetOwner() {
		return (QualityCategory) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(final QualityCategory newOwner) {
		// TODO: implement this method to set the 'Owner' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return this.title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(final String newTitle) {
		final String oldTitle = this.title;
		this.title = newTitle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, QualityModelPackage.ABSTRACT_QUALITY_NODE__TITLE, oldTitle, this.title));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case QualityModelPackage.ABSTRACT_QUALITY_NODE__OWNER:
			if (resolve) {
				return getOwner();
			}
			return basicGetOwner();
		case QualityModelPackage.ABSTRACT_QUALITY_NODE__TITLE:
			return getTitle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case QualityModelPackage.ABSTRACT_QUALITY_NODE__OWNER:
			setOwner((QualityCategory)newValue);
			return;
		case QualityModelPackage.ABSTRACT_QUALITY_NODE__TITLE:
			setTitle((String)newValue);
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
		case QualityModelPackage.ABSTRACT_QUALITY_NODE__OWNER:
			setOwner((QualityCategory)null);
			return;
		case QualityModelPackage.ABSTRACT_QUALITY_NODE__TITLE:
			setTitle(TITLE_EDEFAULT);
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
		case QualityModelPackage.ABSTRACT_QUALITY_NODE__OWNER:
			return basicGetOwner() != null;
		case QualityModelPackage.ABSTRACT_QUALITY_NODE__TITLE:
			return TITLE_EDEFAULT == null ? this.title != null : !TITLE_EDEFAULT.equals(this.title);
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
		result.append(" (title: ");
		result.append(this.title);
		result.append(')');
		return result.toString();
	}

} //AbstractQualityNodeImpl
