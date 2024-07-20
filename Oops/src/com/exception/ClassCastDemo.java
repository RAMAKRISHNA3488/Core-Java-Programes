package com.exception;

public class ClassCastDemo {

	public static void main(String[] args) {
		Object object = new Object();
		if (object instanceof String) {
			String s = (String) object;
			System.out.println(s);
		}
	}

}
