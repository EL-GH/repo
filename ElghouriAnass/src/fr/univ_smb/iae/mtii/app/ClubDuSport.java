package fr.univ_smb.iae.mtii.app;
import java.util.ArrayList;

public class ClubDuSport {
	private ArrayList<Adherent> adherents = new ArrayList<Adherent>();
	
	public ArrayList<Adherent> getAdherents() {
		return adherents;
	}
	
	public void ajouterAdherent(Adherent a) {
		this.getAdherents().add(a);
	}
	
	public void listingDesAdherents() {
		if(this.getAdherents().size() == 0) {
			System.out.println("Il n'y a aucun adhérent au club !!");
		}
		else
			for(Adherent a : this.getAdherents())
				a.afficherInfoAdherent();
	}
	
	public Adherent rechercherAdherent(String a) {
		Adherent trouve = null;
		int i = 0;
		while (trouve == null && i < this.getAdherents().size()) {
			if(this.getAdherents().get(i).getNom().equals(a))
				trouve = this.getAdherents().get(i);
			i++;
		}
		return trouve;
	}
	
	public void desabonner(Adherent a) {
		if (this.getAdherents().contains(a))
			this.getAdherents().remove(a);
		
	}
	
	public void desabonner(String a) {
		this.desabonner(this.rechercherAdherent(a));
	}
	
	
	
	
}
