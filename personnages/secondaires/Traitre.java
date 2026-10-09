package personnages.secondaires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Samourai;

public class Traitre extends Samourai {
	private int traitrise = 0;

	public Traitre(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson, seigneur);
	}

	public void extorquer(Commercant c) {
		if (traitrise >= 3) {
			parler("Mon niveau de traîtrise est à son maximum, je ne peux plus extorquer personne...");
			return;
		}
		parler("Tu vas payer, " + c.getNom() + ", sinon gare à toi !");
		int butin = c.seFaireExtorquer();
		gagnerArgent(butin);
		traitrise++;
		parler("Ça me fait " + butin + " sous de plus. Hé hé hé !");
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon niveau de traîtrise est de " + traitrise + ". Chut, c'est un secret !");
	}

	public void faireLeGentil(Humain h, int argent) {
		if (argent > getArgent()) {
			parler("Je n'ai pas assez d'argent pour faire le gentil...");
			return;
		}
		parler("Tiens " + h.getNom() + ", voilà " + argent + " sous. Nous sommes ami-ami, n'est-ce pas ?");
		perdreArgent(argent);
		h.gagnerArgent(argent);
		traitrise = Math.max(0, traitrise - argent / 10);
	}
}
