package com.arrays;

import java.util.Scanner;

public class SearchingElement {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=scanner.nextInt();
		System.out.println("Enter a tager: ");
		int t=scanner.nextInt();
		int x[]=new int[n];
		boolean found=false;
		for(int i=0;i<n;i++) {
			 x[i]=scanner.nextInt();
			 
			 if(x[i]==t) {
				 found=true;
				 break;
			 }
		}
		if(found) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
