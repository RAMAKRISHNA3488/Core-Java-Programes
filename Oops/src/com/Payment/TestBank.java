package com.Payment;

public class TestBank {

	public static void main(String[] args) {
		BankAccount bankaccount =new BankAccount("Ram",1211,00);
		System.out.println(bankaccount.toString());
		bankaccount.deposit(100);
		System.out.println(bankaccount.toString());

	}

}
