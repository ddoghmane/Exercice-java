package com.crm.bo;

import java.util.Date;


/**
 * Classe represantant une personne (nom, prenom, surnom)
 * 
 * @author Daoud
 * @version 1.0
 * @since 25/02/2020
 *
 */
public class Personne {
	//Attributs
	public String surnom;
	private String nom;
	private String prenom;
	protected Date dateNaissance;

	// Constructeur
	/**
	 * Constructeur sans paramètre
	 */
	public Personne() {
		nom = "";
		prenom = "";
		surnom = "";
		System.out.println("Construction d'un objet");
	}

	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}

	// Méthodes


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * Cette méthode renvoie la valeur de l'attribut nom
	 * 
	 * @return
	 */

	public void afficherDetails() {
		System.out.println("bienvenue " + nom + " " + prenom + " (" + surnom + ")");
	}

	/**
	 * Affichage des infos relatives à la personne
	 * 
	 * @param langue langue utilisée
	 */
	public void afficherDetails(String langue) {
		if (langue.equals("fr")) {

			System.out.println("bienvenue " + nom + " " + prenom + " (" + surnom + ")");
		}
		if (langue.equals("en")) {

			System.out.println("welcome " + nom + " " + prenom + " (" + surnom + ")");
		}
		
	}

	public int incrementenombre(int nb) {
		return nb++;
	}

}
