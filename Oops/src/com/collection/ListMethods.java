package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for (int i = 10; i <= 100; i = i + 10) {
			list.add(i);

		}
		System.out.println("list: " + list);

		list.add(2, 200);
		System.out.println("List after Insert: " + list);

		list.set(3, 500);
		System.out.println("List After Replacement: " + list);

		// add all contains and all methods

		List<Integer> Secondslist = new ArrayList<>();

		Secondslist.add(111);
		Secondslist.add(222);
		Secondslist.add(333);
		System.out.println("Second List: " + list);
		list.addAll(4, Secondslist);
		System.out.println("First List:" + list);

		if (list.contains(222)) {
			System.out.println("List has the values");
		} else {
			System.out.println("List does not have the values");
		}
		
		List<Integer> threelist= new ArrayList<>();
		threelist.add(101);
		threelist.add(102);
		threelist.add(103);
		System.out.println("List Three: "+list);
		
		System.out.println("Elememts in the list are:");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(3);
		System.out.println("list after deletion: "+list);
		
		
	}

}
