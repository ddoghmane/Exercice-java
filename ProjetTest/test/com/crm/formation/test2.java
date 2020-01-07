package com.crm.formation;

public class test2 {

	public static void main(String[] args) {
		short nb1, nb2, nb3, nb4;
		nb1 = 1;
		nb2 = 2;
		nb3 = 6;
		nb4 = 7;

		boolean bool1 = nb1 > nb2;
		boolean bool2 = (nb3 == nb4);
		boolean bool3 = bool1 || bool2;

		System.out.println(bool3);
		double total =0,num=1;
		double pourcentage = 0.5;
		
		total = total+ num;
		System.out.println(total);
		
		total+=num;
		System.out.println(total);
		
		total-=num;
		System.out.println(total);
		
		total*=pourcentage;
		System.out.println(total);
		
		total/=2;
		System.out.println(total);
		
		num %= pourcentage;
		System.out.println(num);

	}

}
