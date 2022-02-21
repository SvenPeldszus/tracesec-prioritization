/**
 * generated by Xtext 2.25.0
 */
package org.tracesec.graph.dsl.graphConfiguration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tracesec.graph.dsl.graphConfiguration.Consider;
import org.tracesec.graph.dsl.graphConfiguration.GraphConfigurationPackage;
import org.tracesec.graph.dsl.graphConfiguration.Namespace;
import org.tracesec.graph.dsl.graphConfiguration.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.impl.NamespaceImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.impl.NamespaceImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.impl.NamespaceImpl#getConsider <em>Consider</em>}</li>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.impl.NamespaceImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.tracesec.graph.dsl.graphConfiguration.impl.NamespaceImpl#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamespaceImpl extends MinimalEObjectImpl.Container implements Namespace
{
  /**
   * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected String package_ = PACKAGE_EDEFAULT;

  /**
   * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected static final int DEFAULT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected int default_ = DEFAULT_EDEFAULT;

  /**
   * The default value of the '{@link #getConsider() <em>Consider</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsider()
   * @generated
   * @ordered
   */
  protected static final Consider CONSIDER_EDEFAULT = Consider.ALL;

  /**
   * The cached value of the '{@link #getConsider() <em>Consider</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsider()
   * @generated
   * @ordered
   */
  protected Consider consider = CONSIDER_EDEFAULT;

  /**
   * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInclude()
   * @generated
   * @ordered
   */
  protected EList<Type> include;

  /**
   * The cached value of the '{@link #getExclude() <em>Exclude</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclude()
   * @generated
   * @ordered
   */
  protected EList<EClass> exclude;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamespaceImpl()
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
    return GraphConfigurationPackage.Literals.NAMESPACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPackage(String newPackage)
  {
    String oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphConfigurationPackage.NAMESPACE__PACKAGE, oldPackage, package_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDefault(int newDefault)
  {
    int oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphConfigurationPackage.NAMESPACE__DEFAULT, oldDefault, default_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Consider getConsider()
  {
    return consider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConsider(Consider newConsider)
  {
    Consider oldConsider = consider;
    consider = newConsider == null ? CONSIDER_EDEFAULT : newConsider;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GraphConfigurationPackage.NAMESPACE__CONSIDER, oldConsider, consider));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Type> getInclude()
  {
    if (include == null)
    {
      include = new EObjectContainmentEList<Type>(Type.class, this, GraphConfigurationPackage.NAMESPACE__INCLUDE);
    }
    return include;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EClass> getExclude()
  {
    if (exclude == null)
    {
      exclude = new EObjectResolvingEList<EClass>(EClass.class, this, GraphConfigurationPackage.NAMESPACE__EXCLUDE);
    }
    return exclude;
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
      case GraphConfigurationPackage.NAMESPACE__INCLUDE:
        return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
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
      case GraphConfigurationPackage.NAMESPACE__PACKAGE:
        return getPackage();
      case GraphConfigurationPackage.NAMESPACE__DEFAULT:
        return getDefault();
      case GraphConfigurationPackage.NAMESPACE__CONSIDER:
        return getConsider();
      case GraphConfigurationPackage.NAMESPACE__INCLUDE:
        return getInclude();
      case GraphConfigurationPackage.NAMESPACE__EXCLUDE:
        return getExclude();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GraphConfigurationPackage.NAMESPACE__PACKAGE:
        setPackage((String)newValue);
        return;
      case GraphConfigurationPackage.NAMESPACE__DEFAULT:
        setDefault((Integer)newValue);
        return;
      case GraphConfigurationPackage.NAMESPACE__CONSIDER:
        setConsider((Consider)newValue);
        return;
      case GraphConfigurationPackage.NAMESPACE__INCLUDE:
        getInclude().clear();
        getInclude().addAll((Collection<? extends Type>)newValue);
        return;
      case GraphConfigurationPackage.NAMESPACE__EXCLUDE:
        getExclude().clear();
        getExclude().addAll((Collection<? extends EClass>)newValue);
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
      case GraphConfigurationPackage.NAMESPACE__PACKAGE:
        setPackage(PACKAGE_EDEFAULT);
        return;
      case GraphConfigurationPackage.NAMESPACE__DEFAULT:
        setDefault(DEFAULT_EDEFAULT);
        return;
      case GraphConfigurationPackage.NAMESPACE__CONSIDER:
        setConsider(CONSIDER_EDEFAULT);
        return;
      case GraphConfigurationPackage.NAMESPACE__INCLUDE:
        getInclude().clear();
        return;
      case GraphConfigurationPackage.NAMESPACE__EXCLUDE:
        getExclude().clear();
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
      case GraphConfigurationPackage.NAMESPACE__PACKAGE:
        return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
      case GraphConfigurationPackage.NAMESPACE__DEFAULT:
        return default_ != DEFAULT_EDEFAULT;
      case GraphConfigurationPackage.NAMESPACE__CONSIDER:
        return consider != CONSIDER_EDEFAULT;
      case GraphConfigurationPackage.NAMESPACE__INCLUDE:
        return include != null && !include.isEmpty();
      case GraphConfigurationPackage.NAMESPACE__EXCLUDE:
        return exclude != null && !exclude.isEmpty();
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
    result.append(" (package: ");
    result.append(package_);
    result.append(", default: ");
    result.append(default_);
    result.append(", consider: ");
    result.append(consider);
    result.append(')');
    return result.toString();
  }

} //NamespaceImpl
