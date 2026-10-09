package personnages.secondaires;

import java.util.Random;

import personnages.principaux.Yakusa;

public class Ninja extends Yakusa {
	private static final String[] clansNinja = { "of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness" };
	private String clanSecret;

	public Ninja(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson, clan);
		String suffixe = switch (new Random().nextInt(clansNinja.length)) {
		case 0 -> clansNinja[0];
		case 1 -> clansNinja[1];
		case 2 -> clansNinja[2];
		case 3 -> clansNinja[3];
		default -> clansNinja[4];
		};
		this.clanSecret = clan + " " + suffixe;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("(mon clan secret est " + clanSecret
				+ " et maintenant que tu le sais, je vais devoir te tuer)");
	}
}
