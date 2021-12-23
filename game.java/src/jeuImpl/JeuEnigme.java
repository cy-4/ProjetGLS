package jeuImpl;

import java.util.ArrayList;
import java.util.HashMap;

import jeu.*;

public class JeuEnigme {

	public static void main(String[] args) {
		Condition vide = new Condition(new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>());
		Condition invalid = vide;
		Objet imposs_obj = new Objet("imposs", 1, 1, false, vide, vide);
		HashMap<String, Objet> imposs_requis = new HashMap<>();
		imposs_requis.put("imposs", imposs_obj);
		Condition imposs = new Condition(imposs_requis, new HashMap<>(), new HashMap<>(), new HashMap<>());
		HashMap<String, Lieu> lieux = new HashMap<>();
		HashMap<String, Chemin> chemins = new HashMap<>();
		Lieu Enigme = new Lieu(Nature.DEPART, "Enigme", new HashMap<>(), new HashMap<>());
		lieux.put("Enigme", Enigme);
		Lieu Succes = new Lieu(Nature.ARRIVEE, "Succes", new HashMap<>(), new HashMap<>());
		lieux.put("Succes", Succes);
		Lieu Echec = new Lieu(Nature.ARRIVEE, "Echec", new HashMap<>(), new HashMap<>());
		lieux.put("Echec", Echec);
		//template
		HashMap<String, Connaissance> SphinxVisible_cr = new HashMap<>();
		HashMap<String, Connaissance> SphinxVisible_ci = new HashMap<>();
		Connaissance SphinxVisible_Reussite = new Connaissance("Reussite", invalid, invalid);
		SphinxVisible_ci.put("Reussite", SphinxVisible_Reussite);
		HashMap<String, Objet> SphinxVisible_or = new HashMap<>();
		Objet SphinxVisible_Tentative = new Objet("Tentative", 1, 1, false, vide, vide);
		SphinxVisible_or.put("Tentative", SphinxVisible_Tentative);
		HashMap<String, Objet> SphinxVisible_oi = new HashMap<>();
		Condition SphinxVisible = new Condition(SphinxVisible_or, SphinxVisible_cr, SphinxVisible_oi, SphinxVisible_ci);
		//end template
		//end template
		Personne Sphinx = new Personne("Sphinx", Enigme, SphinxVisible, invalid, true);
		lieux.get("Enigme").addPersonne(Sphinx);
		Interaction Question = new Interaction("[Question...]");
		ArrayList<Objet> Bonne_cons = new ArrayList<>();
		//end template
		//end template
		Objet Bonne_Tentative = new Objet("Tentative", 1, 1, false, invalid, invalid);
		Bonne_cons.add(Bonne_Tentative);
		ArrayList<Avantage> Bonne_don = new ArrayList<>();
		//end template
		//end template
		Connaissance Bonne_Reussite = new Connaissance("Reussite", invalid, invalid);
		Bonne_don.add(Bonne_Reussite);
		Choix Bonne_Question = new Choix("Bonne", "oui", Bonne_cons, Bonne_don, true);
		Question.addChoix(Bonne_Question);
		ArrayList<Objet> Mauvaise_cons = new ArrayList<>();
		//end template
		//end template
		Objet Mauvaise_Tentative = new Objet("Tentative", 1, 1, false, invalid, invalid);
		Mauvaise_cons.add(Mauvaise_Tentative);
		ArrayList<Avantage> Mauvaise_don = new ArrayList<>();
		Choix Mauvaise_Question = new Choix("Mauvaise", "non", Mauvaise_cons, Mauvaise_don, false);
		Question.addChoix(Mauvaise_Question);
		Sphinx.addInteraction(Question);
		//template
		HashMap<String, Connaissance> ReussiteObtenue_cr = new HashMap<>();
		Connaissance ReussiteObtenue_Reussite = new Connaissance("Reussite", invalid, invalid);
		ReussiteObtenue_cr.put("Reussite", ReussiteObtenue_Reussite);
		HashMap<String, Connaissance> ReussiteObtenue_ci = new HashMap<>();
		HashMap<String, Objet> ReussiteObtenue_oi = new HashMap<>();
		Condition ReussiteObtenue = new Condition(new HashMap<>(), ReussiteObtenue_cr, ReussiteObtenue_oi, ReussiteObtenue_ci);
		//end template
		//end template
		Chemin Victoire = new Chemin("Victoire", Enigme, Succes, ReussiteObtenue, true, invalid);
		chemins.put("Victoire", Victoire);
		lieux.get("Enigme").addChemin(Victoire);
		//template
		HashMap<String, Connaissance> PlusDeTentatives_cr = new HashMap<>();
		HashMap<String, Connaissance> PlusDeTentatives_ci = new HashMap<>();
		Connaissance PlusDeTentatives_Reussite = new Connaissance("Reussite", invalid, invalid);
		PlusDeTentatives_ci.put("Reussite", PlusDeTentatives_Reussite);
		HashMap<String, Objet> PlusDeTentatives_oi = new HashMap<>();
		Objet PlusDeTentatives_Tentative = new Objet("Tentative", 1, 1, false, vide, vide);
		PlusDeTentatives_oi.put("Tentative", PlusDeTentatives_Tentative);
		Condition PlusDeTentatives = new Condition(new HashMap<>(), PlusDeTentatives_cr, PlusDeTentatives_oi, PlusDeTentatives_ci);
		//end template
		//end template
		Chemin Defaite = new Chemin("Defaite", Enigme, Echec, PlusDeTentatives, true, invalid);
		chemins.put("Defaite", Defaite);
		lieux.get("Enigme").addChemin(Defaite);
		Territoire terrain = new Territoire(lieux, chemins);
		HashMap<String, Objet> objetsExpl = new HashMap<>();
		//end template
		//end template
		Objet Tentative_expl = new Objet("Tentative", 1, 3, false, invalid, invalid);
		objetsExpl.put("Tentative",Tentative_expl);
		HashMap<String, Connaissance> connaisExpl = new HashMap<>();
		Explorateur explorateur = new Explorateur(Enigme, 1, objetsExpl, connaisExpl);
		Jeu JeuEnigme = new Jeu(terrain, explorateur);
		JeuEnigme.jouer();
	}

}

