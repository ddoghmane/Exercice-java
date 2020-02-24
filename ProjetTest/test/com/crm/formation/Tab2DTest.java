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
		//parcours
		System.out.println("parcours du tableau:");
		for(int i= 0;i< tab2dim.length;i++) {
			for(int j=0;j<tab2dim[i].length;j++) {
				System.out.println(+i+j+tab2dim[i][j]);}}
				//declaration d'un tableau a 2 dimen,sion (colonnes variables)
				int[][]tab2Var1= new int[3][];
				tab2Var1[0]= new int [1];
				tab2Var1[1]= new int [2];
				tab2Var1[2]= new int[1];
				tab2Var1[0][0]=1;
				tab2Var1[1][0]=1;
				tab2Var1[1][1]=1;
				tab2Var1[2][0]=1;
				//parcours
				System.out.println("Parcours du tableau tab2Var1:");
				for(int i = 0;i<tab2Var1.length;i++) {
					for(int j=0;j<tab2Var1[i].length;j++) {
						System.out.print(tab2Var1[i][j]);
					}
					System.out.println();
				}
				System.out.println("\n\n");
				//declaration avec init(colonnes variables)
				int[][]tab2dVar2= {{1,1,1},{1,1,1,1,1,1},{1},{1,1,1,1,1,1,1}};
				//parcours du tablea
				System.out.println("Parcours du tableau tab2Var2:");
				for(int i = 0;i<tab2dVar2.length;i++) {
					for(int j =0;i<tab2dVar2[i].length;j++) {
						System.out.print(tab2dVar2[i][j]);
					}
					System.out.println();
			}
				//acceder a un mauvais indice
				
		
		// TODO Auto-generated method stub

	}

}
//declaration d'un tableau a 2 dimen,sion (colonnes variables)
