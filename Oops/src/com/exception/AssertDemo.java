package com.exception;

public class AssertDemo {

	public static void main(String[] args) {
		int withdrawlamount = 100;
		int currentBalance = 100;
		try {
			assert (withdrawlamount < currentBalance) : "withral amount is more than current balance";
		} catch (AssertionError e) {
			System.out.println(e);
		}
	}
}
