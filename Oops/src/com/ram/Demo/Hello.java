package com.ram.Demo;

public interface Hello {
	
	public void Demo();
	
	public int Demo1();
	
	public static void Demo2() {
		System.out.println("Hello");
	}
	
	public default void Demo3() {
		System.out.println("Hello");
	}

}
