/**
 * generated by Xtext 2.25.0
 */
package org.tracesec.graph.dsl.graphConfiguration;

import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Weight</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.AttributeWeight#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.tracesec.graph.dsl.graphConfiguration.GraphConfigurationPackage#getAttributeWeight()
 * @model
 * @generated
 */
public interface AttributeWeight extends Weight
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(EAttribute)
   * @see org.tracesec.graph.dsl.graphConfiguration.GraphConfigurationPackage#getAttributeWeight_Value()
   * @model
   * @generated
   */
  EAttribute getValue();

  /**
   * Sets the value of the '{@link org.tracesec.graph.dsl.graphConfiguration.AttributeWeight#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(EAttribute value);

} // AttributeWeight