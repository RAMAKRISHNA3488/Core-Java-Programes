package com.ram.unit3;

public  interface  DemoInter {
	public void Demo();
	
	public  void Demo1() ;
	
	public static void StaticMethod() {
		System.out.println("This is Static method");
	}
	
	public default void DefaultMethod() {
		System.out.println("this is DefaultMethod()");
	}
		
	

}
