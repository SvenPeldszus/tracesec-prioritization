/**
 */
package org.tracesec.prioritization.prioritization.prioritization;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prioritization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.prioritization.prioritization.prioritization.Prioritization#getFindings <em>Findings</em>}</li>
 * </ul>
 *
 * @see org.tracesec.prioritization.prioritization.prioritization.PrioritizationPackage#getPrioritization()
 * @model
 * @generated
 */
public interface Prioritization extends EObject {
	/**
	 * Returns the value of the '<em><b>Findings</b></em>' containment reference list.
	 * The list contents are of type {@link org.tracesec.prioritization.prioritization.prioritization.Finding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Findings</em>' containment reference list.
	 * @see org.tracesec.prioritization.prioritization.prioritization.PrioritizationPackage#getPrioritization_Findings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Finding> getFindings();

} // Prioritization
