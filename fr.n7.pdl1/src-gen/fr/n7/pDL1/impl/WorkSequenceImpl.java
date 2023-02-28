/**
 * generated by Xtext 2.29.0
 */
package fr.n7.pDL1.impl;

import fr.n7.pDL1.PDL1Package;
import fr.n7.pDL1.WorkDefinition;
import fr.n7.pDL1.WorkSequence;
import fr.n7.pDL1.WorkSequenceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.pDL1.impl.WorkSequenceImpl#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link fr.n7.pDL1.impl.WorkSequenceImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link fr.n7.pDL1.impl.WorkSequenceImpl#getSuccessor <em>Successor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkSequenceImpl extends ProcessElementImpl implements WorkSequence
{
  /**
   * The default value of the '{@link #getLinkType() <em>Link Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkType()
   * @generated
   * @ordered
   */
  protected static final WorkSequenceType LINK_TYPE_EDEFAULT = WorkSequenceType.START2START;

  /**
   * The cached value of the '{@link #getLinkType() <em>Link Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkType()
   * @generated
   * @ordered
   */
  protected WorkSequenceType linkType = LINK_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredecessor()
   * @generated
   * @ordered
   */
  protected WorkDefinition predecessor;

  /**
   * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuccessor()
   * @generated
   * @ordered
   */
  protected WorkDefinition successor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkSequenceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PDL1Package.Literals.WORK_SEQUENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WorkSequenceType getLinkType()
  {
    return linkType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLinkType(WorkSequenceType newLinkType)
  {
    WorkSequenceType oldLinkType = linkType;
    linkType = newLinkType == null ? LINK_TYPE_EDEFAULT : newLinkType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDL1Package.WORK_SEQUENCE__LINK_TYPE, oldLinkType, linkType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WorkDefinition getPredecessor()
  {
    if (predecessor != null && predecessor.eIsProxy())
    {
      InternalEObject oldPredecessor = (InternalEObject)predecessor;
      predecessor = (WorkDefinition)eResolveProxy(oldPredecessor);
      if (predecessor != oldPredecessor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PDL1Package.WORK_SEQUENCE__PREDECESSOR, oldPredecessor, predecessor));
      }
    }
    return predecessor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkDefinition basicGetPredecessor()
  {
    return predecessor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPredecessor(WorkDefinition newPredecessor)
  {
    WorkDefinition oldPredecessor = predecessor;
    predecessor = newPredecessor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDL1Package.WORK_SEQUENCE__PREDECESSOR, oldPredecessor, predecessor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WorkDefinition getSuccessor()
  {
    if (successor != null && successor.eIsProxy())
    {
      InternalEObject oldSuccessor = (InternalEObject)successor;
      successor = (WorkDefinition)eResolveProxy(oldSuccessor);
      if (successor != oldSuccessor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PDL1Package.WORK_SEQUENCE__SUCCESSOR, oldSuccessor, successor));
      }
    }
    return successor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkDefinition basicGetSuccessor()
  {
    return successor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSuccessor(WorkDefinition newSuccessor)
  {
    WorkDefinition oldSuccessor = successor;
    successor = newSuccessor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDL1Package.WORK_SEQUENCE__SUCCESSOR, oldSuccessor, successor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PDL1Package.WORK_SEQUENCE__LINK_TYPE:
        return getLinkType();
      case PDL1Package.WORK_SEQUENCE__PREDECESSOR:
        if (resolve) return getPredecessor();
        return basicGetPredecessor();
      case PDL1Package.WORK_SEQUENCE__SUCCESSOR:
        if (resolve) return getSuccessor();
        return basicGetSuccessor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PDL1Package.WORK_SEQUENCE__LINK_TYPE:
        setLinkType((WorkSequenceType)newValue);
        return;
      case PDL1Package.WORK_SEQUENCE__PREDECESSOR:
        setPredecessor((WorkDefinition)newValue);
        return;
      case PDL1Package.WORK_SEQUENCE__SUCCESSOR:
        setSuccessor((WorkDefinition)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PDL1Package.WORK_SEQUENCE__LINK_TYPE:
        setLinkType(LINK_TYPE_EDEFAULT);
        return;
      case PDL1Package.WORK_SEQUENCE__PREDECESSOR:
        setPredecessor((WorkDefinition)null);
        return;
      case PDL1Package.WORK_SEQUENCE__SUCCESSOR:
        setSuccessor((WorkDefinition)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PDL1Package.WORK_SEQUENCE__LINK_TYPE:
        return linkType != LINK_TYPE_EDEFAULT;
      case PDL1Package.WORK_SEQUENCE__PREDECESSOR:
        return predecessor != null;
      case PDL1Package.WORK_SEQUENCE__SUCCESSOR:
        return successor != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (linkType: ");
    result.append(linkType);
    result.append(')');
    return result.toString();
  }

} //WorkSequenceImpl
