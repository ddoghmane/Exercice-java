package com.crm.bo;

public class Voiture {
	public String marque;
	public String couleur;
	public String nombredeporte;
	public String boitemanuelle;
	public String boiteauto;
	public int prix;
	boolean pushStart = false;
	public int vitesse=0;

	
	public Voiture() {

		pushStart = true;

	}
	
	public boolean getPushStart() {
		return pushStart;
	}

	public void setPushStart(boolean start) {
		this.pushStart = start;

	}
	
	/**
	 * @return the vitesse
	 */
	public int getVitesse() {
		return vitesse;
	}

	/**
	 * @param vitesse the vitesse to set
	 */
	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	
	public void accelerer () {
		vitesse=vitesse++;
	}
	
	public void ralentir () {
		vitesse=vitesse--;
	}

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * @param marque the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	/**
	 * @return the nombredeporte
	 */
	public String getNombredeporte() {
		return nombredeporte;
	}

	/**
	 * @param nombredeporte the nombredeporte to set
	 */
	public void setNombredeporte(String nombredeporte) {
		this.nombredeporte = nombredeporte;
	}

	/**
	 * @return the boitemanuelle
	 */
	public String getBoitemanuelle() {
		return boitemanuelle;
	}

	/**
	 * @param boitemanuelle the boitemanuelle to set
	 */
	public void setBoitemanuelle(String boitemanuelle) {
		this.boitemanuelle = boitemanuelle;
	}

	/**
	 * @return the boiteauto
	 */
	public String getBoiteauto() {
		return boiteauto;
	}

	/**
	 * @param boiteauto the boiteauto to set
	 */
	public void setBoiteauto(String boiteauto) {
		this.boiteauto = boiteauto;
	}

	/**
	 * @return the prix
	 */
	public int getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(int prix) {
		this.prix = prix;
	}
}