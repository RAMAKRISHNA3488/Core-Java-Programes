package com.Patterns;

import java.util.Scanner;

public class MirrorPattern {
	public static void main(String[] args) {
//		System.out.println("Enter a Number: ");
//		Scanner scanner=new Scanner(System.in);
		int num= 5; //scanner.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=i;j<num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a=2;a<num+1;a++) {
			for(int b=1;b<a+1;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
			
	}

}
