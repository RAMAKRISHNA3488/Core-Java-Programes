package com.Assert;

import java.util.ArrayList;
import java.util.List;

public class AssertDemo {

	public static void main(String[] args) {
		int withdrawlAmount = 200;
		int currentBalance = 100;

		assert (withdrawlAmount < currentBalance) : "withdrawl amount is more current balance";
		List<Integer> list = new ArrayList<Integer>();
	
		int a=10;
		System.out.println(a);
		

	}

}
