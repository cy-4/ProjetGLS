package jeu;

import java.util.HashMap;
import java.util.Map;

public class Place implements ElementsJeu {
	
	
	private String name;
	private Map<String, Objet> objets;
	private Map<String, Connaissance> connaissances;
	
	public Place(String nom) {
		this.name = nom;
		this.objets = new HashMap<String, Objet>();
		this.connaissances = new HashMap<String, Connaissance>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public Map<String, Objet> getObjets(){
		return this.objets;
	}
	
	public Map<String, Connaissance> getConnaissances() {
		return this.connaissances;
	}
	
	public void initialiserObjets(Map<String, Objet> objetsInit) {
		this.objets = objetsInit;
	}
	
	public void initialiserConnaissances(Map<String, Connaissance> connaissancesInit) {
		this.connaissances = connaissancesInit;
	}

	@Override
	public ElementsJeu getElement() {
		return this;
	}

}
