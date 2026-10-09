package personnages.secondaires;

import java.util.Random;

import personnages.Humain;

public class GrandMere extends Humain {
	private static final int TAILLE_MEMOIRE = 30;
	private Humain[] memoire = new Humain[TAILLE_MEMOIRE];
	private int nbConnaissances = 0;
	private Random r = new Random();

	public GrandMere(String nom) {
		super(nom, 0, "tisane");
	}

	public void faireConnaissanceAvec(Humain humain) {
		if (nbConnaissances < TAILLE_MEMOIRE) {
			memoire[nbConnaissances] = humain;
			nbConnaissances++;
			parler("Enchantée " + humain.getNom() + " !");
		} else {
			parler("Ma mémoire est pleine, je ne peux plus retenir personne...");
		}
	}

	private String humainHasard() {
		return switch (r.nextInt(5)) {
		case 0 -> "Commerçant";
		case 1 -> "Ronin";
		case 2 -> "Samouraï";
		case 3 -> "Yakusa";
		default -> "Humain";
		};
	}

	public void ragoter() {
		for (int i = 0; i < nbConnaissances; i++) {
			Humain h = memoire[i];
			if (h instanceof Traitre) {
				parler("Je sais que " + h.getNom() + " est un traître !");
			} else {
				parler("Je crois que " + h.getNom() + " est un " + humainHasard() + ".");
			}
		}
	}
}
