/**
 * generated by Xtext 2.34.0
 */
package org.tracesec.graph.dsl.graphConfiguration.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.tracesec.graph.dsl.graphConfiguration.Direction;
import org.tracesec.graph.dsl.graphConfiguration.Edge;
import org.tracesec.graph.dsl.graphConfiguration.GraphConfigurationPackage;
import org.tracesec.graph.dsl.graphConfiguration.Weight;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.impl.EdgeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.impl.EdgeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.impl.EdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.impl.EdgeImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.impl.EdgeImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeImpl extends MinimalEObjectImpl.Container implements Edge
{
  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected EReference reference;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EClass type;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected EReference target;

  /**
   * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected static final Direction DIRECTION_EDEFAULT = Direction.FWD;

  /**
   * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirection()
   * @generated
   * @ordered
   */
  protected Direction direction = DIRECTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getWeight() <em>Weight</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected Weight weight;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EdgeImpl()
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
    return GraphConfigurationPackage.Literals.EDGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getReference()
  {
    if (reference != null && reference.eIsProxy())
    {
      InternalEObject oldReference = (InternalEObject)reference;
      reference = (EReference)eResolveProxy(oldReference);
      if (reference != oldReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphConfigurationPackage.EDGE__REFERENCE, oldReference, reference));
      }
    }
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference basicGetReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReference(EReference newReference)
  {
    EReference oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphConfigurationPackage.EDGE__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (EClass)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphConfigurationPackage.EDGE__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(EClass newType)
  {
    EClass oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphConfigurationPackage.EDGE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (EReference)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphConfigurationPackage.EDGE__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTarget(EReference newTarget)
  {
    EReference oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphConfigurationPackage.EDGE__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Direction getDirection()
  {
    return direction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDirection(Direction newDirection)
  {
    Direction oldDirection = direction;
    direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphConfigurationPackage.EDGE__DIRECTION, oldDirection, direction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Weight getWeight()
  {
    return weight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWeight(Weight newWeight, NotificationChain msgs)
  {
    Weight oldWeight = weight;
    weight = newWeight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphConfigurationPackage.EDGE__WEIGHT, oldWeight, newWeight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWeight(Weight newWeight)
  {
    if (newWeight != weight)
    {
      NotificationChain msgs = null;
      if (weight != null)
        msgs = ((InternalEObject)weight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphConfigurationPackage.EDGE__WEIGHT, null, msgs);
      if (newWeight != null)
        msgs = ((InternalEObject)newWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphConfigurationPackage.EDGE__WEIGHT, null, msgs);
      msgs = basicSetWeight(newWeight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphConfigurationPackage.EDGE__WEIGHT, newWeight, newWeight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GraphConfigurationPackage.EDGE__WEIGHT:
        return basicSetWeight(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GraphConfigurationPackage.EDGE__REFERENCE:
        if (resolve) return getReference();
        return basicGetReference();
      case GraphConfigurationPackage.EDGE__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case GraphConfigurationPackage.EDGE__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case GraphConfigurationPackage.EDGE__DIRECTION:
        return getDirection();
      case GraphConfigurationPackage.EDGE__WEIGHT:
        return getWeight();
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
      case GraphConfigurationPackage.EDGE__REFERENCE:
        setReference((EReference)newValue);
        return;
      case GraphConfigurationPackage.EDGE__TYPE:
        setType((EClass)newValue);
        return;
      case GraphConfigurationPackage.EDGE__TARGET:
        setTarget((EReference)newValue);
        return;
      case GraphConfigurationPackage.EDGE__DIRECTION:
        setDirection((Direction)newValue);
        return;
      case GraphConfigurationPackage.EDGE__WEIGHT:
        setWeight((Weight)newValue);
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
      case GraphConfigurationPackage.EDGE__REFERENCE:
        setReference((EReference)null);
        return;
      case GraphConfigurationPackage.EDGE__TYPE:
        setType((EClass)null);
        return;
      case GraphConfigurationPackage.EDGE__TARGET:
        setTarget((EReference)null);
        return;
      case GraphConfigurationPackage.EDGE__DIRECTION:
        setDirection(DIRECTION_EDEFAULT);
        return;
      case GraphConfigurationPackage.EDGE__WEIGHT:
        setWeight((Weight)null);
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
      case GraphConfigurationPackage.EDGE__REFERENCE:
        return reference != null;
      case GraphConfigurationPackage.EDGE__TYPE:
        return type != null;
      case GraphConfigurationPackage.EDGE__TARGET:
        return target != null;
      case GraphConfigurationPackage.EDGE__DIRECTION:
        return direction != DIRECTION_EDEFAULT;
      case GraphConfigurationPackage.EDGE__WEIGHT:
        return weight != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (direction: ");
    result.append(direction);
    result.append(')');
    return result.toString();
  }

} //EdgeImpl
