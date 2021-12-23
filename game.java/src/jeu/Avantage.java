package jeu;


public interface Avantage extends ElementsJeu {
	
	public boolean isVisible() throws QuantiteInsuffisanteException;
	
	public boolean isActif() throws QuantiteInsuffisanteException;
	
}
