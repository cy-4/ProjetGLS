package jeu;


public class Connaissance implements Avantage {
	
	private String name;
	private Condition visible, actif;
	
	public Connaissance(String nom, Condition visible, Condition actif) {
		this.name = nom;
		this.visible = visible;
		this.actif = actif;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public boolean isVisible() {
		if (this.visible == null) {
			return true;
		}
		return this.visible.verifierCondition();
	}

	@Override
	public boolean isActif() {
		if (this.actif == null) {
			return true;
		}
		return this.actif.verifierCondition();
	}

	@Override
	public ElementsJeu getElement() {
		return this;
	}
	
}
