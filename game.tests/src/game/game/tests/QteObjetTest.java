/**
 * generated by Xtext 2.23.0
 */
package game.game.tests;

import game.game.GameFactory;
import game.game.QteObjet;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Qte Objet</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QteObjetTest extends ElementsJeuTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QteObjetTest.class);
	}

	/**
	 * Constructs a new Qte Objet test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QteObjetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Qte Objet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QteObjet getFixture() {
		return (QteObjet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GameFactory.eINSTANCE.createQteObjet());
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

} //QteObjetTest
