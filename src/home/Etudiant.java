package home;

import java.io.Serializable;

public class Etudiant implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nom, prenom;
	private int numero;
	
	public Etudiant(String nom, String prenom, int numero) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	

}
