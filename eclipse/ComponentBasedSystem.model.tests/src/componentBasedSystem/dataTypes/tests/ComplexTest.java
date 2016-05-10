/**
 */
package componentBasedSystem.dataTypes.tests;

import componentBasedSystem.dataTypes.Complex;
import componentBasedSystem.dataTypes.DataTypesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Complex</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexTest extends ReturnTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComplexTest.class);
	}

	/**
	 * Constructs a new Complex test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Complex test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Complex getFixture() {
		return (Complex)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataTypesFactory.eINSTANCE.createComplex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ComplexTest
