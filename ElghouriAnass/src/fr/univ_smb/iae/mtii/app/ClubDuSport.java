package fr.univ_smb.iae.mtii.app;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONObject;

import com.google.gson.Gson;


public class ClubDuSport {
	private ArrayList<Adherent> adherents = new ArrayList<Adherent>();
	
	public ArrayList<Adherent> getAdherents() {
		return adherents;
	}
	
	public void ajouterAdherent(Adherent a) throws IOException {
		this.getAdherents().add(a);
		Gson json = new Gson();
		
		String response= json.toJson(a);
//		System.out.println(response);
		FileWriter file = new FileWriter("Adherent "+ a.getNom() +".json");
		file.write(response);
		file.flush();
		file.close();
		
		
	}
	
	public void listingDesAdherents() {
		if(this.getAdherents().size() == 0) {
			System.out.println("Il n'y a aucun adhérent au club !!");
		}
		else
			for(Adherent a : this.getAdherents())
				a.afficherInfoAdherent();
	}
	
	private Adherent rechercherAdherent(String a) {
			Adherent trouve = null;
			int i = 0;
			while (trouve == null && i < this.getAdherents().size()) {
				if(this.getAdherents().get(i).getNom().equals(a))
					trouve = this.getAdherents().get(i);
				i++; 
				}
			return trouve;
		}
	
	
	public void infoAdherent(String a) {
		try {
				this.rechercherAdherent(a).afficherInfo();
		} catch (NullPointerException e) {
			System.err.println("Le nom que vous avez entrez n'est pas enregistrer au club !");
		}
	
	}
	
	
	private void desabonner(Adherent ob) {
		if (this.getAdherents().contains(ob))
			this.getAdherents().remove(ob);
	}
	
	public void desabonner(String a) {
		if (this.rechercherAdherent(a) != null ) {
		this.desabonner(this.rechercherAdherent(a));
		System.out.println(a + " a été désabonné avec succès"); }
		else System.out.println("La personne que vous souhaitez désabonné n'existe pas !");
	}

	
	
}
