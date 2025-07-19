/**
 */
package org.tracesec.qualitymodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link org.tracesec.qualitymodel.impl.QualityModelImpl <em>Quality Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tracesec.qualitymodel.impl.QualityModelImpl
	 * @see org.tracesec.qualitymodel.impl.QualityModelPackageImpl#getQualityModel()
	 * @generated
	 */
	int QUALITY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Qualities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL__QUALITIES = 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL__ROOT = 1;

	/**
	 * The number of structural features of the '<em>Quality Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Quality Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tracesec.qualitymodel.impl.QualityImpl <em>Quality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tracesec.qualitymodel.impl.QualityImpl
	 * @see org.tracesec.qualitymodel.impl.QualityModelPackageImpl#getQuality()
	 * @generated
	 */
	int QUALITY = 1;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__ASPECTS = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Relevant Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY__RELEVANT_ELEMENTS = 3;

	/**
	 * The number of structural features of the '<em>Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tracesec.qualitymodel.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tracesec.qualitymodel.impl.AspectImpl
	 * @see org.tracesec.qualitymodel.impl.QualityModelPackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__PRIORITY = 0;

	/**
	 * The feature id for the '<em><b>Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__QUALITY = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__OWNER = 2;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tracesec.qualitymodel.Priority <em>Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tracesec.qualitymodel.Priority
	 * @see org.tracesec.qualitymodel.impl.QualityModelPackageImpl#getPriority()
	 * @generated
	 */
	int PRIORITY = 3;


	/**
	 * Returns the meta object for class '{@link org.tracesec.qualitymodel.QualityModel <em>Quality Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Model</em>'.
	 * @see org.tracesec.qualitymodel.QualityModel
	 * @generated
	 */
	EClass getQualityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tracesec.qualitymodel.QualityModel#getQualities <em>Qualities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualities</em>'.
	 * @see org.tracesec.qualitymodel.QualityModel#getQualities()
	 * @see #getQualityModel()
	 * @generated
	 */
	EReference getQualityModel_Qualities();

	/**
	 * Returns the meta object for the reference '{@link org.tracesec.qualitymodel.QualityModel#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see org.tracesec.qualitymodel.QualityModel#getRoot()
	 * @see #getQualityModel()
	 * @generated
	 */
	EReference getQualityModel_Root();

	/**
	 * Returns the meta object for class '{@link org.tracesec.qualitymodel.Quality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality</em>'.
	 * @see org.tracesec.qualitymodel.Quality
	 * @generated
	 */
	EClass getQuality();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tracesec.qualitymodel.Quality#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see org.tracesec.qualitymodel.Quality#getAspects()
	 * @see #getQuality()
	 * @generated
	 */
	EReference getQuality_Aspects();

	/**
	 * Returns the meta object for the attribute '{@link org.tracesec.qualitymodel.Quality#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.tracesec.qualitymodel.Quality#getTitle()
	 * @see #getQuality()
	 * @generated
	 */
	EAttribute getQuality_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.tracesec.qualitymodel.Quality#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.tracesec.qualitymodel.Quality#getDescription()
	 * @see #getQuality()
	 * @generated
	 */
	EAttribute getQuality_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.tracesec.qualitymodel.Quality#getRelevantElements <em>Relevant Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relevant Elements</em>'.
	 * @see org.tracesec.qualitymodel.Quality#getRelevantElements()
	 * @see #getQuality()
	 * @generated
	 */
	EReference getQuality_RelevantElements();

	/**
	 * Returns the meta object for class '{@link org.tracesec.qualitymodel.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see org.tracesec.qualitymodel.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for the attribute '{@link org.tracesec.qualitymodel.Aspect#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.tracesec.qualitymodel.Aspect#getPriority()
	 * @see #getAspect()
	 * @generated
	 */
	EAttribute getAspect_Priority();

	/**
	 * Returns the meta object for the reference '{@link org.tracesec.qualitymodel.Aspect#getQuality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quality</em>'.
	 * @see org.tracesec.qualitymodel.Aspect#getQuality()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Quality();

	/**
	 * Returns the meta object for the container reference '{@link org.tracesec.qualitymodel.Aspect#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see org.tracesec.qualitymodel.Aspect#getOwner()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Owner();

	/**
	 * Returns the meta object for enum '{@link org.tracesec.qualitymodel.Priority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority</em>'.
	 * @see org.tracesec.qualitymodel.Priority
	 * @generated
	 */
	EEnum getPriority();

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
		 * The meta object literal for the '{@link org.tracesec.qualitymodel.impl.QualityModelImpl <em>Quality Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tracesec.qualitymodel.impl.QualityModelImpl
		 * @see org.tracesec.qualitymodel.impl.QualityModelPackageImpl#getQualityModel()
		 * @generated
		 */
		EClass QUALITY_MODEL = eINSTANCE.getQualityModel();

		/**
		 * The meta object literal for the '<em><b>Qualities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_MODEL__QUALITIES = eINSTANCE.getQualityModel_Qualities();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_MODEL__ROOT = eINSTANCE.getQualityModel_Root();

		/**
		 * The meta object literal for the '{@link org.tracesec.qualitymodel.impl.QualityImpl <em>Quality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tracesec.qualitymodel.impl.QualityImpl
		 * @see org.tracesec.qualitymodel.impl.QualityModelPackageImpl#getQuality()
		 * @generated
		 */
		EClass QUALITY = eINSTANCE.getQuality();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY__ASPECTS = eINSTANCE.getQuality_Aspects();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY__TITLE = eINSTANCE.getQuality_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY__DESCRIPTION = eINSTANCE.getQuality_Description();

		/**
		 * The meta object literal for the '<em><b>Relevant Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY__RELEVANT_ELEMENTS = eINSTANCE.getQuality_RelevantElements();

		/**
		 * The meta object literal for the '{@link org.tracesec.qualitymodel.impl.AspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tracesec.qualitymodel.impl.AspectImpl
		 * @see org.tracesec.qualitymodel.impl.QualityModelPackageImpl#getAspect()
		 * @generated
		 */
		EClass ASPECT = eINSTANCE.getAspect();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASPECT__PRIORITY = eINSTANCE.getAspect_Priority();

		/**
		 * The meta object literal for the '<em><b>Quality</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__QUALITY = eINSTANCE.getAspect_Quality();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__OWNER = eINSTANCE.getAspect_Owner();

		/**
		 * The meta object literal for the '{@link org.tracesec.qualitymodel.Priority <em>Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tracesec.qualitymodel.Priority
		 * @see org.tracesec.qualitymodel.impl.QualityModelPackageImpl#getPriority()
		 * @generated
		 */
		EEnum PRIORITY = eINSTANCE.getPriority();

	}

} //QualityModelPackage
