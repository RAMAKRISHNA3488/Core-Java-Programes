package com.arrays;

public class master1 {

	public static void main(String[] args) {
		int array[]=new int [] {15,12,02, 60,55,10000,258,369,147};
		        int temp=0;
        
        System.out.println("Elements of original array");
        
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        
        for(int i=0;i<array.length;i++) {
        	for(int j=i+1;j<array.length;j++) {
        		if(array[i]<array[j] ){
        			temp=array[i];
        			array[i]=array[j];
        			array[j]=temp;
        		}
        		
        	}
        }
	System.out.println();
	
	
	System.out.println("Elements af array sorted in descending order");
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+" ");
	}

	}

}
