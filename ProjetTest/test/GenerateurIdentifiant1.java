import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class GenerateurIdentifiant1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer votre prenom");

		String str = sc.nextLine();
		System.out.println("Votre login sera" + str);
		str.toUpperCase();
		System.out.println(str);
		

		System.out.println("Entrer votre nom");
		String str1 = sc.nextLine();

		System.out.println("Votre mot passse sera" + str1);
		sc.close();

		// TODO Auto-generated method stub

	}

}
