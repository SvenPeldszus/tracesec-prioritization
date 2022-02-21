/**
 */
package org.gravity.hulk.sonarlint.sonarlint;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gravity.hulk.sonarlint.sonarlint.SonarlintPackage
 * @generated
 */
public interface SonarlintFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SonarlintFactory eINSTANCE = org.gravity.hulk.sonarlint.sonarlint.impl.SonarlintFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Finding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finding</em>'.
	 * @generated
	 */
	SonarlintFinding createSonarlintFinding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SonarlintPackage getSonarlintPackage();

} //SonarlintFactory
