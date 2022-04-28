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
		if ((this.src != null) && this.src.eIsProxy()) {
			final var oldSrc = (InternalEObject) this.src;
			this.src = (Node) eResolveProxy(oldSrc);
			if ((this.src != oldSrc) && eNotificationRequired()) {
				eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracegraphPackage.EDGE__SRC, oldSrc,
						this.src));
			}
		}
		return this.src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetSrc() {
		return this.src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrc(final Node newSrc, NotificationChain msgs) {
		final var oldSrc = this.src;
		this.src = newSrc;
		if (eNotificationRequired()) {
			final var notification = new ENotificationImpl(this, Notification.SET, TracegraphPackage.EDGE__SRC,
					oldSrc, newSrc);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrc(final Node newSrc) {
		if (newSrc != this.src) {
			NotificationChain msgs = null;
			if (this.src != null) {
				msgs = ((InternalEObject) this.src).eInverseRemove(this, TracegraphPackage.NODE__OUT, Node.class, msgs);
			}
			if (newSrc != null) {
				msgs = ((InternalEObject) newSrc).eInverseAdd(this, TracegraphPackage.NODE__OUT, Node.class, msgs);
			}
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TracegraphPackage.EDGE__SRC, newSrc, newSrc));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getTrg() {
		if ((this.trg != null) && this.trg.eIsProxy()) {
			final var oldTrg = (InternalEObject) this.trg;
			this.trg = (Node) eResolveProxy(oldTrg);
			if ((this.trg != oldTrg) && eNotificationRequired()) {
				eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracegraphPackage.EDGE__TRG, oldTrg,
						this.trg));
			}
		}
		return this.trg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTrg() {
		return this.trg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrg(final Node newTrg, NotificationChain msgs) {
		final var oldTrg = this.trg;
		this.trg = newTrg;
		if (eNotificationRequired()) {
			final var notification = new ENotificationImpl(this, Notification.SET, TracegraphPackage.EDGE__TRG,
					oldTrg, newTrg);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrg(final Node newTrg) {
		if (newTrg != this.trg) {
			NotificationChain msgs = null;
			if (this.trg != null) {
				msgs = ((InternalEObject) this.trg).eInverseRemove(this, TracegraphPackage.NODE__IN, Node.class, msgs);
			}
			if (newTrg != null) {
				msgs = ((InternalEObject) newTrg).eInverseAdd(this, TracegraphPackage.NODE__IN, Node.class, msgs);
			}
			msgs = basicSetTrg(newTrg, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TracegraphPackage.EDGE__TRG, newTrg, newTrg));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCapacity() {
		return this.capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(final int newCapacity) {
		final var oldCapacity = this.capacity;
		this.capacity = newCapacity;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TracegraphPackage.EDGE__CAPACITY, oldCapacity,
					this.capacity));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TracegraphPackage.EDGE__SRC:
			if (this.src != null) {
				msgs = ((InternalEObject) this.src).eInverseRemove(this, TracegraphPackage.NODE__OUT, Node.class, msgs);
			}
			return basicSetSrc((Node) otherEnd, msgs);
		case TracegraphPackage.EDGE__TRG:
			if (this.trg != null) {
				msgs = ((InternalEObject) this.trg).eInverseRemove(this, TracegraphPackage.NODE__IN, Node.class, msgs);
			}
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
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
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
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case TracegraphPackage.EDGE__SRC:
			if (resolve) {
				return getSrc();
			}
			return basicGetSrc();
		case TracegraphPackage.EDGE__TRG:
			if (resolve) {
				return getTrg();
			}
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
	public void eSet(final int featureID, final Object newValue) {
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
	public void eUnset(final int featureID) {
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
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case TracegraphPackage.EDGE__SRC:
			return this.src != null;
		case TracegraphPackage.EDGE__TRG:
			return this.trg != null;
		case TracegraphPackage.EDGE__CAPACITY:
			return this.capacity != CAPACITY_EDEFAULT;
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

		final var result = new StringBuilder(super.toString());
		result.append(" (");
		result.append(this.src.getId());
		result.append("-->");
		result.append(this.trg.getId());
		result.append(", capacity: ");
		result.append(this.capacity);
		result.append(')');
		return result.toString();
	}

} //EdgeImpl
