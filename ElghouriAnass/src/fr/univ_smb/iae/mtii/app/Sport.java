package fr.univ_smb.iae.mtii.app;

public class Sport {
	
	private String libelle;
	private Entraineur entraineur;
	
	public Sport(String libelle, Entraineur entraineur) {
		this.libelle = libelle;
		this.entraineur = entraineur;
	}
	
	public Sport() {
		
	}
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Entraineur getEntraineur() {
		return entraineur;
	}
	public void setEntraineur(Entraineur entraineur) {
		this.entraineur = entraineur;
	}
	
	public void sportInfo() {
		System.out.println(this.getLibelle() + " avec l'entraineur " + this.getEntraineur().getNom() + " " + this.getEntraineur().getPrenom());
	}

}
