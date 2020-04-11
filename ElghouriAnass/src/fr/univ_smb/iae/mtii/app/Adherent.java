package fr.univ_smb.iae.mtii.app;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class Adherent extends Personne {
	private Abonnement abonnement;
	
	public Adherent(String n, String p, int i, Abonnement abonnement) throws IOException {
		super(n,p,i);
//		JSONObject jsonob = new JSONObject(); 
//		jsonob.put("nom", n);
//		jsonob.put("prenom", p);
//		jsonob.put("id", i);
		this.abonnement = abonnement;
//		
//		FileWriter file = new FileWriter("Adherent " + n +".json");
//		file.write(jsonob.toString());
//		file.flush();
//		file.close();
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
	
//	public Adherent(String n, String p, int i) throws IOException{
//		JSONObject jsonob = new JSONObject(); 
//		jsonob.put("nom", n);
//		jsonob.put("prenom", p);
//		jsonob.put("id", i);
//		
//		FileWriter file = new FileWriter("Adherent " + n +".json");
//		file.write(jsonob.toString());
//		file.flush();
//		file.close();
//		
//	}
	
	

}
