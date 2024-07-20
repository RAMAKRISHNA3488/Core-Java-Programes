package com.ram;

import java.io.IOException;

public class A {
	public static void main(String[] args) {
		int i;
		System.out.println("Enter anything");
		try {
			i = System.in.read();
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
