import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class Projectinternetenvrac {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int rayon = 0;
		System.out.println("Veuillez taper le rayon du cercle");
		 
		try
		{
		 
		//Lire le entree du cercle au clavier
		Scanner entree = new Scanner(System.in);
		rayon = Integer.parseInt(entree.nextLine());
		// Quitter le programme si le nombre est invalid
		}catch(NumberFormatException ex)
		{
		System.out.println("Nombre invalid" + ex);
		System.exit(0);
		}
		 
		 
		/*
		* La surface=
		* pi * r * r
		* d'où r est le rayon du cercle.
		*/
		 
		 
		double surface = Math.PI * rayon * rayon;
		 
		System.out.println("La surface du cercle est " + surface);
		}
		
		/*
		Veuillez taper le rayon du cercle
		15
		La surface du cercle est 706.8583470577034
		*/
}
	


