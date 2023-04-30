/**
 */
package chartitproject.impl;

import chartitproject.ChartitprojectPackage;
import chartitproject.ColumnRef;
import chartitproject.CompOperator;
import chartitproject.Condition;
import chartitproject.Constant;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chartitproject.impl.ConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link chartitproject.impl.ConditionImpl#getRightElement <em>Right Element</em>}</li>
 *   <li>{@link chartitproject.impl.ConditionImpl#getLeftElement <em>Left Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final CompOperator OPERATOR_EDEFAULT = CompOperator.EQUAL;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected CompOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRightElement() <em>Right Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightElement()
	 * @generated
	 * @ordered
	 */
	protected Constant rightElement;

	/**
	 * The cached value of the '{@link #getLeftElement() <em>Left Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftElement()
	 * @generated
	 * @ordered
	 */
	protected ColumnRef leftElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartitprojectPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(CompOperator newOperator) {
		CompOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartitprojectPackage.CONDITION__OPERATOR,
					oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant getRightElement() {
		return rightElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightElement(Constant newRightElement, NotificationChain msgs) {
		Constant oldRightElement = rightElement;
		rightElement = newRightElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ChartitprojectPackage.CONDITION__RIGHT_ELEMENT, oldRightElement, newRightElement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightElement(Constant newRightElement) {
		if (newRightElement != rightElement) {
			NotificationChain msgs = null;
			if (rightElement != null)
				msgs = ((InternalEObject) rightElement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ChartitprojectPackage.CONDITION__RIGHT_ELEMENT, null, msgs);
			if (newRightElement != null)
				msgs = ((InternalEObject) newRightElement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ChartitprojectPackage.CONDITION__RIGHT_ELEMENT, null, msgs);
			msgs = basicSetRightElement(newRightElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartitprojectPackage.CONDITION__RIGHT_ELEMENT,
					newRightElement, newRightElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnRef getLeftElement() {
		return leftElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftElement(ColumnRef newLeftElement, NotificationChain msgs) {
		ColumnRef oldLeftElement = leftElement;
		leftElement = newLeftElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ChartitprojectPackage.CONDITION__LEFT_ELEMENT, oldLeftElement, newLeftElement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftElement(ColumnRef newLeftElement) {
		if (newLeftElement != leftElement) {
			NotificationChain msgs = null;
			if (leftElement != null)
				msgs = ((InternalEObject) leftElement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ChartitprojectPackage.CONDITION__LEFT_ELEMENT, null, msgs);
			if (newLeftElement != null)
				msgs = ((InternalEObject) newLeftElement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ChartitprojectPackage.CONDITION__LEFT_ELEMENT, null, msgs);
			msgs = basicSetLeftElement(newLeftElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartitprojectPackage.CONDITION__LEFT_ELEMENT,
					newLeftElement, newLeftElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ChartitprojectPackage.CONDITION__RIGHT_ELEMENT:
			return basicSetRightElement(null, msgs);
		case ChartitprojectPackage.CONDITION__LEFT_ELEMENT:
			return basicSetLeftElement(null, msgs);
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
		case ChartitprojectPackage.CONDITION__OPERATOR:
			return getOperator();
		case ChartitprojectPackage.CONDITION__RIGHT_ELEMENT:
			return getRightElement();
		case ChartitprojectPackage.CONDITION__LEFT_ELEMENT:
			return getLeftElement();
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
		case ChartitprojectPackage.CONDITION__OPERATOR:
			setOperator((CompOperator) newValue);
			return;
		case ChartitprojectPackage.CONDITION__RIGHT_ELEMENT:
			setRightElement((Constant) newValue);
			return;
		case ChartitprojectPackage.CONDITION__LEFT_ELEMENT:
			setLeftElement((ColumnRef) newValue);
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
		case ChartitprojectPackage.CONDITION__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
			return;
		case ChartitprojectPackage.CONDITION__RIGHT_ELEMENT:
			setRightElement((Constant) null);
			return;
		case ChartitprojectPackage.CONDITION__LEFT_ELEMENT:
			setLeftElement((ColumnRef) null);
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
		case ChartitprojectPackage.CONDITION__OPERATOR:
			return operator != OPERATOR_EDEFAULT;
		case ChartitprojectPackage.CONDITION__RIGHT_ELEMENT:
			return rightElement != null;
		case ChartitprojectPackage.CONDITION__LEFT_ELEMENT:
			return leftElement != null;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
