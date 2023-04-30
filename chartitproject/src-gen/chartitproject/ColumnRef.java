/**
 */
package chartitproject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chartitproject.ColumnRef#getMakeRefTo <em>Make Ref To</em>}</li>
 * </ul>
 *
 * @see chartitproject.ChartitprojectPackage#getColumnRef()
 * @model
 * @generated
 */
public interface ColumnRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Make Ref To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Make Ref To</em>' reference.
	 * @see #setMakeRefTo(Column)
	 * @see chartitproject.ChartitprojectPackage#getColumnRef_MakeRefTo()
	 * @model required="true"
	 * @generated
	 */
	Column getMakeRefTo();

	/**
	 * Sets the value of the '{@link chartitproject.ColumnRef#getMakeRefTo <em>Make Ref To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Make Ref To</em>' reference.
	 * @see #getMakeRefTo()
	 * @generated
	 */
	void setMakeRefTo(Column value);

} // ColumnRef
