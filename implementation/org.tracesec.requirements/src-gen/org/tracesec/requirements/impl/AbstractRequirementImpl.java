/**
 */
package org.tracesec.requirements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tracesec.requirements.AbstractRequirement;
import org.tracesec.requirements.RequirementRelation;
import org.tracesec.requirements.RequirementsPackage;
import org.tracesec.requirements.RequirementsSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.requirements.impl.AbstractRequirementImpl#getWording <em>Wording</em>}</li>
 *   <li>{@link org.tracesec.requirements.impl.AbstractRequirementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.tracesec.requirements.impl.AbstractRequirementImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.tracesec.requirements.impl.AbstractRequirementImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.tracesec.requirements.impl.AbstractRequirementImpl#getOutgoingReferences <em>Outgoing References</em>}</li>
 *   <li>{@link org.tracesec.requirements.impl.AbstractRequirementImpl#getIncomingReferences <em>Incoming References</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractRequirementImpl extends MinimalEObjectImpl.Container implements AbstractRequirement {
	/**
	 * The default value of the '{@link #getWording() <em>Wording</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWording()
	 * @generated
	 * @ordered
	 */
	protected static final String WORDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWording() <em>Wording</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWording()
	 * @generated
	 * @ordered
	 */
	protected String wording = WORDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getOutgoingReferences() <em>Outgoing References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementRelation> outgoingReferences;

	/**
	 * The cached value of the '{@link #getIncomingReferences() <em>Incoming References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementRelation> incomingReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.ABSTRACT_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWording() {
		return wording;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWording(String newWording) {
		String oldWording = wording;
		wording = newWording;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.ABSTRACT_REQUIREMENT__WORDING,
					oldWording, wording));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.ABSTRACT_REQUIREMENT__ID, oldId,
					id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.ABSTRACT_REQUIREMENT__TITLE,
					oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementsSet getSet() {
		if (eContainerFeatureID() != RequirementsPackage.ABSTRACT_REQUIREMENT__SET)
			return null;
		return (RequirementsSet) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSet(RequirementsSet newSet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSet, RequirementsPackage.ABSTRACT_REQUIREMENT__SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSet(RequirementsSet newSet) {
		if (newSet != eInternalContainer()
				|| (eContainerFeatureID() != RequirementsPackage.ABSTRACT_REQUIREMENT__SET && newSet != null)) {
			if (EcoreUtil.isAncestor(this, newSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSet != null)
				msgs = ((InternalEObject) newSet).eInverseAdd(this, RequirementsPackage.REQUIREMENTS_SET__REQUIREMENTS,
						RequirementsSet.class, msgs);
			msgs = basicSetSet(newSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.ABSTRACT_REQUIREMENT__SET, newSet,
					newSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequirementRelation> getOutgoingReferences() {
		if (outgoingReferences == null) {
			outgoingReferences = new EObjectContainmentWithInverseEList<RequirementRelation>(RequirementRelation.class,
					this, RequirementsPackage.ABSTRACT_REQUIREMENT__OUTGOING_REFERENCES,
					RequirementsPackage.REQUIREMENT_RELATION__SOURCE);
		}
		return outgoingReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequirementRelation> getIncomingReferences() {
		if (incomingReferences == null) {
			incomingReferences = new EObjectWithInverseResolvingEList<RequirementRelation>(RequirementRelation.class,
					this, RequirementsPackage.ABSTRACT_REQUIREMENT__INCOMING_REFERENCES,
					RequirementsPackage.REQUIREMENT_RELATION__TARGET);
		}
		return incomingReferences;
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
		case RequirementsPackage.ABSTRACT_REQUIREMENT__SET:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSet((RequirementsSet) otherEnd, msgs);
		case RequirementsPackage.ABSTRACT_REQUIREMENT__OUTGOING_REFERENCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoingReferences()).basicAdd(otherEnd,
					msgs);
		case RequirementsPackage.ABSTRACT_REQUIREMENT__INCOMING_REFERENCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncomingReferences()).basicAdd(otherEnd,
					msgs);
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
		case RequirementsPackage.ABSTRACT_REQUIREMENT__SET:
			return basicSetSet(null, msgs);
		case RequirementsPackage.ABSTRACT_REQUIREMENT__OUTGOING_REFERENCES:
			return ((InternalEList<?>) getOutgoingReferences()).basicRemove(otherEnd, msgs);
		case RequirementsPackage.ABSTRACT_REQUIREMENT__INCOMING_REFERENCES:
			return ((InternalEList<?>) getIncomingReferences()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case RequirementsPackage.ABSTRACT_REQUIREMENT__SET:
			return eInternalContainer().eInverseRemove(this, RequirementsPackage.REQUIREMENTS_SET__REQUIREMENTS,
					RequirementsSet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RequirementsPackage.ABSTRACT_REQUIREMENT__WORDING:
			return getWording();
		case RequirementsPackage.ABSTRACT_REQUIREMENT__ID:
			return getId();
		case RequirementsPackage.ABSTRACT_REQUIREMENT__TITLE:
			return getTitle();
		case RequirementsPackage.ABSTRACT_REQUIREMENT__SET:
			return getSet();
		case RequirementsPackage.ABSTRACT_REQUIREMENT__OUTGOING_REFERENCES:
			return getOutgoingReferences();
		case RequirementsPackage.ABSTRACT_REQUIREMENT__INCOMING_REFERENCES:
			return getIncomingReferences();
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
		case RequirementsPackage.ABSTRACT_REQUIREMENT__WORDING:
			setWording((String) newValue);
			return;
		case RequirementsPackage.ABSTRACT_REQUIREMENT__ID:
			setId((String) newValue);
			return;
		case RequirementsPackage.ABSTRACT_REQUIREMENT__TITLE:
			setTitle((String) newValue);
			return;
		case RequirementsPackage.ABSTRACT_REQUIREMENT__SET:
			setSet((RequirementsSet) newValue);
			return;
		case RequirementsPackage.ABSTRACT_REQUIREMENT__OUTGOING_REFERENCES:
			getOutgoingReferences().clear();
			getOutgoingReferences().addAll((Collection<? extends RequirementRelation>) newValue);
			return;
		case RequirementsPackage.ABSTRACT_REQUIREMENT__INCOMING_REFERENCES:
			getIncomingReferences().clear();
			getIncomingReferences().addAll((Collection<? extends RequirementRelation>) newValue);
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
		case RequirementsPackage.ABSTRACT_REQUIREMENT__WORDING:
			setWording(WORDING_EDEFAULT);
			return;
		case RequirementsPackage.ABSTRACT_REQUIREMENT__ID:
			setId(ID_EDEFAULT);
			return;
		case RequirementsPackage.ABSTRACT_REQUIREMENT__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case RequirementsPackage.ABSTRACT_REQUIREMENT__SET:
			setSet((RequirementsSet) null);
			return;
		case RequirementsPackage.ABSTRACT_REQUIREMENT__OUTGOING_REFERENCES:
			getOutgoingReferences().clear();
			return;
		case RequirementsPackage.ABSTRACT_REQUIREMENT__INCOMING_REFERENCES:
			getIncomingReferences().clear();
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
		case RequirementsPackage.ABSTRACT_REQUIREMENT__WORDING:
			return WORDING_EDEFAULT == null ? wording != null : !WORDING_EDEFAULT.equals(wording);
		case RequirementsPackage.ABSTRACT_REQUIREMENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case RequirementsPackage.ABSTRACT_REQUIREMENT__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case RequirementsPackage.ABSTRACT_REQUIREMENT__SET:
			return getSet() != null;
		case RequirementsPackage.ABSTRACT_REQUIREMENT__OUTGOING_REFERENCES:
			return outgoingReferences != null && !outgoingReferences.isEmpty();
		case RequirementsPackage.ABSTRACT_REQUIREMENT__INCOMING_REFERENCES:
			return incomingReferences != null && !incomingReferences.isEmpty();
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
		result.append(" (wording: ");
		result.append(wording);
		result.append(", id: ");
		result.append(id);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //AbstractRequirementImpl
