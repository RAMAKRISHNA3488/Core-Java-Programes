package com.exception;

public class AssertDemo2 {

	public static void main(String[] args) {
		int withdrawlamount=100;
		int currentBalance=100;
		
		assert(withdrawlamount<currentBalance):"withral amount is more than current balance";/* run configuration and click on
		
                                                                                          AssertDemo go to Arguments vs arguments*/
	}

}
