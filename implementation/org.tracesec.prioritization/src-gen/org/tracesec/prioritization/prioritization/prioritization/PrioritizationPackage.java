/**
 */
package org.tracesec.prioritization.prioritization.prioritization;

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
 * @see org.tracesec.prioritization.prioritization.prioritization.PrioritizationFactory
 * @model kind="package"
 * @generated
 */
public interface PrioritizationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "prioritization";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.tracesec.org/prioritization";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "prioritization";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrioritizationPackage eINSTANCE = org.tracesec.prioritization.prioritization.prioritization.impl.PrioritizationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tracesec.prioritization.prioritization.prioritization.impl.PrioritizationImpl <em>Prioritization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tracesec.prioritization.prioritization.prioritization.impl.PrioritizationImpl
	 * @see org.tracesec.prioritization.prioritization.prioritization.impl.PrioritizationPackageImpl#getPrioritization()
	 * @generated
	 */
	int PRIORITIZATION = 0;

	/**
	 * The feature id for the '<em><b>Findings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZATION__FINDINGS = 0;

	/**
	 * The number of structural features of the '<em>Prioritization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Prioritization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tracesec.prioritization.prioritization.prioritization.impl.FindingImpl <em>Finding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tracesec.prioritization.prioritization.prioritization.impl.FindingImpl
	 * @see org.tracesec.prioritization.prioritization.prioritization.impl.PrioritizationPackageImpl#getFinding()
	 * @generated
	 */
	int FINDING = 1;

	/**
	 * The feature id for the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__REPRESENTS = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__PRIORITY = 1;

	/**
	 * The feature id for the '<em><b>Manual Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__MANUAL_PRIORITY = 2;

	/**
	 * The number of structural features of the '<em>Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.tracesec.prioritization.prioritization.prioritization.Prioritization <em>Prioritization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prioritization</em>'.
	 * @see org.tracesec.prioritization.prioritization.prioritization.Prioritization
	 * @generated
	 */
	EClass getPrioritization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tracesec.prioritization.prioritization.prioritization.Prioritization#getFindings <em>Findings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Findings</em>'.
	 * @see org.tracesec.prioritization.prioritization.prioritization.Prioritization#getFindings()
	 * @see #getPrioritization()
	 * @generated
	 */
	EReference getPrioritization_Findings();

	/**
	 * Returns the meta object for class '{@link org.tracesec.prioritization.prioritization.prioritization.Finding <em>Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finding</em>'.
	 * @see org.tracesec.prioritization.prioritization.prioritization.Finding
	 * @generated
	 */
	EClass getFinding();

	/**
	 * Returns the meta object for the reference '{@link org.tracesec.prioritization.prioritization.prioritization.Finding#getRepresents <em>Represents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represents</em>'.
	 * @see org.tracesec.prioritization.prioritization.prioritization.Finding#getRepresents()
	 * @see #getFinding()
	 * @generated
	 */
	EReference getFinding_Represents();

	/**
	 * Returns the meta object for the attribute '{@link org.tracesec.prioritization.prioritization.prioritization.Finding#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.tracesec.prioritization.prioritization.prioritization.Finding#getPriority()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.tracesec.prioritization.prioritization.prioritization.Finding#getManualPriority <em>Manual Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual Priority</em>'.
	 * @see org.tracesec.prioritization.prioritization.prioritization.Finding#getManualPriority()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_ManualPriority();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PrioritizationFactory getPrioritizationFactory();

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
		 * The meta object literal for the '{@link org.tracesec.prioritization.prioritization.prioritization.impl.PrioritizationImpl <em>Prioritization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tracesec.prioritization.prioritization.prioritization.impl.PrioritizationImpl
		 * @see org.tracesec.prioritization.prioritization.prioritization.impl.PrioritizationPackageImpl#getPrioritization()
		 * @generated
		 */
		EClass PRIORITIZATION = eINSTANCE.getPrioritization();

		/**
		 * The meta object literal for the '<em><b>Findings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIORITIZATION__FINDINGS = eINSTANCE.getPrioritization_Findings();

		/**
		 * The meta object literal for the '{@link org.tracesec.prioritization.prioritization.prioritization.impl.FindingImpl <em>Finding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tracesec.prioritization.prioritization.prioritization.impl.FindingImpl
		 * @see org.tracesec.prioritization.prioritization.prioritization.impl.PrioritizationPackageImpl#getFinding()
		 * @generated
		 */
		EClass FINDING = eINSTANCE.getFinding();

		/**
		 * The meta object literal for the '<em><b>Represents</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINDING__REPRESENTS = eINSTANCE.getFinding_Represents();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__PRIORITY = eINSTANCE.getFinding_Priority();

		/**
		 * The meta object literal for the '<em><b>Manual Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__MANUAL_PRIORITY = eINSTANCE.getFinding_ManualPriority();

	}

} //PrioritizationPackage
