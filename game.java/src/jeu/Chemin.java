package jeu;


public class Chemin extends Place {

	private Lieu pred;
	private Lieu succ;
	private Condition visible;
	private boolean obligatoire;
	private Condition ouvert;

	public Chemin(String nom, Lieu p, Lieu s, Condition v, boolean ob, Condition ov) {
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

	public boolean isVisible() throws QuantiteInsuffisanteException {
		if (this.visible == null) {
			return true;
		}
		return visible.verifierCondition();
	}

	public boolean isObligatoire() {
		return obligatoire;
	}

	public boolean isOuvert() throws QuantiteInsuffisanteException {
		if (this.ouvert == null) {
			return true;
		}
		return ouvert.verifierCondition();
	}

}