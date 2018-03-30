package etudiant;

import java.util.ArrayList;

public class Etudiant {
	private String nom, prenom, nompromo;
	private int age, annees;
	private ArrayList<Integer> notes;

	public Etudiant (String _nom, String _prenom, int _age, int _annees, String _nompromo) {
		nom = _nom;
		setPrenom(_prenom);
		age = _age;
		setAnnees(_annees) ;
		setNompromo(_nompromo);
		notes = new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> getNotes() {
		return notes;
	}
	public void setNotes(ArrayList<Integer> notes) {
		this.notes = notes;
	}
	public int getAge() {
		return age;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	void setAge(int _age) {
		age = _age;

	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int getAnnees() {
		return annees;
	}

	public void setAnnees(int annees) {
		this.annees = annees;
	}

	public String getNompromo() {
		return nompromo;
	}

	public void setNompromo(String nompromo) {
		this.nompromo = nompromo;
	}
	
	
}
