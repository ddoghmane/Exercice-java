package com.crm.bo;

public class RectangleAireEtPerimetre {
	// Attribut
	private double longueur;
	private double largeur;

	// Constructeur
	public RectangleAireEtPerimetre() {
		longueur = 87.6;
		largeur = 46.4;

	}

	public RectangleAireEtPerimetre(double longueur, double largeur) {
		this.largeur = largeur;
		this.longueur = longueur;
	}

	/**
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	/**
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public void afficherdetails() {
		System.out.println("La longueur est" + longueur);

	}

	public void afficherdetails1() {
		System.out.println("La largeur est " + largeur);

	}

	private double formuleaire() {
		return 2 * (longueur + largeur);

	}
	
	private double formuleaire(String cm) {
		
		return 2 * (longueur + largeur) ;
		
	}

	private double surface() {
		return (longueur * largeur);

	}

	public void afficher3() {

		System.out.println(formuleaire());

	}

	public void afficher(String nom) {
		System.out.println("Informations du rectangle " + nom + " : ");
		System.out.println("  longueur  : " + longueur);
		System.out.println("  largeur   : " + largeur);
		System.out.println("  perimetre : " + formuleaire());
		System.out.println("  surface   : " + surface());

	}
}