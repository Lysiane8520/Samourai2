package personnages.principaux;

import personnages.Humain;

public class Yakusa extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakusa(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant commercant) {
		int butin = commercant.seFaireExtorquer();
		gagnerArgent(butin);
		reputation++;
		parler("J'ai piqué les " + butin + " sous de " + commercant.getNom() + ", ce qui me fait "
				+ getArgent() + " sous dans ma poche.");
	}

	public void gagnerDuel() {
		reputation++;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan " + clan + " ? Ha ha ha !");
	}

	public int perdreDuel() {
		int perte = getArgent();
		perdreArgent(perte);
		reputation--;
		parler("J'ai perdu mon duel et mes " + perte + " sous, snif...");
		return perte;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan + ".");
	}
}
