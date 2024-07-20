package Basic_of_Programming;

import java.util.Scanner;

//Java Program to Find the Sum of n odd Numbers
public class SumOfNOddNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Any Number: ");
		int number = scanner.nextInt();
		int sum = 0;
		for (int i = 0; i <= number ; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("The Sum of " + number + " odd numbers is " + sum);

	}

}
