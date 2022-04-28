/**
 */
package org.gravity.requirements;

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
 * @see org.gravity.requirements.RequirementsFactory
 * @model kind="package"
 * @generated
 */
public interface RequirementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/requirements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "requirements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementsPackage eINSTANCE = org.gravity.requirements.impl.RequirementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.requirements.impl.RequirementsModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.requirements.impl.RequirementsModelImpl
	 * @see org.gravity.requirements.impl.RequirementsPackageImpl#getRequirementsModel()
	 * @generated
	 */
	int REQUIREMENTS_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Usecases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL__USECASES = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gravity.requirements.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.requirements.impl.ElementImpl
	 * @see org.gravity.requirements.impl.RequirementsPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__REFERENCES = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Usecase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__USECASE = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gravity.requirements.impl.IdentifyableObjectImpl <em>Identifyable Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.requirements.impl.IdentifyableObjectImpl
	 * @see org.gravity.requirements.impl.RequirementsPackageImpl#getIdentifyableObject()
	 * @generated
	 */
	int IDENTIFYABLE_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFYABLE_OBJECT__REFERENCES = ELEMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFYABLE_OBJECT__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Usecase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFYABLE_OBJECT__USECASE = ELEMENT__USECASE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFYABLE_OBJECT__ID = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identifyable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFYABLE_OBJECT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Identifyable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFYABLE_OBJECT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.requirements.impl.UseCaseImpl <em>Use Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.requirements.impl.UseCaseImpl
	 * @see org.gravity.requirements.impl.RequirementsPackageImpl#getUseCase()
	 * @generated
	 */
	int USE_CASE = 1;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__REFERENCES = IDENTIFYABLE_OBJECT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__VALUE = IDENTIFYABLE_OBJECT__VALUE;

	/**
	 * The feature id for the '<em><b>Usecase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__USECASE = IDENTIFYABLE_OBJECT__USECASE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__ID = IDENTIFYABLE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Supportet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__SUPPORTET = IDENTIFYABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Preconditons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__PRECONDITONS = IDENTIFYABLE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mainflows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__MAINFLOWS = IDENTIFYABLE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subflows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__SUBFLOWS = IDENTIFYABLE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alternativeflows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__ALTERNATIVEFLOWS = IDENTIFYABLE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__MODEL = IDENTIFYABLE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Logging Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__LOGGING_REQUIREMENTS = IDENTIFYABLE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__DESCRIPTION = IDENTIFYABLE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_FEATURE_COUNT = IDENTIFYABLE_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_OPERATION_COUNT = IDENTIFYABLE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.requirements.impl.PreConditonImpl <em>Pre Conditon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.requirements.impl.PreConditonImpl
	 * @see org.gravity.requirements.impl.RequirementsPackageImpl#getPreConditon()
	 * @generated
	 */
	int PRE_CONDITON = 2;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITON__REFERENCES = ELEMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITON__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Usecase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITON__USECASE = ELEMENT__USECASE;

	/**
	 * The number of structural features of the '<em>Pre Conditon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITON_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pre Conditon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITON_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.requirements.impl.SubFlowImpl <em>Sub Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.requirements.impl.SubFlowImpl
	 * @see org.gravity.requirements.impl.RequirementsPackageImpl#getSubFlow()
	 * @generated
	 */
	int SUB_FLOW = 3;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW__REFERENCES = IDENTIFYABLE_OBJECT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW__VALUE = IDENTIFYABLE_OBJECT__VALUE;

	/**
	 * The feature id for the '<em><b>Usecase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW__USECASE = IDENTIFYABLE_OBJECT__USECASE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW__ID = IDENTIFYABLE_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Sub Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW_FEATURE_COUNT = IDENTIFYABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sub Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FLOW_OPERATION_COUNT = IDENTIFYABLE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.requirements.impl.MainFlowImpl <em>Main Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.requirements.impl.MainFlowImpl
	 * @see org.gravity.requirements.impl.RequirementsPackageImpl#getMainFlow()
	 * @generated
	 */
	int MAIN_FLOW = 4;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FLOW__REFERENCES = ELEMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FLOW__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Usecase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FLOW__USECASE = ELEMENT__USECASE;

	/**
	 * The number of structural features of the '<em>Main Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FLOW_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Main Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FLOW_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.requirements.impl.AlternativeFlowImpl <em>Alternative Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.requirements.impl.AlternativeFlowImpl
	 * @see org.gravity.requirements.impl.RequirementsPackageImpl#getAlternativeFlow()
	 * @generated
	 */
	int ALTERNATIVE_FLOW = 7;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW__REFERENCES = IDENTIFYABLE_OBJECT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW__VALUE = IDENTIFYABLE_OBJECT__VALUE;

	/**
	 * The feature id for the '<em><b>Usecase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW__USECASE = IDENTIFYABLE_OBJECT__USECASE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW__ID = IDENTIFYABLE_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Alternative Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW_FEATURE_COUNT = IDENTIFYABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alternative Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW_OPERATION_COUNT = IDENTIFYABLE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gravity.requirements.impl.LoggingRequirementImpl <em>Logging Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.requirements.impl.LoggingRequirementImpl
	 * @see org.gravity.requirements.impl.RequirementsPackageImpl#getLoggingRequirement()
	 * @generated
	 */
	int LOGGING_REQUIREMENT = 8;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_REQUIREMENT__REFERENCES = IDENTIFYABLE_OBJECT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_REQUIREMENT__VALUE = IDENTIFYABLE_OBJECT__VALUE;

	/**
	 * The feature id for the '<em><b>Usecase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_REQUIREMENT__USECASE = IDENTIFYABLE_OBJECT__USECASE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_REQUIREMENT__ID = IDENTIFYABLE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Additional Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_REQUIREMENT__ADDITIONAL_INFORMATION = IDENTIFYABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logging Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_REQUIREMENT_FEATURE_COUNT = IDENTIFYABLE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logging Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGING_REQUIREMENT_OPERATION_COUNT = IDENTIFYABLE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.gravity.requirements.RequirementsModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.gravity.requirements.RequirementsModel
	 * @generated
	 */
	EClass getRequirementsModel();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.requirements.RequirementsModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gravity.requirements.RequirementsModel#getName()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EAttribute getRequirementsModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.requirements.RequirementsModel#getUsecases <em>Usecases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Usecases</em>'.
	 * @see org.gravity.requirements.RequirementsModel#getUsecases()
	 * @see #getRequirementsModel()
	 * @generated
	 */
	EReference getRequirementsModel_Usecases();

	/**
	 * Returns the meta object for class '{@link org.gravity.requirements.UseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Case</em>'.
	 * @see org.gravity.requirements.UseCase
	 * @generated
	 */
	EClass getUseCase();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.requirements.UseCase#isSupportet <em>Supportet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supportet</em>'.
	 * @see org.gravity.requirements.UseCase#isSupportet()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Supportet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.requirements.UseCase#getPreconditons <em>Preconditons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preconditons</em>'.
	 * @see org.gravity.requirements.UseCase#getPreconditons()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Preconditons();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.requirements.UseCase#getMainflows <em>Mainflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mainflows</em>'.
	 * @see org.gravity.requirements.UseCase#getMainflows()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Mainflows();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.requirements.UseCase#getSubflows <em>Subflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subflows</em>'.
	 * @see org.gravity.requirements.UseCase#getSubflows()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Subflows();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.requirements.UseCase#getAlternativeflows <em>Alternativeflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternativeflows</em>'.
	 * @see org.gravity.requirements.UseCase#getAlternativeflows()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Alternativeflows();

	/**
	 * Returns the meta object for the container reference '{@link org.gravity.requirements.UseCase#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see org.gravity.requirements.UseCase#getModel()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gravity.requirements.UseCase#getLoggingRequirements <em>Logging Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logging Requirements</em>'.
	 * @see org.gravity.requirements.UseCase#getLoggingRequirements()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_LoggingRequirements();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.requirements.UseCase#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gravity.requirements.UseCase#getDescription()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Description();

	/**
	 * Returns the meta object for class '{@link org.gravity.requirements.PreConditon <em>Pre Conditon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Conditon</em>'.
	 * @see org.gravity.requirements.PreConditon
	 * @generated
	 */
	EClass getPreConditon();

	/**
	 * Returns the meta object for class '{@link org.gravity.requirements.SubFlow <em>Sub Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Flow</em>'.
	 * @see org.gravity.requirements.SubFlow
	 * @generated
	 */
	EClass getSubFlow();

	/**
	 * Returns the meta object for class '{@link org.gravity.requirements.MainFlow <em>Main Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Flow</em>'.
	 * @see org.gravity.requirements.MainFlow
	 * @generated
	 */
	EClass getMainFlow();

	/**
	 * Returns the meta object for class '{@link org.gravity.requirements.IdentifyableObject <em>Identifyable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifyable Object</em>'.
	 * @see org.gravity.requirements.IdentifyableObject
	 * @generated
	 */
	EClass getIdentifyableObject();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.requirements.IdentifyableObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.gravity.requirements.IdentifyableObject#getId()
	 * @see #getIdentifyableObject()
	 * @generated
	 */
	EAttribute getIdentifyableObject_Id();

	/**
	 * Returns the meta object for class '{@link org.gravity.requirements.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.gravity.requirements.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the reference list '{@link org.gravity.requirements.Element#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see org.gravity.requirements.Element#getReferences()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_References();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.requirements.Element#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gravity.requirements.Element#getValue()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Value();

	/**
	 * Returns the meta object for the reference '{@link org.gravity.requirements.Element#getUsecase <em>Usecase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usecase</em>'.
	 * @see org.gravity.requirements.Element#getUsecase()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Usecase();

	/**
	 * Returns the meta object for class '{@link org.gravity.requirements.AlternativeFlow <em>Alternative Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Flow</em>'.
	 * @see org.gravity.requirements.AlternativeFlow
	 * @generated
	 */
	EClass getAlternativeFlow();

	/**
	 * Returns the meta object for class '{@link org.gravity.requirements.LoggingRequirement <em>Logging Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logging Requirement</em>'.
	 * @see org.gravity.requirements.LoggingRequirement
	 * @generated
	 */
	EClass getLoggingRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.requirements.LoggingRequirement#getAdditionalInformation <em>Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Information</em>'.
	 * @see org.gravity.requirements.LoggingRequirement#getAdditionalInformation()
	 * @see #getLoggingRequirement()
	 * @generated
	 */
	EAttribute getLoggingRequirement_AdditionalInformation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementsFactory getRequirementsFactory();

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
		 * The meta object literal for the '{@link org.gravity.requirements.impl.RequirementsModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.requirements.impl.RequirementsModelImpl
		 * @see org.gravity.requirements.impl.RequirementsPackageImpl#getRequirementsModel()
		 * @generated
		 */
		EClass REQUIREMENTS_MODEL = eINSTANCE.getRequirementsModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENTS_MODEL__NAME = eINSTANCE.getRequirementsModel_Name();

		/**
		 * The meta object literal for the '<em><b>Usecases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_MODEL__USECASES = eINSTANCE.getRequirementsModel_Usecases();

		/**
		 * The meta object literal for the '{@link org.gravity.requirements.impl.UseCaseImpl <em>Use Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.requirements.impl.UseCaseImpl
		 * @see org.gravity.requirements.impl.RequirementsPackageImpl#getUseCase()
		 * @generated
		 */
		EClass USE_CASE = eINSTANCE.getUseCase();

		/**
		 * The meta object literal for the '<em><b>Supportet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__SUPPORTET = eINSTANCE.getUseCase_Supportet();

		/**
		 * The meta object literal for the '<em><b>Preconditons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__PRECONDITONS = eINSTANCE.getUseCase_Preconditons();

		/**
		 * The meta object literal for the '<em><b>Mainflows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__MAINFLOWS = eINSTANCE.getUseCase_Mainflows();

		/**
		 * The meta object literal for the '<em><b>Subflows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__SUBFLOWS = eINSTANCE.getUseCase_Subflows();

		/**
		 * The meta object literal for the '<em><b>Alternativeflows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__ALTERNATIVEFLOWS = eINSTANCE.getUseCase_Alternativeflows();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__MODEL = eINSTANCE.getUseCase_Model();

		/**
		 * The meta object literal for the '<em><b>Logging Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__LOGGING_REQUIREMENTS = eINSTANCE.getUseCase_LoggingRequirements();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__DESCRIPTION = eINSTANCE.getUseCase_Description();

		/**
		 * The meta object literal for the '{@link org.gravity.requirements.impl.PreConditonImpl <em>Pre Conditon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.requirements.impl.PreConditonImpl
		 * @see org.gravity.requirements.impl.RequirementsPackageImpl#getPreConditon()
		 * @generated
		 */
		EClass PRE_CONDITON = eINSTANCE.getPreConditon();

		/**
		 * The meta object literal for the '{@link org.gravity.requirements.impl.SubFlowImpl <em>Sub Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.requirements.impl.SubFlowImpl
		 * @see org.gravity.requirements.impl.RequirementsPackageImpl#getSubFlow()
		 * @generated
		 */
		EClass SUB_FLOW = eINSTANCE.getSubFlow();

		/**
		 * The meta object literal for the '{@link org.gravity.requirements.impl.MainFlowImpl <em>Main Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.requirements.impl.MainFlowImpl
		 * @see org.gravity.requirements.impl.RequirementsPackageImpl#getMainFlow()
		 * @generated
		 */
		EClass MAIN_FLOW = eINSTANCE.getMainFlow();

		/**
		 * The meta object literal for the '{@link org.gravity.requirements.impl.IdentifyableObjectImpl <em>Identifyable Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.requirements.impl.IdentifyableObjectImpl
		 * @see org.gravity.requirements.impl.RequirementsPackageImpl#getIdentifyableObject()
		 * @generated
		 */
		EClass IDENTIFYABLE_OBJECT = eINSTANCE.getIdentifyableObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFYABLE_OBJECT__ID = eINSTANCE.getIdentifyableObject_Id();

		/**
		 * The meta object literal for the '{@link org.gravity.requirements.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.requirements.impl.ElementImpl
		 * @see org.gravity.requirements.impl.RequirementsPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__REFERENCES = eINSTANCE.getElement_References();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__VALUE = eINSTANCE.getElement_Value();

		/**
		 * The meta object literal for the '<em><b>Usecase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__USECASE = eINSTANCE.getElement_Usecase();

		/**
		 * The meta object literal for the '{@link org.gravity.requirements.impl.AlternativeFlowImpl <em>Alternative Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.requirements.impl.AlternativeFlowImpl
		 * @see org.gravity.requirements.impl.RequirementsPackageImpl#getAlternativeFlow()
		 * @generated
		 */
		EClass ALTERNATIVE_FLOW = eINSTANCE.getAlternativeFlow();

		/**
		 * The meta object literal for the '{@link org.gravity.requirements.impl.LoggingRequirementImpl <em>Logging Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.requirements.impl.LoggingRequirementImpl
		 * @see org.gravity.requirements.impl.RequirementsPackageImpl#getLoggingRequirement()
		 * @generated
		 */
		EClass LOGGING_REQUIREMENT = eINSTANCE.getLoggingRequirement();

		/**
		 * The meta object literal for the '<em><b>Additional Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGGING_REQUIREMENT__ADDITIONAL_INFORMATION = eINSTANCE
				.getLoggingRequirement_AdditionalInformation();

	}

} //RequirementsPackage
