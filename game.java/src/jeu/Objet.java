package jeu;

public class Objet implements Avantage {
	
	private String name;
	private int poids;
	private int quantite;
	private Condition visible, actif;
	private boolean transformable;
	
	public Objet(String nom, int poids, int quantite, boolean transformable, Condition visible, Condition actif) {
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
	public boolean isVisible() throws QuantiteInsuffisanteException {
		return this.visible.verifierCondition();
	}
	@Override
	public boolean isActif() throws QuantiteInsuffisanteException {
		return this.actif.verifierCondition();
	}

	@Override
	public ElementsJeu getElement() {
		return this;
	}
	
}
