/*
 * generated by Xtext 2.23.0
 */
package game.xtext.formatting2

import com.google.inject.Inject
import game.game.Jeu
import game.xtext.services.GameGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class GameFormatter extends AbstractFormatter2 {
	
	@Inject extension GameGrammarAccess

	def dispatch void format(Jeu jeu, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		jeu.territoire.format
		jeu.explorateur.format
		for (elementsJeu : jeu.elementsjeu) {
			elementsJeu.format
		}
	}
	
	// TODO: implement for 
}
