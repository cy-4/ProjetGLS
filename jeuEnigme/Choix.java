package jeuEnigme;

public class Choix {

	private String name;
	private String reponse;
	
	public Choix(String n, String r) {
		this.name = n;
		this.reponse = r;
	}

	public String getName() {
		return this.name;
	}

	public String getReponse() {
		return this.reponse;
	}
}
