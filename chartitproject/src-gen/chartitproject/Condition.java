/**
 */
package chartitproject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chartitproject.Condition#getOperator <em>Operator</em>}</li>
 *   <li>{@link chartitproject.Condition#getRightElement <em>Right Element</em>}</li>
 *   <li>{@link chartitproject.Condition#getLeftElement <em>Left Element</em>}</li>
 * </ul>
 *
 * @see chartitproject.ChartitprojectPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link chartitproject.CompOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see chartitproject.CompOperator
	 * @see #setOperator(CompOperator)
	 * @see chartitproject.ChartitprojectPackage#getCondition_Operator()
	 * @model
	 * @generated
	 */
	CompOperator getOperator();

	/**
	 * Sets the value of the '{@link chartitproject.Condition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see chartitproject.CompOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(CompOperator value);

	/**
	 * Returns the value of the '<em><b>Right Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Element</em>' containment reference.
	 * @see #setRightElement(Constant)
	 * @see chartitproject.ChartitprojectPackage#getCondition_RightElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Constant getRightElement();

	/**
	 * Sets the value of the '{@link chartitproject.Condition#getRightElement <em>Right Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Element</em>' containment reference.
	 * @see #getRightElement()
	 * @generated
	 */
	void setRightElement(Constant value);

	/**
	 * Returns the value of the '<em><b>Left Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Element</em>' containment reference.
	 * @see #setLeftElement(ColumnRef)
	 * @see chartitproject.ChartitprojectPackage#getCondition_LeftElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ColumnRef getLeftElement();

	/**
	 * Sets the value of the '{@link chartitproject.Condition#getLeftElement <em>Left Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Element</em>' containment reference.
	 * @see #getLeftElement()
	 * @generated
	 */
	void setLeftElement(ColumnRef value);

} // Condition
