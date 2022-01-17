/**
 * generated by Xtext 2.23.0
 */
package game.game.tests;

import game.game.ConditionPersonne;
import game.game.GameFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Condition Personne</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionPersonneTest extends ConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConditionPersonneTest.class);
	}

	/**
	 * Constructs a new Condition Personne test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionPersonneTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Condition Personne test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConditionPersonne getFixture() {
		return (ConditionPersonne)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GameFactory.eINSTANCE.createConditionPersonne());
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

} //ConditionPersonneTest
