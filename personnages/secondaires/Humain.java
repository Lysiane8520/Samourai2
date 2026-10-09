package histoires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Ronin;
import personnages.principaux.Samourai;
import personnages.principaux.Yakusa;
import personnages.secondaires.Colporteur;
import personnages.secondaires.GrandMere;
import personnages.secondaires.Ninja;
import personnages.secondaires.Traitre;

public class MonHistoire {

	public static void main(String[] args) {
		System.out.println("=== Histoire de base ===");
		Humain humain = new Humain("Prof", 10, "Porto");
		humain.direBonjour();
		humain.boire();

		Commercant commercant = new Commercant("Marchand", 35);
		commercant.direBonjour();

		Yakusa yakusa = new Yakusa("Yaku le noir", 42, "bière", "WarSong");
		yakusa.direBonjour();
		yakusa.extorquer(commercant);

		Ronin ronin = new Ronin("Roro", 61, "saké");
		ronin.donner(10, commercant);
		ronin.provoquer(yakusa);
		ronin.direBonjour();

		System.out.println("\n=== Samouraï (surcharge / polymorphisme) ===");
		Samourai akimoto = new Samourai("Akimoto", 20, "thé", "Miyamoto");
		akimoto.direBonjour();
		akimoto.boire();
		akimoto.boire("saké");
		Ronin musaichi = new Samourai("Musaichi", 20, "thé", "Miyamoto");
		musaichi.direBonjour(); // appelle la version de Samourai
		((Samourai) musaichi).boire("bière"); // re-cast nécessaire

		System.out.println("\n=== Traître ===");
		Traitre traitre = new Traitre("Judas", 5, "vin", "Shogun");
		traitre.direBonjour();
		Commercant victime = new Commercant("Kenji", 100);
		for (int i = 0; i < 4; i++) {
			victime.gagnerArgent(50);
			traitre.extorquer(victime);
		}
		traitre.faireLeGentil(humain, 100);
		traitre.direBonjour();

		System.out.println("\n=== Colporteur ===");
		Colporteur colporteur = new Colporteur("Hanzo", 80);
		yakusa.extorquer(colporteur);

		System.out.println("\n=== Ninja ===");
		Ninja ninja = new Ninja("Colibri", 0, "cyanure", "Long Fangs");
		ninja.direBonjour();

		System.out.println("\n=== Grand-mère ===");
		GrandMere mamie = new GrandMere("Mamie");
		mamie.direBonjour();
		mamie.boire();
		mamie.faireConnaissanceAvec(commercant);
		mamie.faireConnaissanceAvec(ronin);
		mamie.faireConnaissanceAvec(akimoto);
		mamie.faireConnaissanceAvec(yakusa);
		mamie.faireConnaissanceAvec(traitre);
		mamie.ragoter();
	}
}
