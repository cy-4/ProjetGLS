package jeu;

import java.util.Map;

public class Territoire {

	private Map<String, Lieu> lieux;
	private Map<String, Chemin> chemins;
	
	public Territoire(Map<String, Lieu> l, Map<String, Chemin> c) {
		this.chemins = c;
		this.lieux = l;
	}

	public Map<String, Lieu> getLieux() {
		return lieux;
	}

	public Map<String, Chemin> getChemins() {
		return chemins;
	}
	
}
