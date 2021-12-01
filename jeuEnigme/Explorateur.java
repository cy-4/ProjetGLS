package jeuEnigme;

import java.util.*;

public class Explorateur {
	
	private Place position;
	
	private HashMap <String, Objet> inventaire;
	
	private HashMap <String, Connaissance> competences;

	private int capacite;

	public Explorateur(Place place, int capacite) {
		this.position = place;
		this.capacite = capacite;
		this.inventaire = new HashMap<String, Objet>();
		this.competences = new HashMap<String, Connaissance>();
	}
}