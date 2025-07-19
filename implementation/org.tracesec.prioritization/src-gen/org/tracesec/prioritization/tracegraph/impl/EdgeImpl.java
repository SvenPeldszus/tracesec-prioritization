/**
 */
package org.tracesec.prioritization.tracegraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.tracesec.prioritization.tracegraph.Edge;
import org.tracesec.prioritization.tracegraph.Node;
import org.tracesec.prioritization.tracegraph.TracegraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.prioritization.tracegraph.impl.EdgeImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.tracesec.prioritization.tracegraph.impl.EdgeImpl#getTrg <em>Trg</em>}</li>
 *   <li>{@link org.tracesec.prioritization.tracegraph.impl.EdgeImpl#getCapacity <em>Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeImpl extends MinimalEObjectImpl.Container implements Edge {
	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected Node src;

	/**
	 * The cached value of the '{@link #getTrg() <em>Trg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrg()
	 * @generated
	 * @ordered
	 */
	protected Node trg;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracegraphPackage.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject) src;
			src = (Node) eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracegraphPackage.EDGE__SRC, oldSrc,
							src));
			}
		}
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrc(Node newSrc, NotificationChain msgs) {
		Node oldSrc = src;
		src = newSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TracegraphPackage.EDGE__SRC,
					oldSrc, newSrc);
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
	public void setSrc(Node newSrc) {
		if (newSrc != src) {
			NotificationChain msgs = null;
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, TracegraphPackage.NODE__OUT, Node.class, msgs);
			if (newSrc != null)
				msgs = ((InternalEObject) newSrc).eInverseAdd(this, TracegraphPackage.NODE__OUT, Node.class, msgs);
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracegraphPackage.EDGE__SRC, newSrc, newSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getTrg() {
		if (trg != null && trg.eIsProxy()) {
			InternalEObject oldTrg = (InternalEObject) trg;
			trg = (Node) eResolveProxy(oldTrg);
			if (trg != oldTrg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracegraphPackage.EDGE__TRG, oldTrg,
							trg));
			}
		}
		return trg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTrg() {
		return trg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrg(Node newTrg, NotificationChain msgs) {
		Node oldTrg = trg;
		trg = newTrg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TracegraphPackage.EDGE__TRG,
					oldTrg, newTrg);
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
	public void setTrg(Node newTrg) {
		if (newTrg != trg) {
			NotificationChain msgs = null;
			if (trg != null)
				msgs = ((InternalEObject) trg).eInverseRemove(this, TracegraphPackage.NODE__IN, Node.class, msgs);
			if (newTrg != null)
				msgs = ((InternalEObject) newTrg).eInverseAdd(this, TracegraphPackage.NODE__IN, Node.class, msgs);
			msgs = basicSetTrg(newTrg, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracegraphPackage.EDGE__TRG, newTrg, newTrg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracegraphPackage.EDGE__CAPACITY, oldCapacity,
					capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracegraphPackage.EDGE__SRC:
				if (src != null)
					msgs = ((InternalEObject) src).eInverseRemove(this, TracegraphPackage.NODE__OUT, Node.class, msgs);
				return basicSetSrc((Node) otherEnd, msgs);
			case TracegraphPackage.EDGE__TRG:
				if (trg != null)
					msgs = ((InternalEObject) trg).eInverseRemove(this, TracegraphPackage.NODE__IN, Node.class, msgs);
				return basicSetTrg((Node) otherEnd, msgs);
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
			case TracegraphPackage.EDGE__SRC:
				return basicSetSrc(null, msgs);
			case TracegraphPackage.EDGE__TRG:
				return basicSetTrg(null, msgs);
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
			case TracegraphPackage.EDGE__SRC:
				if (resolve)
					return getSrc();
				return basicGetSrc();
			case TracegraphPackage.EDGE__TRG:
				if (resolve)
					return getTrg();
				return basicGetTrg();
			case TracegraphPackage.EDGE__CAPACITY:
				return getCapacity();
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
			case TracegraphPackage.EDGE__SRC:
				setSrc((Node) newValue);
				return;
			case TracegraphPackage.EDGE__TRG:
				setTrg((Node) newValue);
				return;
			case TracegraphPackage.EDGE__CAPACITY:
				setCapacity((Integer) newValue);
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
			case TracegraphPackage.EDGE__SRC:
				setSrc((Node) null);
				return;
			case TracegraphPackage.EDGE__TRG:
				setTrg((Node) null);
				return;
			case TracegraphPackage.EDGE__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
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
			case TracegraphPackage.EDGE__SRC:
				return src != null;
			case TracegraphPackage.EDGE__TRG:
				return trg != null;
			case TracegraphPackage.EDGE__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
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
		result.append(" (capacity: ");
		result.append(capacity);
		result.append(')');
		return result.toString();
	}

} //EdgeImpl
