package com.concurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProblem {

	public static void main(String[] args) {

		ArrayList<String> courses = new ArrayList<String>();
		courses.add("Java");
		courses.add("Python");
		courses.add("AWS");
		courses.add("Docker");
		Iterator<String> iterator=courses.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}

}
