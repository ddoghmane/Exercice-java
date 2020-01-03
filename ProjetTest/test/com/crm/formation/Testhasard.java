package com.crm.formation;

public class Testhasard {public static class Operateurs{
	public static void main(String[] args){
		int a, b;
		if (args.length==2){
		a = Integer.parseInt(args[0]);
		b = (new Integer(args[1])).intValue();
		}
		else {
		a = 5;
		b = 4;
		}
		System.out.println(" La résultat de "+
		a+" / "+b+ " est "+(a/b) );
		System.out.println(" La résultat de "+
		a+" % "+b+" est "+(a%b) );}}

}
