package com.exception;

public class NullExcaption {
	public static void main(String[] args) {

		String data = null;
		try {
			System.out.println(data.length());
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}
}
