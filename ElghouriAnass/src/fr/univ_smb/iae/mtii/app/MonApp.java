package fr.univ_smb.iae.mtii.app;

import java.io.IOException;

public class MonApp {

	public static void main(String[] args) throws IOException {
		
		ClubDuSport clubAnnecy; clubAnnecy = new ClubDuSport();
		Entraineur entrai1, entrai2; entrai1 = new Entraineur("SEFRA", "Alex", 99, "Natation"); entrai2 = new Entraineur("ALARCON", "Slim", 98, "Football");
		Sport s, s2; s = new Sport("Natation", 40, entrai1); s2 = new Sport("Football", 45, entrai2);
		Abonnement abonn1, abonn2; abonn1 = new Abonnement("12/12/2019"); abonn2 = new Abonnement("06/01/2020");
		abonn1.ajouterSport(s);abonn1.ajouterSport(s2); abonn2.ajouterSport(s2);
		Adherent j, p; j = new Adherent("RICHARD", "Jack", 123, abonn1); p = new Adherent("GRIZE", "Paul", 222, abonn2);
		
		clubAnnecy.ajouterAdherent(j);
		clubAnnecy.ajouterAdherent(p);
	//	clubAnnecy.infoAdherent("RICHAR");
		
	//	clubAnnecy.rechercherAdherent("RICHARD");
	//	clubAnnecy.desabonner("GRIZO");
		
		clubAnnecy.listingDesAdherents();
	//	clubAnnecy.infoAdherent("RICHRD");
	
		
	}

}
