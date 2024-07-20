package com.medium;

public class myException extends Exception{
	private int errorCode;
	public myException(String message,int errorCode) {
		super(message);
		this.errorCode=errorCode;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public static void myMethod() throws myException {
		throw new myException("An error Occurred", 123);
	}
	public static void main(String[] args) {
		try {
			myException.myMethod();
		} catch (myException e) {
			System.out.println("Error code: "+e.getErrorCode());
			e.printStackTrace();
		}
	}

}
