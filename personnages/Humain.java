package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;

	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}

	public void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + ", j'aime boire du " + boisson + " et j'ai " + argent
				+ " sous en poche.");
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}

	public int getArgent() {
		return argent;
	}

	public String getBoisson() {
		return boisson;
	}

	public String getNom() {
		return nom;
	}

	public void gagnerArgent(int n) {
		argent += n;
	}

	public void perdreArgent(int n) {
		argent -= n;
	}
}
