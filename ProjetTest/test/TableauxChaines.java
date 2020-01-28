import java.util.Scanner;

import com.crm.api.Utils;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class TableauxChaines {

	// private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// int[] tabInt;
		// tabInt = new int[7];
		// int[]tabInt1= new int[7];
		// System.out.println(tabInt1[0]);

		// sc = new Scanner(System.in);
		// System.out.println("Veullez entrer un jour de la semaine");
		// String jour = sc.nextLine();

		String tabInt1[] = { "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche" };
		System.out.println("LA taille du tableau est : " + tabInt1.length);
		System.out.println("Les jours de la semaine en fançais :");
		for (int i = 0; i < tabInt1.length; i++) {
			System.out.println(tabInt1[i]);
		}
		
		/*
		 * System.out.println(tabInt1[0]); System.out.println(tabInt1[1]);
		 * System.out.println(tabInt1[2]); System.out.println(tabInt1[3]);
		 * System.out.println(tabInt1[4]); System.out.println(tabInt1[5]);
		 * System.out.println(tabInt1[6]);
		 */

		String tabInt2[] = { "monday", "tuesday", "wednesday", "thursday", "friday", "saturday",
				"sunday" };
		
//		String[] tabInt2 = new String[7];
//		tabInt2[0] = "monday";
//		tabInt2[1] = "tuesday";
		System.out.println("Les jours de la semaine en anglais :");
		for (int j = 0; j < tabInt2.length; j++) {
			System.out.println(tabInt2[j]);
		}
		
		
		
	}
}
