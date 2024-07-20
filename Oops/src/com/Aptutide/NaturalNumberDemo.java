package com.Aptutide;

import java.util.Scanner;

public class NaturalNumberDemo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a any number: ");
		int natural_number=scanner.nextInt();
		System.out.println("Enter multiple of number:");
		int multiple_of_number=scanner.nextInt();
		int N=natural_number/multiple_of_number;
		int L=N*multiple_of_number;
		int result=(N*(multiple_of_number+L))/2;
		System.out.println(result+" is the sum of natural numbers upto "+natural_number+" which are multipies of "+multiple_of_number);
	}

}
