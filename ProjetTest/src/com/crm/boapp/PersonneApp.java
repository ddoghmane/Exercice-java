package com.crm.boapp;

import com.crm.bo.Personne;

public class PersonneApp {

	public static void main(String[] args) {

		Personne pers = new Personne();
		pers.surnom = "Joe";
		pers.setNom("charih");
		System.out.println("bienvenue " + pers.getNom() + " (" + pers.surnom + ")");

		Personne pers1 = new Personne();
		pers1.surnom = "Stagiaire";
		pers1.setNom("Doghmane");
		pers1.setPrenom("Daoud");
//		System.out.println("bienvenue " + pers1.getNom() + " " + pers1.getPrenom() + " (" + pers1.surnom + ")");
		pers1.afficherDetails();

		Personne pers2 = new Personne();
		// pers2.afficherDetail();

		// Personne pers3= new Personne("Bob" , "Dylan");
		// System.out.println(pers3);

		// Déclencher une exception au déréférencement de l'objet
		// pers2= null;
		// System.out.println(pers2.getNom());
		
		pers2.setNom("Doghmane");
		pers2.setPrenom("Daoud");
		pers2.afficherDetails("en");

//		int a = 5;
//		int b = 5;
//		if (a == b) {
//			System.out.println("Les 2 entiers sont identiques");
//		}
//
//		Personne pers4 = new Personne("Khalil", "charih");
//		Personne pers5 = new Personne("Khalil", "charih");
//		if (pers4 == pers5) {
//			System.out.println("Les 2 objets sont identiques");
//		}
//		int nb = 5;
//		pers5.incrementenombre(nb);
//		System.out.println(nb);
	}

}
