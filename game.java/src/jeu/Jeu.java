package jeu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Jeu {
	
	private Territoire territoire;
	protected static Explorateur explorateur;
	private List<ElementsJeu> elementsjeu;
	protected static Scanner scan = new Scanner(System.in);
	
	public Jeu (Territoire territoire,Explorateur explorateur,List<ElementsJeu> elementsjeu ) {	
		this.territoire = territoire;
		Jeu.explorateur = explorateur;
		this.elementsjeu =  elementsjeu;
	}
	
	public void jouer() {
		System.out.println("Veuillez entrer votre nom :");
		Jeu.explorateur.setName(Jeu.scan.nextLine());
		System.out.println(Jeu.explorateur.getName() + ", vous êtes à "
				+ Jeu.explorateur.getPosition().getName() + ". Vous pouvez :");
		boolean lieu = true;
		Commande com = afficherChoix(lieu, Jeu.explorateur.getPosition());
		while(com != Commande.QUITTER) {
			switch(com) {
			case CHEMIN:
				prendreChemin(Jeu.explorateur.getPosition());
				lieu = false;
				break;
			case PARLER:
				parler(Jeu.explorateur.getPosition());
				break;
			case LIEU:
				avancer(Jeu.explorateur.getPosition());
				lieu = true;
				break;
			case CONNAISSANCE:
				apprendreConnaissance(Jeu.explorateur.getPosition());
				break;
			case OBJET:
				prendreObjet(Jeu.explorateur.getPosition());
				break;
			// attendre
			default:
			}
			com = afficherChoix(lieu, Jeu.explorateur.getPosition());
		}
	}
	
	private Commande afficherChoix(boolean lieu, Place p) {
		System.out.println("0 - Quitter");
		System.out.println("1 - Attendre");
		int nbChoix = 2;
		HashMap<Integer, Commande> possib = new HashMap<Integer, Commande>();
		possib.put(0, Commande.QUITTER);
		possib.put(1, Commande.ATTENDRE);
		if (lieu) {
			HashMap<String, Chemin> chemins = (HashMap<String, Chemin>) ((Lieu) p).getChemins();
			for (Chemin c : chemins.values()) {
				if (c.isVisible()) {
					System.out.println(nbChoix + " - Prendre chemin");
					possib.put(nbChoix, Commande.CHEMIN);
					nbChoix++;
					break;
				}
			}
			HashMap<String, Personne> personnes = (HashMap<String, Personne>) ((Lieu) p).getPersonnes();
			for (Personne pe : personnes.values()) {
				if (pe.isVisible()) {
					System.out.println(nbChoix + " - Parler à une personne");
					possib.put(nbChoix, Commande.PARLER);
					nbChoix++;
					break;
				}
			}
		} else {
			System.out.println(nbChoix + " - Avancer");
			possib.put(nbChoix, Commande.LIEU);
			nbChoix++;
		}
		HashMap<String, Objet> objets = (HashMap<String, Objet>) p.getObjets();
		for (Objet o : objets.values()) {
			if (o.isVisible()) {
				System.out.println(nbChoix + " - Prendre objet");
				possib.put(nbChoix, Commande.OBJET);
				nbChoix++;
				break;
			}
		}
		HashMap<String, Connaissance> connaissances = (HashMap<String, Connaissance>) p.getConnaissances();
		for (Connaissance c : connaissances.values()) {
			if (c.isVisible()) {
				System.out.println(nbChoix + " - Apprendre connaissance");
				possib.put(nbChoix, Commande.CONNAISSANCE);
				nbChoix++;
				break;
			}
		}
		System.out.println(Jeu.explorateur.getName() + ", entrez le chiffre de votre choix :");
		int choix = Jeu.scan.nextInt();
		return possib.get(choix);
	}
	
	private void prendreChemin(Place p) {
		HashMap<String, Chemin> chemins = (HashMap<String, Chemin>) ((Lieu) p).getChemins();
		System.out.println(Jeu.explorateur.getName() + ", vous souhaitez suivre le chemin :");
		System.out.println("0 - Aucun");
		HashMap<Integer, String> choixCh = new HashMap<Integer, String>();
		Chemin chOblig = null;
		boolean oblig = false;
		int nbChoix = 1;
		for (Chemin c : chemins.values()) {
			if (c.isObligatoire()) {
				chOblig = c;
				break;
			}
		}
		if (oblig) {
			System.out.println("1 - " + chOblig.getName() + " (obligatoire)");
			
		} else {
			for (Chemin c : chemins.values()) {
				if (c.isVisible()) {
					System.out.println(nbChoix + " - " + c.getName());
					choixCh.put(nbChoix, c.getName());
					nbChoix++;
				}
			}
		}
		System.out.println(Jeu.explorateur.getName() + ", entrez le chiffre de votre choix :");
		int choix = Jeu.scan.nextInt();
		if (oblig) {
			if (choix == 1) {
				Jeu.explorateur.setPosition(chOblig);
			}
		} else {
			if (choix != 0) {
				if (chemins.get(choixCh.get(choix)).isOuvert()) {
					Jeu.explorateur.setPosition(chemins.get(choixCh.get(choix)));
				} else {
					System.out.println("Le chemin " + choixCh.get(choix) + " n'est pas encore ouvert");
				}
			}
		}
	}
	
	private void parler(Place p) {
		HashMap<String, Personne> personnes = (HashMap<String, Personne>) ((Lieu) p).getPersonnes();
		System.out.println(Jeu.explorateur.getName() + ", vous souhaitez parler à :");
		System.out.println("0 - Personne");
		HashMap<Integer, String> choixP = new HashMap<Integer, String>();
		int nbChoix = 1;
		for (Personne pe : personnes.values()) {
			if (pe.isVisible()) {
				System.out.println(nbChoix + " - " + pe.getName());
				choixP.put(nbChoix, pe.getName());
				nbChoix++;
			}
		}
		System.out.println(Jeu.explorateur.getName() + ", entrez le chiffre de votre choix :");
		int choix = Jeu.scan.nextInt();
		if (choix != 0) {
			try {
				personnes.get(choixP.get(choix)).interagir();
			} catch (ObjetAbsentException e) {
				System.out.println("Vous devez posséder l'objet : "
						+ e.getMessage() + " pour finir cette interaction");
			} catch (QuantiteInsuffisanteException e) {
				System.out.println("Vous n'avez pas assez de : "
						+ e.getMessage() + " pour cette interaction");
			} catch (InventairePleinException e) {
				System.out.println("Vous ne pouvez pas prendre l'objet : "
						+ e.getMessage() + ", votre inventaire est plein");
			}
		}
	}
	
	private void avancer(Place p) {
		System.out.println(Jeu.explorateur.getName() + ", vous souhaitez rejoindre :");
		System.out.println("0 - Rien");
		System.out.println("1 - " + ((Chemin) p).getPred().getName());
		System.out.println("2 - " + ((Chemin) p).getSucc().getName());
		System.out.println(Jeu.explorateur.getName() + ", entrez le chiffre de votre choix :");
		int choix = Jeu.scan.nextInt();
		if (choix == 1) {
			Jeu.explorateur.setPosition(((Chemin) p).getPred());
		} else if (choix == 2) {
			Jeu.explorateur.setPosition(((Chemin) p).getSucc());
		}
	}
	
	private void apprendreConnaissance(Place p) {
		HashMap<String, Connaissance> connaissances = (HashMap<String, Connaissance>) p.getConnaissances();
		System.out.println(Jeu.explorateur.getName() + ", vous souhaitez apprendre :");
		System.out.println("0 - Rien");
		HashMap<Integer, String> choixCo = new HashMap<Integer, String>();
		int nbChoix = 1;
		for (Connaissance c : connaissances.values()) {
			if (c.isVisible()) {
				System.out.println(nbChoix + " - " + c.getName());
				choixCo.put(nbChoix, c.getName());
				nbChoix++;
			}
		}
		System.out.println(Jeu.explorateur.getName() + ", entrez le chiffre de votre choix :");
		int choix = Jeu.scan.nextInt();
		if (choix != 0) {
			Jeu.explorateur.addCompetence(connaissances.get(choixCo.get(choix)));
		}
	}
	
	private void prendreObjet(Place p) {
		HashMap<String, Objet> objets = (HashMap<String, Objet>) p.getObjets();
		System.out.println(Jeu.explorateur.getName() + ", vous souhaitez prendre :");
		System.out.println("0 - Rien");
		HashMap<Integer, String> choixOb = new HashMap<Integer, String>();
		int nbChoix = 1;
		for (Objet o : objets.values()) {
			if (o.isVisible()) {
				System.out.println(nbChoix + " - " + o.getName());
				choixOb.put(nbChoix, o.getName());
				nbChoix++;
			}
		}
		System.out.println(Jeu.explorateur.getName() + ", entrez le chiffre de votre choix :");
		int choix = Jeu.scan.nextInt();
		if (choix != 0) {
			try {
				Jeu.explorateur.addObjet(objets.get(choixOb.get(choix)));
			} catch (InventairePleinException e) {
				System.out.println("Vous ne pouvez pas prendre l'objet : "
						+ choixOb.get(choix) + ", votre inventaire est plein");
			}
		}
	}
	
}
