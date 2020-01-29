import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class ExerciceMatrice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Etape 1 : Déclaration des variables
		final String LANGUE_FR = "francais";
		final String LANGUE_EN = "anglais";
		Scanner sc = new Scanner(System.in);

		// Etape 2 : Création du tableau avec les mots à traduire
		String[][] tab2dimJoursTraduits = { { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendred", "Samedi", "Dimanche" },
				{ "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" } };

		// Etape 3 : Récupération des infos utilisateur
		System.out.println("Quelle est la langue source?");
		String languesource = sc.next();
		System.out.println("Quel jour voulez vous traduire");
		String jouratraduire = sc.next();

		// Etape 4 : Identification de la langue origine
		if (languesource.equalsIgnoreCase(LANGUE_FR)) {
			System.out.println("La langue choisie est le francais");
			// Recherche du jour à traduire dans le sous tableau francais
			for (int i = 0; i < tab2dimJoursTraduits[0].length; i++) {
				// System.out.println(tab2dimJoursTraduits[0][i] + " ");
				// Test si le jour à traduire existe dans le sous tableau

			}

		} else if (languesource.equalsIgnoreCase(LANGUE_EN)) {
			System.out.println("La langue choisie est l'anglais");
			// Recherche du jour à traduire dans le sous tableau francais
			for (int i = 0; i < tab2dimJoursTraduits[0].length; i++) {
			}
		}

		else {
			System.out.println("Langue choisie est inconnue");
		}

		sc.close();

	}
}
