/**
 * generated by Xtext 2.25.0
 */
package org.tracesec.graph.dsl.graphConfiguration.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tracesec.graph.dsl.graphConfiguration.AttributeWeight;
import org.tracesec.graph.dsl.graphConfiguration.GraphConfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Weight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.impl.AttributeWeightImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeWeightImpl extends WeightImpl implements AttributeWeight
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EAttribute value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeWeightImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GraphConfigurationPackage.Literals.ATTRIBUTE_WEIGHT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getValue()
  {
    if (value != null && value.eIsProxy())
    {
      InternalEObject oldValue = (InternalEObject)value;
      value = (EAttribute)eResolveProxy(oldValue);
      if (value != oldValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphConfigurationPackage.ATTRIBUTE_WEIGHT__VALUE, oldValue, value));
      }
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute basicGetValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(EAttribute newValue)
  {
    EAttribute oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphConfigurationPackage.ATTRIBUTE_WEIGHT__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GraphConfigurationPackage.ATTRIBUTE_WEIGHT__VALUE:
        if (resolve) return getValue();
        return basicGetValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GraphConfigurationPackage.ATTRIBUTE_WEIGHT__VALUE:
        setValue((EAttribute)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GraphConfigurationPackage.ATTRIBUTE_WEIGHT__VALUE:
        setValue((EAttribute)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GraphConfigurationPackage.ATTRIBUTE_WEIGHT__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //AttributeWeightImpl
