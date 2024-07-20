package Simpleprogram;

import java.util.Scanner;

public class PrimeNumbers {
	public static void prime_N(int n) {
		for (int i = 1; i <= n; i++) {
			if (i == 0 || i == 1) {
				continue;

			}
			int flag = 1;
			for (int j = 2; j <= i; ++j) {
				int k = i / 2;
				if (k % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				System.out.print(i + " is prime number ");
			}
		}

	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scanner.nextInt();
		prime_N(n);
		
		//float r=1%2;
		//System.out.println(r);

	}

}
