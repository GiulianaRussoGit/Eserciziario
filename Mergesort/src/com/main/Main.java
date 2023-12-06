package com.main;

import java.util.Random;

/*• È una variante del quick sort che produce sempre due
	sub-array di egual ampiezza
	– così, si ottiene sempre il caso ottimo O(n log2 n)
	• In pratica:
	si spezza l’array in due parti di ugual dimensione si
	ordinano separatamente queste due parti (chiamata
	ricorsiva) si fondono i due sub-array ordinati così ottenuti
	in modo da ottenere un unico array ordinato.
	• Il punto cruciale è l’algoritmo di fusione (merge) dei due
	array*/
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

	        mergesort(array, 0, array.length - 1);

	        System.out.println("\nArray ordinato:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }
	
	  public static void mergesort(int[] array, int min, int max) {
		  if(array.length == 0 || array.length ==1) {
			  return;
		  }
	        if (min < max) {
	            int middle = (min + max) / 2;
	            mergesort(array, min, middle); //faccio lo split a sx e dx finchè non ho array da 1
	            mergesort(array, middle + 1, max);
	            merge(array, min, middle, max);
	        } 
	    }

	    public static void merge(int[] array, int min, int middle, int max) {
	        int[] left = new int[middle - min + 1]; 
	        int[] right = new int[max - middle];

	        for (int i = 0; i < left.length; i++) {
	            left[i] = array[min + i]; //lo riempio con i valori di sx
	        }
	        for (int i = 0; i < right.length; i++) {
	            right[i] = array[middle + 1 + i];
	        }

	        int i = 0, j = 0, k = min;

	        while (i < left.length && j < right.length) {
	            if (left[i] <= right[j]) {
	                array[k] = left[i];
	                i++;
	            } else {
	                array[k] = right[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < left.length) {
	            array[k] = left[i];
	            i++;
	            k++;
	        }

	        while (j < right.length) {
	            array[k] = right[j];
	            j++;
	            k++;
	        }
	
	    }
	    
}
