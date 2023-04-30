/**
 */
package chartitproject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chartitproject.DoubleVariable#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 *
 * @see chartitproject.ChartitprojectPackage#getDoubleVariable()
 * @model
 * @generated
 */
public interface DoubleVariable extends Constant {
	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(double)
	 * @see chartitproject.ChartitprojectPackage#getDoubleVariable_InitialValue()
	 * @model
	 * @generated
	 */
	double getInitialValue();

	/**
	 * Sets the value of the '{@link chartitproject.DoubleVariable#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(double value);

} // DoubleVariable
