package jeuImpl;

import java.util.ArrayList;
import java.util.HashMap;

import jeu.*;

public class Enquete {

	public static void main(String[] args) {
		Condition vide = new Condition(new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>());
		Condition invalid = vide;
		Objet imposs_obj = new Objet("imposs", 1, 1, false, vide, vide);
		HashMap<String, Objet> imposs_requis = new HashMap<>();
		imposs_requis.put("imposs", imposs_obj);
		Condition imposs = new Condition(imposs_requis, new HashMap<>(), new HashMap<>(), new HashMap<>());
		HashMap<String, Lieu> lieux = new HashMap<>();
		HashMap<String, Chemin> chemins = new HashMap<>();
		Lieu Paris = new Lieu(Nature.DEPART, "Paris", new HashMap<>(), new HashMap<>());
		lieux.put("Paris", Paris);
		Lieu Toulouse = new Lieu(Nature.INTERMEDIAIRE, "Toulouse", new HashMap<>(), new HashMap<>());
		lieux.put("Toulouse", Toulouse);
		Lieu Lyon = new Lieu(Nature.INTERMEDIAIRE, "Lyon", new HashMap<>(), new HashMap<>());
		lieux.put("Lyon", Lyon);
		Lieu AssassinTrouve = new Lieu(Nature.ARRIVEE, "AssassinTrouve", new HashMap<>(), new HashMap<>());
		lieux.put("AssassinTrouve", AssassinTrouve);
		Lieu InnocentChoisi = new Lieu(Nature.ARRIVEE, "InnocentChoisi", new HashMap<>(), new HashMap<>());
		lieux.put("InnocentChoisi", InnocentChoisi);
		//template
		HashMap<String, Connaissance> PolicierVisible_cr = new HashMap<>();
		HashMap<String, Connaissance> PolicierVisible_ci = new HashMap<>();
		HashMap<String, Objet> PolicierVisible_or = new HashMap<>();
		Objet PolicierVisible_CarteEnquete = new Objet("CarteEnquete", 1, 1, false, vide, vide);
		PolicierVisible_or.put("CarteEnquete", PolicierVisible_CarteEnquete);
		HashMap<String, Objet> PolicierVisible_oi = new HashMap<>();
		Condition PolicierVisible = new Condition(PolicierVisible_or, PolicierVisible_cr, PolicierVisible_oi, PolicierVisible_ci);
		//end template
		//end template
		Personne Police = new Personne("Police", Paris, PolicierVisible, invalid, true);
		lieux.get("Paris").addPersonne(Police);
		Interaction parlerPolice = new Interaction("[Question: Bonjour jeune personne, on a trouvé un corps dans la Seine. La carte bleue du suspect a été utilisée pour acheter un billet à Toulouse et à Lyon, vous voulez aller où ?]");
		ArrayList<Objet> Lyon_cons = new ArrayList<>();
		ArrayList<Avantage> Lyon_don = new ArrayList<>();
		//end template
		//end template
		Objet Lyon_BilletAvion = new Objet("BilletAvion", 1, 1, false, invalid, invalid);
		Lyon_don.add(Lyon_BilletAvion);
		Choix Lyon_parlerPolice = new Choix("Lyon", "[Lyon, j'aime bien la pluie en plus ]", Lyon_cons, Lyon_don, true);
		parlerPolice.addChoix(Lyon_parlerPolice);
		ArrayList<Objet> Toulouse_cons = new ArrayList<>();
		ArrayList<Avantage> Toulouse_don = new ArrayList<>();
		//end template
		//end template
		Objet Toulouse_BilletTGV = new Objet("BilletTGV", 1, 1, false, invalid, invalid);
		Toulouse_don.add(Toulouse_BilletTGV);
		Choix Toulouse_parlerPolice = new Choix("Toulouse", "[Toulouse, meilleur ville du monde en plus ]", Toulouse_cons, Toulouse_don, true);
		parlerPolice.addChoix(Toulouse_parlerPolice);
		Police.addInteraction(parlerPolice);
		//template
		HashMap<String, Connaissance> Policier_cr = new HashMap<>();
		HashMap<String, Connaissance> Policier_ci = new HashMap<>();
		HashMap<String, Objet> Policier_or = new HashMap<>();
		Objet Policier_CarteEnquete = new Objet("CarteEnquete", 1, 1, false, vide, vide);
		Policier_or.put("CarteEnquete", Policier_CarteEnquete);
		HashMap<String, Objet> Policier_oi = new HashMap<>();
		Condition Policier = new Condition(Policier_or, Policier_cr, Policier_oi, Policier_ci);
		//end template
		//end template
		Personne Suspect1Lyon = new Personne("Suspect1Lyon", Lyon, Policier, invalid, true);
		lieux.get("Lyon").addPersonne(Suspect1Lyon);
		Interaction Suspect1 = new Interaction("[Question: Bonjour inspecteur, ce n'est pas moi, je vous jure]");
		ArrayList<Objet> S1_cons = new ArrayList<>();
		//end template
		//end template
		Objet S1_Pistolet = new Objet("Pistolet", 1, 1, false, invalid, invalid);
		S1_cons.add(S1_Pistolet);
		ArrayList<Avantage> S1_don = new ArrayList<>();
		//end template
		//end template
		Objet S1_InnocentTue = new Objet("InnocentTue", 1, 1, false, invalid, invalid);
		S1_don.add(S1_InnocentTue);
		Choix S1_Suspect1 = new Choix("S1", "[Si c'est vous, je vais vous tuer]", S1_cons, S1_don, true);
		Suspect1.addChoix(S1_Suspect1);
		ArrayList<Objet> S2_cons = new ArrayList<>();
		ArrayList<Avantage> S2_don = new ArrayList<>();
		Choix S2_Suspect1 = new Choix("S2", "[Ok, bonne continuation, au revoir]", S2_cons, S2_don, true);
		Suspect1.addChoix(S2_Suspect1);
		Suspect1Lyon.addInteraction(Suspect1);
		//template
		HashMap<String, Connaissance> Suspect2_cr = new HashMap<>();
		HashMap<String, Connaissance> Suspect2_ci = new HashMap<>();
		HashMap<String, Objet> Suspect2_or = new HashMap<>();
		Objet Suspect2_CarteEnquete = new Objet("CarteEnquete", 1, 1, false, vide, vide);
		Suspect2_or.put("CarteEnquete", Suspect2_CarteEnquete);
		HashMap<String, Objet> Suspect2_oi = new HashMap<>();
		Objet Suspect2_InnocentTue = new Objet("InnocentTue", 1, 1, false, vide, vide);
		Suspect2_oi.put("InnocentTue", Suspect2_InnocentTue);
		Condition Suspect2 = new Condition(Suspect2_or, Suspect2_cr, Suspect2_oi, Suspect2_ci);
		//end template
		//end template
		Personne Suspect2Lyon = new Personne("Suspect2Lyon", Lyon, Suspect2, invalid, true);
		lieux.get("Lyon").addPersonne(Suspect2Lyon);
		Interaction ParlerSuspect = new Interaction("[Question: Bonjour inspecteur, j'était en train de pécher ce dimanche à Paris, sinon rien de spécial]");
		ArrayList<Objet> R1_cons = new ArrayList<>();
		ArrayList<Avantage> R1_don = new ArrayList<>();
		//end template
		//end template
		Objet R1_CoupableMenote = new Objet("CoupableMenote", 1, 1, false, invalid, invalid);
		R1_don.add(R1_CoupableMenote);
		Choix R1_ParlerSuspect = new Choix("R1", "[AAAAh, votre alibi est nul, c'est vous]", R1_cons, R1_don, true);
		ParlerSuspect.addChoix(R1_ParlerSuspect);
		ArrayList<Objet> R2_cons = new ArrayList<>();
		ArrayList<Avantage> R2_don = new ArrayList<>();
		//end template
		//end template
		Objet R2_InnocentMenote = new Objet("InnocentMenote", 1, 1, false, invalid, invalid);
		R2_don.add(R2_InnocentMenote);
		Choix R2_ParlerSuspect = new Choix("R2", "C'est pas vous, vous m'avez convaincu, je vais arreter quelqu'un quelqu'un d'autre]", R2_cons, R2_don, true);
		ParlerSuspect.addChoix(R2_ParlerSuspect);
		Suspect2Lyon.addInteraction(ParlerSuspect);
		//end template
		//end template
		Personne Suspect1Toulouse = new Personne("Suspect1Toulouse", Toulouse, invalid, invalid, true);
		lieux.get("Toulouse").addPersonne(Suspect1Toulouse);
		Interaction S1 = new Interaction("[Question: Bonjour inspecteur, ce n'est pas moi, je vous jure]");
		ArrayList<Objet> C1_cons = new ArrayList<>();
		//end template
		//end template
		Objet C1_Pistolet = new Objet("Pistolet", 1, 1, false, invalid, invalid);
		C1_cons.add(C1_Pistolet);
		ArrayList<Avantage> C1_don = new ArrayList<>();
		//end template
		//end template
		Objet C1_InnocentTue = new Objet("InnocentTue", 1, 1, false, invalid, invalid);
		C1_don.add(C1_InnocentTue);
		Choix C1_S1 = new Choix("C1", "[Si c'est vous, je vais vous tuer]", C1_cons, C1_don, true);
		S1.addChoix(C1_S1);
		ArrayList<Objet> C2_cons = new ArrayList<>();
		ArrayList<Avantage> C2_don = new ArrayList<>();
		Choix C2_S1 = new Choix("C2", "[Ok, bonne continuation, au revoir]", C2_cons, C2_don, true);
		S1.addChoix(C2_S1);
		Suspect1Toulouse.addInteraction(S1);
		Interaction S2 = new Interaction("[Question: Bonjour inspecteur, j'était en train de pécher ce dimanche à Paris, sinon rien de spécial]");
		ArrayList<Objet> R1S2_cons = new ArrayList<>();
		ArrayList<Avantage> R1S2_don = new ArrayList<>();
		//end template
		//end template
		Objet R1S2_CoupableMenote = new Objet("CoupableMenote", 1, 1, false, invalid, invalid);
		R1S2_don.add(R1S2_CoupableMenote);
		Choix R1S2_S2 = new Choix("R1S2", "[AAAAh, votre alibi est nulle, c'est vous]", R1S2_cons, R1S2_don, true);
		S2.addChoix(R1S2_S2);
		ArrayList<Objet> R2S2_cons = new ArrayList<>();
		ArrayList<Avantage> R2S2_don = new ArrayList<>();
		//end template
		//end template
		Objet R2S2_InnocentMenote = new Objet("InnocentMenote", 1, 1, false, invalid, invalid);
		R2S2_don.add(R2S2_InnocentMenote);
		Choix R2S2_S2 = new Choix("R2S2", "[C'est pas vous, vous m'avez convaincu, je vais arreter quelqu'un d'autre]", R2S2_cons, R2S2_don, true);
		S2.addChoix(R2S2_S2);
		Suspect1Toulouse.addInteraction(S2);
		//template
		HashMap<String, Connaissance> AvoirBilletTGV_cr = new HashMap<>();
		HashMap<String, Connaissance> AvoirBilletTGV_ci = new HashMap<>();
		HashMap<String, Objet> AvoirBilletTGV_or = new HashMap<>();
		Objet AvoirBilletTGV_BilletTGV = new Objet("BilletTGV", 1, 1, false, vide, vide);
		AvoirBilletTGV_or.put("BilletTGV", AvoirBilletTGV_BilletTGV);
		HashMap<String, Objet> AvoirBilletTGV_oi = new HashMap<>();
		Condition AvoirBilletTGV = new Condition(AvoirBilletTGV_or, AvoirBilletTGV_cr, AvoirBilletTGV_oi, AvoirBilletTGV_ci);
		//end template
		//end template
		Chemin TGV = new Chemin("TGV", Paris, Toulouse, AvoirBilletTGV, false, invalid);
		chemins.put("TGV", TGV);
		lieux.get("Paris").addChemin(TGV);
		//template
		HashMap<String, Connaissance> AvoirBilletAvion_cr = new HashMap<>();
		HashMap<String, Connaissance> AvoirBilletAvion_ci = new HashMap<>();
		HashMap<String, Objet> AvoirBilletAvion_or = new HashMap<>();
		Objet AvoirBilletAvion_BilletAvion = new Objet("BilletAvion", 1, 1, false, vide, vide);
		AvoirBilletAvion_or.put("BilletAvion", AvoirBilletAvion_BilletAvion);
		HashMap<String, Objet> AvoirBilletAvion_oi = new HashMap<>();
		Condition AvoirBilletAvion = new Condition(AvoirBilletAvion_or, AvoirBilletAvion_cr, AvoirBilletAvion_oi, AvoirBilletAvion_ci);
		//end template
		//end template
		Chemin Avion = new Chemin("Avion", Paris, Lyon, AvoirBilletAvion, false, invalid);
		chemins.put("Avion", Avion);
		lieux.get("Paris").addChemin(Avion);
		//template
		HashMap<String, Connaissance> Lyon1_cr = new HashMap<>();
		HashMap<String, Connaissance> Lyon1_ci = new HashMap<>();
		HashMap<String, Objet> Lyon1_or = new HashMap<>();
		Objet Lyon1_InnocentTue = new Objet("InnocentTue", 1, 1, false, vide, vide);
		Lyon1_or.put("InnocentTue", Lyon1_InnocentTue);
		HashMap<String, Objet> Lyon1_oi = new HashMap<>();
		Condition Lyon1 = new Condition(Lyon1_or, Lyon1_cr, Lyon1_oi, Lyon1_ci);
		//end template
		//end template
		Chemin PerduLyon = new Chemin("PerduLyon", Lyon, InnocentChoisi, Lyon1, true, invalid);
		chemins.put("PerduLyon", PerduLyon);
		lieux.get("Lyon").addChemin(PerduLyon);
		//template
		HashMap<String, Connaissance> Lyon2_cr = new HashMap<>();
		HashMap<String, Connaissance> Lyon2_ci = new HashMap<>();
		HashMap<String, Objet> Lyon2_or = new HashMap<>();
		Objet Lyon2_InnocentMenote = new Objet("InnocentMenote", 1, 1, false, vide, vide);
		Lyon2_or.put("InnocentMenote", Lyon2_InnocentMenote);
		HashMap<String, Objet> Lyon2_oi = new HashMap<>();
		Condition Lyon2 = new Condition(Lyon2_or, Lyon2_cr, Lyon2_oi, Lyon2_ci);
		//end template
		//end template
		Chemin PerduLyon2 = new Chemin("PerduLyon2", Lyon, InnocentChoisi, Lyon2, true, invalid);
		chemins.put("PerduLyon2", PerduLyon2);
		lieux.get("Lyon").addChemin(PerduLyon2);
		//template
		HashMap<String, Connaissance> Toulouse1_cr = new HashMap<>();
		HashMap<String, Connaissance> Toulouse1_ci = new HashMap<>();
		HashMap<String, Objet> Toulouse1_or = new HashMap<>();
		Objet Toulouse1_InnocentTue = new Objet("InnocentTue", 1, 1, false, vide, vide);
		Toulouse1_or.put("InnocentTue", Toulouse1_InnocentTue);
		HashMap<String, Objet> Toulouse1_oi = new HashMap<>();
		Condition Toulouse1 = new Condition(Toulouse1_or, Toulouse1_cr, Toulouse1_oi, Toulouse1_ci);
		//end template
		//end template
		Chemin PerduToulouse = new Chemin("PerduToulouse", Toulouse, InnocentChoisi, Toulouse1, true, invalid);
		chemins.put("PerduToulouse", PerduToulouse);
		lieux.get("Toulouse").addChemin(PerduToulouse);
		//template
		HashMap<String, Connaissance> Toulouse2_cr = new HashMap<>();
		HashMap<String, Connaissance> Toulouse2_ci = new HashMap<>();
		HashMap<String, Objet> Toulouse2_or = new HashMap<>();
		Objet Toulouse2_InnocentMenote = new Objet("InnocentMenote", 1, 1, false, vide, vide);
		Toulouse2_or.put("InnocentMenote", Toulouse2_InnocentMenote);
		HashMap<String, Objet> Toulouse2_oi = new HashMap<>();
		Condition Toulouse2 = new Condition(Toulouse2_or, Toulouse2_cr, Toulouse2_oi, Toulouse2_ci);
		//end template
		//end template
		Chemin PerduToulouse2 = new Chemin("PerduToulouse2", Toulouse, InnocentChoisi, Toulouse2, true, invalid);
		chemins.put("PerduToulouse2", PerduToulouse2);
		lieux.get("Toulouse").addChemin(PerduToulouse2);
		//template
		HashMap<String, Connaissance> LyonWin_cr = new HashMap<>();
		HashMap<String, Connaissance> LyonWin_ci = new HashMap<>();
		HashMap<String, Objet> LyonWin_or = new HashMap<>();
		Objet LyonWin_CoupableMenote = new Objet("CoupableMenote", 1, 1, false, vide, vide);
		LyonWin_or.put("CoupableMenote", LyonWin_CoupableMenote);
		HashMap<String, Objet> LyonWin_oi = new HashMap<>();
		Condition LyonWin = new Condition(LyonWin_or, LyonWin_cr, LyonWin_oi, LyonWin_ci);
		//end template
		//end template
		Chemin GagneLyon = new Chemin("GagneLyon", Lyon, AssassinTrouve, LyonWin, true, invalid);
		chemins.put("GagneLyon", GagneLyon);
		lieux.get("Lyon").addChemin(GagneLyon);
		//template
		HashMap<String, Connaissance> ToulouseWin_cr = new HashMap<>();
		HashMap<String, Connaissance> ToulouseWin_ci = new HashMap<>();
		HashMap<String, Objet> ToulouseWin_or = new HashMap<>();
		Objet ToulouseWin_CoupableMenote = new Objet("CoupableMenote", 1, 1, false, vide, vide);
		ToulouseWin_or.put("CoupableMenote", ToulouseWin_CoupableMenote);
		HashMap<String, Objet> ToulouseWin_oi = new HashMap<>();
		Condition ToulouseWin = new Condition(ToulouseWin_or, ToulouseWin_cr, ToulouseWin_oi, ToulouseWin_ci);
		//end template
		//end template
		Chemin GagneToulouse = new Chemin("GagneToulouse", Toulouse, AssassinTrouve, ToulouseWin, true, invalid);
		chemins.put("GagneToulouse", GagneToulouse);
		lieux.get("Toulouse").addChemin(GagneToulouse);
		Territoire terrain = new Territoire(lieux, chemins);
		HashMap<String, Objet> objetsExpl = new HashMap<>();
		//end template
		//end template
		Objet Pistolet_expl = new Objet("Pistolet", 1, 3, false, invalid, invalid);
		objetsExpl.put("Pistolet",Pistolet_expl);
		//end template
		//end template
		Objet CarteEnquete_expl = new Objet("CarteEnquete", 1, 1, false, invalid, invalid);
		objetsExpl.put("CarteEnquete",CarteEnquete_expl);
		HashMap<String, Connaissance> connaisExpl = new HashMap<>();
		Explorateur explorateur = new Explorateur(Paris, 4, objetsExpl, connaisExpl);
		Jeu Enquete = new Jeu(terrain, explorateur);
		Enquete.jouer();
	}

}

