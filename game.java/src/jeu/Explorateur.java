package jeu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Explorateur {
	
	private String name;
	private Place position;
	private Map <String, Objet> inventaire;
	private Map <String, Connaissance> competences;
	private int capaciteDisponible;

	public Explorateur(Place p, int c, HashMap<String, Objet> inv,HashMap<String, Connaissance> con) {
		this.position = p;
		this.capaciteDisponible = c;
		this.inventaire = inv;
		this.competences = con;
	}

	public Place getPosition() {
		return position;
	}

	public Map<String, Objet> getInventaire() {
		return inventaire;
	}

	public Map<String, Connaissance> getCompetences() {
		return competences;
	}

	public int getCapaciteDisponible() {
		return capaciteDisponible;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setPosition(Place p) {
		this.position = p;
	}
	
	public void addCompetence(Connaissance c) {
		this.competences.put(c.getName(), c);
	}
	
	public void addObjet(Objet o) throws InventairePleinException {
		if (this.capaciteDisponible < o.getPoids() * o.getQuantite()) {
			throw new InventairePleinException(o.getName());
		} else {
			if (this.inventaire.containsKey(o.getName())) {
				Objet ob = this.inventaire.get(o.getName());
				ob.addQuantite(o.getQuantite());
			} else {
				this.inventaire.put(o.getName(), o);
			}
			this.capaciteDisponible -= o.getPoids() * o.getQuantite();
		}
	}
	
	public void consommer(List<Objet> cons) throws ObjetAbsentException, QuantiteInsuffisanteException {
		for (Objet o : cons) {
			if (this.inventaire.containsKey(o.getName())) {
				if (this.inventaire.get(o.getName()).getQuantite() < o.getQuantite()) {
					throw new QuantiteInsuffisanteException(o.getName());
				} else {
					this.inventaire.get(o.getName()).addQuantite(- o.getQuantite());
					this.capaciteDisponible += o.getQuantite() * o.getPoids();
				}
			} else {
				throw new ObjetAbsentException(o.getName());
			}
		}
	}
	
	public void recompenser(List<Avantage> rec) throws InventairePleinException {
		for (Avantage a : rec) {
			if (a instanceof Objet) {
				this.addObjet((Objet) a);
			} else {
				this.competences.put(((Connaissance) a).getName(), (Connaissance) a);
			}
		}
	}
	
}
