/**
 */
package org.gravity.requirements.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.requirements.AlternativeFlow;
import org.gravity.requirements.Element;
import org.gravity.requirements.IdentifyableObject;
import org.gravity.requirements.LoggingRequirement;
import org.gravity.requirements.MainFlow;
import org.gravity.requirements.PreConditon;
import org.gravity.requirements.RequirementsFactory;
import org.gravity.requirements.RequirementsModel;
import org.gravity.requirements.RequirementsPackage;
import org.gravity.requirements.SubFlow;
import org.gravity.requirements.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementsPackageImpl extends EPackageImpl implements RequirementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preConditonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifyableObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loggingRequirementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gravity.requirements.RequirementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequirementsPackageImpl() {
		super(eNS_URI, RequirementsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RequirementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequirementsPackage init() {
		if (isInited)
			return (RequirementsPackage) EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRequirementsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RequirementsPackageImpl theRequirementsPackage = registeredRequirementsPackage instanceof RequirementsPackageImpl
				? (RequirementsPackageImpl) registeredRequirementsPackage
				: new RequirementsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRequirementsPackage.createPackageContents();

		// Initialize created meta-data
		theRequirementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRequirementsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequirementsPackage.eNS_URI, theRequirementsPackage);
		return theRequirementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementsModel() {
		return requirementsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementsModel_Name() {
		return (EAttribute) requirementsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementsModel_Usecases() {
		return (EReference) requirementsModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUseCase() {
		return useCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUseCase_Supportet() {
		return (EAttribute) useCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUseCase_Preconditons() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUseCase_Mainflows() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUseCase_Subflows() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUseCase_Alternativeflows() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUseCase_Model() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUseCase_LoggingRequirements() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUseCase_Description() {
		return (EAttribute) useCaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreConditon() {
		return preConditonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubFlow() {
		return subFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMainFlow() {
		return mainFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifyableObject() {
		return identifyableObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifyableObject_Id() {
		return (EAttribute) identifyableObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_References() {
		return (EReference) elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Value() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Usecase() {
		return (EReference) elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlternativeFlow() {
		return alternativeFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoggingRequirement() {
		return loggingRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoggingRequirement_AdditionalInformation() {
		return (EAttribute) loggingRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementsFactory getRequirementsFactory() {
		return (RequirementsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		requirementsModelEClass = createEClass(REQUIREMENTS_MODEL);
		createEAttribute(requirementsModelEClass, REQUIREMENTS_MODEL__NAME);
		createEReference(requirementsModelEClass, REQUIREMENTS_MODEL__USECASES);

		useCaseEClass = createEClass(USE_CASE);
		createEAttribute(useCaseEClass, USE_CASE__SUPPORTET);
		createEReference(useCaseEClass, USE_CASE__PRECONDITONS);
		createEReference(useCaseEClass, USE_CASE__MAINFLOWS);
		createEReference(useCaseEClass, USE_CASE__SUBFLOWS);
		createEReference(useCaseEClass, USE_CASE__ALTERNATIVEFLOWS);
		createEReference(useCaseEClass, USE_CASE__MODEL);
		createEReference(useCaseEClass, USE_CASE__LOGGING_REQUIREMENTS);
		createEAttribute(useCaseEClass, USE_CASE__DESCRIPTION);

		preConditonEClass = createEClass(PRE_CONDITON);

		subFlowEClass = createEClass(SUB_FLOW);

		mainFlowEClass = createEClass(MAIN_FLOW);

		identifyableObjectEClass = createEClass(IDENTIFYABLE_OBJECT);
		createEAttribute(identifyableObjectEClass, IDENTIFYABLE_OBJECT__ID);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__REFERENCES);
		createEAttribute(elementEClass, ELEMENT__VALUE);
		createEReference(elementEClass, ELEMENT__USECASE);

		alternativeFlowEClass = createEClass(ALTERNATIVE_FLOW);

		loggingRequirementEClass = createEClass(LOGGING_REQUIREMENT);
		createEAttribute(loggingRequirementEClass, LOGGING_REQUIREMENT__ADDITIONAL_INFORMATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		useCaseEClass.getESuperTypes().add(this.getIdentifyableObject());
		preConditonEClass.getESuperTypes().add(this.getElement());
		subFlowEClass.getESuperTypes().add(this.getIdentifyableObject());
		mainFlowEClass.getESuperTypes().add(this.getElement());
		identifyableObjectEClass.getESuperTypes().add(this.getElement());
		alternativeFlowEClass.getESuperTypes().add(this.getIdentifyableObject());
		loggingRequirementEClass.getESuperTypes().add(this.getIdentifyableObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(requirementsModelEClass, RequirementsModel.class, "RequirementsModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementsModel_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				RequirementsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementsModel_Usecases(), this.getUseCase(), this.getUseCase_Model(), "usecases", null, 0,
				-1, RequirementsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useCaseEClass, UseCase.class, "UseCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUseCase_Supportet(), ecorePackage.getEBoolean(), "supportet", null, 0, 1, UseCase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_Preconditons(), this.getPreConditon(), null, "preconditons", null, 0, -1,
				UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_Mainflows(), this.getMainFlow(), null, "mainflows", null, 0, -1, UseCase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_Subflows(), this.getSubFlow(), null, "subflows", null, 0, -1, UseCase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_Alternativeflows(), this.getAlternativeFlow(), null, "alternativeflows", null, 0, -1,
				UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_Model(), this.getRequirementsModel(), this.getRequirementsModel_Usecases(), "model",
				null, 1, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_LoggingRequirements(), this.getLoggingRequirement(), null, "loggingRequirements",
				null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUseCase_Description(), ecorePackage.getEString(), "description", null, 0, 1, UseCase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preConditonEClass, PreConditon.class, "PreConditon", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(subFlowEClass, SubFlow.class, "SubFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mainFlowEClass, MainFlow.class, "MainFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(identifyableObjectEClass, IdentifyableObject.class, "IdentifyableObject", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifyableObject_Id(), ecorePackage.getEString(), "id", null, 0, 1,
				IdentifyableObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_References(), this.getIdentifyableObject(), null, "references", null, 0, -1,
				Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Value(), ecorePackage.getEString(), "value", null, 0, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Usecase(), this.getUseCase(), null, "usecase", null, 1, 1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeFlowEClass, AlternativeFlow.class, "AlternativeFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(loggingRequirementEClass, LoggingRequirement.class, "LoggingRequirement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoggingRequirement_AdditionalInformation(), ecorePackage.getEString(),
				"additionalInformation", null, 0, 1, LoggingRequirement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RequirementsPackageImpl
