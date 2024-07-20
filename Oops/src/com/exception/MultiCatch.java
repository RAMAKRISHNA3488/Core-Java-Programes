package com.exception;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			String input = args[0];
			System.out.println("Input is:" + input);
			int output = Integer.parseInt(input);
			System.out.println("Output is:" + output);
			String in = Integer.toString(output);
			System.out.println("In is:" + in);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is required");
		} catch (NumberFormatException e) {
			System.out.println("Invalid input provided");
		} catch (NullPointerException e) {
			System.out.println("out of the code");
		}
		System.out.println("More code can go here");

	}

}
