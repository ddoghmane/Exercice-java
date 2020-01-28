/**
 * 
 */

/**
 * @author CRM
 *
 */
public class MaxNombre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 2;
				int y=4;
				int z=9;
		
		
		int max;
		if(x>y) {
		    max=x;
		    if (z>max)
		        max=z;
		} else {
		    max=y;
		    if (z>max)
		        max=z;
		    System.out.println("mon max est" +max );
		}

}}