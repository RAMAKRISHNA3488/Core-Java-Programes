package com.collection;

import java.util.ArrayList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		Object object[]=new Object[10000000];
		for(int i=0;i<object.length;i++) {
			object[i]=new Object();
			
		}
		List<Object> list=new ArrayList<>();
		long start = System.currentTimeMillis();
         for (Object object1 : object) {
        	 
        	 
        	 list.add(object);
			
		}
		long end = System.currentTimeMillis();	
		System.out.println("time taken: "+(end-start));
		}
	}


