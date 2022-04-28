/**
 */
package org.tracesec.prioritization.prioritization.prioritization;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tracesec.prioritization.prioritization.prioritization.PrioritizationPackage
 * @generated
 */
public interface PrioritizationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrioritizationFactory eINSTANCE = org.tracesec.prioritization.prioritization.prioritization.impl.PrioritizationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Prioritization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prioritization</em>'.
	 * @generated
	 */
	Prioritization createPrioritization();

	/**
	 * Returns a new object of class '<em>Finding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finding</em>'.
	 * @generated
	 */
	Finding createFinding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PrioritizationPackage getPrioritizationPackage();

} //PrioritizationFactory
