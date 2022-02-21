/**
 */
package org.tracesec.requirements;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reference Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.tracesec.requirements.RequirementsPackage#getReferenceType()
 * @model
 * @generated
 */
public enum ReferenceType implements Enumerator {
	/**
	 * The '<em><b>PRECONDITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	PRECONDITION(0, "PRECONDITION", "PRECONDITION"),

	/**
	 * The '<em><b>COMPLEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLEMENT(1, "COMPLEMENT", "COMPLEMENT"),

	/**
	 * The '<em><b>REFINEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFINEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	REFINEMENT(2, "REFINEMENT", "REFINEMENT"),

	/**
	 * The '<em><b>USAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USAGE_VALUE
	 * @generated
	 * @ordered
	 */
	USAGE(3, "USAGE", "USAGE");

	/**
	 * The '<em><b>PRECONDITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECONDITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRECONDITION_VALUE = 0;

	/**
	 * The '<em><b>COMPLEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLEMENT_VALUE = 1;

	/**
	 * The '<em><b>REFINEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFINEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFINEMENT_VALUE = 2;

	/**
	 * The '<em><b>USAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USAGE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Reference Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReferenceType[] VALUES_ARRAY = new ReferenceType[] { PRECONDITION, COMPLEMENT, REFINEMENT,
			USAGE, };

	/**
	 * A public read-only list of all the '<em><b>Reference Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReferenceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reference Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceType get(int value) {
		switch (value) {
		case PRECONDITION_VALUE:
			return PRECONDITION;
		case COMPLEMENT_VALUE:
			return COMPLEMENT;
		case REFINEMENT_VALUE:
			return REFINEMENT;
		case USAGE_VALUE:
			return USAGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ReferenceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ReferenceType
