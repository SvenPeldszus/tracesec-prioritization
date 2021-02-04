/**
 */
package org.tracesec.qualitymodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tracesec.qualitymodel.QualityModelPackage
 * @generated
 */
public interface QualityModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QualityModelFactory eINSTANCE = org.tracesec.qualitymodel.impl.QualityModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Quality Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Category</em>'.
	 * @generated
	 */
	QualityCategory createQualityCategory();

	/**
	 * Returns a new object of class '<em>Quality Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Aspect</em>'.
	 * @generated
	 */
	QualityAspect createQualityAspect();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QualityModelPackage getQualityModelPackage();

} //QualityModelFactory
