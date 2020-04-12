package fr.mtii.miniapp;
import java.util.ArrayList;


public class Abonnement {
	private String dateDebut;
	private ArrayList<Sport> sports = new ArrayList<Sport>();
	
	public Abonnement() {
		
	}
	
	public Abonnement(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	
	public int tarifs() {
		int t = 0;
		for(int i = 0; i < this.getSport().size(); i++) {
			t = this.getSport().get(i).getTarif() + t;
		}
		return t;
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
			System.out.println("le prix d'abonnement est : " + this.tarifs() + " Euros");
	}
	
	
	
	
	
	

	

}
