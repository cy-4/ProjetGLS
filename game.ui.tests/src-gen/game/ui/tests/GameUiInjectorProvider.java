/*
 * generated by Xtext 2.23.0
 */
package game.ui.tests;

import com.google.inject.Injector;
import game.ui.internal.GameActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class GameUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return GameActivator.getInstance().getInjector("game.Game");
	}

}
