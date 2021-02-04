/**
 */
package org.tracesec.qualitymodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.qualitymodel.QualityCategory#getOwnedNodes <em>Owned Nodes</em>}</li>
 *   <li>{@link org.tracesec.qualitymodel.QualityCategory#getAspects <em>Aspects</em>}</li>
 *   <li>{@link org.tracesec.qualitymodel.QualityCategory#getSubcategories <em>Subcategories</em>}</li>
 * </ul>
 *
 * @see org.tracesec.qualitymodel.QualityModelPackage#getQualityCategory()
 * @model
 * @generated
 */
public interface QualityCategory extends AbstractQualityNode {
	/**
	 * Returns the value of the '<em><b>Owned Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.tracesec.qualitymodel.AbstractQualityNode}.
	 * It is bidirectional and its opposite is '{@link org.tracesec.qualitymodel.AbstractQualityNode#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Nodes</em>' reference list.
	 * @see org.tracesec.qualitymodel.QualityModelPackage#getQualityCategory_OwnedNodes()
	 * @see org.tracesec.qualitymodel.AbstractQualityNode#getOwner
	 * @model opposite="owner" transient="true" changeable="false" volatile="true"
	 *        annotation="union"
	 * @generated
	 */
	EList<AbstractQualityNode> getOwnedNodes();

	/**
	 * Returns the value of the '<em><b>Aspects</b></em>' containment reference list.
	 * The list contents are of type {@link org.tracesec.qualitymodel.QualityAspect}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.tracesec.qualitymodel.QualityCategory#getOwnedNodes() <em>Owned Nodes</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the quality aspects owned by this category
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aspects</em>' containment reference list.
	 * @see org.tracesec.qualitymodel.QualityModelPackage#getQualityCategory_Aspects()
	 * @model containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<QualityAspect> getAspects();

	/**
	 * Returns the value of the '<em><b>Subcategories</b></em>' containment reference list.
	 * The list contents are of type {@link org.tracesec.qualitymodel.QualityCategory}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.tracesec.qualitymodel.QualityCategory#getOwnedNodes() <em>Owned Nodes</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the sub categories owned by this category
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subcategories</em>' containment reference list.
	 * @see org.tracesec.qualitymodel.QualityModelPackage#getQualityCategory_Subcategories()
	 * @model containment="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<QualityCategory> getSubcategories();

} // QualityCategory
