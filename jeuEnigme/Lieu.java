package jeuEnigme;


public class Lieu extends Place{
	
	private Map<String, Personne> personnes;
	private Nature nature;
	
	public Lieu(Nature etat, String name) {
		super(name);
		this.personnes = new HashMap<String, Personne>();
		this.nature = etat;
		
	}
}