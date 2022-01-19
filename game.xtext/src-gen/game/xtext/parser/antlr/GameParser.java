/*
 * generated by Xtext 2.23.0
 */
package game.xtext.parser.antlr;

import com.google.inject.Inject;
import game.xtext.parser.antlr.internal.InternalGameParser;
import game.xtext.services.GameGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class GameParser extends AbstractAntlrParser {

	@Inject
	private GameGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGameParser createParser(XtextTokenStream stream) {
		return new InternalGameParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Jeu";
	}

	public GameGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GameGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
