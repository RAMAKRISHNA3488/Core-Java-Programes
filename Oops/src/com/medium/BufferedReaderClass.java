package com.medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Name: ");
		String name=br.readLine();
		
		System.out.println("Enter your Age: ");
		int Age=Integer.parseInt(br.readLine());
		System.out.println("Your Name is: "+name+" Your Age is: "+Age);
		
	}

}
