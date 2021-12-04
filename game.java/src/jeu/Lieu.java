package jeu;

import java.util.Map;

public class Lieu extends Place {
	
	private Map<String, Personne> personnes;
	private Nature nature;
	private Map<String, Chemin> chemins;
	
	public Lieu(Nature nat, String name, Map<String, Personne> p, Map<String, Chemin> c) {
		super(name);
		this.personnes = p;
		this.nature = nat;	
		this.chemins = c;
	}

	@Override
	public ElementsJeu getElement() {
		return this;
	}

	public Map<String, Personne> getPersonnes() {
		return this.personnes;
	}

	public Nature getNature() {
		return this.nature;
	}
	
	public void addChemin(Chemin c) {
		this.chemins.put(c.getName(), c);
	}
	
	public Map<String, Chemin> getChemins() {
		return this.chemins;
	}

}
