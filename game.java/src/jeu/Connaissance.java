package jeu;


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
	public boolean isVisible() {
		
		return this.visible;
	}

	@Override
	public boolean isActif() {
		
		return this.actif;
	}

	@Override
	public ElementsJeu getElement() {
		return this;
	}
	
}
