package FlowControlStatement;

import java.util.Scanner;

public class PalinderomeNumberString {

	static void clickpalinderome(String input) {
		boolean res = true;
		int Length = input.length();

		for (int i = 0; i <= Length / 2; i++) {
			if (input.charAt(i) != input.charAt(Length - i - 1)) {
				res = false;
				break;
			}}
			System.out.println(input + " is palindrome = "+res);

		

	}

	public static void main(String[] args) {
		System.out.println("Enter String ");
		Scanner scanner = new Scanner(System.in);
		String sr = scanner.next();
		clickpalinderome(sr);

	}

}
