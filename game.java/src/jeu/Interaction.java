package jeu;

import java.util.HashMap;
import java.util.Map;

public class Interaction {

	private boolean effectuee = false;
	private String question;
	private Map<Integer, Choix> choix = new HashMap<Integer, Choix>();
	private Choix reponse;
	private int indice = 0;
	
	public Interaction(String q) {
		this.question = q;
	}
	
	public void addChoix(Choix c) {
		this.choix.put(this.indice, c);
		this.indice++;
	}

	public boolean getEffectuee() {
		return this.effectuee;
	}

	public void lancer() throws ObjetAbsentException, QuantiteInsuffisanteException, InventairePleinException {
		System.out.println(this.question);
		for (int k : this.choix.keySet()) {
			System.out.println(k + " - " + this.choix.get(k).getReponse());
		}
		int ch = Jeu.scan.nextInt();
		System.out.println("");
		this.reponse = choix.get(ch);
		Jeu.explorateur.consommer(this.reponse.getConsomme());
		if (this.reponse.getBonne()) {
			this.effectuee = true;
		}
		Jeu.explorateur.recompenser(this.reponse.getRecompense());
	}
	
	public Choix getReponse() {
		return this.reponse;
	}

}
