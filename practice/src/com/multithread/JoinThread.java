package com.multithread;

import java.util.Scanner;

public class JoinThread extends Thread {
      
	static int n,sum;
	public static void main(String[] args) {
      
		
		System.out.println("Sum of First 'N' numbers");
		System.out.println("Enter  a Number");
		Scanner scanner=new Scanner(System.in);
		JoinThread.n=scanner.nextInt();
		
		JoinThread jd=new JoinThread();
		jd.start();
		try {
			jd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sum of first "+JoinThread.n+" numbers is "+JoinThread.sum);
	}
	
	public void run() {
		for(int i=1;i<=JoinThread.n;i++) {
			JoinThread.sum +=i;
			
		}
	}

}
