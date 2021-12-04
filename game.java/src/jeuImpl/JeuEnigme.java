package jeuImpl;

import java.util.ArrayList;
import java.util.HashMap;

import jeu.*;

public class JeuEnigme {
	
	private static Jeu jeuEnigme;

	public static void main(String[] args) {
		Personne sphinx = new Personne("Sphinx", null, true, true, true);
		Interaction i = new Interaction("[Question...]?");
		Objet o = new Objet("Tentative", 1, 1, false, true, true);
		ArrayList<Objet> ob = new ArrayList<>();
		ob.add(o);
		Connaissance c = new Connaissance("Reussite", true, true);
		ArrayList<Avantage> av = new ArrayList<>();
		av.add(c);
		Choix bon = new Choix("Q1 R1", "oui", ob, av, true);
		Choix mauvais = new Choix("Q1 R2", "non", ob, new ArrayList<Avantage>(), false);
		HashMap<String, Personne> persos = new HashMap<>();
		i.addChoix(bon);
		i.addChoix(mauvais);
		sphinx.addInteraction(i);
		persos.put(sphinx.getName(), sphinx);
		Lieu enigme = new Lieu(Nature.DEPART, "Enigme", persos, new HashMap<String, Chemin>());
		sphinx.setPosition(enigme);
		Lieu succes = new Lieu(Nature.ARRIVEE, "Succes", null, null);
		Lieu echec = new Lieu(Nature.ARRIVEE, "Echec", null, null);
		Chemin victoire = new Chemin("Victoire", enigme, succes, true, false, true);
		Chemin defaite = new Chemin("Defaite", enigme, echec, true, false, true);
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
		Objet tentatives = new Objet("Tentative", 1, 3, false, true, true);
		Connaissance reussite = new Connaissance("Reussite", true, true);
		HashMap<String, Objet> objets = new HashMap<>();
		HashMap<String, Connaissance> connaissances = new HashMap<>();
		objets.put(tentatives.getName(), tentatives);
		connaissances.put(reussite.getName(), reussite);
		Explorateur explo = new Explorateur(enigme, 0, objets, connaissances);
		jeuEnigme = new Jeu(terre, explo, null);
		jeuEnigme.jouer();
	}
}
