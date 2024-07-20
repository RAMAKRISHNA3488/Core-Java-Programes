package com.Function;

import java.util.Scanner;

public class FunctiomsDmeo {

	public static void main(String[] args) {
		action();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		method(a,b);
		

	}
	public static void action() {
		System.out.println("Action of Functions");
	}
	public static void method(int a,int b) {
		System.out.println("Addition of two number is: "+(a+b));
	}

}
