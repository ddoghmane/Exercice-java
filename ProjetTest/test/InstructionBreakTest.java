/**
 * 
 */

/**
 * @author CRM
 *
 */
public class InstructionBreakTest {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = -5; x <= 5; x++) {
			if (x == 0) {
				System.out.println("division par0");
				break;
			}
			System.out.println(1.0 / x);
		}

	}

}
