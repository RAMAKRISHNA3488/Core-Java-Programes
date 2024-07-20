package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShortedList {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("Z");
		list.add("A");
		list.add("S");
		list.add("X");
		list.add("K");
		System.out.println("Before the Shorting: "+list);
		
		Collections.sort(list);
		
		System.out.println("After Shorting: "+list);
		
		
		Collections.sort(list,new MyComparatorDemo());
		System.out.println("present Shorting: "+list);

	}

}
