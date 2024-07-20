package com.exception;

import java.util.Scanner;

public class RuntimeException {

	public static void main(String[] args) {
       double a,b,c;
       System.out.println("Enter two numbers");
       Scanner obj=new Scanner(System.in);
       a=obj.nextInt();
       b=obj.nextInt();
       c=a/b;
       double d=a+b;
       double e=a-b;
       double f=a*b;
       double g=a%b;
	
       System.out.println("Result:"+c);
       System.out.println("Addition Result:"+d);
       System.out.println("Subtraction Result:"+e);
       System.out.println("Multiplication Result:"+f);
       System.out.println("Divition Result:"+g);
       
       
       System.out.println("More code can go here");
       
}}
