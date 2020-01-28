/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class Tab2DTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Déclaration d'un tableau a 2 dimensions
		int[][]tab2d = new int[2][3];
		//déclaration avec init
		int[][]tab2dim = {{1,3,5},{0,2,4}};
		//Accès aux éléments
		System.out.println(tab2dim[0][0]);
		System.out.println(tab2dim[1][2]);
		
		//Modification d'un élément
		tab2dim[1][2]=224;
		System.out.println(tab2dim[1][2]);
		
		
		//taille
		System.out.println(tab2dim.length);
		
		//Nb colonne
		System.out.println(tab2dim[0].length);
		// TODO Auto-generated method stub

	}

}
