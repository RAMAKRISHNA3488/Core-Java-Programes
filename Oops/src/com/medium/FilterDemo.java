package com.medium;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(12);
		list.add(23);// Stream=Create a stream from the list
		list.add(45);// Filter=filter operation only get numbers greater then 10
		list.add(6);// For each=printing each number in the list after filtering
		list.stream().filter(num -> num > 10).forEach(System.out::println);
		// Again printing the elements of list to show that
		// the original list is not modified.
		System.out.println("'Original list is not modified'");
		list.stream().forEach(System.out::println);

	}

}
