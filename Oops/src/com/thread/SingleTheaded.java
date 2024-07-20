package com.thread;

public class SingleTheaded {

	public static void main(String[] args) {
		SingleTheaded st=new SingleTheaded();
		st.printnumbers();
	    	 for(int j=1;j<=10;j++) {
	    		 System.out.print("j: "+j);
	    	 }
	}
     void printnumbers() {
    	 for(int i=1;i<=10;i++) {
    		 System.out.print("i: "+i);
    	 }
     
	}
		}
