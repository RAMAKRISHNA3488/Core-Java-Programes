package com.encapsulation;

public class BankAccount {
	private double Balance;

	public double getBalance() {
		return Balance;
	}

	public void Deposit(double amount) {
		Balance += amount;
	}

	public void Withdraw(double amount) {
		Balance -= amount;

	}

}
