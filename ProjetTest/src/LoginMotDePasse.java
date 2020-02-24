import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class LoginMotDePasse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String USER = "CRM";
		final String MDP = "CDI1234";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre identifiant");
		String login = sc.next();
		System.out.println("Entree mot de passe ");
		String motDePasse = sc.next();

		if (login.equals(USER) && motDePasse.equals(MDP)) {
			System.out.println("Connection OK");
		} else {
			System.out.println("Connection K.O");
		}

		sc.close();

		// TODO Auto-generated method stub

	}

}
