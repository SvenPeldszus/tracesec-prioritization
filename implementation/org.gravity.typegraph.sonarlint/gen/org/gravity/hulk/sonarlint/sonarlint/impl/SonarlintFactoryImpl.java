/**
 */
package org.gravity.hulk.sonarlint.sonarlint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gravity.hulk.sonarlint.sonarlint.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SonarlintFactoryImpl extends EFactoryImpl implements SonarlintFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SonarlintFactory init() {
		try {
			SonarlintFactory theSonarlintFactory = (SonarlintFactory)EPackage.Registry.INSTANCE.getEFactory(SonarlintPackage.eNS_URI);
			if (theSonarlintFactory != null) {
				return theSonarlintFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SonarlintFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SonarlintFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SonarlintPackage.SONARLINT_FINDING: return createSonarlintFinding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SonarlintFinding createSonarlintFinding() {
		SonarlintFindingImpl sonarlintFinding = new SonarlintFindingImpl();
		return sonarlintFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SonarlintPackage getSonarlintPackage() {
		return (SonarlintPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SonarlintPackage getPackage() {
		return SonarlintPackage.eINSTANCE;
	}

} //SonarlintFactoryImpl
