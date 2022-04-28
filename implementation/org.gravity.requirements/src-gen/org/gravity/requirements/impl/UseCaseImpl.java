/**
 */
package org.gravity.requirements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gravity.requirements.AlternativeFlow;
import org.gravity.requirements.LoggingRequirement;
import org.gravity.requirements.MainFlow;
import org.gravity.requirements.PreConditon;
import org.gravity.requirements.RequirementsModel;
import org.gravity.requirements.RequirementsPackage;
import org.gravity.requirements.SubFlow;
import org.gravity.requirements.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.requirements.impl.UseCaseImpl#isSupportet <em>Supportet</em>}</li>
 *   <li>{@link org.gravity.requirements.impl.UseCaseImpl#getPreconditons <em>Preconditons</em>}</li>
 *   <li>{@link org.gravity.requirements.impl.UseCaseImpl#getMainflows <em>Mainflows</em>}</li>
 *   <li>{@link org.gravity.requirements.impl.UseCaseImpl#getSubflows <em>Subflows</em>}</li>
 *   <li>{@link org.gravity.requirements.impl.UseCaseImpl#getAlternativeflows <em>Alternativeflows</em>}</li>
 *   <li>{@link org.gravity.requirements.impl.UseCaseImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.gravity.requirements.impl.UseCaseImpl#getLoggingRequirements <em>Logging Requirements</em>}</li>
 *   <li>{@link org.gravity.requirements.impl.UseCaseImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseImpl extends IdentifyableObjectImpl implements UseCase {
	/**
	 * The default value of the '{@link #isSupportet() <em>Supportet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUPPORTET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSupportet() <em>Supportet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSupportet()
	 * @generated
	 * @ordered
	 */
	protected boolean supportet = SUPPORTET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreconditons() <em>Preconditons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditons()
	 * @generated
	 * @ordered
	 */
	protected EList<PreConditon> preconditons;

	/**
	 * The cached value of the '{@link #getMainflows() <em>Mainflows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainflows()
	 * @generated
	 * @ordered
	 */
	protected EList<MainFlow> mainflows;

	/**
	 * The cached value of the '{@link #getSubflows() <em>Subflows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubflows()
	 * @generated
	 * @ordered
	 */
	protected EList<SubFlow> subflows;

	/**
	 * The cached value of the '{@link #getAlternativeflows() <em>Alternativeflows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeflows()
	 * @generated
	 * @ordered
	 */
	protected EList<AlternativeFlow> alternativeflows;

	/**
	 * The cached value of the '{@link #getLoggingRequirements() <em>Logging Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggingRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<LoggingRequirement> loggingRequirements;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSupportet() {
		return supportet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportet(boolean newSupportet) {
		boolean oldSupportet = supportet;
		supportet = newSupportet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.USE_CASE__SUPPORTET, oldSupportet,
					supportet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PreConditon> getPreconditons() {
		if (preconditons == null) {
			preconditons = new EObjectContainmentEList<PreConditon>(PreConditon.class, this,
					RequirementsPackage.USE_CASE__PRECONDITONS);
		}
		return preconditons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MainFlow> getMainflows() {
		if (mainflows == null) {
			mainflows = new EObjectContainmentEList<MainFlow>(MainFlow.class, this,
					RequirementsPackage.USE_CASE__MAINFLOWS);
		}
		return mainflows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubFlow> getSubflows() {
		if (subflows == null) {
			subflows = new EObjectContainmentEList<SubFlow>(SubFlow.class, this,
					RequirementsPackage.USE_CASE__SUBFLOWS);
		}
		return subflows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AlternativeFlow> getAlternativeflows() {
		if (alternativeflows == null) {
			alternativeflows = new EObjectContainmentEList<AlternativeFlow>(AlternativeFlow.class, this,
					RequirementsPackage.USE_CASE__ALTERNATIVEFLOWS);
		}
		return alternativeflows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementsModel getModel() {
		if (eContainerFeatureID() != RequirementsPackage.USE_CASE__MODEL)
			return null;
		return (RequirementsModel) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(RequirementsModel newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newModel, RequirementsPackage.USE_CASE__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(RequirementsModel newModel) {
		if (newModel != eInternalContainer()
				|| (eContainerFeatureID() != RequirementsPackage.USE_CASE__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject) newModel).eInverseAdd(this, RequirementsPackage.REQUIREMENTS_MODEL__USECASES,
						RequirementsModel.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.USE_CASE__MODEL, newModel,
					newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoggingRequirement> getLoggingRequirements() {
		if (loggingRequirements == null) {
			loggingRequirements = new EObjectContainmentEList<LoggingRequirement>(LoggingRequirement.class, this,
					RequirementsPackage.USE_CASE__LOGGING_REQUIREMENTS);
		}
		return loggingRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.USE_CASE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RequirementsPackage.USE_CASE__MODEL:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetModel((RequirementsModel) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RequirementsPackage.USE_CASE__PRECONDITONS:
			return ((InternalEList<?>) getPreconditons()).basicRemove(otherEnd, msgs);
		case RequirementsPackage.USE_CASE__MAINFLOWS:
			return ((InternalEList<?>) getMainflows()).basicRemove(otherEnd, msgs);
		case RequirementsPackage.USE_CASE__SUBFLOWS:
			return ((InternalEList<?>) getSubflows()).basicRemove(otherEnd, msgs);
		case RequirementsPackage.USE_CASE__ALTERNATIVEFLOWS:
			return ((InternalEList<?>) getAlternativeflows()).basicRemove(otherEnd, msgs);
		case RequirementsPackage.USE_CASE__MODEL:
			return basicSetModel(null, msgs);
		case RequirementsPackage.USE_CASE__LOGGING_REQUIREMENTS:
			return ((InternalEList<?>) getLoggingRequirements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case RequirementsPackage.USE_CASE__MODEL:
			return eInternalContainer().eInverseRemove(this, RequirementsPackage.REQUIREMENTS_MODEL__USECASES,
					RequirementsModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RequirementsPackage.USE_CASE__SUPPORTET:
			return isSupportet();
		case RequirementsPackage.USE_CASE__PRECONDITONS:
			return getPreconditons();
		case RequirementsPackage.USE_CASE__MAINFLOWS:
			return getMainflows();
		case RequirementsPackage.USE_CASE__SUBFLOWS:
			return getSubflows();
		case RequirementsPackage.USE_CASE__ALTERNATIVEFLOWS:
			return getAlternativeflows();
		case RequirementsPackage.USE_CASE__MODEL:
			return getModel();
		case RequirementsPackage.USE_CASE__LOGGING_REQUIREMENTS:
			return getLoggingRequirements();
		case RequirementsPackage.USE_CASE__DESCRIPTION:
			return getDescription();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RequirementsPackage.USE_CASE__SUPPORTET:
			setSupportet((Boolean) newValue);
			return;
		case RequirementsPackage.USE_CASE__PRECONDITONS:
			getPreconditons().clear();
			getPreconditons().addAll((Collection<? extends PreConditon>) newValue);
			return;
		case RequirementsPackage.USE_CASE__MAINFLOWS:
			getMainflows().clear();
			getMainflows().addAll((Collection<? extends MainFlow>) newValue);
			return;
		case RequirementsPackage.USE_CASE__SUBFLOWS:
			getSubflows().clear();
			getSubflows().addAll((Collection<? extends SubFlow>) newValue);
			return;
		case RequirementsPackage.USE_CASE__ALTERNATIVEFLOWS:
			getAlternativeflows().clear();
			getAlternativeflows().addAll((Collection<? extends AlternativeFlow>) newValue);
			return;
		case RequirementsPackage.USE_CASE__MODEL:
			setModel((RequirementsModel) newValue);
			return;
		case RequirementsPackage.USE_CASE__LOGGING_REQUIREMENTS:
			getLoggingRequirements().clear();
			getLoggingRequirements().addAll((Collection<? extends LoggingRequirement>) newValue);
			return;
		case RequirementsPackage.USE_CASE__DESCRIPTION:
			setDescription((String) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case RequirementsPackage.USE_CASE__SUPPORTET:
			setSupportet(SUPPORTET_EDEFAULT);
			return;
		case RequirementsPackage.USE_CASE__PRECONDITONS:
			getPreconditons().clear();
			return;
		case RequirementsPackage.USE_CASE__MAINFLOWS:
			getMainflows().clear();
			return;
		case RequirementsPackage.USE_CASE__SUBFLOWS:
			getSubflows().clear();
			return;
		case RequirementsPackage.USE_CASE__ALTERNATIVEFLOWS:
			getAlternativeflows().clear();
			return;
		case RequirementsPackage.USE_CASE__MODEL:
			setModel((RequirementsModel) null);
			return;
		case RequirementsPackage.USE_CASE__LOGGING_REQUIREMENTS:
			getLoggingRequirements().clear();
			return;
		case RequirementsPackage.USE_CASE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RequirementsPackage.USE_CASE__SUPPORTET:
			return supportet != SUPPORTET_EDEFAULT;
		case RequirementsPackage.USE_CASE__PRECONDITONS:
			return preconditons != null && !preconditons.isEmpty();
		case RequirementsPackage.USE_CASE__MAINFLOWS:
			return mainflows != null && !mainflows.isEmpty();
		case RequirementsPackage.USE_CASE__SUBFLOWS:
			return subflows != null && !subflows.isEmpty();
		case RequirementsPackage.USE_CASE__ALTERNATIVEFLOWS:
			return alternativeflows != null && !alternativeflows.isEmpty();
		case RequirementsPackage.USE_CASE__MODEL:
			return getModel() != null;
		case RequirementsPackage.USE_CASE__LOGGING_REQUIREMENTS:
			return loggingRequirements != null && !loggingRequirements.isEmpty();
		case RequirementsPackage.USE_CASE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (supportet: ");
		result.append(supportet);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //UseCaseImpl
