package jeuEnigme;



public class Connaissance implements Avantage {
	
	private String name;
	private boolean visible, actif;
	
	public Connaissance(String nom, boolean visible, boolean actif) {
		this.name = nom;
		this.visible = visible;
		this.actif = actif;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public boolean estVisible() {
		
		return this.visible;
	}

	@Override
	public boolean estActif() {
		
		return this.actif;
	}
	
	
}