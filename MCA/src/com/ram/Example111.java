package com.ram;

import java.util.Scanner;

public class Example111 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = scanner.nextLine();

		String[] words = s.split(" ");

		for (int i = 0; i < words.length; i++) {
			String firstLetter = words[i].substring(0, 1);
			String nextLetters = words[i].substring(1);

			firstLetter = firstLetter.toUpperCase();

			words[i] = firstLetter + nextLetters;
		}
		String newString = String.join(" ", words);
		System.out.println("New String: " + newString);
	}

}
