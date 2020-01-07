/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class MethodeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nb1=2;
		int nb2=3;
		int s1 = MethodeTest.somme(nb1,nb2);
		System.out.println(s1);
		// TODO Auto-generated method stub

	}
public static int somme(int a, int b) {
	int s=a+b;
	return s;
}
}
