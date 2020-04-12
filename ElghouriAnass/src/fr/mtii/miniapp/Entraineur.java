package fr.mtii.miniapp;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class Entraineur extends Personne {
	private String specialite;
	private double salaire;
	
	public Entraineur(String n, String p, int i, String specialite) {
		super(n,p,i);
		this.specialite = specialite;
	}
	
	public Entraineur() {
		
	}
	
	
	@SuppressWarnings("unchecked")
	public Entraineur(String nom, String specialite, double salaire) throws IOException {
		super(nom);
		this.specialite = specialite;
		this.salaire = salaire;
		
		JSONObject jsonob = new JSONObject(); 
		jsonob.put("nom", nom);
		jsonob.put("specialite", specialite);
		jsonob.put("salaire", salaire);
		
		FileWriter file = new FileWriter("Entraineur " + nom +".json");
		file.write(jsonob.toString());
		file.flush();
		file.close();
	}

	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	
	

}
