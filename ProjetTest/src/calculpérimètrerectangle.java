import java.util.Scanner;

import com.crm.api.Utils;

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
		//System.out.println("veullez saisir longueur:");
		Utils.affichermessage("veullez saisir longueur:");
		int lgr = sc.nextInt();
		//System.out.println("Vous avez saisi : " + lgr);
		Utils.affichermessage("Vous avez saisi :"+lgr);
		//System.out.println("veullez saisir largeur:");
		Utils.affichermessage("veullez saisir largeur:");
		int larg = sc.nextInt();
		//System.out.println("Vous avez saisi : " + larg);
		Utils.affichermessage("Vous avez saisi:"+larg);
		sc.close();

		//perimetre = (lgr + larg) * 2;
		perimetre = Utils.perimetreRectangle(lgr, larg);
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
