package com.multithread;

public class SingleThreadDemo {
	public static void main(String[] args) {
		
		for(int j=0;j<=10;j++) {
			System.out.print("J:"+j);	
		}
		
		SingleThreadDemo.printnumbers();
		
	} 
		public static void printnumbers() {
			for(int i=0;i<=10;i++) {
				 System.out.print("i:"+i);
			}
		}
		
	}


