/**
 */
package org.tracesec.qualitymodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tracesec.qualitymodel.Aspect;
import org.tracesec.qualitymodel.Quality;
import org.tracesec.qualitymodel.QualityModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.qualitymodel.impl.QualityImpl#getAspects <em>Aspects</em>}</li>
 *   <li>{@link org.tracesec.qualitymodel.impl.QualityImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.tracesec.qualitymodel.impl.QualityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.tracesec.qualitymodel.impl.QualityImpl#getRelevantElements <em>Relevant Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityImpl extends MinimalEObjectImpl.Container implements Quality {
	/**
	 * The cached value of the '{@link #getAspects() <em>Aspects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspects()
	 * @generated
	 * @ordered
	 */
	protected EList<Aspect> aspects;

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
	protected QualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityModelPackage.Literals.QUALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Aspect> getAspects() {
		if (aspects == null) {
			aspects = new EObjectContainmentWithInverseEList<Aspect>(Aspect.class, this, QualityModelPackage.QUALITY__ASPECTS, QualityModelPackage.ASPECT__OWNER);
		}
		return aspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityModelPackage.QUALITY__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityModelPackage.QUALITY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getRelevantElements() {
		if (relevantElements == null) {
			relevantElements = new EObjectResolvingEList<EObject>(EObject.class, this, QualityModelPackage.QUALITY__RELEVANT_ELEMENTS);
		}
		return relevantElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualityModelPackage.QUALITY__ASPECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAspects()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualityModelPackage.QUALITY__ASPECTS:
				return ((InternalEList<?>)getAspects()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QualityModelPackage.QUALITY__ASPECTS:
				return getAspects();
			case QualityModelPackage.QUALITY__TITLE:
				return getTitle();
			case QualityModelPackage.QUALITY__DESCRIPTION:
				return getDescription();
			case QualityModelPackage.QUALITY__RELEVANT_ELEMENTS:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QualityModelPackage.QUALITY__ASPECTS:
				getAspects().clear();
				getAspects().addAll((Collection<? extends Aspect>)newValue);
				return;
			case QualityModelPackage.QUALITY__TITLE:
				setTitle((String)newValue);
				return;
			case QualityModelPackage.QUALITY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case QualityModelPackage.QUALITY__RELEVANT_ELEMENTS:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case QualityModelPackage.QUALITY__ASPECTS:
				getAspects().clear();
				return;
			case QualityModelPackage.QUALITY__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case QualityModelPackage.QUALITY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case QualityModelPackage.QUALITY__RELEVANT_ELEMENTS:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QualityModelPackage.QUALITY__ASPECTS:
				return aspects != null && !aspects.isEmpty();
			case QualityModelPackage.QUALITY__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case QualityModelPackage.QUALITY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case QualityModelPackage.QUALITY__RELEVANT_ELEMENTS:
				return relevantElements != null && !relevantElements.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //QualityImpl
