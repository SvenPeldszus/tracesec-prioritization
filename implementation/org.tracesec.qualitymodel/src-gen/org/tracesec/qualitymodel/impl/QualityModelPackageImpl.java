/**
 */
package org.tracesec.qualitymodel.impl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tracesec.qualitymodel.AbstractQualityNode;
import org.tracesec.qualitymodel.QualityAspect;
import org.tracesec.qualitymodel.QualityCategory;
import org.tracesec.qualitymodel.QualityModelFactory;
import org.tracesec.qualitymodel.QualityModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityModelPackageImpl extends EPackageImpl implements QualityModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractQualityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityAspectEClass = null;

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
	 * @see org.tracesec.qualitymodel.QualityModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QualityModelPackageImpl() {
		super(eNS_URI, QualityModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QualityModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QualityModelPackage init() {
		if (isInited) return (QualityModelPackage)EPackage.Registry.INSTANCE.getEPackage(QualityModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQualityModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QualityModelPackageImpl theQualityModelPackage = registeredQualityModelPackage instanceof QualityModelPackageImpl ? (QualityModelPackageImpl)registeredQualityModelPackage : new QualityModelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQualityModelPackage.createPackageContents();

		// Initialize created meta-data
		theQualityModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQualityModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QualityModelPackage.eNS_URI, theQualityModelPackage);
		return theQualityModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualityCategory() {
		return qualityCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualityCategory_OwnedNodes() {
		return (EReference)qualityCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualityCategory_Aspects() {
		return (EReference)qualityCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualityCategory_Subcategories() {
		return (EReference)qualityCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractQualityNode() {
		return abstractQualityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractQualityNode_Owner() {
		return (EReference)abstractQualityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractQualityNode_Title() {
		return (EAttribute)abstractQualityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualityAspect() {
		return qualityAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQualityAspect_Description() {
		return (EAttribute)qualityAspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQualityAspect_RelevantElements() {
		return (EReference)qualityAspectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualityModelFactory getQualityModelFactory() {
		return (QualityModelFactory)getEFactoryInstance();
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
		qualityCategoryEClass = createEClass(QUALITY_CATEGORY);
		createEReference(qualityCategoryEClass, QUALITY_CATEGORY__OWNED_NODES);
		createEReference(qualityCategoryEClass, QUALITY_CATEGORY__ASPECTS);
		createEReference(qualityCategoryEClass, QUALITY_CATEGORY__SUBCATEGORIES);

		abstractQualityNodeEClass = createEClass(ABSTRACT_QUALITY_NODE);
		createEReference(abstractQualityNodeEClass, ABSTRACT_QUALITY_NODE__OWNER);
		createEAttribute(abstractQualityNodeEClass, ABSTRACT_QUALITY_NODE__TITLE);

		qualityAspectEClass = createEClass(QUALITY_ASPECT);
		createEAttribute(qualityAspectEClass, QUALITY_ASPECT__DESCRIPTION);
		createEReference(qualityAspectEClass, QUALITY_ASPECT__RELEVANT_ELEMENTS);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		qualityCategoryEClass.getESuperTypes().add(this.getAbstractQualityNode());
		qualityAspectEClass.getESuperTypes().add(this.getAbstractQualityNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(qualityCategoryEClass, QualityCategory.class, "QualityCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualityCategory_OwnedNodes(), this.getAbstractQualityNode(), this.getAbstractQualityNode_Owner(), "ownedNodes", null, 0, -1, QualityCategory.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityCategory_Aspects(), this.getQualityAspect(), null, "aspects", null, 0, -1, QualityCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQualityCategory_Subcategories(), this.getQualityCategory(), null, "subcategories", null, 0, -1, QualityCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractQualityNodeEClass, AbstractQualityNode.class, "AbstractQualityNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractQualityNode_Owner(), this.getQualityCategory(), this.getQualityCategory_OwnedNodes(), "owner", null, 1, 1, AbstractQualityNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractQualityNode_Title(), ecorePackage.getEString(), "title", null, 0, 1, AbstractQualityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualityAspectEClass, QualityAspect.class, "QualityAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualityAspect_Description(), ecorePackage.getEString(), "description", null, 0, 1, QualityAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityAspect_RelevantElements(), theEcorePackage.getEObject(), null, "relevantElements", null, 0, -1, QualityAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// union
		createUnionAnnotations();
		// subsets
		createSubsetsAnnotations();
	}

	/**
	 * Initializes the annotations for <b>union</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUnionAnnotations() {
		String source = "union";
		addAnnotation
		  (getQualityCategory_OwnedNodes(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>subsets</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSubsetsAnnotations() {
		String source = "subsets";
		addAnnotation
		  (getQualityCategory_Aspects(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//QualityCategory/ownedNodes")
		   });
		addAnnotation
		  (getQualityCategory_Subcategories(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//QualityCategory/ownedNodes")
		   });
	}

} //QualityModelPackageImpl
