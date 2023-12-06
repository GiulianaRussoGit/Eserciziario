package com.main;

import java.util.Random;

/*
 * <determina la posizione in cui va inserito il nuovo elemento>
 * <crea lo spazio spostando gli altri elementi in avanti di una posizione>
 * <inserisce il nuovo elemento nella posizione prevista>
 * 
 * Complessità: O(n^2)
 * O(n) best Case!
 */

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}

		System.out.println("Array non ordinato:");
		for (int num : array) {
			System.out.print(num + " ");
		}

		insertionsort(array);

		System.out.println("\nArray ordinato:");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

	public static int[] insertionsort(int[] array) {
		for (int i = 1; i < array.length; i++) { //prendo tutti gli elementi dopo k
			for (int k = 0; k < i; k++) { //prendo tutti gli elementi prima di i
				if (array[i] < array[k]) {
					int start = k;
					int end = i;
					int tmp = array[i];
					for (int j = end; j > start; j--) {
						array[j] = array[j - 1];
					}
					array[start] = tmp;
				}
			}
		}

		return array;

	}

}
