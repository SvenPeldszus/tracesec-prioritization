/**
 */
package org.tracesec.qualitymodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.tracesec.qualitymodel.AbstractQualityNode;
import org.tracesec.qualitymodel.QualityAspect;
import org.tracesec.qualitymodel.QualityCategory;
import org.tracesec.qualitymodel.QualityModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.qualitymodel.impl.QualityCategoryImpl#getOwnedNodes <em>Owned Nodes</em>}</li>
 *   <li>{@link org.tracesec.qualitymodel.impl.QualityCategoryImpl#getAspects <em>Aspects</em>}</li>
 *   <li>{@link org.tracesec.qualitymodel.impl.QualityCategoryImpl#getSubcategories <em>Subcategories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityCategoryImpl extends AbstractQualityNodeImpl implements QualityCategory {
	/**
	 * The cached value of the '{@link #getAspects() <em>Aspects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspects()
	 * @generated
	 * @ordered
	 */
	protected EList<QualityAspect> aspects;

	/**
	 * The cached value of the '{@link #getSubcategories() <em>Subcategories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcategories()
	 * @generated
	 * @ordered
	 */
	protected EList<QualityCategory> subcategories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityCategoryImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityModelPackage.Literals.QUALITY_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractQualityNode> getOwnedNodes() {
		return new DerivedUnionEObjectEList<>(AbstractQualityNode.class, this, QualityModelPackage.QUALITY_CATEGORY__OWNED_NODES, OWNED_NODES_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedNodes() <em>Owned Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNodes()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_NODES_ESUBSETS = new int[] {QualityModelPackage.QUALITY_CATEGORY__ASPECTS, QualityModelPackage.QUALITY_CATEGORY__SUBCATEGORIES};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QualityAspect> getAspects() {
		if (this.aspects == null) {
			this.aspects = new EObjectContainmentEList<>(QualityAspect.class, this, QualityModelPackage.QUALITY_CATEGORY__ASPECTS);
		}
		return this.aspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QualityCategory> getSubcategories() {
		if (this.subcategories == null) {
			this.subcategories = new EObjectContainmentEList<>(QualityCategory.class, this, QualityModelPackage.QUALITY_CATEGORY__SUBCATEGORIES);
		}
		return this.subcategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
		switch (featureID) {
		case QualityModelPackage.QUALITY_CATEGORY__ASPECTS:
			return ((InternalEList<?>)getAspects()).basicRemove(otherEnd, msgs);
		case QualityModelPackage.QUALITY_CATEGORY__SUBCATEGORIES:
			return ((InternalEList<?>)getSubcategories()).basicRemove(otherEnd, msgs);
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
		case QualityModelPackage.QUALITY_CATEGORY__OWNED_NODES:
			return getOwnedNodes();
		case QualityModelPackage.QUALITY_CATEGORY__ASPECTS:
			return getAspects();
		case QualityModelPackage.QUALITY_CATEGORY__SUBCATEGORIES:
			return getSubcategories();
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
		case QualityModelPackage.QUALITY_CATEGORY__ASPECTS:
			getAspects().clear();
			getAspects().addAll((Collection<? extends QualityAspect>)newValue);
			return;
		case QualityModelPackage.QUALITY_CATEGORY__SUBCATEGORIES:
			getSubcategories().clear();
			getSubcategories().addAll((Collection<? extends QualityCategory>)newValue);
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
		case QualityModelPackage.QUALITY_CATEGORY__ASPECTS:
			getAspects().clear();
			return;
		case QualityModelPackage.QUALITY_CATEGORY__SUBCATEGORIES:
			getSubcategories().clear();
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
		case QualityModelPackage.QUALITY_CATEGORY__OWNED_NODES:
			return isSetOwnedNodes();
		case QualityModelPackage.QUALITY_CATEGORY__ASPECTS:
			return (this.aspects != null) && !this.aspects.isEmpty();
		case QualityModelPackage.QUALITY_CATEGORY__SUBCATEGORIES:
			return (this.subcategories != null) && !this.subcategories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedNodes() {
		return eIsSet(QualityModelPackage.QUALITY_CATEGORY__ASPECTS)
				|| eIsSet(QualityModelPackage.QUALITY_CATEGORY__SUBCATEGORIES);
	}

	@Override
	public void setOwner(final QualityCategory newOwner) {
		newOwner.getSubcategories().add(this);
		super.setOwner(newOwner);
	}

} //QualityCategoryImpl
