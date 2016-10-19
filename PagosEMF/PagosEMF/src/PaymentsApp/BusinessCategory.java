/**
 */
package PaymentsApp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Business Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see PaymentsApp.PaymentsAppPackage#getBusinessCategory()
 * @model
 * @generated
 */
public enum BusinessCategory implements Enumerator {
	/**
	 * The '<em><b>CATEGORY 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATEGORY_1_VALUE
	 * @generated
	 * @ordered
	 */
	CATEGORY_1(0, "CATEGORY_1", "CATEGORY_1"),

	/**
	 * The '<em><b>CATEGORY 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATEGORY_2_VALUE
	 * @generated
	 * @ordered
	 */
	CATEGORY_2(1, "CATEGORY_2", "CATEGORY_2");

	/**
	 * The '<em><b>CATEGORY 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CATEGORY 1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CATEGORY_1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CATEGORY_1_VALUE = 0;

	/**
	 * The '<em><b>CATEGORY 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CATEGORY 2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CATEGORY_2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CATEGORY_2_VALUE = 1;

	/**
	 * An array of all the '<em><b>Business Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BusinessCategory[] VALUES_ARRAY =
		new BusinessCategory[] {
			CATEGORY_1,
			CATEGORY_2,
		};

	/**
	 * A public read-only list of all the '<em><b>Business Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BusinessCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Business Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BusinessCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BusinessCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Business Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BusinessCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BusinessCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Business Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BusinessCategory get(int value) {
		switch (value) {
			case CATEGORY_1_VALUE: return CATEGORY_1;
			case CATEGORY_2_VALUE: return CATEGORY_2;
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
	private BusinessCategory(int value, String name, String literal) {
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
	
} //BusinessCategory
