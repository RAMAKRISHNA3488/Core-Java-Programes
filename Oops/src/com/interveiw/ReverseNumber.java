package com.interveiw;

import java.util.Scanner;

public class ReverseNumber {
	public static void Reverse(int num) {
		num=Integer.parseInt(Integer.toString(num).replaceAll("0",""));
		int ReverseNumber=Integer.parseInt(new StringBuilder(Integer.toString(num)).reverse().toString());
		System.out.println(ReverseNumber);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number : ");
		 int num=scanner.nextInt();
		 Reverse(num);
	}

}
