package jeuEnigme;



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
	
	@Override
	public boolean estVisible() {
		// TODO Auto-generated method stub
		return this.visible;
	}
	@Override
	public boolean estActif() {
		// TODO Auto-generated method stub
		return this.actif;
	}
	
}