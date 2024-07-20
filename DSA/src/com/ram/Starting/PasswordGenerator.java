package com.ram.Starting;

import java.util.Scanner;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the number of test cases
		int T = scanner.nextInt();
		scanner.nextLine(); // Consume the newline

		// Process each test case
		for (int i = 0; i < T; i++) {
			// Input number and name separated by space
			String[] data = scanner.nextLine().split(" ");
			String number = data[0];
			String name = data[1];

			// Generate and print password
			String password = generatePassword(number, name, T);
			System.out.println(password);
		}

		scanner.close();
	}

	private static String generatePassword(String number, String name, int T) {
		// Check constraints
		if (!(1 <= name.length() && name.length() <= 100) || !(1 <= number.length() && number.length() <= 100)
				|| !(1 <= T && T <= 10)
				|| !(number.matches("-?\\d+") && Integer.parseInt(number) <= Math.pow(10, 10))) {
			return "Invalid Input";
		}

		// Check if name consists only of lowercase letters
		if (!name.matches("[a-z]+")) {
			return "Invalid Input: Name must consist of only lowercase letters";
		}

		// Generate password
		return new StringBuilder(name).reverse().toString() + Math.abs(Integer.parseInt(number));
	}
}
