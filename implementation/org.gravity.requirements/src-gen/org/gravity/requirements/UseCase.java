/**
 */
package org.gravity.requirements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.requirements.UseCase#isSupportet <em>Supportet</em>}</li>
 *   <li>{@link org.gravity.requirements.UseCase#getPreconditons <em>Preconditons</em>}</li>
 *   <li>{@link org.gravity.requirements.UseCase#getMainflows <em>Mainflows</em>}</li>
 *   <li>{@link org.gravity.requirements.UseCase#getSubflows <em>Subflows</em>}</li>
 *   <li>{@link org.gravity.requirements.UseCase#getAlternativeflows <em>Alternativeflows</em>}</li>
 *   <li>{@link org.gravity.requirements.UseCase#getModel <em>Model</em>}</li>
 *   <li>{@link org.gravity.requirements.UseCase#getLoggingRequirements <em>Logging Requirements</em>}</li>
 *   <li>{@link org.gravity.requirements.UseCase#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.gravity.requirements.RequirementsPackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends IdentifyableObject {
	/**
	 * Returns the value of the '<em><b>Supportet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supportet</em>' attribute.
	 * @see #setSupportet(boolean)
	 * @see org.gravity.requirements.RequirementsPackage#getUseCase_Supportet()
	 * @model
	 * @generated
	 */
	boolean isSupportet();

	/**
	 * Sets the value of the '{@link org.gravity.requirements.UseCase#isSupportet <em>Supportet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supportet</em>' attribute.
	 * @see #isSupportet()
	 * @generated
	 */
	void setSupportet(boolean value);

	/**
	 * Returns the value of the '<em><b>Preconditons</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.requirements.PreConditon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preconditons</em>' containment reference list.
	 * @see org.gravity.requirements.RequirementsPackage#getUseCase_Preconditons()
	 * @model containment="true"
	 * @generated
	 */
	EList<PreConditon> getPreconditons();

	/**
	 * Returns the value of the '<em><b>Mainflows</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.requirements.MainFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mainflows</em>' containment reference list.
	 * @see org.gravity.requirements.RequirementsPackage#getUseCase_Mainflows()
	 * @model containment="true"
	 * @generated
	 */
	EList<MainFlow> getMainflows();

	/**
	 * Returns the value of the '<em><b>Subflows</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.requirements.SubFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subflows</em>' containment reference list.
	 * @see org.gravity.requirements.RequirementsPackage#getUseCase_Subflows()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubFlow> getSubflows();

	/**
	 * Returns the value of the '<em><b>Alternativeflows</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.requirements.AlternativeFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternativeflows</em>' containment reference list.
	 * @see org.gravity.requirements.RequirementsPackage#getUseCase_Alternativeflows()
	 * @model containment="true"
	 * @generated
	 */
	EList<AlternativeFlow> getAlternativeflows();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gravity.requirements.RequirementsModel#getUsecases <em>Usecases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(RequirementsModel)
	 * @see org.gravity.requirements.RequirementsPackage#getUseCase_Model()
	 * @see org.gravity.requirements.RequirementsModel#getUsecases
	 * @model opposite="usecases" required="true" transient="false"
	 * @generated
	 */
	RequirementsModel getModel();

	/**
	 * Sets the value of the '{@link org.gravity.requirements.UseCase#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(RequirementsModel value);

	/**
	 * Returns the value of the '<em><b>Logging Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.gravity.requirements.LoggingRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logging Requirements</em>' containment reference list.
	 * @see org.gravity.requirements.RequirementsPackage#getUseCase_LoggingRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<LoggingRequirement> getLoggingRequirements();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.gravity.requirements.RequirementsPackage#getUseCase_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.gravity.requirements.UseCase#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // UseCase
