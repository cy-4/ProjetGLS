package jeuEnigme;

import java.util.HashMap;
import java.util.Map;

public class Lieu extends Place {
	
	private Map<String, Personne> personnes;
	private Nature nature;
	
	public Lieu(Nature nat, String name) {
		super(name);
		this.personnes = new HashMap<String, Personne>();
		this.nature = nat;	
	}
}
