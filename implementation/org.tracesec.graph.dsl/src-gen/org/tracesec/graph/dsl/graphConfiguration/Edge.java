/**
 * generated by Xtext 2.25.0
 */
package org.tracesec.graph.dsl.graphConfiguration;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.Edge#getReference <em>Reference</em>}</li>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.Edge#getType <em>Type</em>}</li>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.Edge#getTarget <em>Target</em>}</li>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.Edge#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.Edge#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see org.tracesec.graph.dsl.graphConfiguration.GraphConfigurationPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(EReference)
   * @see org.tracesec.graph.dsl.graphConfiguration.GraphConfigurationPackage#getEdge_Reference()
   * @model
   * @generated
   */
  EReference getReference();

  /**
   * Sets the value of the '{@link org.tracesec.graph.dsl.graphConfiguration.Edge#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(EReference value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(EClass)
   * @see org.tracesec.graph.dsl.graphConfiguration.GraphConfigurationPackage#getEdge_Type()
   * @model
   * @generated
   */
  EClass getType();

  /**
   * Sets the value of the '{@link org.tracesec.graph.dsl.graphConfiguration.Edge#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(EClass value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(EReference)
   * @see org.tracesec.graph.dsl.graphConfiguration.GraphConfigurationPackage#getEdge_Target()
   * @model
   * @generated
   */
  EReference getTarget();

  /**
   * Sets the value of the '{@link org.tracesec.graph.dsl.graphConfiguration.Edge#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(EReference value);

  /**
   * Returns the value of the '<em><b>Direction</b></em>' attribute.
   * The literals are from the enumeration {@link org.tracesec.graph.dsl.graphConfiguration.Direction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' attribute.
   * @see org.tracesec.graph.dsl.graphConfiguration.Direction
   * @see #setDirection(Direction)
   * @see org.tracesec.graph.dsl.graphConfiguration.GraphConfigurationPackage#getEdge_Direction()
   * @model
   * @generated
   */
  Direction getDirection();

  /**
   * Sets the value of the '{@link org.tracesec.graph.dsl.graphConfiguration.Edge#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' attribute.
   * @see org.tracesec.graph.dsl.graphConfiguration.Direction
   * @see #getDirection()
   * @generated
   */
  void setDirection(Direction value);

  /**
   * Returns the value of the '<em><b>Weight</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight</em>' containment reference.
   * @see #setWeight(Weight)
   * @see org.tracesec.graph.dsl.graphConfiguration.GraphConfigurationPackage#getEdge_Weight()
   * @model containment="true"
   * @generated
   */
  Weight getWeight();

  /**
   * Sets the value of the '{@link org.tracesec.graph.dsl.graphConfiguration.Edge#getWeight <em>Weight</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight</em>' containment reference.
   * @see #getWeight()
   * @generated
   */
  void setWeight(Weight value);

} // Edge
