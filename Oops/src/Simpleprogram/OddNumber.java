package Simpleprogram;

import java.util.Scanner;

public class OddNumber {
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int N = scanner.nextInt();

		if (N % 2 != 0) {
			System.out.println("Weird");
		} else {
			if (N >= 2 && N <= 5) {
				System.out.println("Not Weird");
			} else if (N >= 6 && N <= 20) {
				System.out.println("Weird");
			} else {
				System.out.println("Not Weird");
			}
		}

	}
}
