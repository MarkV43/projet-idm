/**
 */
package simplepdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Utilisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.ResourceUtilisation#getAmount <em>Amount</em>}</li>
 *   <li>{@link simplepdl.ResourceUtilisation#getWork <em>Work</em>}</li>
 *   <li>{@link simplepdl.ResourceUtilisation#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getResourceUtilisation()
 * @model
 * @generated
 */
public interface ResourceUtilisation extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(int)
	 * @see simplepdl.SimplepdlPackage#getResourceUtilisation_Amount()
	 * @model required="true"
	 * @generated
	 */
	int getAmount();

	/**
	 * Sets the value of the '{@link simplepdl.ResourceUtilisation#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(int value);

	/**
	 * Returns the value of the '<em><b>Work</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkDefinition#getResourcesUtilised <em>Resources Utilised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work</em>' reference.
	 * @see #setWork(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getResourceUtilisation_Work()
	 * @see simplepdl.WorkDefinition#getResourcesUtilised
	 * @model opposite="resourcesUtilised" required="true"
	 * @generated
	 */
	WorkDefinition getWork();

	/**
	 * Sets the value of the '{@link simplepdl.ResourceUtilisation#getWork <em>Work</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work</em>' reference.
	 * @see #getWork()
	 * @generated
	 */
	void setWork(WorkDefinition value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.Resource#getUtilisations <em>Utilisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see simplepdl.SimplepdlPackage#getResourceUtilisation_Resource()
	 * @see simplepdl.Resource#getUtilisations
	 * @model opposite="utilisations" required="true"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link simplepdl.ResourceUtilisation#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

} // ResourceUtilisation
