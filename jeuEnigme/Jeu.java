package jeuEnigme;

import java.util.List;

public class Jeu {
	
	private Territoire territoire;
	private Explorateur explorateur;
	private List<ElementsJeu> elementsjeu;
	
	public Jeu (Territoire territoire,Explorateur explorateur,List<ElementsJeu> elementsjeu ) {
		
		this.territoire = territoire;
		this.explorateur = explorateur;
		this.elementsjeu =  elementsjeu;
		
	}
}