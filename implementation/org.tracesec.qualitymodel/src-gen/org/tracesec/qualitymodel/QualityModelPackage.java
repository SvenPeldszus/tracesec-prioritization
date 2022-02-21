/**
 */
package org.tracesec.qualitymodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.tracesec.qualitymodel.QualityModelFactory
 * @model kind="package"
 * @generated
 */
public interface QualityModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qualitymodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.tracesec.org/qualitymodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.tracesec.qualitymodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QualityModelPackage eINSTANCE = org.tracesec.qualitymodel.impl.QualityModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tracesec.qualitymodel.impl.AbstractQualityNodeImpl <em>Abstract Quality Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tracesec.qualitymodel.impl.AbstractQualityNodeImpl
	 * @see org.tracesec.qualitymodel.impl.QualityModelPackageImpl#getAbstractQualityNode()
	 * @generated
	 */
	int ABSTRACT_QUALITY_NODE = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUALITY_NODE__OWNER = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUALITY_NODE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUALITY_NODE__PRIORITY = 2;

	/**
	 * The number of structural features of the '<em>Abstract Quality Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUALITY_NODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract Quality Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUALITY_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tracesec.qualitymodel.impl.QualityCategoryImpl <em>Quality Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tracesec.qualitymodel.impl.QualityCategoryImpl
	 * @see org.tracesec.qualitymodel.impl.QualityModelPackageImpl#getQualityCategory()
	 * @generated
	 */
	int QUALITY_CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CATEGORY__OWNER = ABSTRACT_QUALITY_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CATEGORY__TITLE = ABSTRACT_QUALITY_NODE__TITLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CATEGORY__PRIORITY = ABSTRACT_QUALITY_NODE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Owned Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CATEGORY__OWNED_NODES = ABSTRACT_QUALITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CATEGORY__ASPECTS = ABSTRACT_QUALITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subcategories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CATEGORY__SUBCATEGORIES = ABSTRACT_QUALITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Quality Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CATEGORY_FEATURE_COUNT = ABSTRACT_QUALITY_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Quality Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CATEGORY_OPERATION_COUNT = ABSTRACT_QUALITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tracesec.qualitymodel.impl.QualityAspectImpl <em>Quality Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tracesec.qualitymodel.impl.QualityAspectImpl
	 * @see org.tracesec.qualitymodel.impl.QualityModelPackageImpl#getQualityAspect()
	 * @generated
	 */
	int QUALITY_ASPECT = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASPECT__OWNER = ABSTRACT_QUALITY_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASPECT__TITLE = ABSTRACT_QUALITY_NODE__TITLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASPECT__PRIORITY = ABSTRACT_QUALITY_NODE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASPECT__DESCRIPTION = ABSTRACT_QUALITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relevant Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASPECT__RELEVANT_ELEMENTS = ABSTRACT_QUALITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quality Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASPECT_FEATURE_COUNT = ABSTRACT_QUALITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Quality Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASPECT_OPERATION_COUNT = ABSTRACT_QUALITY_NODE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.tracesec.qualitymodel.QualityCategory <em>Quality Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Category</em>'.
	 * @see org.tracesec.qualitymodel.QualityCategory
	 * @generated
	 */
	EClass getQualityCategory();

	/**
	 * Returns the meta object for the reference list '{@link org.tracesec.qualitymodel.QualityCategory#getOwnedNodes <em>Owned Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Nodes</em>'.
	 * @see org.tracesec.qualitymodel.QualityCategory#getOwnedNodes()
	 * @see #getQualityCategory()
	 * @generated
	 */
	EReference getQualityCategory_OwnedNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tracesec.qualitymodel.QualityCategory#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see org.tracesec.qualitymodel.QualityCategory#getAspects()
	 * @see #getQualityCategory()
	 * @generated
	 */
	EReference getQualityCategory_Aspects();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tracesec.qualitymodel.QualityCategory#getSubcategories <em>Subcategories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subcategories</em>'.
	 * @see org.tracesec.qualitymodel.QualityCategory#getSubcategories()
	 * @see #getQualityCategory()
	 * @generated
	 */
	EReference getQualityCategory_Subcategories();

	/**
	 * Returns the meta object for class '{@link org.tracesec.qualitymodel.AbstractQualityNode <em>Abstract Quality Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Quality Node</em>'.
	 * @see org.tracesec.qualitymodel.AbstractQualityNode
	 * @generated
	 */
	EClass getAbstractQualityNode();

	/**
	 * Returns the meta object for the reference '{@link org.tracesec.qualitymodel.AbstractQualityNode#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see org.tracesec.qualitymodel.AbstractQualityNode#getOwner()
	 * @see #getAbstractQualityNode()
	 * @generated
	 */
	EReference getAbstractQualityNode_Owner();

	/**
	 * Returns the meta object for the attribute '{@link org.tracesec.qualitymodel.AbstractQualityNode#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.tracesec.qualitymodel.AbstractQualityNode#getTitle()
	 * @see #getAbstractQualityNode()
	 * @generated
	 */
	EAttribute getAbstractQualityNode_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.tracesec.qualitymodel.AbstractQualityNode#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.tracesec.qualitymodel.AbstractQualityNode#getPriority()
	 * @see #getAbstractQualityNode()
	 * @generated
	 */
	EAttribute getAbstractQualityNode_Priority();

	/**
	 * Returns the meta object for class '{@link org.tracesec.qualitymodel.QualityAspect <em>Quality Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Aspect</em>'.
	 * @see org.tracesec.qualitymodel.QualityAspect
	 * @generated
	 */
	EClass getQualityAspect();

	/**
	 * Returns the meta object for the attribute '{@link org.tracesec.qualitymodel.QualityAspect#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.tracesec.qualitymodel.QualityAspect#getDescription()
	 * @see #getQualityAspect()
	 * @generated
	 */
	EAttribute getQualityAspect_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.tracesec.qualitymodel.QualityAspect#getRelevantElements <em>Relevant Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relevant Elements</em>'.
	 * @see org.tracesec.qualitymodel.QualityAspect#getRelevantElements()
	 * @see #getQualityAspect()
	 * @generated
	 */
	EReference getQualityAspect_RelevantElements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QualityModelFactory getQualityModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.tracesec.qualitymodel.impl.QualityCategoryImpl <em>Quality Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tracesec.qualitymodel.impl.QualityCategoryImpl
		 * @see org.tracesec.qualitymodel.impl.QualityModelPackageImpl#getQualityCategory()
		 * @generated
		 */
		EClass QUALITY_CATEGORY = eINSTANCE.getQualityCategory();

		/**
		 * The meta object literal for the '<em><b>Owned Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_CATEGORY__OWNED_NODES = eINSTANCE.getQualityCategory_OwnedNodes();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_CATEGORY__ASPECTS = eINSTANCE.getQualityCategory_Aspects();

		/**
		 * The meta object literal for the '<em><b>Subcategories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_CATEGORY__SUBCATEGORIES = eINSTANCE.getQualityCategory_Subcategories();

		/**
		 * The meta object literal for the '{@link org.tracesec.qualitymodel.impl.AbstractQualityNodeImpl <em>Abstract Quality Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tracesec.qualitymodel.impl.AbstractQualityNodeImpl
		 * @see org.tracesec.qualitymodel.impl.QualityModelPackageImpl#getAbstractQualityNode()
		 * @generated
		 */
		EClass ABSTRACT_QUALITY_NODE = eINSTANCE.getAbstractQualityNode();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_QUALITY_NODE__OWNER = eINSTANCE.getAbstractQualityNode_Owner();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_QUALITY_NODE__TITLE = eINSTANCE.getAbstractQualityNode_Title();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_QUALITY_NODE__PRIORITY = eINSTANCE.getAbstractQualityNode_Priority();

		/**
		 * The meta object literal for the '{@link org.tracesec.qualitymodel.impl.QualityAspectImpl <em>Quality Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tracesec.qualitymodel.impl.QualityAspectImpl
		 * @see org.tracesec.qualitymodel.impl.QualityModelPackageImpl#getQualityAspect()
		 * @generated
		 */
		EClass QUALITY_ASPECT = eINSTANCE.getQualityAspect();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_ASPECT__DESCRIPTION = eINSTANCE.getQualityAspect_Description();

		/**
		 * The meta object literal for the '<em><b>Relevant Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_ASPECT__RELEVANT_ELEMENTS = eINSTANCE.getQualityAspect_RelevantElements();

	}

} //QualityModelPackage
