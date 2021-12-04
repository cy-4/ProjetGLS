package jeu;

public class Objet implements Avantage {
	
	private String name;
	private int poids;
	private int quantite;
	private boolean transformable, visible, actif;
	
	public Objet(String nom, int poids, int quantite, boolean transformable, boolean visible, boolean actif) {
		this.name = nom;
		this.poids = poids;
		this.quantite = quantite;
		this.transformable = transformable;
		this.visible = visible;
		this.actif = actif;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPoids() {
		return this.poids;
	}
	
	public int getQuantite() {
		return this.quantite;
	}
	
	public boolean estTransformable() {
		return this.transformable;
	}
	
	public void addQuantite(int q) {
		this.quantite += q; 
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
