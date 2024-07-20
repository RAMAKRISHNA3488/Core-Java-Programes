package Simpleprogram1;

import java.util.Scanner;

public class Ugly {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		if(num<0) {
			System.out.println("Enter a correct number.");
		}
		
		int x=0;
		while(num!=1) {
			if(num%5==0) {
				num/=5;
			}else if(num%3==0) {
				num/=3;
			}else if(num%2==0) {
				num/=2;
		}else {
			System.out.println("It not a Ugly Number");
			break;
		}
		}
			if(x==0)
			System.out.println("It is an ugly Number");
			System.out.println("\n");
		
	}

}
