/**
 */
package chartitproject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chartitproject.Chart#getTitle <em>Title</em>}</li>
 *   <li>{@link chartitproject.Chart#getType <em>Type</em>}</li>
 *   <li>{@link chartitproject.Chart#getXVariable <em>XVariable</em>}</li>
 *   <li>{@link chartitproject.Chart#getYVariable <em>YVariable</em>}</li>
 *   <li>{@link chartitproject.Chart#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see chartitproject.ChartitprojectPackage#getChart()
 * @model
 * @generated
 */
public interface Chart extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see chartitproject.ChartitprojectPackage#getChart_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link chartitproject.Chart#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link chartitproject.ChartType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see chartitproject.ChartType
	 * @see #setType(ChartType)
	 * @see chartitproject.ChartitprojectPackage#getChart_Type()
	 * @model
	 * @generated
	 */
	ChartType getType();

	/**
	 * Sets the value of the '{@link chartitproject.Chart#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see chartitproject.ChartType
	 * @see #getType()
	 * @generated
	 */
	void setType(ChartType value);

	/**
	 * Returns the value of the '<em><b>XVariable</b></em>' containment reference list.
	 * The list contents are of type {@link chartitproject.ColumnRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XVariable</em>' containment reference list.
	 * @see chartitproject.ChartitprojectPackage#getChart_XVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnRef> getXVariable();

	/**
	 * Returns the value of the '<em><b>YVariable</b></em>' containment reference list.
	 * The list contents are of type {@link chartitproject.ColumnRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YVariable</em>' containment reference list.
	 * @see chartitproject.ChartitprojectPackage#getChart_YVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<ColumnRef> getYVariable();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link chartitproject.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see chartitproject.ChartitprojectPackage#getChart_Filter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getFilter();

} // Chart
