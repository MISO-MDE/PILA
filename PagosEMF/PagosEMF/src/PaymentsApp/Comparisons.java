/**
 */
package PaymentsApp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Comparisons</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see PaymentsApp.PaymentsAppPackage#getComparisons()
 * @model
 * @generated
 */
public enum Comparisons implements Enumerator {
	/**
	 * The '<em><b>LESS THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN(0, "LESS_THAN", "LESS_THAN"),

	/**
	 * The '<em><b>LESS THAN OR EQUAL TO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_OR_EQUAL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN_OR_EQUAL_TO(1, "LESS_THAN_OR_EQUAL_TO", "LESS_THAN_OR_EQUAL_TO"),

	/**
	 * The '<em><b>EQUAL TO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL_TO(2, "EQUAL_TO", "EQUAL_TO"),

	/**
	 * The '<em><b>GREATER THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN(3, "GREATER_THAN", "GREATER_THAN"),

	/**
	 * The '<em><b>GREATER OR EQUAL TO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_OR_EQUAL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_OR_EQUAL_TO(4, "GREATER_OR_EQUAL_TO", "GREATER_OR_EQUAL_TO"),

	/**
	 * The '<em><b>OTHER THAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_THAN(5, "OTHER_THAN", "OTHER_THAN"),

	/**
	 * The '<em><b>NO COMPARISON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_COMPARISON_VALUE
	 * @generated
	 * @ordered
	 */
	NO_COMPARISON(6, "NO_COMPARISON", "NO_COMPARISON");

	/**
	 * The '<em><b>LESS THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LESS THAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_VALUE = 0;

	/**
	 * The '<em><b>LESS THAN OR EQUAL TO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LESS THAN OR EQUAL TO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_OR_EQUAL_TO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_OR_EQUAL_TO_VALUE = 1;

	/**
	 * The '<em><b>EQUAL TO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EQUAL TO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL_TO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_TO_VALUE = 2;

	/**
	 * The '<em><b>GREATER THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GREATER THAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_VALUE = 3;

	/**
	 * The '<em><b>GREATER OR EQUAL TO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GREATER OR EQUAL TO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER_OR_EQUAL_TO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_OR_EQUAL_TO_VALUE = 4;

	/**
	 * The '<em><b>OTHER THAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTHER THAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER_THAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_THAN_VALUE = 5;

	/**
	 * The '<em><b>NO COMPARISON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO COMPARISON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_COMPARISON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_COMPARISON_VALUE = 6;

	/**
	 * An array of all the '<em><b>Comparisons</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Comparisons[] VALUES_ARRAY =
		new Comparisons[] {
			LESS_THAN,
			LESS_THAN_OR_EQUAL_TO,
			EQUAL_TO,
			GREATER_THAN,
			GREATER_OR_EQUAL_TO,
			OTHER_THAN,
			NO_COMPARISON,
		};

	/**
	 * A public read-only list of all the '<em><b>Comparisons</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Comparisons> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Comparisons</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Comparisons get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Comparisons result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparisons</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Comparisons getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Comparisons result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparisons</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Comparisons get(int value) {
		switch (value) {
			case LESS_THAN_VALUE: return LESS_THAN;
			case LESS_THAN_OR_EQUAL_TO_VALUE: return LESS_THAN_OR_EQUAL_TO;
			case EQUAL_TO_VALUE: return EQUAL_TO;
			case GREATER_THAN_VALUE: return GREATER_THAN;
			case GREATER_OR_EQUAL_TO_VALUE: return GREATER_OR_EQUAL_TO;
			case OTHER_THAN_VALUE: return OTHER_THAN;
			case NO_COMPARISON_VALUE: return NO_COMPARISON;
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
	private Comparisons(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //Comparisons
