package com.exception;

public class MultiCatchDemo {
	public static void main(String[] args) {
		try {

			String input = args[100];
			System.out.println("Input is: " + input);
			int output = Integer.parseInt(input);
			System.out.println("Output is:m" + output);
			String in = Integer.toString(output);
			System.out.println("In is: " + in);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index is requsted");
		} catch (NumberFormatException e2) {
			System.out.println("Invalid input provided");
		} catch (NullPointerException e) {
			System.out.println("out of the code");
		}
		System.out.println("more code ");
	}

}
