/**
 */
package org.tracesec.prioritization.prioritization.prioritization;

import org.eclipse.emf.ecore.EObject;

import org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.prioritization.prioritization.prioritization.Finding#getRepresents <em>Represents</em>}</li>
 *   <li>{@link org.tracesec.prioritization.prioritization.prioritization.Finding#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.tracesec.prioritization.prioritization.prioritization.Finding#getManualPriority <em>Manual Priority</em>}</li>
 * </ul>
 *
 * @see org.tracesec.prioritization.prioritization.prioritization.PrioritizationPackage#getFinding()
 * @model
 * @generated
 */
public interface Finding extends EObject {
	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' reference.
	 * @see #setRepresents(SonarlintFinding)
	 * @see org.tracesec.prioritization.prioritization.prioritization.PrioritizationPackage#getFinding_Represents()
	 * @model required="true"
	 * @generated
	 */
	SonarlintFinding getRepresents();

	/**
	 * Sets the value of the '{@link org.tracesec.prioritization.prioritization.prioritization.Finding#getRepresents <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(SonarlintFinding value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.tracesec.prioritization.prioritization.prioritization.PrioritizationPackage#getFinding_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.tracesec.prioritization.prioritization.prioritization.Finding#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Manual Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual Priority</em>' attribute.
	 * @see #setManualPriority(int)
	 * @see org.tracesec.prioritization.prioritization.prioritization.PrioritizationPackage#getFinding_ManualPriority()
	 * @model
	 * @generated
	 */
	int getManualPriority();

	/**
	 * Sets the value of the '{@link org.tracesec.prioritization.prioritization.prioritization.Finding#getManualPriority <em>Manual Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual Priority</em>' attribute.
	 * @see #getManualPriority()
	 * @generated
	 */
	void setManualPriority(int value);

} // Finding
