package etudiant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Promo promotion = new Promo();
		System.out.println("Bonjour etudiant, faite votre choix pour rentrer les donnes");
		System.out.println("1- Creation Etudiant");
		System.out.println("2- Supprimer étudiant");
		System.out.println("3- Afficher Notes étudiants");
		System.out.println("4- Quitter");

		Scanner choix = new Scanner (System.in );
		int valeur = choix.nextInt(); 
		do {

		switch (valeur){
		case 1: 
			System.out.println("Annees :");
			choix.nextLine();
			int _annees=choix .nextInt();

			System.out.println("nom de la promo");
			choix.nextLine();
			String _nompromo=choix .nextLine();

			System.out.println("Nom etudiant :");
			choix.nextLine();
			String _nom=choix .nextLine();

			System.out.println("Prenom");
			choix.nextLine();
			String _prenom=choix .nextLine();
			System.out.println("Age");
			choix.nextLine();
			int _age=choix .nextInt();
			Etudiant etudiant1 = new Etudiant(_nom, _prenom, _age, _annees, _nompromo );
			
		case 2:
		
			System.out.println("supprimer etudiant !");
			break;
			
		case 3:
			System.out.println("notes etudiant");
			break;
		}
		
	}while(valeur != 4);


		}
	}
