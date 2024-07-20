package com.interveiw;

import java.util.Scanner;
public class StringReverse {
	public static String reverse(String string) {
		StringBuilder sb=new StringBuilder();
		for(int i=string.length()-1;i>=0;i--) {
			sb.append(string.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		reverse(string);
		
		if(string.length()<1||string.length()>100||string.matches("[a+z]+")) {
			System.out.println();
		}else {
			String s=reverse(string);
			System.out.println(s);
		}
		scanner.close();
	}

}
