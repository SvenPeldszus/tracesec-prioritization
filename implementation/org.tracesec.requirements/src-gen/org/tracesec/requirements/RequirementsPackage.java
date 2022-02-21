/**
 */
package org.tracesec.requirements;

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
 * @see org.tracesec.requirements.RequirementsFactory
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
	String eNS_URI = "http://www.tracesec.org/requirements";

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
	RequirementsPackage eINSTANCE = org.tracesec.requirements.impl.RequirementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tracesec.requirements.impl.AbstractRequirementImpl <em>Abstract Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tracesec.requirements.impl.AbstractRequirementImpl
	 * @see org.tracesec.requirements.impl.RequirementsPackageImpl#getAbstractRequirement()
	 * @generated
	 */
	int ABSTRACT_REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Wording</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__WORDING = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__SET = 3;

	/**
	 * The feature id for the '<em><b>Outgoing References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__OUTGOING_REFERENCES = 4;

	/**
	 * The feature id for the '<em><b>Incoming References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__INCOMING_REFERENCES = 5;

	/**
	 * The number of structural features of the '<em>Abstract Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Abstract Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tracesec.requirements.impl.RequirementsSetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tracesec.requirements.impl.RequirementsSetImpl
	 * @see org.tracesec.requirements.impl.RequirementsPackageImpl#getRequirementsSet()
	 * @generated
	 */
	int REQUIREMENTS_SET = 0;

	/**
	 * The feature id for the '<em><b>Wording</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SET__WORDING = ABSTRACT_REQUIREMENT__WORDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SET__ID = ABSTRACT_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SET__TITLE = ABSTRACT_REQUIREMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SET__SET = ABSTRACT_REQUIREMENT__SET;

	/**
	 * The feature id for the '<em><b>Outgoing References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SET__OUTGOING_REFERENCES = ABSTRACT_REQUIREMENT__OUTGOING_REFERENCES;

	/**
	 * The feature id for the '<em><b>Incoming References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SET__INCOMING_REFERENCES = ABSTRACT_REQUIREMENT__INCOMING_REFERENCES;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SET__ORDERED = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SET__REQUIREMENTS = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SET_FEATURE_COUNT = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SET_OPERATION_COUNT = ABSTRACT_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tracesec.requirements.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tracesec.requirements.impl.RequirementImpl
	 * @see org.tracesec.requirements.impl.RequirementsPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Wording</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__WORDING = ABSTRACT_REQUIREMENT__WORDING;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = ABSTRACT_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TITLE = ABSTRACT_REQUIREMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SET = ABSTRACT_REQUIREMENT__SET;

	/**
	 * The feature id for the '<em><b>Outgoing References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__OUTGOING_REFERENCES = ABSTRACT_REQUIREMENT__OUTGOING_REFERENCES;

	/**
	 * The feature id for the '<em><b>Incoming References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__INCOMING_REFERENCES = ABSTRACT_REQUIREMENT__INCOMING_REFERENCES;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = ABSTRACT_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tracesec.requirements.impl.RequirementRelationImpl <em>Requirement Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tracesec.requirements.impl.RequirementRelationImpl
	 * @see org.tracesec.requirements.impl.RequirementsPackageImpl#getRequirementRelation()
	 * @generated
	 */
	int REQUIREMENT_RELATION = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATION__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATION__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Requirement Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Requirement Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tracesec.requirements.ReferenceType <em>Reference Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tracesec.requirements.ReferenceType
	 * @see org.tracesec.requirements.impl.RequirementsPackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 4;

	/**
	 * Returns the meta object for class '{@link org.tracesec.requirements.RequirementsSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see org.tracesec.requirements.RequirementsSet
	 * @generated
	 */
	EClass getRequirementsSet();

	/**
	 * Returns the meta object for the attribute '{@link org.tracesec.requirements.RequirementsSet#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see org.tracesec.requirements.RequirementsSet#isOrdered()
	 * @see #getRequirementsSet()
	 * @generated
	 */
	EAttribute getRequirementsSet_Ordered();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tracesec.requirements.RequirementsSet#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.tracesec.requirements.RequirementsSet#getRequirements()
	 * @see #getRequirementsSet()
	 * @generated
	 */
	EReference getRequirementsSet_Requirements();

	/**
	 * Returns the meta object for class '{@link org.tracesec.requirements.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.tracesec.requirements.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for class '{@link org.tracesec.requirements.AbstractRequirement <em>Abstract Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Requirement</em>'.
	 * @see org.tracesec.requirements.AbstractRequirement
	 * @generated
	 */
	EClass getAbstractRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.tracesec.requirements.AbstractRequirement#getWording <em>Wording</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wording</em>'.
	 * @see org.tracesec.requirements.AbstractRequirement#getWording()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EAttribute getAbstractRequirement_Wording();

	/**
	 * Returns the meta object for the attribute '{@link org.tracesec.requirements.AbstractRequirement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.tracesec.requirements.AbstractRequirement#getId()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EAttribute getAbstractRequirement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.tracesec.requirements.AbstractRequirement#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.tracesec.requirements.AbstractRequirement#getTitle()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EAttribute getAbstractRequirement_Title();

	/**
	 * Returns the meta object for the container reference '{@link org.tracesec.requirements.AbstractRequirement#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Set</em>'.
	 * @see org.tracesec.requirements.AbstractRequirement#getSet()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_Set();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tracesec.requirements.AbstractRequirement#getOutgoingReferences <em>Outgoing References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing References</em>'.
	 * @see org.tracesec.requirements.AbstractRequirement#getOutgoingReferences()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_OutgoingReferences();

	/**
	 * Returns the meta object for the reference list '{@link org.tracesec.requirements.AbstractRequirement#getIncomingReferences <em>Incoming References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming References</em>'.
	 * @see org.tracesec.requirements.AbstractRequirement#getIncomingReferences()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_IncomingReferences();

	/**
	 * Returns the meta object for class '{@link org.tracesec.requirements.RequirementRelation <em>Requirement Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Relation</em>'.
	 * @see org.tracesec.requirements.RequirementRelation
	 * @generated
	 */
	EClass getRequirementRelation();

	/**
	 * Returns the meta object for the container reference '{@link org.tracesec.requirements.RequirementRelation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see org.tracesec.requirements.RequirementRelation#getSource()
	 * @see #getRequirementRelation()
	 * @generated
	 */
	EReference getRequirementRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link org.tracesec.requirements.RequirementRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.tracesec.requirements.RequirementRelation#getTarget()
	 * @see #getRequirementRelation()
	 * @generated
	 */
	EReference getRequirementRelation_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.tracesec.requirements.RequirementRelation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.tracesec.requirements.RequirementRelation#getType()
	 * @see #getRequirementRelation()
	 * @generated
	 */
	EAttribute getRequirementRelation_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.tracesec.requirements.RequirementRelation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.tracesec.requirements.RequirementRelation#getDescription()
	 * @see #getRequirementRelation()
	 * @generated
	 */
	EAttribute getRequirementRelation_Description();

	/**
	 * Returns the meta object for enum '{@link org.tracesec.requirements.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reference Type</em>'.
	 * @see org.tracesec.requirements.ReferenceType
	 * @generated
	 */
	EEnum getReferenceType();

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
		 * The meta object literal for the '{@link org.tracesec.requirements.impl.RequirementsSetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tracesec.requirements.impl.RequirementsSetImpl
		 * @see org.tracesec.requirements.impl.RequirementsPackageImpl#getRequirementsSet()
		 * @generated
		 */
		EClass REQUIREMENTS_SET = eINSTANCE.getRequirementsSet();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENTS_SET__ORDERED = eINSTANCE.getRequirementsSet_Ordered();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_SET__REQUIREMENTS = eINSTANCE.getRequirementsSet_Requirements();

		/**
		 * The meta object literal for the '{@link org.tracesec.requirements.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tracesec.requirements.impl.RequirementImpl
		 * @see org.tracesec.requirements.impl.RequirementsPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '{@link org.tracesec.requirements.impl.AbstractRequirementImpl <em>Abstract Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tracesec.requirements.impl.AbstractRequirementImpl
		 * @see org.tracesec.requirements.impl.RequirementsPackageImpl#getAbstractRequirement()
		 * @generated
		 */
		EClass ABSTRACT_REQUIREMENT = eINSTANCE.getAbstractRequirement();

		/**
		 * The meta object literal for the '<em><b>Wording</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_REQUIREMENT__WORDING = eINSTANCE.getAbstractRequirement_Wording();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_REQUIREMENT__ID = eINSTANCE.getAbstractRequirement_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_REQUIREMENT__TITLE = eINSTANCE.getAbstractRequirement_Title();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__SET = eINSTANCE.getAbstractRequirement_Set();

		/**
		 * The meta object literal for the '<em><b>Outgoing References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__OUTGOING_REFERENCES = eINSTANCE.getAbstractRequirement_OutgoingReferences();

		/**
		 * The meta object literal for the '<em><b>Incoming References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__INCOMING_REFERENCES = eINSTANCE.getAbstractRequirement_IncomingReferences();

		/**
		 * The meta object literal for the '{@link org.tracesec.requirements.impl.RequirementRelationImpl <em>Requirement Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tracesec.requirements.impl.RequirementRelationImpl
		 * @see org.tracesec.requirements.impl.RequirementsPackageImpl#getRequirementRelation()
		 * @generated
		 */
		EClass REQUIREMENT_RELATION = eINSTANCE.getRequirementRelation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_RELATION__SOURCE = eINSTANCE.getRequirementRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_RELATION__TARGET = eINSTANCE.getRequirementRelation_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_RELATION__TYPE = eINSTANCE.getRequirementRelation_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_RELATION__DESCRIPTION = eINSTANCE.getRequirementRelation_Description();

		/**
		 * The meta object literal for the '{@link org.tracesec.requirements.ReferenceType <em>Reference Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tracesec.requirements.ReferenceType
		 * @see org.tracesec.requirements.impl.RequirementsPackageImpl#getReferenceType()
		 * @generated
		 */
		EEnum REFERENCE_TYPE = eINSTANCE.getReferenceType();

	}

} //RequirementsPackage
