package jeuEnigme;

import java.util.HashMap;
import java.util.Map;

public class Interaction {

	private boolean effectuee;
	private String question;
	private Map<String, Choix> choix;
	
	public Interaction(String q) {
		this.effectuee = false;
		this.question = q;
		this.choix = new HashMap<String, Choix>();
	}
	
	public void addChoix(Choix c) {
		this.choix.put(c.getName(), c);
	}

	public boolean getEffectuee() {
		return this.effectuee;
	}

	public void lancer() {		
	}

}
