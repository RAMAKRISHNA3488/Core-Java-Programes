package com.thread;

import java.util.Scanner;


public class JoinDemo extends Thread {
        static int n,sum=1;             //addition can take a 0 ,multiplication can take a 1 
	public static void main(String[] args) {
		
		long start=System.currentTimeMillis();
		System.out.println("Multiplcation  frist 'N' Numbers");
		System.out.println("Enter Number");
		Scanner scanner= new Scanner(System.in);
        JoinDemo.n= scanner.nextInt();
         
        JoinDemo jd=new JoinDemo();
        jd.start();
        
        try {
			jd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        System.out.println("Multiplcation frist "+n +" Numbers is  " + sum);
        
        
        long end=System.currentTimeMillis(); 
        System.out.println("the total time is "+ (end-start)/1000+" seconds ");   
	}
        	
        	public void run() {
        		for(int i=1;i<=JoinDemo.n;i++) {
        			JoinDemo.sum *= i;
        			try {
        				Thread.sleep(100);
        			} catch (InterruptedException e) {
        				e.printStackTrace();
        			}
        
	}

        	}}
