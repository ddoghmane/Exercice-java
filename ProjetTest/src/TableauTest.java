/**
 * 
 */

/**
 * @author CRM
 *
 */
public class TableauTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] tabInt;
		tabInt = new int[5];
		int[] tabInt1 = new int[5];
		System.out.println(tabInt1[0]);

		tabInt1[0] = 5;
		System.out.println(tabInt1[0]);
		System.out.println(tabInt1[1]);

		int tabInt2[] = { 1, 2, 3, 4, 5 };
		System.out.println(tabInt2[4]);

		int[] tabInt3 = { 1, 2, 3 };
		// Acceder a un element du tableau
		int premierElement = tabInt3[0];
		System.out.println(premierElement);
		System.out.println("le 1er element(indice 0)du tableauest :" + premierElement);
		int deuxiemeElement = tabInt3[1];
		System.out.println("le 2er element(indice 1)du tableauest :" + deuxiemeElement);

		int troisiemeElement = tabInt3[2];
		System.out.println("le 3er element(indice 2)du tableauest :" + troisiemeElement);

		// Indice depasse la taille du tableau
		// int quatriemeElement = tabInt3[3];
		// Modifier la valeur d'un element du tableau
		tabInt3[0] = 10;
		premierElement = tabInt3[0];
		System.out.println(premierElement);
		
		// Afficher la ttaille du tableau
		System.out.println("La taille du tableau est : " + tabInt3.length);

		// Parcours du tableau
		System.out.println("Parcours du tableau(1ere version:");
		for (int i = 0; i < tabInt3.length; i++) {
			System.out.println(tabInt3[i]);
		}

		// Parcours du tableau
		System.out.println("Parcours du tableau(2eme version:");
		for (int nb : tabInt3) {
			System.out.println(nb);
		}

	}
}
