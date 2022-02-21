/**
 */
package org.gravity.hulk.sonarlint.sonarlint;

import org.gravity.hulk.antipatterngraph.HCodeSmell;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getRulekey <em>Rulekey</em>}</li>
 *   <li>{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getKind <em>Kind</em>}</li>
 *   <li>{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getRulename <em>Rulename</em>}</li>
 *   <li>{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getDescription <em>Description</em>}</li>
 *   <li>{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getCreationdate <em>Creationdate</em>}</li>
 *   <li>{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getMarker <em>Marker</em>}</li>
 * </ul>
 *
 * @see org.gravity.hulk.sonarlint.sonarlint.SonarlintPackage#getSonarlintFinding()
 * @model
 * @generated
 */
public interface SonarlintFinding extends HCodeSmell {
	/**
	 * Returns the value of the '<em><b>Rulekey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rulekey</em>' attribute.
	 * @see #setRulekey(String)
	 * @see org.gravity.hulk.sonarlint.sonarlint.SonarlintPackage#getSonarlintFinding_Rulekey()
	 * @model
	 * @generated
	 */
	String getRulekey();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getRulekey <em>Rulekey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rulekey</em>' attribute.
	 * @see #getRulekey()
	 * @generated
	 */
	void setRulekey(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see org.gravity.hulk.sonarlint.sonarlint.SonarlintPackage#getSonarlintFinding_Kind()
	 * @model
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(String)
	 * @see org.gravity.hulk.sonarlint.sonarlint.SonarlintPackage#getSonarlintFinding_Severity()
	 * @model
	 * @generated
	 */
	String getSeverity();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(String value);

	/**
	 * Returns the value of the '<em><b>Rulename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rulename</em>' attribute.
	 * @see #setRulename(String)
	 * @see org.gravity.hulk.sonarlint.sonarlint.SonarlintPackage#getSonarlintFinding_Rulename()
	 * @model
	 * @generated
	 */
	String getRulename();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getRulename <em>Rulename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rulename</em>' attribute.
	 * @see #getRulename()
	 * @generated
	 */
	void setRulename(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.gravity.hulk.sonarlint.sonarlint.SonarlintPackage#getSonarlintFinding_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Creationdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creationdate</em>' attribute.
	 * @see #setCreationdate(long)
	 * @see org.gravity.hulk.sonarlint.sonarlint.SonarlintPackage#getSonarlintFinding_Creationdate()
	 * @model
	 * @generated
	 */
	long getCreationdate();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getCreationdate <em>Creationdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creationdate</em>' attribute.
	 * @see #getCreationdate()
	 * @generated
	 */
	void setCreationdate(long value);

	/**
	 * Returns the value of the '<em><b>Marker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marker</em>' attribute.
	 * @see #setMarker(Object)
	 * @see org.gravity.hulk.sonarlint.sonarlint.SonarlintPackage#getSonarlintFinding_Marker()
	 * @model transient="true"
	 * @generated
	 */
	Object getMarker();

	/**
	 * Sets the value of the '{@link org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding#getMarker <em>Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marker</em>' attribute.
	 * @see #getMarker()
	 * @generated
	 */
	void setMarker(Object value);

} // SonarlintFinding
