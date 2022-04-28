/**
 */
package org.gravity.hulk.sonarlint.sonarlint.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.swt.widgets.TreeItem;
import org.gravity.hulk.antipatterngraph.impl.HCodeSmellImpl;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintFinding;
import org.gravity.hulk.sonarlint.sonarlint.SonarlintPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gravity.hulk.sonarlint.sonarlint.impl.SonarlintFindingImpl#getRulekey <em>Rulekey</em>}</li>
 *   <li>{@link org.gravity.hulk.sonarlint.sonarlint.impl.SonarlintFindingImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.gravity.hulk.sonarlint.sonarlint.impl.SonarlintFindingImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.gravity.hulk.sonarlint.sonarlint.impl.SonarlintFindingImpl#getRulename <em>Rulename</em>}</li>
 *   <li>{@link org.gravity.hulk.sonarlint.sonarlint.impl.SonarlintFindingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.gravity.hulk.sonarlint.sonarlint.impl.SonarlintFindingImpl#getCreationdate <em>Creationdate</em>}</li>
 *   <li>{@link org.gravity.hulk.sonarlint.sonarlint.impl.SonarlintFindingImpl#getMarker <em>Marker</em>}</li>
 *   <li>{@link org.gravity.hulk.sonarlint.sonarlint.impl.SonarlintFindingImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.gravity.hulk.sonarlint.sonarlint.impl.SonarlintFindingImpl#getStartChar <em>Start Char</em>}</li>
 *   <li>{@link org.gravity.hulk.sonarlint.sonarlint.impl.SonarlintFindingImpl#getEndChar <em>End Char</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SonarlintFindingImpl extends HCodeSmellImpl implements SonarlintFinding {
	/**
	 * The default value of the '{@link #getRulekey() <em>Rulekey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulekey()
	 * @generated
	 * @ordered
	 */
	protected static final String RULEKEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRulekey() <em>Rulekey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulekey()
	 * @generated
	 * @ordered
	 */
	protected String rulekey = RULEKEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final String SEVERITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected String severity = SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRulename() <em>Rulename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulename()
	 * @generated
	 * @ordered
	 */
	protected static final String RULENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRulename() <em>Rulename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulename()
	 * @generated
	 * @ordered
	 */
	protected String rulename = RULENAME_EDEFAULT;

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
	 * The default value of the '{@link #getCreationdate() <em>Creationdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationdate()
	 * @generated
	 * @ordered
	 */
	protected static final long CREATIONDATE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCreationdate() <em>Creationdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationdate()
	 * @generated
	 * @ordered
	 */
	protected long creationdate = CREATIONDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarker() <em>Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarker()
	 * @generated
	 * @ordered
	 */
	protected static final Object MARKER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarker() <em>Marker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarker()
	 * @generated
	 * @ordered
	 */
	protected Object marker = MARKER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected int line = LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartChar() <em>Start Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartChar()
	 * @generated
	 * @ordered
	 */
	protected static final int START_CHAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartChar() <em>Start Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartChar()
	 * @generated
	 * @ordered
	 */
	protected int startChar = START_CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndChar() <em>End Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndChar()
	 * @generated
	 * @ordered
	 */
	protected static final int END_CHAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndChar() <em>End Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndChar()
	 * @generated
	 * @ordered
	 */
	protected int endChar = END_CHAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SonarlintFindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SonarlintPackage.Literals.SONARLINT_FINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRulekey() {
		return rulekey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRulekey(String newRulekey) {
		String oldRulekey = rulekey;
		rulekey = newRulekey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SonarlintPackage.SONARLINT_FINDING__RULEKEY, oldRulekey, rulekey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SonarlintPackage.SONARLINT_FINDING__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(String newSeverity) {
		String oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SonarlintPackage.SONARLINT_FINDING__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRulename() {
		return rulename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRulename(String newRulename) {
		String oldRulename = rulename;
		rulename = newRulename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SonarlintPackage.SONARLINT_FINDING__RULENAME, oldRulename, rulename));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SonarlintPackage.SONARLINT_FINDING__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCreationdate() {
		return creationdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationdate(long newCreationdate) {
		long oldCreationdate = creationdate;
		creationdate = newCreationdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SonarlintPackage.SONARLINT_FINDING__CREATIONDATE, oldCreationdate, creationdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getMarker() {
		return this.marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarker(Object newMarker) {
		Object oldMarker = marker;
		marker = newMarker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SonarlintPackage.SONARLINT_FINDING__MARKER, oldMarker, marker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine(int newLine) {
		int oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SonarlintPackage.SONARLINT_FINDING__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartChar() {
		return startChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartChar(int newStartChar) {
		int oldStartChar = startChar;
		startChar = newStartChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SonarlintPackage.SONARLINT_FINDING__START_CHAR, oldStartChar, startChar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEndChar() {
		return endChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndChar(int newEndChar) {
		int oldEndChar = endChar;
		endChar = newEndChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SonarlintPackage.SONARLINT_FINDING__END_CHAR, oldEndChar, endChar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SonarlintPackage.SONARLINT_FINDING__RULEKEY:
				return getRulekey();
			case SonarlintPackage.SONARLINT_FINDING__KIND:
				return getKind();
			case SonarlintPackage.SONARLINT_FINDING__SEVERITY:
				return getSeverity();
			case SonarlintPackage.SONARLINT_FINDING__RULENAME:
				return getRulename();
			case SonarlintPackage.SONARLINT_FINDING__DESCRIPTION:
				return getDescription();
			case SonarlintPackage.SONARLINT_FINDING__CREATIONDATE:
				return getCreationdate();
			case SonarlintPackage.SONARLINT_FINDING__MARKER:
				return getMarker();
			case SonarlintPackage.SONARLINT_FINDING__LINE:
				return getLine();
			case SonarlintPackage.SONARLINT_FINDING__START_CHAR:
				return getStartChar();
			case SonarlintPackage.SONARLINT_FINDING__END_CHAR:
				return getEndChar();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SonarlintPackage.SONARLINT_FINDING__RULEKEY:
				setRulekey((String)newValue);
				return;
			case SonarlintPackage.SONARLINT_FINDING__KIND:
				setKind((String)newValue);
				return;
			case SonarlintPackage.SONARLINT_FINDING__SEVERITY:
				setSeverity((String)newValue);
				return;
			case SonarlintPackage.SONARLINT_FINDING__RULENAME:
				setRulename((String)newValue);
				return;
			case SonarlintPackage.SONARLINT_FINDING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SonarlintPackage.SONARLINT_FINDING__CREATIONDATE:
				setCreationdate((Long)newValue);
				return;
			case SonarlintPackage.SONARLINT_FINDING__MARKER:
				setMarker(newValue);
				return;
			case SonarlintPackage.SONARLINT_FINDING__LINE:
				setLine((Integer)newValue);
				return;
			case SonarlintPackage.SONARLINT_FINDING__START_CHAR:
				setStartChar((Integer)newValue);
				return;
			case SonarlintPackage.SONARLINT_FINDING__END_CHAR:
				setEndChar((Integer)newValue);
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
			case SonarlintPackage.SONARLINT_FINDING__RULEKEY:
				setRulekey(RULEKEY_EDEFAULT);
				return;
			case SonarlintPackage.SONARLINT_FINDING__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case SonarlintPackage.SONARLINT_FINDING__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case SonarlintPackage.SONARLINT_FINDING__RULENAME:
				setRulename(RULENAME_EDEFAULT);
				return;
			case SonarlintPackage.SONARLINT_FINDING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SonarlintPackage.SONARLINT_FINDING__CREATIONDATE:
				setCreationdate(CREATIONDATE_EDEFAULT);
				return;
			case SonarlintPackage.SONARLINT_FINDING__MARKER:
				setMarker(MARKER_EDEFAULT);
				return;
			case SonarlintPackage.SONARLINT_FINDING__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case SonarlintPackage.SONARLINT_FINDING__START_CHAR:
				setStartChar(START_CHAR_EDEFAULT);
				return;
			case SonarlintPackage.SONARLINT_FINDING__END_CHAR:
				setEndChar(END_CHAR_EDEFAULT);
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
			case SonarlintPackage.SONARLINT_FINDING__RULEKEY:
				return RULEKEY_EDEFAULT == null ? rulekey != null : !RULEKEY_EDEFAULT.equals(rulekey);
			case SonarlintPackage.SONARLINT_FINDING__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case SonarlintPackage.SONARLINT_FINDING__SEVERITY:
				return SEVERITY_EDEFAULT == null ? severity != null : !SEVERITY_EDEFAULT.equals(severity);
			case SonarlintPackage.SONARLINT_FINDING__RULENAME:
				return RULENAME_EDEFAULT == null ? rulename != null : !RULENAME_EDEFAULT.equals(rulename);
			case SonarlintPackage.SONARLINT_FINDING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SonarlintPackage.SONARLINT_FINDING__CREATIONDATE:
				return creationdate != CREATIONDATE_EDEFAULT;
			case SonarlintPackage.SONARLINT_FINDING__MARKER:
				return MARKER_EDEFAULT == null ? marker != null : !MARKER_EDEFAULT.equals(marker);
			case SonarlintPackage.SONARLINT_FINDING__LINE:
				return line != LINE_EDEFAULT;
			case SonarlintPackage.SONARLINT_FINDING__START_CHAR:
				return startChar != START_CHAR_EDEFAULT;
			case SonarlintPackage.SONARLINT_FINDING__END_CHAR:
				return endChar != END_CHAR_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (rulekey: ");
		result.append(rulekey);
		result.append(", kind: ");
		result.append(kind);
		result.append(", severity: ");
		result.append(severity);
		result.append(", rulename: ");
		result.append(rulename);
		result.append(", description: ");
		result.append(description);
		result.append(", creationdate: ");
		result.append(creationdate);
		result.append(", marker: ");
		result.append(marker);
		result.append(", line: ");
		result.append(line);
		result.append(", startChar: ");
		result.append(startChar);
		result.append(", endChar: ");
		result.append(endChar);
		result.append(')');
		return result.toString();
	}

	@Override
	public TreeItem createItemContents(final TreeItem item, final int style) {
		final TreeItem treeItem = new TreeItem(item, style);
		treeItem.setText(getRulekey()+": "+ getRulename());
		return treeItem;
	}

} //SonarlintFindingImpl
