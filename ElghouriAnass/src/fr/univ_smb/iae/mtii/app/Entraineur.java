package fr.univ_smb.iae.mtii.app;

public class Entraineur extends Personne {
	private String specialite;
	private int salaire;
	
	public Entraineur(String n, String p, int i, String specialite) {
		super(n,p,i);
		this.specialite = specialite;
	}
	
	public Entraineur() {
		
	}
	
	
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public int getSalaire() {
		return salaire;
	}
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	
	
	

}
