package jeu;


public class Chemin extends Place {

	private Lieu pred;
	private Lieu succ;
	private boolean visible;
	private boolean obligatoire;
	private boolean ouvert;

	public Chemin(String nom, Lieu p, Lieu s, boolean v, boolean ob, boolean ov) {
		super(nom);
		this.pred = p;
		this.succ = s;
		this.visible = v;
		this.obligatoire = ob;
		this.ouvert = ov;
	}

	public Lieu getPred() {
		return pred;
	}

	public Lieu getSucc() {
		return succ;
	}

	public boolean isVisible() {
		return visible;
	}

	public boolean isObligatoire() {
		return obligatoire;
	}

	public boolean isOuvert() {
		return ouvert;
	}

}