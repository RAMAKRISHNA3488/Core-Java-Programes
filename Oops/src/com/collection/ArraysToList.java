package com.collection;

import java.util.Arrays;
import java.util.List;

public class ArraysToList {

	public static void main(String[] args) {
		String s[]= {"Z","A","U","T","D","H"};
		
		Arrays.sort(s);
		for (String string : s) {
			System.out.print(string +" ");
			
		}
		System.out.println();
		
		List<String> List = Arrays.asList(s);
		s[3]="I";
		
		
		System.out.println(List);

	}

}
