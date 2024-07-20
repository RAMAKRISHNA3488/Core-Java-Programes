package com.Payment;

public class BankAccount {
	private String name;
	private int acc_no;
	private double balance;

	public BankAccount(String name, int acc_no, double amount) {
		super();
		this.name = name;
		this.acc_no = acc_no;
		this.balance = amount;
	}

	public BankAccount(String name, int acc_no) {
		super();
		this.name = name;
		this.acc_no = acc_no;
		this.balance = 0.00;
	}

	@Override
	public String toString() {
		return "BackAccount [name=" + name + ", acc_no=" + acc_no + ", balance=" + balance + "]";
	}
	
	//deposit 
	
	public void deposit(double amount) {
		if(amount<=0) {
			System.err.println("Cannot deposit nagative amounts.please enter a differet amount.");
		}else {
			this.balance+=amount;
			System.out.format("%.2f has been deposited\n",amount);
		}
	}
	public void withdraw(double amount) {
		if(this.balance>=amount) {
			this.balance-=amount;
			System.out.format("%.2f has been withdraw\n",amount);
		}else {
			System.err.println("Transaction cancelled due to insufficient funds.check balance or deposit funds.");
		}
	}
	
	public double getbalance() {
		return balance;
	}
}
