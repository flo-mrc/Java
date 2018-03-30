package etudiant;

import java.util.ArrayList;

/**
 * @author Florian
 *
 */
public class Promo {
	private String annee;
	private String nom;
	private ArrayList<Etudiant> etudiants;
	
	public Promo() {
		this.etudiants = new ArrayList<Etudiant>();
	}
	
	public String getAnnee() {
		return annee;
	}
	public void setAnnee(String annee) {
		this.annee = annee;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(ArrayList<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
	
	
}
