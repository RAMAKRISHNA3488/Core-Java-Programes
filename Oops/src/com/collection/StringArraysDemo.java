package com.collection;

import java.util.ArrayList;
import java.util.List;

public class StringArraysDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ram");
		list.add("rama");
		list.add("krishna");
		list.add("Krish");
		System.out.println("Add all Names:" + list);
		
		List<String> list1 =new ArrayList<>();
		list1.add("vennela");
		list1.add("surya");
		list1.add("pavan");
		list1.add("priya");
		list1.add("riya");
		
		list.addAll(2, list1);
		System.out.println("after add list: "+list);
		list.set(1, "ramakrishna");
		System.out.println("insert after: "+list);
		
		
		list.remove(1);
		System.out.println("after removing: "+list);
		
		
	
	}

}
