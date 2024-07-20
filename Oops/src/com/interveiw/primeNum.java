package com.interveiw;

import java.util.Scanner;

public class primeNum {
	public static boolean Prime(int num) {

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a any Number : ");
		int num = scanner.nextInt();
		Prime(num);

		if (Prime(num)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scanner.close();

	}

}
