/*
 * generated by Xtext 2.23.0
 */
package game;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class GameStandaloneSetup extends GameStandaloneSetupGenerated {

	public static void doSetup() {
		new GameStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
