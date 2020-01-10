package com.crm.api;

public class Utils {

	public static final String COULEUR_BLEU = "bleu";

	public static int perimetreRectangle(int longueur, int largeur) {
		int p;
		p = (longueur + largeur) * 2;
		return p;

	}

	public static void affichermessage(String texte) {
		System.out.println(texte);
	}

	public static double airecercle(double pi, int R) {
		// Déclaration d'une constante PI
		final float PI = 3.14f;

		double airecercle1 = PI * R * R;
		return airecercle1;

	}

	public static double airecercle2(double rayon) {
		double aire = Math.PI * Math.pow(rayon, 2);
		return aire;
	}


}
