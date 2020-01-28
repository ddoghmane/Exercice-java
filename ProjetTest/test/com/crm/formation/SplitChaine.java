/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class SplitChaine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//chaine de caractere a spliter
		String strToSplit = "toto";
		//Le resultat  du split est stocké dans un tableau
		String[]tabSplit= strToSplit.split("o");
		//Parcours du tableau avec séparateur
		for(String str : tabSplit) {
			System.out.println(str);
		}
		// TODO Auto-generated method stub

	}

}
