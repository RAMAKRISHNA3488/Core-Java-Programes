package Simpleprogram;

import java.util.Scanner;

public class SquareFreeDivisors2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number N: ");
		int N = scanner.nextInt();

		int count = countSquareFreeDivisors(N);
		System.out.println("The number of square-free divisors of " + N + " is: " + count);

	}

	public static int countSquareFreeDivisors(int N) {
		int count = 0;
		for (int i = 2; i <= N; i++) {
			if (N % i == 0 && isSquareFree(i)) {
				count++;
			}
		}
		return count;
	}

	public static boolean isSquareFree(int num) {
		if (num % 2 == 0)
			num = num / 2;
		if (num % 2 == 0)
			return false;
		for (int i = 3; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				num = num / i;
			if (num % i == 0)
				return false;

		}
		return true;
	}

}
