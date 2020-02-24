package com.crm.bo;

public class gestionGroupes {
	//attribut
	private  int nbrpers;
	private String prenom;
	private String nom;
	private String surnom;
//Opérations
	
	//public void gestionGroupes() {
		//nbrpers = 2;
		//prenom ="Daoud";
		//nom="Doghmane";
		//surnom = "Kakabaw";
		
	
	public gestionGroupes(int nbrpers,String prenom,String nom ,String surnom) {
		this.nbrpers=nbrpers;
		this.prenom=prenom;
		this.nom=nom;
		this.surnom=surnom;
		
	}
	/**
	 * @return the nbrpers
	 */
	public int getNbrpers() {
		return nbrpers;
	}
	/**
	 * @param nbrpers the nbrpers to set
	 */
	public void setNbrpers(int nbrpers) {
		this.nbrpers = nbrpers;
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
	 * @return the surnom
	 */
	public String getSurnom() {
		return surnom;
	}
	/**
	 * @param surnom the surnom to set
	 */
	public void setSurnom(String surnom) {
		this.surnom = surnom;
	}
	public void affiche() {
		System.out.println("Votre groupe est composé " + nbrpers + " persones " + prenom +" "+ nom +" "+ surnom);
	}
}
