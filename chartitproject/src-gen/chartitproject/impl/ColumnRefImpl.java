/**
 */
package chartitproject.impl;

import chartitproject.ChartitprojectPackage;
import chartitproject.Column;
import chartitproject.ColumnRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chartitproject.impl.ColumnRefImpl#getMakeRefTo <em>Make Ref To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnRefImpl extends MinimalEObjectImpl.Container implements ColumnRef {
	/**
	 * The cached value of the '{@link #getMakeRefTo() <em>Make Ref To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMakeRefTo()
	 * @generated
	 * @ordered
	 */
	protected Column makeRefTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartitprojectPackage.Literals.COLUMN_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getMakeRefTo() {
		if (makeRefTo != null && makeRefTo.eIsProxy()) {
			InternalEObject oldMakeRefTo = (InternalEObject) makeRefTo;
			makeRefTo = (Column) eResolveProxy(oldMakeRefTo);
			if (makeRefTo != oldMakeRefTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ChartitprojectPackage.COLUMN_REF__MAKE_REF_TO, oldMakeRefTo, makeRefTo));
			}
		}
		return makeRefTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetMakeRefTo() {
		return makeRefTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMakeRefTo(Column newMakeRefTo) {
		Column oldMakeRefTo = makeRefTo;
		makeRefTo = newMakeRefTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartitprojectPackage.COLUMN_REF__MAKE_REF_TO,
					oldMakeRefTo, makeRefTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ChartitprojectPackage.COLUMN_REF__MAKE_REF_TO:
			if (resolve)
				return getMakeRefTo();
			return basicGetMakeRefTo();
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
		case ChartitprojectPackage.COLUMN_REF__MAKE_REF_TO:
			setMakeRefTo((Column) newValue);
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
		case ChartitprojectPackage.COLUMN_REF__MAKE_REF_TO:
			setMakeRefTo((Column) null);
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
		case ChartitprojectPackage.COLUMN_REF__MAKE_REF_TO:
			return makeRefTo != null;
		}
		return super.eIsSet(featureID);
	}

} //ColumnRefImpl
