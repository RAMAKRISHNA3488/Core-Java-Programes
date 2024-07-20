package com.encapsulation;

import java.util.Date;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		Date d=new Date();
		account.Deposit(10000);
		account.Withdraw(499);
		System.out.println("Balance is: " + account.getBalance()+d);
		account.Deposit(500895);
		System.out.println("Balance is: " + account.getBalance()+d);
		account.Deposit(9999.0);
		System.out.println("Balance is: " + account.getBalance()+d);

	}

}
