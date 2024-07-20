package com.polymarphism;

public class BMW extends vehicle {
	  String color="Black";
	  
	  
	  void tyre() {
		  System.out.println("this is BMW tyre colors");
	  }
	  
	  void work() {
		  super.tyre();
	    	System.out.println(color);
	    	System.out.println(super.color);
	  }
}
