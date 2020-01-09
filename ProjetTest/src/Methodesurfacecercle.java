import com.crm.api.Utils;

public class Methodesurfacecercle {
	public static void main(String[] args) {
		int nb1 = 3;
		int nb2 = 18;
		double pi = 3.14;
		
		int R = 25;
		double resultat;

	
		resultat = Utils.airecercle(pi, R);
		
		
		System.out.println(resultat);
		
		
		int maxNB = Math.max(nb1, nb2);
		System.out.println(maxNB);
	}
}
