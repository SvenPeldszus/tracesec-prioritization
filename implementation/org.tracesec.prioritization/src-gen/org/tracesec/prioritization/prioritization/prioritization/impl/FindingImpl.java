/**
 */
package org.tracesec.prioritization.prioritization.prioritization.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding;

import org.tracesec.prioritization.prioritization.prioritization.Finding;
import org.tracesec.prioritization.prioritization.prioritization.PrioritizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.prioritization.prioritization.prioritization.impl.FindingImpl#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.tracesec.prioritization.prioritization.prioritization.impl.FindingImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.tracesec.prioritization.prioritization.prioritization.impl.FindingImpl#getManualPriority <em>Manual Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindingImpl extends MinimalEObjectImpl.Container implements Finding {
	/**
	 * The cached value of the '{@link #getRepresents() <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresents()
	 * @generated
	 * @ordered
	 */
	protected SonarlintFinding represents;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getManualPriority() <em>Manual Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int MANUAL_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getManualPriority() <em>Manual Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualPriority()
	 * @generated
	 * @ordered
	 */
	protected int manualPriority = MANUAL_PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrioritizationPackage.Literals.FINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SonarlintFinding getRepresents() {
		if (represents != null && represents.eIsProxy()) {
			InternalEObject oldRepresents = (InternalEObject)represents;
			represents = (SonarlintFinding)eResolveProxy(oldRepresents);
			if (represents != oldRepresents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrioritizationPackage.FINDING__REPRESENTS, oldRepresents, represents));
			}
		}
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SonarlintFinding basicGetRepresents() {
		return represents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresents(SonarlintFinding newRepresents) {
		SonarlintFinding oldRepresents = represents;
		represents = newRepresents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrioritizationPackage.FINDING__REPRESENTS, oldRepresents, represents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrioritizationPackage.FINDING__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getManualPriority() {
		return manualPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManualPriority(int newManualPriority) {
		int oldManualPriority = manualPriority;
		manualPriority = newManualPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrioritizationPackage.FINDING__MANUAL_PRIORITY, oldManualPriority, manualPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrioritizationPackage.FINDING__REPRESENTS:
				if (resolve) return getRepresents();
				return basicGetRepresents();
			case PrioritizationPackage.FINDING__PRIORITY:
				return getPriority();
			case PrioritizationPackage.FINDING__MANUAL_PRIORITY:
				return getManualPriority();
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
			case PrioritizationPackage.FINDING__REPRESENTS:
				setRepresents((SonarlintFinding)newValue);
				return;
			case PrioritizationPackage.FINDING__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case PrioritizationPackage.FINDING__MANUAL_PRIORITY:
				setManualPriority((Integer)newValue);
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
			case PrioritizationPackage.FINDING__REPRESENTS:
				setRepresents((SonarlintFinding)null);
				return;
			case PrioritizationPackage.FINDING__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case PrioritizationPackage.FINDING__MANUAL_PRIORITY:
				setManualPriority(MANUAL_PRIORITY_EDEFAULT);
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
			case PrioritizationPackage.FINDING__REPRESENTS:
				return represents != null;
			case PrioritizationPackage.FINDING__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case PrioritizationPackage.FINDING__MANUAL_PRIORITY:
				return manualPriority != MANUAL_PRIORITY_EDEFAULT;
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(", manualPriority: ");
		result.append(manualPriority);
		result.append(')');
		return result.toString();
	}

} //FindingImpl
