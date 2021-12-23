package jeu;

import java.util.ArrayList;
import java.util.List;

public class Personne implements ElementsJeu {
	
	private String name;
	private Place position;
	private Condition visible;
	private Condition actif;
	private boolean obligatoire;
	private List<Interaction> interactions;
	private int numInteraction = 0;
	
	public Personne(String n, Place p, Condition v, Condition a, boolean o) {
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
	
	public boolean interagir() throws ObjetAbsentException, QuantiteInsuffisanteException, InventairePleinException {
		int i;
		for (i = this.numInteraction ; i < this.interactions.size() ; i++) {
			if (!this.interactions.get(i).getEffectuee()) {
				this.interactions.get(i).lancer();
				// maj du compteur si interaction effectuee
				if (this.interactions.get(i).getEffectuee()) {
					this.numInteraction ++;
				}
				return true;
			}
		}
		if (i == this.interactions.size()) {
			System.out.println(Jeu.explorateur.getName() + ", aucune interaction disponible avec " + this.name);
			System.out.println("");
		}
		return false;
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

	public boolean isVisible() throws QuantiteInsuffisanteException {
		return this.visible.verifierCondition();
	}

	public boolean isActif() throws QuantiteInsuffisanteException {
		return this.actif.verifierCondition();
	}

	public boolean isObligatoire() {
		return this.obligatoire;
	}

	public List<Interaction> getInteractions() {
		return interactions;
	}
}
