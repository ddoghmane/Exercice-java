/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class ConditionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean estVraie = true;
		System.out.println("Début du programme");
		if (estVraie == true)
		{
			System.out.println("YES");
		}else {
			System.out.println("NO");
			System.out.println("WE CANNOT");
		}
		System.out.println("Fin programme");
		int nb= 3;
		String chaine = "OKK";
		if( nb>10 && chaine.equals("OK")) {
			System.out.println("Condition remplie");
		}else{
			if(nb>10||chaine.equals("OK")){
				System.out.println("Une des 2 condi est remple");
			}else {
				System.out.println("Aucune Condition remplie");
			}
		}
		// TODO Auto-generated method stub

	}

}
