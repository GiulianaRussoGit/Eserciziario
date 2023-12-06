package com.main;

import java.util.Random;

/*
 * Struttura dell’algoritmo scegliere un elemento come pivot
 * partizionare l’array nei due sub-array
 * ordinarli separatamente (ricorsione)
 * L’operazione-base è il partizionamento dell’array nei due sub-array. Per farla:
	•  se il primo sub-array ha un elemento > pivot, e il secondo array
	un elemento < pivot, questi due elementi vengono scambiati
	Poi si riapplica quicksort ai due sub-array.
 * 
 * Numero globale di confronti: O(n log2 n)
	Dunque, nessun algoritmo, presente o futuro, potrà far
	meglio di O(n log n)
 * 
 * 
 * 
 * 
 * 
 *  
 */
public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}
		quicksort(array, 0, array.length - 1);
		for (int num : array) {
			System.out.print(num + " ");
		}

	}

	public static void quicksort(int[] array, int min, int max) {
		if (array == null || array.length <= 1 || min >= max) { // se è nullo o è 1 solo valore
			return;
		} else {
			int pivot = array[max]; //prendo come pivot l'ultimo valore
			int i = min; //estremo sinistro
			int j = max; //estremo destro 
			while (i < j) { //quando sono = vuol dire che l' ho letto tutto
				while (i < max && array[i] <= pivot) { //mi fermo quando l'ho letto tutto o trovo il valore da cambiare
					i++;
				}
				while (j > min && array[j] >= pivot) {
					j--;
				}
				if (i < j) { //se li ho trovati e sono effettivamente da scambiare
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp; 
				}
			} //esco dal ciclo quando i=j e si incontrano a metà
			int tmp = array[i]; //metto il pivot al centro
			array[i] = array[max];
			array[max] = tmp;
			quicksort(array, min, i - 1);
			quicksort(array, i + 1, max);
		}
	}

}
