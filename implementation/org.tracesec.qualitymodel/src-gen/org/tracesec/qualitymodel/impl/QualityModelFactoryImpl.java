/**
 */
package org.tracesec.qualitymodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tracesec.qualitymodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityModelFactoryImpl extends EFactoryImpl implements QualityModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QualityModelFactory init() {
		try {
			QualityModelFactory theQualityModelFactory = (QualityModelFactory)EPackage.Registry.INSTANCE.getEFactory(QualityModelPackage.eNS_URI);
			if (theQualityModelFactory != null) {
				return theQualityModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QualityModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityModelFactoryImpl() {
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
			case QualityModelPackage.QUALITY_CATEGORY: return createQualityCategory();
			case QualityModelPackage.QUALITY_ASPECT: return createQualityAspect();
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
	public QualityCategory createQualityCategory() {
		QualityCategoryImpl qualityCategory = new QualityCategoryImpl();
		return qualityCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualityAspect createQualityAspect() {
		QualityAspectImpl qualityAspect = new QualityAspectImpl();
		return qualityAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualityModelPackage getQualityModelPackage() {
		return (QualityModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QualityModelPackage getPackage() {
		return QualityModelPackage.eINSTANCE;
	}

} //QualityModelFactoryImpl
