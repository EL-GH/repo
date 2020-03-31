package fr.univ_smb.iae.mtii.app;

public class Adherent extends Personne {
	private Abonnement abonnement;
	
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
	
	public void afficherInfoAdherent() {
		super.afficherInfo();
		System.out.println(", est adherent depuis le " + this.getAbonnement().getDateDebut());
		this.getAbonnement().afficherSports();
	}
	

}
