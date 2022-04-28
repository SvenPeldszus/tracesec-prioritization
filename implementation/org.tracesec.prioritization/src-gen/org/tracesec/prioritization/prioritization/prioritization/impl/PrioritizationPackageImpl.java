/**
 */
package org.tracesec.prioritization.prioritization.prioritization.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

import org.gravity.hulk.sonarlint.sonarlint.SonarlintPackage;

import org.gravity.typegraph.basic.BasicPackage;

import org.tracesec.prioritization.prioritization.prioritization.Finding;
import org.tracesec.prioritization.prioritization.prioritization.Prioritization;
import org.tracesec.prioritization.prioritization.prioritization.PrioritizationFactory;
import org.tracesec.prioritization.prioritization.prioritization.PrioritizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrioritizationPackageImpl extends EPackageImpl implements PrioritizationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prioritizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findingEClass = null;

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
	 * @see org.tracesec.prioritization.prioritization.prioritization.PrioritizationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PrioritizationPackageImpl() {
		super(eNS_URI, PrioritizationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PrioritizationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PrioritizationPackage init() {
		if (isInited) return (PrioritizationPackage)EPackage.Registry.INSTANCE.getEPackage(PrioritizationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPrioritizationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PrioritizationPackageImpl thePrioritizationPackage = registeredPrioritizationPackage instanceof PrioritizationPackageImpl ? (PrioritizationPackageImpl)registeredPrioritizationPackage : new PrioritizationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AntipatterngraphPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();
		SonarlintPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePrioritizationPackage.createPackageContents();

		// Initialize created meta-data
		thePrioritizationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePrioritizationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PrioritizationPackage.eNS_URI, thePrioritizationPackage);
		return thePrioritizationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrioritization() {
		return prioritizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrioritization_Findings() {
		return (EReference)prioritizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinding() {
		return findingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinding_Represents() {
		return (EReference)findingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinding_Priority() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFinding_ManualPriority() {
		return (EAttribute)findingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrioritizationFactory getPrioritizationFactory() {
		return (PrioritizationFactory)getEFactoryInstance();
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
		prioritizationEClass = createEClass(PRIORITIZATION);
		createEReference(prioritizationEClass, PRIORITIZATION__FINDINGS);

		findingEClass = createEClass(FINDING);
		createEReference(findingEClass, FINDING__REPRESENTS);
		createEAttribute(findingEClass, FINDING__PRIORITY);
		createEAttribute(findingEClass, FINDING__MANUAL_PRIORITY);
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
		SonarlintPackage theSonarlintPackage = (SonarlintPackage)EPackage.Registry.INSTANCE.getEPackage(SonarlintPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(prioritizationEClass, Prioritization.class, "Prioritization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrioritization_Findings(), this.getFinding(), null, "findings", null, 0, -1, Prioritization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(findingEClass, Finding.class, "Finding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinding_Represents(), theSonarlintPackage.getSonarlintFinding(), null, "represents", null, 1, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFinding_ManualPriority(), ecorePackage.getEInt(), "manualPriority", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PrioritizationPackageImpl
