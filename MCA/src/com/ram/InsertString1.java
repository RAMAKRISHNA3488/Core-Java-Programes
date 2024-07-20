package com.ram;

import java.util.Scanner;

public class InsertString1 {

	public static String insertWordInMiddle(String original, String word) {
		int length = original.length();

		int middle = length / 2;

		String firstHalf = original.substring(0, middle);

		String secoundHalf = original.substring(middle);

		return firstHalf + word + secoundHalf;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String original = scanner.next();
		System.out.println("Enter a insert String: ");
		String word = scanner.next();

		String result = insertWordInMiddle(original, word);

		System.out.println(result);
	}

}
