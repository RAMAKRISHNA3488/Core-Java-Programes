package Basic_of_Programming;

import java.util.Scanner;

public class FlowCharts1 {

//	Explanation: 
//		Input a number: Start by receiving a number from the user. 
//		Is the number divisible by 2 without remainder?: Check if the input number can be evenly 
//		divided by 2. 
//		If the number is divisible by 2 without remainder, then it's even, and the flowchart outputs 
//		"Number is Even" and ends. 
//		If the number is not divisible by 2 without remainder, then it's odd, and the flowchart 
//		outputs "Number is Odd" and ends. 
//		Default Input and Outputs: 
//		Input: 6 
//		Output: "Number is Even" 
//		This input represents a typical even number. If you input an odd number like 9, the output 
//		would be "Number is Odd". 
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.println("Number is Even");

		} else {
			System.out.println("Number is Odd");
		}

	}

}
