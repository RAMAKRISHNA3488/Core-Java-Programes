package com.ram;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a rows Number: ");
		int num = scanner.nextInt();
		int number = 1;
		for (int row = 1; row <= num; row++) {
			for (int space = 1; space <= num - row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*" + " ");
				number++;
			}
			System.out.println();
		}

		for (int row = num - 1; row >= 1; row--) {
			for (int space = 1; space <= num - row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*" + " ");
				number++;
			}
			System.out.println();
		}
	}

}
