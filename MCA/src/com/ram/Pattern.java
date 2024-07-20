package com.ram;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter pattern length: ");
		int num = scanner.nextInt();

		int number = 1;
		for (int row = 1; row <= num; row++) {
			
			for (int col = 1; col <= row; col++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}
}
