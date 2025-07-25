/**
 * generated by Xtext 2.34.0
 */
package org.tracesec.graph.dsl.graphConfiguration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.Configuration#getDefault <em>Default</em>}</li>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.Configuration#getConsider <em>Consider</em>}</li>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.Configuration#getNamespaces <em>Namespaces</em>}</li>
 * </ul>
 *
 * @see org.tracesec.graph.dsl.graphConfiguration.GraphConfigurationPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject
{
  /**
   * Returns the value of the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' attribute.
   * @see #setDefault(int)
   * @see org.tracesec.graph.dsl.graphConfiguration.GraphConfigurationPackage#getConfiguration_Default()
   * @model
   * @generated
   */
  int getDefault();

  /**
   * Sets the value of the '{@link org.tracesec.graph.dsl.graphConfiguration.Configuration#getDefault <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' attribute.
   * @see #getDefault()
   * @generated
   */
  void setDefault(int value);

  /**
   * Returns the value of the '<em><b>Consider</b></em>' attribute.
   * The literals are from the enumeration {@link org.tracesec.graph.dsl.graphConfiguration.Consider}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Consider</em>' attribute.
   * @see org.tracesec.graph.dsl.graphConfiguration.Consider
   * @see #setConsider(Consider)
   * @see org.tracesec.graph.dsl.graphConfiguration.GraphConfigurationPackage#getConfiguration_Consider()
   * @model
   * @generated
   */
  Consider getConsider();

  /**
   * Sets the value of the '{@link org.tracesec.graph.dsl.graphConfiguration.Configuration#getConsider <em>Consider</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Consider</em>' attribute.
   * @see org.tracesec.graph.dsl.graphConfiguration.Consider
   * @see #getConsider()
   * @generated
   */
  void setConsider(Consider value);

  /**
   * Returns the value of the '<em><b>Namespaces</b></em>' containment reference list.
   * The list contents are of type {@link org.tracesec.graph.dsl.graphConfiguration.Namespace}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespaces</em>' containment reference list.
   * @see org.tracesec.graph.dsl.graphConfiguration.GraphConfigurationPackage#getConfiguration_Namespaces()
   * @model containment="true"
   * @generated
   */
  EList<Namespace> getNamespaces();

} // Configuration
