package Basic_of_Programming;

import java.util.Scanner;

public class FlowCharts2 {
//	Explanation: 
//		Input three numbers (A, B, C): Start by receiving three numbers from the user. 
//		Set largest = A: Assume initially that the first number (A) is the largest. 
//		Compare B with largest: Check if the second number (B) is greater than the current largest 
//		number. 
//		If B is greater than the current largest, update the largest to B. 
//		Compare C with largest: Check if the third number (C) is greater than the current largest 
//		number. 
//		If C is greater than the current largest, update the largest to C. 
//		Output the largest number. 
//		Default Input and Outputs: 
//		Input: A = 12, B = 25, C = 18 
//		Output: Largest number = 25 
//		In this example, the largest number among 12, 25, and 18 is 25. 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ener A value: ");
		int A = scanner.nextInt();

		System.out.println("Enter B value: ");
		int B = scanner.nextInt();

		System.out.println("Enter C value: ");
		int C = scanner.nextInt();

		if (A > B && A > C) {
			System.out.println("Largest Number = " + A);
		} else if (B > C) {
			System.out.println("Largest Number = " + B);

		} else {
			System.out.println("Largest Number = " + C);
		}

	}

}
