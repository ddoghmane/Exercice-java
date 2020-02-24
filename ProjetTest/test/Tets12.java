import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class Tets12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrez le nombre total d'éléments du tableau à remplir");
		
		int n = scanner.nextInt(); // Initialisation de n
		
		String[] tab = new String[n]; //Initialisation du tableau vide avec n nombre total d'éléments
		
		for(int i = 0; i<n; i++){
//			System.out.println( "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche" );
			String val = scanner.next();
			tab[i] = val;
			String tabInt1[] = { "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche" };
		}
		
		System.out.println("\nListe des éléments du tableau");
		
		parcourirTableau(tab); //Affiche les contenus du tableau créé
		
		
	}
		// TODO Auto-generated method stub

	private static void parcourirTableau(String[] tab) {
		// TODO Auto-generated method stub
		
	}

	}


