package com.main;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(11);
		System.out.println("Numero : " + a);
		System.out.println("Fattoriale : " + factorial(a));
		//System.out.println(fact(a));
	}


	private static int factorial(int a) {
		if (a >= 1)
			return a * factorial(a - 1);
		else
			return 1;

	}
	
	/*
	 * NON RICORSIVO
	 */
	
	/*private static int fact(int a) {
		int result =1;
		while(a>1) {
			result*=a;
			a--;
		}
		return result;
	}*/
}
