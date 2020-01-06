import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class calculpérimètrerectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int perimetre;
		
		

		Scanner sc = new Scanner(System.in);
		System.out.println("veullez saisir longueur:");
		int lgr = sc.nextInt();
		System.out.println("Vous avez saisi : " + lgr);
		System.out.println("veullez saisir largeur:");
		int larg = sc.nextInt();
		System.out.println("Vous avez saisi : " + larg);
		sc.close();

		perimetre = (lgr + larg) * 2;
		System.out.println("Le périmétre du rectangle est " + perimetre);

		// Entrée longueur
		//int longueur;
		//longueur = 5;
		// Entrée largeur
		//int largeur;
		//largeur = 8;
		// calcul perimetre
		
		//perimetre = (longueur + largeur) * 2;
		//System.out.println(perimetre);
	}

}
