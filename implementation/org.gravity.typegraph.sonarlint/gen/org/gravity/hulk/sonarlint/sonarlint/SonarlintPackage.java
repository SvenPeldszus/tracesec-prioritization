/**
 */
package org.gravity.hulk.sonarlint.sonarlint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.gravity.hulk.antipatterngraph.AntipatterngraphPackage;

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
 * @see org.gravity.hulk.sonarlint.sonarlint.SonarlintFactory
 * @model kind="package"
 * @generated
 */
public interface SonarlintPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sonarlint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gravity-tool.org/typegraph/antipatterngraph/sonarlint";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.gravity.hulk.antipatterngraph.sonarlint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SonarlintPackage eINSTANCE = org.gravity.hulk.sonarlint.sonarlint.impl.SonarlintPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gravity.hulk.sonarlint.sonarlint.impl.SonarlintFindingImpl <em>Finding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gravity.hulk.sonarlint.sonarlint.impl.SonarlintFindingImpl
	 * @see org.gravity.hulk.sonarlint.sonarlint.impl.SonarlintPackageImpl#getSonarlintFinding()
	 * @generated
	 */
	int SONARLINT_FINDING = 0;

	/**
	 * The feature id for the '<em><b>TAnnotated</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING__TANNOTATED = AntipatterngraphPackage.HCODE_SMELL__TANNOTATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING__TYPE = AntipatterngraphPackage.HCODE_SMELL__TYPE;

	/**
	 * The feature id for the '<em><b>TValues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING__TVALUES = AntipatterngraphPackage.HCODE_SMELL__TVALUES;

	/**
	 * The feature id for the '<em><b>Apg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING__APG = AntipatterngraphPackage.HCODE_SMELL__APG;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING__PART_OF = AntipatterngraphPackage.HCODE_SMELL__PART_OF;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING__CHANGED = AntipatterngraphPackage.HCODE_SMELL__CHANGED;

	/**
	 * The feature id for the '<em><b>Rulekey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING__RULEKEY = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING__KIND = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING__SEVERITY = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rulename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING__RULENAME = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING__DESCRIPTION = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creationdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING__CREATIONDATE = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING__MARKER = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING_FEATURE_COUNT = AntipatterngraphPackage.HCODE_SMELL_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING___ECLASS = AntipatterngraphPackage.HCODE_SMELL___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING___EIS_PROXY = AntipatterngraphPackage.HCODE_SMELL___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING___ERESOURCE = AntipatterngraphPackage.HCODE_SMELL___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING___ECONTAINER = AntipatterngraphPackage.HCODE_SMELL___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING___ECONTAINING_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING___ECONTAINMENT_FEATURE = AntipatterngraphPackage.HCODE_SMELL___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING___ECONTENTS = AntipatterngraphPackage.HCODE_SMELL___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING___EALL_CONTENTS = AntipatterngraphPackage.HCODE_SMELL___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING___ECROSS_REFERENCES = AntipatterngraphPackage.HCODE_SMELL___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING___EGET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING___EGET__ESTRUCTURALFEATURE_BOOLEAN = AntipatterngraphPackage.HCODE_SMELL___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING___ESET__ESTRUCTURALFEATURE_OBJECT = AntipatterngraphPackage.HCODE_SMELL___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING___EIS_SET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING___EUNSET__ESTRUCTURALFEATURE = AntipatterngraphPackage.HCODE_SMELL___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING___EINVOKE__EOPERATION_ELIST = AntipatterngraphPackage.HCODE_SMELL___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING___GET_VALUE__STRING = AntipatterngraphPackage.HCODE_SMELL___GET_VALUE__STRING;

	/**
	 * The number of operations of the '<em>Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONARLINT_FINDING_OPERATION_COUNT = AntipatterngraphPackage.HCODE_SMELL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding <em>Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finding</em>'.
	 * @see org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding
	 * @generated
	 */
	EClass getSonarlintFinding();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getRulekey <em>Rulekey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rulekey</em>'.
	 * @see org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getRulekey()
	 * @see #getSonarlintFinding()
	 * @generated
	 */
	EAttribute getSonarlintFinding_Rulekey();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getKind()
	 * @see #getSonarlintFinding()
	 * @generated
	 */
	EAttribute getSonarlintFinding_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getSeverity()
	 * @see #getSonarlintFinding()
	 * @generated
	 */
	EAttribute getSonarlintFinding_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getRulename <em>Rulename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rulename</em>'.
	 * @see org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getRulename()
	 * @see #getSonarlintFinding()
	 * @generated
	 */
	EAttribute getSonarlintFinding_Rulename();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getDescription()
	 * @see #getSonarlintFinding()
	 * @generated
	 */
	EAttribute getSonarlintFinding_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getCreationdate <em>Creationdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creationdate</em>'.
	 * @see org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getCreationdate()
	 * @see #getSonarlintFinding()
	 * @generated
	 */
	EAttribute getSonarlintFinding_Creationdate();

	/**
	 * Returns the meta object for the attribute '{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getMarker <em>Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marker</em>'.
	 * @see org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getMarker()
	 * @see #getSonarlintFinding()
	 * @generated
	 */
	EAttribute getSonarlintFinding_Marker();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SonarlintFactory getSonarlintFactory();

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
		 * The meta object literal for the '{@link org.gravity.hulk.sonarlint.sonarlint.impl.SonarlintFindingImpl <em>Finding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gravity.hulk.sonarlint.sonarlint.impl.SonarlintFindingImpl
		 * @see org.gravity.hulk.sonarlint.sonarlint.impl.SonarlintPackageImpl#getSonarlintFinding()
		 * @generated
		 */
		EClass SONARLINT_FINDING = eINSTANCE.getSonarlintFinding();

		/**
		 * The meta object literal for the '<em><b>Rulekey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONARLINT_FINDING__RULEKEY = eINSTANCE.getSonarlintFinding_Rulekey();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONARLINT_FINDING__KIND = eINSTANCE.getSonarlintFinding_Kind();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONARLINT_FINDING__SEVERITY = eINSTANCE.getSonarlintFinding_Severity();

		/**
		 * The meta object literal for the '<em><b>Rulename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONARLINT_FINDING__RULENAME = eINSTANCE.getSonarlintFinding_Rulename();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONARLINT_FINDING__DESCRIPTION = eINSTANCE.getSonarlintFinding_Description();

		/**
		 * The meta object literal for the '<em><b>Creationdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONARLINT_FINDING__CREATIONDATE = eINSTANCE.getSonarlintFinding_Creationdate();

		/**
		 * The meta object literal for the '<em><b>Marker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONARLINT_FINDING__MARKER = eINSTANCE.getSonarlintFinding_Marker();

	}

} //SonarlintPackage
