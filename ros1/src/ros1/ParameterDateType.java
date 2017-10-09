/**
 */
package ros1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Date Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ros1.ParameterDateType#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see ros1.Ros1Package#getParameterDateType()
 * @model
 * @generated
 */
public interface ParameterDateType extends ParameterType {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(ParameterDate)
	 * @see ros1.Ros1Package#getParameterDateType_Default()
	 * @model containment="true"
	 * @generated
	 */
	ParameterDate getDefault();

	/**
	 * Sets the value of the '{@link ros1.ParameterDateType#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(ParameterDate value);

} // ParameterDateType