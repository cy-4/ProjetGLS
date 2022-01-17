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
		HashMap<String, Connaissance> Sphinx_cr_visible = new HashMap<>();
		HashMap<String, Connaissance> Sphinx_ci_visible = new HashMap<>();
		HashMap<String, Objet> Sphinx_or_visible = new HashMap<>();
		HashMap<String, Objet> Sphinx_oi_visible = new HashMap<>();
		Connaissance Reussite_sphinxVisible = new Connaissance("Reussite", vide, vide);
		Sphinx_ci_visible.put("Reussite", Reussite_sphinxVisible);
		Objet tentative_sphinxVisible = new Objet("tentative", 1, 1, false, vide, vide);
		Sphinx_or_visible.put("tentative", tentative_sphinxVisible);
		
		Condition Sphinx_visible = new Condition(Sphinx_or_visible, Sphinx_cr_visible, Sphinx_oi_visible, Sphinx_ci_visible);
		
		HashMap<String, Connaissance> Sphinx_cr_active = new HashMap<>();
		HashMap<String, Connaissance> Sphinx_ci_active = new HashMap<>();
		HashMap<String, Objet> Sphinx_or_active = new HashMap<>();
		HashMap<String, Objet> Sphinx_oi_active = new HashMap<>();
		Condition Sphinx_active = new Condition(Sphinx_or_active, Sphinx_cr_active, Sphinx_oi_active, Sphinx_ci_active);

		Personne Sphinx = new Personne("Sphinx", Enigme, Sphinx_visible, Sphinx_active, true);
		lieux.get("Enigme").addPersonne(Sphinx);
		Interaction Question = new Interaction("Gagner");
		ArrayList<Objet> vrai_cons = new ArrayList<>();
		Objet vrai_tentative = new Objet("tentative", 1, 2, false, vide, vide);
		vrai_cons.add(vrai_tentative);
		ArrayList<Avantage> vrai_don = new ArrayList<>();
		Connaissance vrai_Reussite = new Connaissance("Reussite", vide, vide);
		vrai_don.add(vrai_Reussite);
		Choix vrai_Question = new Choix("vrai", "oui", vrai_cons, vrai_don, true);
		Question.addChoix(vrai_Question);
		ArrayList<Objet> faux_cons = new ArrayList<>();
		Objet faux_tentative = new Objet("tentative", 1, 1, false, vide, vide);
		faux_cons.add(faux_tentative);
		ArrayList<Avantage> faux_don = new ArrayList<>();
		Choix faux_Question = new Choix("faux", "non", faux_cons, faux_don, false);
		Question.addChoix(faux_Question);
		Sphinx.addInteraction(Question);
		HashMap<String, Connaissance> victoire_cr_visible = new HashMap<>();
		HashMap<String, Connaissance> victoire_ci_visible = new HashMap<>();
		HashMap<String, Objet> victoire_or_visible = new HashMap<>();
		HashMap<String, Objet> victoire_oi_visible = new HashMap<>();
		Connaissance Reussite_vicVisible = new Connaissance("Reussite", vide, vide);
		victoire_cr_visible.put("Reussite", Reussite_vicVisible);
		
		Condition victoire_visible = new Condition(victoire_or_visible, victoire_cr_visible, victoire_oi_visible, victoire_ci_visible);
		
		HashMap<String, Connaissance> victoire_cr_ouvert = new HashMap<>();
		HashMap<String, Connaissance> victoire_ci_ouvert = new HashMap<>();
		HashMap<String, Objet> victoire_or_ouvert = new HashMap<>();
		HashMap<String, Objet> victoire_oi_ouvert = new HashMap<>();
		Condition victoire_ouvert = new Condition(victoire_or_ouvert, victoire_cr_ouvert, victoire_oi_ouvert, victoire_ci_ouvert);

		Chemin victoire = new Chemin("victoire", Enigme, Succes, victoire_visible, true, victoire_ouvert);
		chemins.put("victoire", victoire);
		lieux.get("Enigme").addChemin(victoire);
		HashMap<String, Connaissance> defaite_cr_visible = new HashMap<>();
		HashMap<String, Connaissance> defaite_ci_visible = new HashMap<>();
		HashMap<String, Objet> defaite_or_visible = new HashMap<>();
		HashMap<String, Objet> defaite_oi_visible = new HashMap<>();
		Connaissance Reussite_defVisible = new Connaissance("Reussite", vide, vide);
		defaite_ci_visible.put("Reussite", Reussite_defVisible);
		Objet tentative_defVisible = new Objet("tentative", 1, 1, false, vide, vide);
		defaite_oi_visible.put("tentative", tentative_defVisible);
		
		Condition defaite_visible = new Condition(defaite_or_visible, defaite_cr_visible, defaite_oi_visible, defaite_ci_visible);
		
		HashMap<String, Connaissance> defaite_cr_ouvert = new HashMap<>();
		HashMap<String, Connaissance> defaite_ci_ouvert = new HashMap<>();
		HashMap<String, Objet> defaite_or_ouvert = new HashMap<>();
		HashMap<String, Objet> defaite_oi_ouvert = new HashMap<>();
		Condition defaite_ouvert = new Condition(defaite_or_ouvert, defaite_cr_ouvert, defaite_oi_ouvert, defaite_ci_ouvert);

		Chemin defaite = new Chemin("defaite", Enigme, Echec, defaite_visible, true, defaite_ouvert);
		chemins.put("defaite", defaite);
		lieux.get("Enigme").addChemin(defaite);
		Territoire terrain = new Territoire(lieux, chemins);
		HashMap<String, Objet> objetsExpl = new HashMap<>();
		Objet tentative_expl = new Objet("tentative", 1, 3, false, vide, vide);
		objetsExpl.put("tentative",tentative_expl);
		HashMap<String, Connaissance> connaisExpl = new HashMap<>();
		Explorateur explorateur = new Explorateur(Enigme, 4, objetsExpl, connaisExpl);
		Jeu JeuEnigme = new Jeu(terrain, explorateur);
		JeuEnigme.jouer();
	}

}

