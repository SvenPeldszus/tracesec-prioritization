/**
 */
package org.gravity.hulk.sonarlint.sonarlint.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

import org.gravity.hulk.sonarlint.sonarlint.SonarlintFactory;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintPackage;

import org.gravity.typegraph.basic.BasicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SonarlintPackageImpl extends EPackageImpl implements SonarlintPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sonarlintFindingEClass = null;

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
	 * @see org.gravity.hulk.sonarlint.sonarlint.SonarlintPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SonarlintPackageImpl() {
		super(eNS_URI, SonarlintFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SonarlintPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SonarlintPackage init() {
		if (isInited) return (SonarlintPackage)EPackage.Registry.INSTANCE.getEPackage(SonarlintPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSonarlintPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SonarlintPackageImpl theSonarlintPackage = registeredSonarlintPackage instanceof SonarlintPackageImpl ? (SonarlintPackageImpl)registeredSonarlintPackage : new SonarlintPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AntipatterngraphPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSonarlintPackage.createPackageContents();

		// Initialize created meta-data
		theSonarlintPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSonarlintPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SonarlintPackage.eNS_URI, theSonarlintPackage);
		return theSonarlintPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSonarlintFinding() {
		return sonarlintFindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonarlintFinding_Rulekey() {
		return (EAttribute)sonarlintFindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonarlintFinding_Kind() {
		return (EAttribute)sonarlintFindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonarlintFinding_Severity() {
		return (EAttribute)sonarlintFindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonarlintFinding_Rulename() {
		return (EAttribute)sonarlintFindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonarlintFinding_Description() {
		return (EAttribute)sonarlintFindingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonarlintFinding_Creationdate() {
		return (EAttribute)sonarlintFindingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonarlintFinding_Marker() {
		return (EAttribute)sonarlintFindingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SonarlintFactory getSonarlintFactory() {
		return (SonarlintFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sonarlintFindingEClass = createEClass(SONARLINT_FINDING);
		createEAttribute(sonarlintFindingEClass, SONARLINT_FINDING__RULEKEY);
		createEAttribute(sonarlintFindingEClass, SONARLINT_FINDING__KIND);
		createEAttribute(sonarlintFindingEClass, SONARLINT_FINDING__SEVERITY);
		createEAttribute(sonarlintFindingEClass, SONARLINT_FINDING__RULENAME);
		createEAttribute(sonarlintFindingEClass, SONARLINT_FINDING__DESCRIPTION);
		createEAttribute(sonarlintFindingEClass, SONARLINT_FINDING__CREATIONDATE);
		createEAttribute(sonarlintFindingEClass, SONARLINT_FINDING__MARKER);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AntipatterngraphPackage theAntipatterngraphPackage = (AntipatterngraphPackage)EPackage.Registry.INSTANCE.getEPackage(AntipatterngraphPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sonarlintFindingEClass.getESuperTypes().add(theAntipatterngraphPackage.getHCodeSmell());

		// Initialize classes, features, and operations; add parameters
		initEClass(sonarlintFindingEClass, SonarlintFinding.class, "SonarlintFinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSonarlintFinding_Rulekey(), ecorePackage.getEString(), "rulekey", null, 0, 1, SonarlintFinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSonarlintFinding_Kind(), ecorePackage.getEString(), "kind", null, 0, 1, SonarlintFinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSonarlintFinding_Severity(), ecorePackage.getEString(), "severity", null, 0, 1, SonarlintFinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSonarlintFinding_Rulename(), ecorePackage.getEString(), "rulename", null, 0, 1, SonarlintFinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSonarlintFinding_Description(), ecorePackage.getEString(), "description", null, 0, 1, SonarlintFinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSonarlintFinding_Creationdate(), ecorePackage.getELong(), "creationdate", null, 0, 1, SonarlintFinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSonarlintFinding_Marker(), ecorePackage.getEJavaObject(), "marker", null, 0, 1, SonarlintFinding.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SonarlintPackageImpl
