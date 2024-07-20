package LoopsAndFunctions;

import java.util.Scanner;

public class GreatestCommenDivisor {
//	Start with two positive integers, a and b.
//
//	Repeat the following steps until b becomes zero:
//
//	Calculate the remainder of a divided by b (i.e., a % b).
//
//	Replace a with b and b with the remainder.
//
//	When b becomes zero, the GCD is the current value of a.
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a=scanner.nextInt();
		
		System.out.println("Enter b value: ");
		int b=scanner.nextInt();
		int remainder=0;
		while(b>0) {
			remainder=a%b;
			a=b;
			b=remainder;
		}
		System.out.println(a);
		
		
	}

}
