package com.ram;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = scanner.nextLine();

		int CountLetters = 0;
		int CountSpaces = 0;
		int CountDigits = 0;
		int CountOtherCharacters = 0;

		for (char c : s.toCharArray()) {
			if (Character.isLetter(c)) {
				CountLetters++;
			} else if (Character.isWhitespace(c)) {
				CountSpaces++;
			} else if (Character.isDigit(c)) {
				CountDigits++;
			} else {
				CountOtherCharacters++;
			}
		}
		System.out.println("Letter count: " + CountLetters);
		System.out.println("Space count: " + CountSpaces);
		System.out.println("Digit count: " + CountDigits);
		System.out.println("Other Characters count: " + CountOtherCharacters);

	}

}
