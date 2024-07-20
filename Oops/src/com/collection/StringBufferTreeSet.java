package com.collection;

import java.util.Set;
import java.util.TreeSet;

public class StringBufferTreeSet {
	public static void main(String[] args) {
		Set<StringBuffer> set = new TreeSet<>(new SBComparator());

		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("xyz"));
		set.add(new StringBuffer("nmo"));
		set.add(new StringBuffer("rst"));

		for (StringBuffer object : set) {
			System.out.println(object);
			
		
		}
		//System.out.println(set);
		
		
		
	}

}
