package com.ram;

import java.util.Scanner;

public class Example8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i = scanner.nextInt();
		if (i % 2 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
