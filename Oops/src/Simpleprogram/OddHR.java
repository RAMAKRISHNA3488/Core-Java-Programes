package Simpleprogram;

import java.util.Scanner;

public class OddHR {
	/*
	 * Question:- Given an integer, , perform the following conditional actions: If
	 * is odd, print Weird If is even and in the inclusive range of 2 to 5 , print
	 * Not Weird If is even and in the inclusive range of 6 to 20, print Weird If is
	 * even and greater than , print Not Weird Complete the stub code provided in
	 * your editor to print whether or not is weird.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		if (N % 2 == 0) {
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
