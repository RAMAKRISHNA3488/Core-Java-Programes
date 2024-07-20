package com.Constructor;

public class TestNo_Arg_Constructor {
	public static void main(String[] args) {
		No_Arg_Constructor test = new No_Arg_Constructor();
		System.out.println("Id: " + test.getId());
		System.out.println("Name: " + test.getName());
		System.out.println("Age: " + test.getAge());
		test.setAge(26);
		System.out.println("Age: " + test.getAge());
	}

}
