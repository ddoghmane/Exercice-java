import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class ExerciceSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre votre chiffre = ");
		int chiffre = sc.nextInt();
		sc.close();

		if (chiffre > 0 && chiffre < 10) {

			// chiffre = 11;
			switch (chiffre) {
			case 1:
				System.out.println("chiffre");
				break;
			case 8:
				System.out.println("chiffre?");
				break;
			default:
				System.out.println("???WTF?");
				break;

			}
		} else {
			System.out.println("ceci n'est pas un chiffre");

		}
	}
}
// TODO Auto-generated method stub
