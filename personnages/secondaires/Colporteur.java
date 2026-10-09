package personnages.secondaires;

import personnages.principaux.Commercant;

public class Colporteur extends Commercant {

	public Colporteur(String nom, int argent) {
		super(nom, argent);
	}

	@Override
	public int seFaireExtorquer() {
		int perte = getArgent() / 2;
		perdreArgent(perte);
		parler("Je n'ai donné que " + perte + " sous, le reste est dans mes chaussettes ! Hi hi hi...");
		return perte;
	}
}
