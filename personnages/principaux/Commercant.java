package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");
	}

	public int seFaireExtorquer() {
		int perte = getArgent();
		perdreArgent(perte);
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		return perte;
	}

	public void recevoir(int n) {
		gagnerArgent(n);
		parler("Je te remercie généreux donateur !");
	}
}
