package com.multithread;


public class Sleep {
	public static void main(String[] args) {
	    int n=15;
	    
	    
	    for(int i=1;i<=10;i++){
	    	System.out.println(n+"*"+i+"="+ n*i);
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
		
		
	}

}
