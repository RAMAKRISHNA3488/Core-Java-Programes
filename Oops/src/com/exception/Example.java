package com.exception;



public class Example {

	public static void main(String[] args) throws ArithmeticException  {
		int a=10,b=0;
		
      try {
    	  long l=a/b;
    	 
      }catch(ArithmeticException e){
    	  System.out.println("dont enter zero(0)");
    	  throw e;  //when you are enter throw key word then do not continue the program
      }
      finally {
    	  System.out.println("finally enter valid number last once again");
    	  System.out.println("you are enter again zero you will wait 30 sec");
      }
      System.out.println("Enter number ");
	}
}
