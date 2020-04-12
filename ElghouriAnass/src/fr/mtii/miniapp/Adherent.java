package fr.mtii.miniapp;

public class Adherent extends Personne {
	private Abonnement abonnement;
	private String sport;
	

	public Adherent(String n, String p, int i, Abonnement abonnement) {
		super(n,p,i);
		this.abonnement = abonnement;
	}
	
	public Adherent() {
		
	}


	public Abonnement getAbonnement() {
		return abonnement;
	}
	public void setAbonnement(Abonnement abonnement) {
		this.abonnement = abonnement;
	}
	
	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	
	public void afficherInfoAdherent() {
		super.afficherInfo();
		System.out.println(", est adherent depuis le " + this.getAbonnement().getDateDebut());
		this.getAbonnement().afficherSports();
	}
	

}
