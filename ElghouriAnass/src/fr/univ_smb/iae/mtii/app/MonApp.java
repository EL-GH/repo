package fr.univ_smb.iae.mtii.app;

public class MonApp {

	public static void main(String[] args) {
		
		ClubDuSport clubAnnecy; clubAnnecy = new ClubDuSport();
		Entraineur entrai1, entrai2; entrai1 = new Entraineur("SEFRA", "Alex", 99, "Natation"); entrai2 = new Entraineur("ALARCON", "Slim", 98, "Football");
		Sport s, s2; s = new Sport("Natation", entrai1); s2 = new Sport("Football", entrai2);
		Abonnement abonn1, abonn2; abonn1 = new Abonnement("12/12/2019", 40); abonn2 = new Abonnement("06/01/2020", 25);
		abonn1.ajouterSport(s);abonn1.ajouterSport(s2); abonn2.ajouterSport(s2);
		Adherent j, p; j = new Adherent("RICHARD", "Jack", 123, abonn1); p = new Adherent("GRIZE", "Paul", 222, abonn2);
		
		clubAnnecy.ajouterAdherent(j);
		clubAnnecy.ajouterAdherent(p);
		
	//	clubAnnecy.rechercherAdherent("RICHARD").afficherInfo();
		clubAnnecy.desabonner("GRIZE");
		
		clubAnnecy.listingDesAdherents();
	
		
	}

}
