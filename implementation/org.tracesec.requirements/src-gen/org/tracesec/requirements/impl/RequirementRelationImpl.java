/**
 */
package org.tracesec.requirements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.tracesec.requirements.AbstractRequirement;
import org.tracesec.requirements.ReferenceType;
import org.tracesec.requirements.RequirementRelation;
import org.tracesec.requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.requirements.impl.RequirementRelationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.tracesec.requirements.impl.RequirementRelationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.tracesec.requirements.impl.RequirementRelationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.tracesec.requirements.impl.RequirementRelationImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementRelationImpl extends MinimalEObjectImpl.Container implements RequirementRelation {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected AbstractRequirement target;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ReferenceType TYPE_EDEFAULT = ReferenceType.USAGE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType type = TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.REQUIREMENT_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractRequirement getSource() {
		if (eContainerFeatureID() != RequirementsPackage.REQUIREMENT_RELATION__SOURCE)
			return null;
		return (AbstractRequirement) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(AbstractRequirement newSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSource, RequirementsPackage.REQUIREMENT_RELATION__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(AbstractRequirement newSource) {
		if (newSource != eInternalContainer()
				|| (eContainerFeatureID() != RequirementsPackage.REQUIREMENT_RELATION__SOURCE && newSource != null)) {
			if (EcoreUtil.isAncestor(this, newSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this,
						RequirementsPackage.ABSTRACT_REQUIREMENT__OUTGOING_REFERENCES, AbstractRequirement.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT_RELATION__SOURCE,
					newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractRequirement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (AbstractRequirement) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RequirementsPackage.REQUIREMENT_RELATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRequirement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(AbstractRequirement newTarget, NotificationChain msgs) {
		AbstractRequirement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RequirementsPackage.REQUIREMENT_RELATION__TARGET, oldTarget, newTarget);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(AbstractRequirement newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this,
						RequirementsPackage.ABSTRACT_REQUIREMENT__INCOMING_REFERENCES, AbstractRequirement.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this,
						RequirementsPackage.ABSTRACT_REQUIREMENT__INCOMING_REFERENCES, AbstractRequirement.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT_RELATION__TARGET,
					newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ReferenceType newType) {
		ReferenceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT_RELATION__TYPE,
					oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.REQUIREMENT_RELATION__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RequirementsPackage.REQUIREMENT_RELATION__SOURCE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSource((AbstractRequirement) otherEnd, msgs);
		case RequirementsPackage.REQUIREMENT_RELATION__TARGET:
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this,
						RequirementsPackage.ABSTRACT_REQUIREMENT__INCOMING_REFERENCES, AbstractRequirement.class, msgs);
			return basicSetTarget((AbstractRequirement) otherEnd, msgs);
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
		case RequirementsPackage.REQUIREMENT_RELATION__SOURCE:
			return basicSetSource(null, msgs);
		case RequirementsPackage.REQUIREMENT_RELATION__TARGET:
			return basicSetTarget(null, msgs);
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
		case RequirementsPackage.REQUIREMENT_RELATION__SOURCE:
			return eInternalContainer().eInverseRemove(this,
					RequirementsPackage.ABSTRACT_REQUIREMENT__OUTGOING_REFERENCES, AbstractRequirement.class, msgs);
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
		case RequirementsPackage.REQUIREMENT_RELATION__SOURCE:
			return getSource();
		case RequirementsPackage.REQUIREMENT_RELATION__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case RequirementsPackage.REQUIREMENT_RELATION__TYPE:
			return getType();
		case RequirementsPackage.REQUIREMENT_RELATION__DESCRIPTION:
			return getDescription();
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
		case RequirementsPackage.REQUIREMENT_RELATION__SOURCE:
			setSource((AbstractRequirement) newValue);
			return;
		case RequirementsPackage.REQUIREMENT_RELATION__TARGET:
			setTarget((AbstractRequirement) newValue);
			return;
		case RequirementsPackage.REQUIREMENT_RELATION__TYPE:
			setType((ReferenceType) newValue);
			return;
		case RequirementsPackage.REQUIREMENT_RELATION__DESCRIPTION:
			setDescription((String) newValue);
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
		case RequirementsPackage.REQUIREMENT_RELATION__SOURCE:
			setSource((AbstractRequirement) null);
			return;
		case RequirementsPackage.REQUIREMENT_RELATION__TARGET:
			setTarget((AbstractRequirement) null);
			return;
		case RequirementsPackage.REQUIREMENT_RELATION__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case RequirementsPackage.REQUIREMENT_RELATION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case RequirementsPackage.REQUIREMENT_RELATION__SOURCE:
			return getSource() != null;
		case RequirementsPackage.REQUIREMENT_RELATION__TARGET:
			return target != null;
		case RequirementsPackage.REQUIREMENT_RELATION__TYPE:
			return type != TYPE_EDEFAULT;
		case RequirementsPackage.REQUIREMENT_RELATION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //RequirementRelationImpl
