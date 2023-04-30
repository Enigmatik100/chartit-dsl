/**
 */
package chartitproject.impl;

import chartitproject.Chart;
import chartitproject.ChartType;
import chartitproject.ChartitprojectPackage;
import chartitproject.ColumnRef;
import chartitproject.Condition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chartitproject.impl.ChartImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link chartitproject.impl.ChartImpl#getType <em>Type</em>}</li>
 *   <li>{@link chartitproject.impl.ChartImpl#getXVariable <em>XVariable</em>}</li>
 *   <li>{@link chartitproject.impl.ChartImpl#getYVariable <em>YVariable</em>}</li>
 *   <li>{@link chartitproject.impl.ChartImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChartImpl extends MinimalEObjectImpl.Container implements Chart {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ChartType TYPE_EDEFAULT = ChartType.BAR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ChartType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXVariable() <em>XVariable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnRef> xVariable;

	/**
	 * The cached value of the '{@link #getYVariable() <em>YVariable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnRef> yVariable;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> filter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartitprojectPackage.Literals.CHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartitprojectPackage.CHART__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ChartType newType) {
		ChartType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartitprojectPackage.CHART__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnRef> getXVariable() {
		if (xVariable == null) {
			xVariable = new EObjectContainmentEList<ColumnRef>(ColumnRef.class, this,
					ChartitprojectPackage.CHART__XVARIABLE);
		}
		return xVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnRef> getYVariable() {
		if (yVariable == null) {
			yVariable = new EObjectContainmentEList<ColumnRef>(ColumnRef.class, this,
					ChartitprojectPackage.CHART__YVARIABLE);
		}
		return yVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList<Condition>(Condition.class, this, ChartitprojectPackage.CHART__FILTER);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ChartitprojectPackage.CHART__XVARIABLE:
			return ((InternalEList<?>) getXVariable()).basicRemove(otherEnd, msgs);
		case ChartitprojectPackage.CHART__YVARIABLE:
			return ((InternalEList<?>) getYVariable()).basicRemove(otherEnd, msgs);
		case ChartitprojectPackage.CHART__FILTER:
			return ((InternalEList<?>) getFilter()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ChartitprojectPackage.CHART__TITLE:
			return getTitle();
		case ChartitprojectPackage.CHART__TYPE:
			return getType();
		case ChartitprojectPackage.CHART__XVARIABLE:
			return getXVariable();
		case ChartitprojectPackage.CHART__YVARIABLE:
			return getYVariable();
		case ChartitprojectPackage.CHART__FILTER:
			return getFilter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ChartitprojectPackage.CHART__TITLE:
			setTitle((String) newValue);
			return;
		case ChartitprojectPackage.CHART__TYPE:
			setType((ChartType) newValue);
			return;
		case ChartitprojectPackage.CHART__XVARIABLE:
			getXVariable().clear();
			getXVariable().addAll((Collection<? extends ColumnRef>) newValue);
			return;
		case ChartitprojectPackage.CHART__YVARIABLE:
			getYVariable().clear();
			getYVariable().addAll((Collection<? extends ColumnRef>) newValue);
			return;
		case ChartitprojectPackage.CHART__FILTER:
			getFilter().clear();
			getFilter().addAll((Collection<? extends Condition>) newValue);
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
		case ChartitprojectPackage.CHART__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case ChartitprojectPackage.CHART__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ChartitprojectPackage.CHART__XVARIABLE:
			getXVariable().clear();
			return;
		case ChartitprojectPackage.CHART__YVARIABLE:
			getYVariable().clear();
			return;
		case ChartitprojectPackage.CHART__FILTER:
			getFilter().clear();
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
		case ChartitprojectPackage.CHART__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case ChartitprojectPackage.CHART__TYPE:
			return type != TYPE_EDEFAULT;
		case ChartitprojectPackage.CHART__XVARIABLE:
			return xVariable != null && !xVariable.isEmpty();
		case ChartitprojectPackage.CHART__YVARIABLE:
			return yVariable != null && !yVariable.isEmpty();
		case ChartitprojectPackage.CHART__FILTER:
			return filter != null && !filter.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ChartImpl
