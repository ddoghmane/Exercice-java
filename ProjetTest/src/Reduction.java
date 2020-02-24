import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class Reduction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Quel est votre age? = ");
		int age1 = sc.nextInt();

		if (age1 < 25) {
			System.out.println("Vous avez droit a 50% de reduction");
		} else if (age1 > 60) {
			System.out.println("Vous avez droit a 25% de reduction");
		} else {
			System.out.println("Vous avez droit a aucune reduction");
		}

		// System.out.println("Vous avez droit a une reduction de ");

		sc.close();

	}

}
