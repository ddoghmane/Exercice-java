package com.crm.boapp;

import com.crm.bo.gestionGroupes;

public class gestionGroupesApp {

	public static void main(String[] args) {
		gestionGroupes gpr = new gestionGroupes(0, null, null, null);
		gpr.setNbrpers(3);
		gpr.setNom("daoud");
		gpr.affiche();
	}

	// TODO Auto-generated method stub

}
