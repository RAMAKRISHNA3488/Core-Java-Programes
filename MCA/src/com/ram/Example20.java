package com.ram;

import java.util.Scanner;

public class Example20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int num1 = scanner.nextInt();

		System.out.println("Enter a second number: ");
		int num2 = scanner.nextInt();

		System.out.println("Enter a third number: ");
		int num3 = scanner.nextInt();

		System.out.println("Enter a fourth number: ");
		int num4 = scanner.nextInt();

		if (num1 == num2 && num2 == num3 && num3 == num4) {
			System.out.println("equal");

		} else {
			System.out.println("not equal");
		}
	}
}
