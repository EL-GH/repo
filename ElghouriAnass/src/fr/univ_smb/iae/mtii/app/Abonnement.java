package fr.univ_smb.iae.mtii.app;
import java.util.ArrayList;


public class Abonnement {
	private String dateDebut;
	private int prix;
	private ArrayList<Sport> sports = new ArrayList<Sport>();
	
	public Abonnement(String dateDebut, int prix) {
		this.dateDebut = dateDebut;
		this.prix = prix;
	}
	
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	public ArrayList<Sport> getSport() {
		return sports;
	}
		
	public void ajouterSport(Sport s) {
		this.getSport().add(s);
	}
	
	public void afficherSports() {
		if(this.getSport().size() == 0) {
			System.out.println("N'a pas ajouter le sport pratiquer !!");
		}
		else
			System.out.println("sport pratiquer :");
			for (Sport s : this.getSport())
				s.sportInfo();
	}
	
	
	
	
	
	

	

}
