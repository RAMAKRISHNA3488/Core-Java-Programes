package com.medium;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

		while (true) {
			System.out.println("Enter A Any String:");
			Scanner scanner = new Scanner(System.in);

			String word = scanner.nextLine(); // "madam1";
			char[] wordsArrays = word.toCharArray();
			char ch;
			String reverseWord = "";
			for (int i = wordsArrays.length - 1; i >= 0; i--) {
				ch = word.charAt(i);
				reverseWord = reverseWord + ch;
			}
			if (word.equalsIgnoreCase(reverseWord)) {
				System.out.println("Word: " + word + " is Palindrome");
			} else {
				System.out.println("Word: " + word + " is not Palindrome");
			}

			if (word == reverseWord) {
				System.out.println("Word: " + word + " is Palindrome");
			} else {
				System.out.println("Word: " + word + " is not Palindrome");
			}
		}
	}
}
