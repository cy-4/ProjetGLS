package jeu;

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

}
