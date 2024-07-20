package com.Static;

public class ArgsDemo {
	public static void main(String[] args) {
		int length = args.length;
		if (length == 0) {
			System.out.println("no inputs provides");
		} else {
			System.out.println("list of provides");

			for (int i = 0; i < length; i++) {
				System.out.println(args[i]);
			}
		}

	}
}
