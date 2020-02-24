/**
 * 
 */

/**
 * @author CRM
 *
 */
public class LoopTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a = 0;
		for (int i = 0; i <= 50; i++) {
			// condition
			System.out.println(i);
			while (a < 100) {
				a++;
				System.out.println(a);
			}
		}
	}
}
