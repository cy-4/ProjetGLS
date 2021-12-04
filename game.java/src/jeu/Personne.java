package jeu;

import java.util.ArrayList;
import java.util.List;

public class Personne implements ElementsJeu {
	
	private String name;
	private Place position;
	private boolean visible;
	private boolean actif;
	private boolean obligatoire;
	private List<Interaction> interactions;
	private int numInteraction = 0;
	
	public Personne(String n, Place p, boolean v, boolean a, boolean o) {
		this.name = n;
		this.position = p;
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
	
	public void interagir() throws ObjetAbsentException, QuantiteInsuffisanteException, InventairePleinException {
		int i;
		for (i = this.numInteraction ; i < this.interactions.size() ; i++) {
			if (!this.interactions.get(i).getEffectuee()) {
				this.interactions.get(i).lancer();
				// maj du compteur si interaction effectuee
				if (this.interactions.get(i).getEffectuee()) {
					this.numInteraction ++;
				}
				break;
			}
		}
		if (i == this.interactions.size()) {
			System.out.println("Aucune interaction disponible");
		}
	}

	@Override
	public ElementsJeu getElement() {
		return this;
	}

	public String getName() {
		return name;
	}

	public Place getPosition() {
		return position;
	}
	
	public void setPosition(Place p) {
		this.position = p;
	}

	public boolean isVisible() {
		return visible;
	}

	public boolean isActif() {
		return actif;
	}

	public boolean isObligatoire() {
		return obligatoire;
	}

	public List<Interaction> getInteractions() {
		return interactions;
	}
}
