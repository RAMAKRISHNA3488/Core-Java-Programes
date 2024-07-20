package com.enums;

public class Test {

	public static void main(String[] args) {
		PaymentType p= PaymentType.CASH;
		System.out.println(p);
		
		PaymentType[] values = PaymentType.values();
		for (PaymentType paymentType : values) {
			System.out.println(paymentType);
			System.out.println(paymentType.ordinal());
			
			System.out.println(paymentType.getFree());
		}

	}

}
