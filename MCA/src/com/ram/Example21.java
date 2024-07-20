package com.ram;

import java.util.Scanner;

public class Example21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int decimalNumber = scanner.nextInt();

		String binaryRepresentation = decimalToBinary(decimalNumber);

		System.out.println("Binary representation: " + binaryRepresentation);
	}

	public static String decimalToBinary(int decimalNumber) {
		StringBuilder binary = new StringBuilder();

		if (decimalNumber == 0) {
			return "0";
		}

		while (decimalNumber > 0) {
			int remainder = decimalNumber % 2;
			binary.insert(0, remainder);
			decimalNumber /= 2;
		}

		return binary.toString();
	}
}
