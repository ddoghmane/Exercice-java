package com.crm.boapp;

import com.crm.bo.CompteBancaire;

public class CompteBancaireApp {

	public static void main(String[] args) {
		CompteBancaire CB = new CompteBancaire();
	
		CB.verser(6000);
		CB.affiche();
		
		// TODO Auto-generated method stub

	}

}
