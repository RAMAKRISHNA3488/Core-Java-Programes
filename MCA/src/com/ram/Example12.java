package com.ram;

import java.util.Scanner;

public class Example12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String sentence = scanner.nextLine();

		String penultimateWord = findPenultimateWord(sentence);

		System.out.println("Penultimate word: " + penultimateWord);
	}

	public static String findPenultimateWord(String sentence) {
		String[] words = sentence.split("\\s+");

		if (words.length >= 2) {
			return words[words.length - 2];
		} else {
			return "";
		}
	}
}
