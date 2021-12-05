package jeuImpl;

import java.util.ArrayList;
import java.util.HashMap;

import jeu.*;

public class JeuEnigme {
	
	private static Jeu jeuEnigme;

	public static void main(String[] args) {
		Personne sphinx = new Personne("Sphinx", null, true, true, true);
		Objet o = new Objet("Tentative", 1, 1, false, true, true);
		ArrayList<Objet> ob = new ArrayList<>();
		ob.add(o);
		HashMap<String, Objet> or = new HashMap<>();
		or.put(o.getName(), o);
		Condition parlerSphinx = new Condition(or, new HashMap<>(), new HashMap<>(), new HashMap<>());
		Interaction i = new Interaction("[Question...]?", parlerSphinx);
		Connaissance c = new Connaissance("Reussite", null, null);
		ArrayList<Avantage> av = new ArrayList<>();
		av.add(c);
		Objet ma = new Objet("MauvRep", 1, 1, false, true, true);
		ArrayList<Avantage> bad = new ArrayList<Avantage>();
		bad.add(ma);
		Choix bon = new Choix("Q1 R1", "oui", ob, av, true);
		Choix mauvais = new Choix("Q1 R2", "non", ob, bad, false);
		HashMap<String, Personne> persos = new HashMap<>();
		i.addChoix(bon);
		i.addChoix(mauvais);
		sphinx.addInteraction(i);
		persos.put(sphinx.getName(), sphinx);
		Lieu enigme = new Lieu(Nature.DEPART, "Enigme", persos, new HashMap<String, Chemin>());
		sphinx.setPosition(enigme);
		Lieu succes = new Lieu(Nature.ARRIVEE, "Succes", null, null);
		Lieu echec = new Lieu(Nature.ARRIVEE, "Echec", null, null);
		Connaissance reussite = new Connaissance("Reussite", null, null);
		HashMap<String, Connaissance> connaissances = new HashMap<>();
		connaissances.put(reussite.getName(), reussite);
		Condition possederReussite = new Condition(new HashMap<>(), connaissances, new HashMap<>(), new HashMap<>());
		Chemin victoire = new Chemin("Victoire", enigme, succes, possederReussite, null, possederReussite);
		Objet tentatives = new Objet("Tentative", 1, 3, false, true, true);
		HashMap<String, Objet> objets = new HashMap<>();
		objets.put(tentatives.getName(), tentatives);
		Objet m = new Objet("MauvRep", 1, 3, false, true, true);
		HashMap<String, Objet> mr = new HashMap<>();
		mr.put(m.getName(), m);
		Condition mauvaisesReponses = new Condition(mr, new HashMap<>(), new HashMap<>(), new HashMap<>());
		Chemin defaite = new Chemin("Defaite", enigme, echec, mauvaisesReponses, mauvaisesReponses, mauvaisesReponses);
		enigme.addChemin(victoire);
		enigme.addChemin(defaite);
		HashMap<String, Lieu> lieux = new HashMap<>();
		HashMap<String, Chemin> chemins = new HashMap<>();
		lieux.put(enigme.getName(), enigme);
		lieux.put(succes.getName(), succes);
		lieux.put(echec.getName(), echec);
		chemins.put(victoire.getName(), victoire);
		chemins.put(defaite.getName(), defaite);
		Territoire terre = new Territoire(lieux, chemins);
		Explorateur explo = new Explorateur(enigme, 3, objets, new HashMap<>());
		jeuEnigme = new Jeu(terre, explo, null);
		jeuEnigme.jouer();
	}
}
