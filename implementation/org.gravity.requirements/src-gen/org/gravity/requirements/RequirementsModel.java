/**
 */
package org.gravity.requirements;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.requirements.RequirementsModel#getName <em>Name</em>}</li>
 *   <li>{@link org.gravity.requirements.RequirementsModel#getUsecases <em>Usecases</em>}</li>
 * </ul>
 *
 * @see org.gravity.requirements.RequirementsPackage#getRequirementsModel()
 * @model
 * @generated
 */
public interface RequirementsModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.gravity.requirements.RequirementsPackage#getRequirementsModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.gravity.requirements.RequirementsModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Usecases</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.requirements.UseCase}.
	 * It is bidirectional and its opposite is '{@link org.gravity.requirements.UseCase#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usecases</em>' containment reference list.
	 * @see org.gravity.requirements.RequirementsPackage#getRequirementsModel_Usecases()
	 * @see org.gravity.requirements.UseCase#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<UseCase> getUsecases();

} // RequirementsModel
