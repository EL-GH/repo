package fr.univ_smb.iae.mtii.app;

public abstract class Personne {
	private String nom, prenom, email, ville;
	private int age, id, telephone;
	
	public Personne(String nom, String prenom, int id) {
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}
	
	public Personne() {
		
	}
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	
	
	public void afficherInfo() {
		System.out.print("Nom : " + this.getNom() + "\n" + "Prenom : " + this.getPrenom() + "\n" + "id : " + this.getId());
	}

}
