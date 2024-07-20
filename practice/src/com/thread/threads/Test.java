package com.thread.threads;

public class Test {

	public static void main(String[] args) {
      A threadA= new A();
      B threadB=new B();
      C threadC=new C();
      System.out.println("Start Thread A");
      threadA.start();
      Thread.yield();
      
      System.out.println("start Thread B");
      threadB.start();
      
      System.out.println("Start Thread C");
      threadC.start();
      
      
	}

}
