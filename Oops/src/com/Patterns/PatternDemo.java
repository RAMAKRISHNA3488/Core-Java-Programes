package com.Patterns;

import java.util.Scanner;

public class PatternDemo {
	
	public static void pattern(int n) {
		for(int row=0;row<=n;row++) {
			for(int space=0;space<n-row;space++) {
				System.out.print("  ");
			}
			for(int col=row;col>=1;col--) {
				System.out.print(col+" ");
			}
			for(int col=2;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		pattern(n);
	}
}
