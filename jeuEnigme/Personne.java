package jeuEnigme;

import java.util.ArrayList;
import java.util.List;

public class Personne {
	
	private String name;
	private boolean visible;
	private boolean actif;
	private boolean obligatoire;
	private List<Interaction> interactions;
	
	public Personne(String n, boolean v, boolean a, boolean o) {
		this.name = n;
		this.visible = v;
		this.actif = a;
		this.obligatoire = o;
		this.interactions = new ArrayList<Interaction>();
	}
	
	public void addInteraction(Interaction i) {
		this.interactions.add(i);
	}
	
	public void addInteractions(List<Interaction> li) {
		for (Interaction i : li) {
			this.interactions.add(i);
		}
	}
	
	public void interagir() {
		for (Interaction i : this.interactions) {
			if (!i.getEffectuee()) {
				i.lancer();
				break;
			}
		}
	}
}