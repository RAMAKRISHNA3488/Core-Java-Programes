package com.medium;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String Name = scanner.nextLine();
		System.out.println("Enter Your Age: ");
		int Age = scanner.nextInt();
		System.out.println("Your Name is: " + Name + " Your Age is: " + Age);

	}

}
