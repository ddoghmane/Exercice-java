package com.crm.formation;

import java.util.Scanner;

public class MethodeTableaux {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int tailleTab;
		Scanner sc = new Scanner(System.in);
		System.out.println("entree la taille du tableau");

		tailleTab = sc.nextInt();

		// Création du tableau (vide)
		int[] tableau = new int[tailleTab];

		// Remplissage du tableau avec des valeurs demandées à l'utilisateur
		for (int i = 0; i < tableau.length; i++) {
			System.out.println("entree un chiffre");
			tableau[i] = sc.nextInt();
		}

		sc.close();
		
		int somme = methodeSomme(tableau);
		System.out.println("LA somme de mon tableau est : " + somme);

		/*
		 * tab1[0] = 18; tab1[1] = 19; tab1[2] = 14; tab1[3] = 178; tab1[4] = 1547;
		 */
		// System.out.println(methodeSomme(tab1));

	}

	public static int methodeSomme(int[] tabbis) {
		int somme = 0;
		for (int tabValeur : tabbis) {
			somme = somme + tabValeur;
			// System.out.println(tabValeur + " " + somme);

		}

		return somme;
	}
}
