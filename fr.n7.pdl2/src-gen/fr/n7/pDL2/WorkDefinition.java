/**
 * generated by Xtext 2.29.0
 */
package fr.n7.pDL2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.pDL2.WorkDefinition#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.pDL2.WorkDefinition#getLinksToPredecessors <em>Links To Predecessors</em>}</li>
 * </ul>
 *
 * @see fr.n7.pDL2.PDL2Package#getWorkDefinition()
 * @model
 * @generated
 */
public interface WorkDefinition extends ProcessElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.n7.pDL2.PDL2Package#getWorkDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.n7.pDL2.WorkDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Links To Predecessors</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links To Predecessors</em>' containment reference list.
   * @see fr.n7.pDL2.PDL2Package#getWorkDefinition_LinksToPredecessors()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getLinksToPredecessors();

} // WorkDefinition
