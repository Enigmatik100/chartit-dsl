/**
 */
package chartitproject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Chart Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see chartitproject.ChartitprojectPackage#getChartType()
 * @model
 * @generated
 */
public enum ChartType implements Enumerator {
	/**
	 * The '<em><b>BAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAR_VALUE
	 * @generated
	 * @ordered
	 */
	BAR(0, "BAR", "BAR"),

	/**
	 * The '<em><b>PIE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIE_VALUE
	 * @generated
	 * @ordered
	 */
	PIE(1, "PIE", "PIE"),

	/**
	 * The '<em><b>SCATTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCATTER_VALUE
	 * @generated
	 * @ordered
	 */
	SCATTER(2, "SCATTER", "SCATTER"),

	/**
	 * The '<em><b>LINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_VALUE
	 * @generated
	 * @ordered
	 */
	LINE(3, "LINE", "LINE"),

	/**
	 * The '<em><b>MIXED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXED_VALUE
	 * @generated
	 * @ordered
	 */
	MIXED(4, "MIXED", "MIXED"),

	/**
	 * The '<em><b>BUBBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUBBLE_VALUE
	 * @generated
	 * @ordered
	 */
	BUBBLE(5, "BUBBLE", "BUBBLE"),

	/**
	 * The '<em><b>RADAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADAR_VALUE
	 * @generated
	 * @ordered
	 */
	RADAR(6, "RADAR", "RADAR"),

	/**
	 * The '<em><b>AREA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AREA_VALUE
	 * @generated
	 * @ordered
	 */
	AREA(7, "AREA", "AREA"),

	/**
	 * The '<em><b>DONUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DONUT_VALUE
	 * @generated
	 * @ordered
	 */
	DONUT(8, "DONUT", "DONUT");

	/**
	 * The '<em><b>BAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAR_VALUE = 0;

	/**
	 * The '<em><b>PIE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PIE_VALUE = 1;

	/**
	 * The '<em><b>SCATTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCATTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCATTER_VALUE = 2;

	/**
	 * The '<em><b>LINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINE_VALUE = 3;

	/**
	 * The '<em><b>MIXED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIXED_VALUE = 4;

	/**
	 * The '<em><b>BUBBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUBBLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUBBLE_VALUE = 5;

	/**
	 * The '<em><b>RADAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RADAR_VALUE = 6;

	/**
	 * The '<em><b>AREA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AREA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AREA_VALUE = 7;

	/**
	 * The '<em><b>DONUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DONUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DONUT_VALUE = 8;

	/**
	 * An array of all the '<em><b>Chart Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChartType[] VALUES_ARRAY = new ChartType[] { BAR, PIE, SCATTER, LINE, MIXED, BUBBLE, RADAR,
			AREA, DONUT, };

	/**
	 * A public read-only list of all the '<em><b>Chart Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChartType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Chart Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChartType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChartType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Chart Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChartType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChartType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Chart Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChartType get(int value) {
		switch (value) {
		case BAR_VALUE:
			return BAR;
		case PIE_VALUE:
			return PIE;
		case SCATTER_VALUE:
			return SCATTER;
		case LINE_VALUE:
			return LINE;
		case MIXED_VALUE:
			return MIXED;
		case BUBBLE_VALUE:
			return BUBBLE;
		case RADAR_VALUE:
			return RADAR;
		case AREA_VALUE:
			return AREA;
		case DONUT_VALUE:
			return DONUT;
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
	private ChartType(int value, String name, String literal) {
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

} //ChartType
