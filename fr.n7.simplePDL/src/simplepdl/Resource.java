/**
 */
package simplepdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.Resource#getAmount <em>Amount</em>}</li>
 *   <li>{@link simplepdl.Resource#getUtilisations <em>Utilisations</em>}</li>
 *   <li>{@link simplepdl.Resource#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(int)
	 * @see simplepdl.SimplepdlPackage#getResource_Amount()
	 * @model required="true"
	 * @generated
	 */
	int getAmount();

	/**
	 * Sets the value of the '{@link simplepdl.Resource#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(int value);

	/**
	 * Returns the value of the '<em><b>Utilisations</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.ResourceUtilisation}.
	 * It is bidirectional and its opposite is '{@link simplepdl.ResourceUtilisation#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilisations</em>' reference list.
	 * @see simplepdl.SimplepdlPackage#getResource_Utilisations()
	 * @see simplepdl.ResourceUtilisation#getResource
	 * @model opposite="resource"
	 * @generated
	 */
	EList<ResourceUtilisation> getUtilisations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simplepdl.SimplepdlPackage#getResource_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplepdl.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Resource
