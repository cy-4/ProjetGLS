package jeu;

import java.util.HashMap;
import java.util.Map;

public class Condition {
	
	private Map<String, Objet> objetsRequis;
	private Map<String, Objet> objetsInterdits;
	private Map<String, Connaissance> connaissancesRequises;
	private Map<String, Connaissance> connaissancesInterdites;
	
	public Condition(Map<String, Objet> or, Map<String, Connaissance> cr, Map<String, Objet> oi, Map<String, Connaissance> ci) {
		this.objetsRequis = or;
		this.objetsInterdits = oi;
		this.connaissancesRequises = cr;
		this.connaissancesInterdites = ci;
	}

	public Map<String, Objet> getObjetsRequis() {
		return objetsRequis;
	}

	public Map<String, Objet> getObjetsInterdits() {
		return objetsInterdits;
	}

	public Map<String, Connaissance> getConnaissancesRequises() {
		return connaissancesRequises;
	}

	public Map<String, Connaissance> getConnaissancesInterdites() {
		return connaissancesInterdites;
	}

	public boolean verifierCondition() {
		HashMap<String, Objet> inv = (HashMap<String, Objet>) Jeu.explorateur.getInventaire();
		HashMap<String, Connaissance> comp = (HashMap<String, Connaissance>) Jeu.explorateur.getCompetences();
		for (String key : this.objetsInterdits.keySet()) {
			if (inv.containsKey(key)) {
				System.out.println(Jeu.explorateur.getName() + ", vous ne pouvez pas posséder l'objet : "
						+ inv.get(key).getName());
				return false;
			}
		}
		for (String key : this.connaissancesInterdites.keySet()) {
			if (comp.containsKey(key)) {
				System.out.println(Jeu.explorateur.getName() + ", vous ne pouvez pas posséder la connaissance : "
						+ comp.get(key).getName());
				return false;
			}
		}
		for (String key : this.objetsRequis.keySet()) {
			if (inv.containsKey(key)) {
				if (inv.get(key).getQuantite() < this.objetsRequis.get(key).getQuantite()) {
					System.out.println(Jeu.explorateur.getName() + ", vous n'avez pas assez de l'objet : "
							+ inv.get(key).getName());
					return false;
				}
			} else {
				System.out.println(Jeu.explorateur.getName() + ", vous devez posséder l'objet : "
						+ this.objetsRequis.get(key).getName());
				return false;
			}
		}
		for (String key : this.connaissancesRequises.keySet()) {
			if (!comp.containsKey(key)) {
				System.out.println(Jeu.explorateur.getName() + ", vous devez posséder la connaissance : "
						+ this.connaissancesRequises.get(key).getName());
				return false;
			}
		}
		return true;
	}
	
}
