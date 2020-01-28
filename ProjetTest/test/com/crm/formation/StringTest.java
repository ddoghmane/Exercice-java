package com.crm.formation;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String texte = "Davai";
		System.out.println(texte);
		//test de la concaténatino
		texte=texte+" "+"la famille";
		System.out.println(texte);
		//longueur d'une chaine
		
		String str = "  Le plus fort n'est jamais assez fort pour etre toujours le maitre  ";
		System.out.println(str.length());
		//Mettre en majuscule
		String str2=str.toUpperCase();
		System.out.println(str2);
		//Suppression des blancs en début et fin de chaine
		String str3 =str.trim();
		System.out.println(str3);
		//Remplacer des caracteres
		String str4 = str.replace('a','e');
		System.out.println(str4);
		//Extraction d'une sous chaine
		String str5 =str.substring(15);
		System.out.println(str5);
		//Comparaison de chaines
		String chaine1="test";
		String chaine2="test1";
				System.out.println(chaine1.equals(chaine2));
				
		
	}

}