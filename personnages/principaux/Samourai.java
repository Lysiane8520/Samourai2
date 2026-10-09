package personnages.principaux;

public class Samourai extends Ronin {
	private String seigneur;

	public Samourai(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson);
		this.seigneur = seigneur;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + seigneur + ".");
	}

	// Surcharge (même nom, paramètre différent) : un samouraï boit ce qu'il veut
	public void boire(String boisson) {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
}
