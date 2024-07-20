package com.ram;

import java.util.Scanner;

public class Example24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a single character from the alphabet: ");
		String s = scanner.nextLine();

		if (s.length() != 1 || !Character.isLetter(s.charAt(0))) {
			System.out.println("Error: Please enter a single character from the alphabet.");
			return;
		}

		char ch = Character.toLowerCase(s.charAt(0));

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Vowel");
		} else {
			System.out.println("Consonant");
		}
	}
}
