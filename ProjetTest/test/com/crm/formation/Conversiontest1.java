/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class Conversiontest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 123456;
		long y = x;
		System.out.println(y);
		//conversion implicite
		
		int a = 65537;
		short z = (short)a;
		System.out.println (z);
		// Conversion explicite
		
		long l1 = 123456789;
		long l2 = 123456788;
		float f1 = l1;
		float f2 = l2;
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(l1-l2);
		System.out.println(f1-f2);

	}

}
