package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
	}

	public void donner(int n, Commercant c) {
		perdreArgent(n);
		parler("Tiens " + c.getNom() + ", voilà " + n + " sous.");
		c.recevoir(n);
	}

	public void provoquer(Yakusa y) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if (2 * honneur > y.getReputation()) {
			gagnerArgent(y.perdreDuel());
			honneur++;
			parler("Je t'ai eu petit yakusa !");
		} else {
			honneur--;
			y.gagnerDuel();
			parler("J'ai perdu mon duel et mon honneur... Ça ne se passera pas comme ça !");
		}
	}
}
