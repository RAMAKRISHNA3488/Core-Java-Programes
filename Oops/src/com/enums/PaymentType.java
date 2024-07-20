package com.enums;

public enum PaymentType {
	DEBITCARD(5), CREDITCARD(0), CASH(10);
	// DEBITCARD,CREDITCARD,CASH;

	int free;

	PaymentType(int free) {
		this.free = free;
	}
	
	public int getFree() {
		return this.free;
	}
}
