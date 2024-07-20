package com.exception;

public class NumberFormatExcap {

	public static void main(String[] args) {
		String date="abc";
		try {
		
		int i=Integer.parseInt(date);
		}catch(NumberFormatException e) {
			System.out.println("this is not integer"+ e);
			
		}

	}

}
