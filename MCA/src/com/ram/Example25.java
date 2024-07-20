package com.ram;

import java.util.Scanner;

public class Example25 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1=scanner.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2=scanner.nextInt();
		
		System.out.println("Enter the third number: ");
		int num3=scanner.nextInt();
		
		
		System.out.println("Enter the fourth number: ");
		int num4=scanner.nextInt();
		
		
		System.out.println("Enter the fifth number: ");
		int num5=scanner.nextInt();
		
		int sum=num1+num2+num3+num4+num5;
		System.out.println("The sum of five numbers: "+sum);
		
		float avg=(num1+num2+num3+num4+num5)/5;
		System.out.println("The Average of five numbers: "+avg);
		
	}

}
