package Basic_of_Programming;

import java.util.Scanner;

//Java Program To Find Sum of N Numbers.
public class SumOfNNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 'N' number: ");
		int number = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of " + number + " numbers is " + sum);
	}

}
