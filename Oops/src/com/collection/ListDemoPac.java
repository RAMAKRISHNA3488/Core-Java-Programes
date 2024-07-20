package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemoPac {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for (int i = 10; i <= 100; i = i + 10) {
			list.add(i);
		}
		System.out.println("List: " + list);
		List<Integer> list1=new ArrayList<>();
		list1.add(111);
		list1.add(222);
		System.out.println("Add the list: "+list);
		list.addAll(2, list1);
		System.out.println(list);
		list.remove(2);
		System.out.println("List After Remove: "+list);
		list1.clear();
		System.out.println(list);
	}
    
}
