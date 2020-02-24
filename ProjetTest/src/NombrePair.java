import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class NombrePair {

	/**
	 * @param args
	 */
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez un nombre entier:");
		int nbr = sc.nextInt();
		
		
		if (nbr % 2 == 0) {
			System.out.println("Pair");
		} else {
			System.out.println("Impair");
		}
		// TODO Auto-generated method stub

	}
}
