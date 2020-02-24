package com.crm.bo;

public class CompteBancaire {
	private int numcompte;
	private int solde;
	private boolean decouvert;

	public CompteBancaire(){
		numcompte=56456524;
		solde = 5000;
		decouvert=true;
		
	}

	public CompteBancaire(int numcompte,int solde,boolean decouvert){
		
	}
	public void verser(int vr) {
		solde = solde+vr;
	}
	public void retirer(int rt) {
		solde=solde-rt;
	}

	/**
	 * @return the numcompte
	 */
	public int getNumcompte() {
		return numcompte;
	}

	/**
	 * @param numcompte the numcompte to set
	 */
	public void setNumcompte(int numcompte) {
		this.numcompte = numcompte;
	}

	/**
	 * @return the solde
	 */
	public int getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(int solde) {
		this.solde = solde;
	}

	/**
	 * @return the decouvert
	 */
	public boolean isDecouvert() {
		return decouvert;
	}

	/**
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(boolean decouvert) {
		this.decouvert = decouvert;
	}
	public void affiche() {
		System.out.println("numcompte" + numcompte + "solde"+solde);
	}
}
