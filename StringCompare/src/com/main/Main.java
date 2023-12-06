package com.main;

import java.util.Random;

/*
 * Given two strings ransomNote and magazine, 
 * return true if ransomNote can be constructed 
 * by using the letters from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 * 
 * */
public class Main {

	public static void main(String[] args) {
		String ransomNote = generateRandomString(6);
		String magazine = generateRandomString(6);
		if (ransomNote.length() == 0) {
			System.out.println("Stringa 1 vuota");
		} else {
			System.out.println("Stringa 1 : " + ransomNote);
			System.out.println("Stringa 2 : " + magazine);
			Boolean res = canConstruct(ransomNote, magazine);
			System.out.println(res);
		}

	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) {
			return false;
		}
		int[] alphabets_counter = new int[26];
		for (char c : magazine.toCharArray()) {
			alphabets_counter[c - 'a']++; // c-'a' è la differenza dei valori ASCII quindi tipo c-a = 2, b-a =1, d-a =3
		}
		for (char c : ransomNote.toCharArray()) {
			if (alphabets_counter[c - 'a'] == 0) {
				return false;
			}
			alphabets_counter[c - 'a']--;
		}
		return true;
	}

	// Genera casualmente una stringa di lunghezza massima maxLength
	private static String generateRandomString(int maxLength) {
		Random random = new Random();
		int length = random.nextInt(maxLength + 1); // Genera una lunghezza casuale fino a maxLength
		StringBuilder randomString = new StringBuilder();

		for (int i = 0; i < length; i++) {
			char randomChar = (char) ('a' + random.nextInt(26)); // Genera un carattere casuale tra 'a' e 'z'
			randomString.append(randomChar);
		}

		return randomString.toString();
	}
}
