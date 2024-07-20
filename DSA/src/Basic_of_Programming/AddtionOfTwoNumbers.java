package Basic_of_Programming;

import java.util.Scanner;

//Java Program for Addition of Two Numbers
public class AddtionOfTwoNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int firstNumber = scanner.nextInt();

		System.out.println("Enter Second Number: ");
		int secondNumber = scanner.nextInt();

		int result = firstNumber + secondNumber;

		System.out.println("Addition of Two Numbers is " + result);
		scanner.close();
	}

}
