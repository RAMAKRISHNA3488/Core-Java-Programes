package com.ram;

import java.util.Scanner;

public class Example15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String str1 = scanner.nextLine();

		System.out.print("Enter the second string: ");
		String str2 = scanner.nextLine();

		if (str1.length() >= 1 && str2.length() >= 1) {
			String result = str1.substring(1) + str2.substring(1);
			System.out.println("Concatenated string after removing first character: " + result);
		} else {
			System.out.println("Both strings must have length 1 or above.");
		}
	}
}
