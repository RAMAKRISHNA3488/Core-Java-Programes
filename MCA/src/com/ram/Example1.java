package com.ram;

public class Example1 {

	public static void main(String[] args) {
		int i = 0, n = 10;
		while (i <= n) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
