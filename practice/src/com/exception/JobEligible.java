package com.exception;

import java.util.Scanner;

public class JobEligible {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		System.out.println("Enter your name ");
		String name = scanner.next();

		if (age < 25 && age > 18) {

			System.out.println("You are eligible this job ");
			System.out.println("Go to next Step");
		} else {
			System.out.println("your not eligible for this job");
			System.out.println("Go to 'HOME'page try another one job");
		}

	}
}
