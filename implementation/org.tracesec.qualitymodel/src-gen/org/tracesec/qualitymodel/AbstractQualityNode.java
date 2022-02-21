/**
 */
package org.tracesec.qualitymodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Quality Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.qualitymodel.AbstractQualityNode#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.tracesec.qualitymodel.AbstractQualityNode#getTitle <em>Title</em>}</li>
 *   <li>{@link org.tracesec.qualitymodel.AbstractQualityNode#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see org.tracesec.qualitymodel.QualityModelPackage#getAbstractQualityNode()
 * @model abstract="true"
 * @generated
 */
public interface AbstractQualityNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.tracesec.qualitymodel.QualityCategory#getOwnedNodes <em>Owned Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(QualityCategory)
	 * @see org.tracesec.qualitymodel.QualityModelPackage#getAbstractQualityNode_Owner()
	 * @see org.tracesec.qualitymodel.QualityCategory#getOwnedNodes
	 * @model opposite="ownedNodes" required="true" transient="true" derived="true"
	 * @generated
	 */
	QualityCategory getOwner();

	/**
	 * Sets the value of the '{@link org.tracesec.qualitymodel.AbstractQualityNode#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(QualityCategory value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.tracesec.qualitymodel.QualityModelPackage#getAbstractQualityNode_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.tracesec.qualitymodel.AbstractQualityNode#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.tracesec.qualitymodel.QualityModelPackage#getAbstractQualityNode_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.tracesec.qualitymodel.AbstractQualityNode#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

} // AbstractQualityNode
