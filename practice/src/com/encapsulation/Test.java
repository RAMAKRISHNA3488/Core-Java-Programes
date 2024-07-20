package com.encapsulation;

public class Test {

	public static void main(String[] args) {
       AccountDetails acc=new AccountDetails();
       acc.setAccountno(70364363611l);
       acc.setName("Ram");
       acc.setEmail("ramak4889@gmail.com");
       acc.setAmount(36985421f);
       
	System.out.println("Account Number: "+acc.getAccountno());
	System.out.println("Name: "+acc.getName());
	System.out.println("Email: "+acc.getEmail());
	System.out.println("Amount: "+acc.getAmount());
	}

}
