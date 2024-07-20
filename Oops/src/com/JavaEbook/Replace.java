package com.JavaEbook;

import java.util.ArrayList;
import java.util.List;

public class Replace {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		strings.add("Program starting!");
		strings.add("Hello world!");
		strings.add("Goodbye world!");
		System.out.println("Before replace Elemant");
		System.out.println(strings);
		System.out.println("After replace Elemant");
		strings.set(1, "Hi World!");
		System.out.println(strings);
		int pos=strings.indexOf("Goodbye world!");
		if(pos>=0) {
			strings.set(pos, "GoodBye curd World!");
		}
		System.out.println("After replace without know indeex");
		System.out.println(strings);

	}

}
