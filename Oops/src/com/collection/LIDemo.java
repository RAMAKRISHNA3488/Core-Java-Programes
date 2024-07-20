package com.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LIDemo {

	public static void main(String[] args) {
		
		List<String> list= new LinkedList<>();
		list.add("abc");
		list.add("mno");
		list.add("xyz");
		list.add("ghi");
		ListIterator<String> li=list.listIterator();
		System.out.println("Traversing the list in the forward direction:");
		
		while(li.hasNext()) {
			System.out.println(li.next());
			
		}
    
		
		System.out.println("Traversing the list in the backward direction:");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
