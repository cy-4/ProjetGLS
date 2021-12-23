package jeu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Jeu {
	
	private Territoire territoire;
	protected static Explorateur explorateur;
	protected static Scanner scan = new Scanner(System.in);
	
	public Jeu (Territoire territoire,Explorateur explorateur) {	
		this.territoire = territoire;
		Jeu.explorateur = explorateur;
	}
	
	public void jouer() {
		System.out.println("Veuillez entrer votre nom :");
		Jeu.explorateur.setName(Jeu.scan.nextLine());
		System.out.println("");
		boolean lieu = true;
		Commande com = afficherChoix(lieu, Jeu.explorateur.getPosition());
		while(true) {
			switch(com) {
			case CHEMIN:
				lieu = prendreChemin(Jeu.explorateur.getPosition());
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
			case INVENTAIRE:
				afficherInventaire();
			// attendre
			default:
			}
			try {
				if (((Lieu) Jeu.explorateur.getPosition()).getNature() == Nature.ARRIVEE) {
					System.out.println(Jeu.explorateur.getName() + ", le jeu est terminé");
					break;
				}
				lieu = true;
			} catch (Exception e) {
				lieu = false;
			}
			com = afficherChoix(lieu, Jeu.explorateur.getPosition());
		}
	}
	
	private void afficherInventaire() {
		System.out.println(Jeu.explorateur.getName() + ", vous possédez :");
		if (Jeu.explorateur.getInventaire().size() > 0) {
			System.out.println(" - les objets suivants : ");
			for (Objet o : Jeu.explorateur.getInventaire().values()) {
				System.out.println("    " + o.getName() + " x" + o.getQuantite());
			}
		}
		if (Jeu.explorateur.getCompetences().size() > 0) {
			System.out.println(" - les connaissances suivantes :");
			for (Connaissance c : Jeu.explorateur.getCompetences().values()) {
				System.out.println("    " + c.getName());
			}
		}
		System.out.println("");
	}

	private Commande afficherChoix(boolean l, Place p) {
		System.out.println(Jeu.explorateur.getName() + ", vous êtes à "
				+ Jeu.explorateur.getPosition().getName());
		boolean changement = true;
		boolean lieu = l;
		ArrayList<Boolean> L;
		while (changement) {
			L = actionsAuto(lieu, Jeu.explorateur.getPosition());
			lieu = L.get(0);
			changement = L.get(1);
		}
		System.out.println("Vous pouvez :");
		int nbChoix = 0;
		HashMap<Integer, Commande> possib = new HashMap<Integer, Commande>();
		System.out.println("0 - Afficher inventaire");
		possib.put(0, Commande.INVENTAIRE);
		nbChoix++;
		if (lieu) {
			HashMap<String, Chemin> chemins = (HashMap<String, Chemin>) ((Lieu) p).getChemins();
			for (Chemin c : chemins.values()) {
				try {
					if (c.isVisible()) {
						System.out.println(nbChoix + " - Prendre chemin");
						possib.put(nbChoix, Commande.CHEMIN);
						nbChoix++;
						break;
					}
				} catch (QuantiteInsuffisanteException e) {
					//on n'affiche pas le message, aucun intérêt à ce niveau
				}
			}
			HashMap<String, Personne> personnes = (HashMap<String, Personne>) ((Lieu) p).getPersonnes();
			for (Personne pe : personnes.values()) {
				try {
					if (pe.isVisible()) {
						System.out.println(nbChoix + " - Parler à une personne");
						possib.put(nbChoix, Commande.PARLER);
						nbChoix++;
						break;
					}
				} catch (QuantiteInsuffisanteException e) {
					//on n'affiche pas le message, aucun intérêt à ce niveau
				}
			}
		} else {
			System.out.println(nbChoix + " - Avancer");
			possib.put(nbChoix, Commande.LIEU);
			nbChoix++;
		}
		HashMap<String, Objet> objets = (HashMap<String, Objet>) p.getObjets();
		for (Objet o : objets.values()) {
			try {
				if (o.isVisible()) {
					System.out.println(nbChoix + " - Prendre objet");
					possib.put(nbChoix, Commande.OBJET);
					nbChoix++;
					break;
				}
			} catch (QuantiteInsuffisanteException e) {
				//on n'affiche pas le message, aucun intérêt à ce niveau
			}
		}
		HashMap<String, Connaissance> connaissances = (HashMap<String, Connaissance>) p.getConnaissances();
		for (Connaissance c : connaissances.values()) {
			try {
				if (c.isVisible()) {
					System.out.println(nbChoix + " - Apprendre connaissance");
					possib.put(nbChoix, Commande.CONNAISSANCE);
					nbChoix++;
					break;
				}
			} catch (QuantiteInsuffisanteException e) {
				//on n'affiche pas le message, aucun intérêt à ce niveau
			}
		}
		System.out.println("Entrez le chiffre de votre choix :");
		int choix = Jeu.scan.nextInt();
		System.out.println("");
		return possib.get(choix);
	}
	
	private ArrayList<Boolean> actionsAuto(boolean lieu, Place p) {
		ArrayList<Boolean> L = new ArrayList<>();
		L.add(0, lieu);
		if (lieu) {
			HashMap<String, Personne> personnes = (HashMap<String, Personne>) ((Lieu) p).getPersonnes();
			for (Personne pe : personnes.values()) {
				try {
					if (pe.isObligatoire() && pe.isActif() && pe.isVisible()) {
						try {
							System.out.println("Vous parlez avec " + pe.getName());
							boolean t = pe.interagir();
							L.add(1,t);
						} catch (ObjetAbsentException | QuantiteInsuffisanteException | InventairePleinException e) {
							System.out.println(e.getMessage());
							L.add(1, false);
						}
					}
				} catch (QuantiteInsuffisanteException e) {
				}
			}
			HashMap<String, Chemin> chemins = (HashMap<String, Chemin>) ((Lieu) p).getChemins();
			for (Chemin c : chemins.values()) {
				try {
					if (c.isObligatoire() && c.isOuvert() && c.isVisible()) {
						L.add(1,true);
						System.out.println(Jeu.explorateur.getName() + ", vous prenez le chemin obligatoire : " + c.getName());
						Jeu.explorateur.setPosition(c);
						L.add(0, false);
						return L;
					}
				} catch (QuantiteInsuffisanteException e) {
					L.add(1, false);
				}
			}
		}
		try {
			L.get(1);
		} catch (Exception e) {
			L.add(1, false);
		}
		return L;
	}

	private boolean prendreChemin(Place p) {
		HashMap<String, Chemin> chemins = (HashMap<String, Chemin>) ((Lieu) p).getChemins();
		HashMap<Integer, String> choixCh = new HashMap<Integer, String>();
		Chemin chOblig = null;
		boolean oblig = false;
		int nbChoix = 1;
		for (Chemin c : chemins.values()) {
			if (c.isObligatoire()) {
				chOblig = c;
				oblig = true;
				break;
			}
		}
		if (oblig) {
			System.out.println(Jeu.explorateur.getName() + ", vous prenez le chemin obligatoire : " + chOblig.getName());
			System.out.println("");
			Jeu.explorateur.setPosition(chOblig);
			return false;
		} else {
			System.out.println(Jeu.explorateur.getName() + ", vous souhaitez suivre le chemin :");
			for (Chemin c : chemins.values()) {
				try {
					if (c.isVisible()) {
						System.out.println(nbChoix + " - " + c.getName());
						choixCh.put(nbChoix, c.getName());
						nbChoix++;
					}
				} catch (QuantiteInsuffisanteException e) {
					//on n'affiche pas le message, aucun intérêt à ce niveau
				}
			}
			System.out.println("Entrez le chiffre de votre choix :");
			int choix = Jeu.scan.nextInt();
			try {
				if (chemins.get(choixCh.get(choix)).isOuvert()) {
					Jeu.explorateur.setPosition(chemins.get(choixCh.get(choix)));
					return false;
				}
			} catch (QuantiteInsuffisanteException e) {
				System.out.println("Le chemin " + choixCh.get(choix) + " n'est pas encore ouvert");
				System.out.println(e.getMessage());
				return true;
			}
		}
		return true;
	}
	
	private void parler(Place p) {
		HashMap<String, Personne> personnes = (HashMap<String, Personne>) ((Lieu) p).getPersonnes();
		System.out.println(Jeu.explorateur.getName() + ", vous souhaitez parler à :");
		HashMap<Integer, String> choixP = new HashMap<Integer, String>();
		int nbChoix = 1;
		for (Personne pe : personnes.values()) {
			try {
				if (pe.isVisible()) {
					System.out.println(nbChoix + " - " + pe.getName());
					choixP.put(nbChoix, pe.getName());
					nbChoix++;
				}
			} catch (QuantiteInsuffisanteException e) {
				//on n'affiche pas le message, aucun intérêt à ce niveau
			}
		}
		System.out.println("Entrez le chiffre de votre choix :");
		int choix = Jeu.scan.nextInt();
		System.out.println("");
		try {
			personnes.get(choixP.get(choix)).interagir();
		} catch (ObjetAbsentException e) {
			System.out.println("Vous devez posséder l'objet : "
					+ e.getMessage() + " pour finir cette interaction");
			System.out.println("");
		} catch (QuantiteInsuffisanteException e) {
			System.out.println(e.getMessage() + " pour cette interaction");
			System.out.println("");
		} catch (InventairePleinException e) {
			System.out.println("Vous ne pouvez pas prendre l'objet : "
					+ e.getMessage() + ", votre inventaire est plein");
			System.out.println("");
		}
	}
	
	private void avancer(Place p) {
		System.out.println(Jeu.explorateur.getName() + ", vous avancez vers " + ((Chemin) p).getSucc().getName());
		System.out.println("");
		Jeu.explorateur.setPosition(((Chemin) p).getSucc());
	}
	
	private void apprendreConnaissance(Place p) {
		HashMap<String, Connaissance> connaissances = (HashMap<String, Connaissance>) p.getConnaissances();
		System.out.println(Jeu.explorateur.getName() + ", vous souhaitez apprendre :");
		HashMap<Integer, String> choixCo = new HashMap<Integer, String>();
		int nbChoix = 1;
		for (Connaissance c : connaissances.values()) {
			try {
				if (c.isVisible()) {
					System.out.println(nbChoix + " - " + c.getName());
					choixCo.put(nbChoix, c.getName());
					nbChoix++;
				}
			} catch (QuantiteInsuffisanteException e) {
				//on n'affiche pas le message, aucun intérêt à ce niveau
			}
		}
		System.out.println("Entrez le chiffre de votre choix :");
		int choix = Jeu.scan.nextInt();
		Jeu.explorateur.addCompetence(connaissances.get(choixCo.get(choix)));
	}
	
	private void prendreObjet(Place p) {
		HashMap<String, Objet> objets = (HashMap<String, Objet>) p.getObjets();
		System.out.println(Jeu.explorateur.getName() + ", vous souhaitez prendre :");
		HashMap<Integer, String> choixOb = new HashMap<Integer, String>();
		int nbChoix = 1;
		for (Objet o : objets.values()) {
			try {
				if (o.isVisible()) {
					System.out.println(nbChoix + " - " + o.getName());
					choixOb.put(nbChoix, o.getName());
					nbChoix++;
				}
			} catch (QuantiteInsuffisanteException e) {
				//on n'affiche pas le message, aucun intérêt à ce niveau
			}
		}
		System.out.println("Entrez le chiffre de votre choix :");
		int choix = Jeu.scan.nextInt();
		try {
			Jeu.explorateur.addObjet(objets.get(choixOb.get(choix)));
		} catch (InventairePleinException e) {
			System.out.println("Vous ne pouvez pas prendre l'objet : "
					+ choixOb.get(choix) + ", votre inventaire est plein");
		}
	}
	
}
