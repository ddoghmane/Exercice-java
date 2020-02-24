package com.crm.boapp;

import java.util.Vector;
import com.crm.bo.Personne;

public class VectorApp {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Vector groupe = new Vector();

		Personne michael = new Personne("michael", "Jordan");
		Personne lebron = new Personne("lebron", "james");

		groupe.addElement(michael);
		groupe.addElement(lebron);

		Personne unBasketteur1 = (Personne) groupe.get(0);

		System.out.println(unBasketteur1.getNom());

		System.out.println("Mon équipe a : " + groupe.size() + "joueurs");

		Personne kobe = new Personne("Kobe", "Bryant");
		groupe.addElement(kobe);
		System.out.println("Mon équipe a :" + groupe.size() + "joueurs");
		System.out.println("Le joueur Lebron James est a la" + (groupe.indexOf(lebron)));

		lebron.surnom = "the king";
		Personne lebronModif = (Personne) groupe.get(1);
		System.out.println("Le surnom de lebron James est" + lebronModif.surnom);

	}

}
