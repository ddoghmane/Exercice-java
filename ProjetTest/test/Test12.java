import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class Test12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		class Principale {
			
			private Scanner scanner;
			private String tab[];
			private int n; //Longeur du tableau
			private String val; //Valeur d'un élément du tableau
			
			
			public void main(String[] args) {
				
				scanner = new Scanner(System.in);
				
				System.out.println("0");
				
				n = scanner.nextInt(); // Initialisation de n
				
				tab = new String[n]; //Initialisation du tableau vide avec n nombre total d'éléments
				
				for(int i = 0; i<n; i++){
					System.out.println("Entrez l'élément d'indice "+i+" du tableau");
					val = scanner.next();
					tab[i] = val;
				}
				
				System.out.println("\nListe des éléments du tableau");
				
				parcourirTableau(tab); //Affiche les contenus du tableau créé
				
				
			}
			
			//Méthode pour parcourir un tableau
			
			private void parcourirTableau(String[] tableau){
				
				 /* for(int i = 0; i<tableau.length; i++){
				  * System.out.println(tableau[i]);
		                      }
				  */
				
				for (String t : tableau){
					System.out.println(t); //Affiche les éléments du tableau pris en paramètre
				}
			}

		}//Fin de la classe
		// TODO Auto-generated method stub

	}

}
