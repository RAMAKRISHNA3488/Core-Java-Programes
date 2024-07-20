package Simpleprogram;

import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int i1=sc.nextInt();
		int i2=sc.nextInt();
		System.out.println(s1.substring(i1, i2));
		
	}

}
