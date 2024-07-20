package com.ram;

import java.util.Scanner;

public class Example27 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the n Natural number: ");
		int num = scanner.nextInt();
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("the sum of n odd natural numbers is " + sum);
	}
}
