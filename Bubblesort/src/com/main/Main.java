package com.main;

import java.util.Random;

/*
 * Il metodo che utilizza consiste nel confrontare elementi vicini tra loro portando l’elemento maggiore 
 * in ultima posizione durante la prima “passata” (eseguendo n-1 confronti), 
 * poi il secondo massimo in penultima posizione e così via finché l’array non è ordinato.
 * 
 * 
 * La complessità è O(n^2);
 * O(n) best case!
 */
public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println("");
		sort(array);
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

	public static int[] sort(int[] array) {
		int count = 1;
		while (count != 0) {
			count = 0;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int tmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = tmp;
					count++;
				}
			}
		}
		 return array;
		 
	}
}
