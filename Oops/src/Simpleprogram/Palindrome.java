package Simpleprogram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean palindrome=true;
		for(int i=0;i<s.length()/2;i++) {
			if(!s.substring(i, i+1).equals(s.substring(s.length()-i-1,s.length()-i))) {
				palindrome=false;
			}
		}

		if(palindrome) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
