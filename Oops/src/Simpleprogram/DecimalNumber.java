package Simpleprogram;

import java.util.Scanner;

public class DecimalNumber {
	
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int testc=scanner.nextInt();
		while(testc-->0) {
		float a=scanner.nextFloat();
		float b=scanner.nextFloat();
		Test t=new Test();
		t.method(a, b);
		System.out.println();
		}
	}

}
