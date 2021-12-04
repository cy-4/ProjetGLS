package jeu;

import java.util.List;

public class Choix {

	private String name;
	private String reponse;
	private List<Objet> consomme;
	private List<Avantage> donne;
	private boolean bonne;
	
	public Choix(String n, String r, List<Objet> c, List<Avantage> d, boolean b) {
		this.name = n;
		this.reponse = r;
		this.consomme = c;
		this.donne = d;
		this.bonne = b;
	}

	public String getName() {
		return this.name;
	}

	public String getReponse() {
		return this.reponse;
	}
	
	public List<Objet> getConsomme() {
		return this.consomme;
	}
	
	public List<Avantage> getRecompense() {
		return this.donne;
	}
	
	public boolean getBonne() {
		return this.bonne;
	}
}
