/**
 * 
 */

/**
 * @author CRM
 *
 */
public class InstructionContinueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int x = -5; x <= 5; x++) {
			if (x == 0) {
				System.out.println("division par0");
				continue;
			}
			System.out.println(1.0 / x);
		}

	}

}
