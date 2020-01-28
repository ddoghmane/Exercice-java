
public class TableauParametre {public static int[] suite (int n)
{ int[] res = new int[n] ;
for (int i=0 ; i<n ; i++) res[i] = i+1 ;
return res ;
}
	
	
	

	public static void main(String[] args) {
		int[]tableau = {1,2,3,4,5,6,7,8,9};
		afficherTableau(tableau);
	}
		
		
		public static void afficherTableau(int[] tabInt) {
			for(int nb:tabInt) {
				System.out.println(nb);
			}
		}
		
		// TODO Auto-generated method stub

	}


