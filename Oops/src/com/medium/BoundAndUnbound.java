package com.medium;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BoundAndUnbound {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("Rama","Krishna","Priya","Riya");
		//Bound method reference to the String.toUpperCase() method
		List<String>toUppercase=list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("Bound Method Reference: "+toUppercase);
		//UnBound method reference to the String.toUpperCase() method
		Function<String, String>toUppercasefunction= String::toUpperCase;
		List<String> collect = list.stream().map(toUppercasefunction).collect(Collectors.toList());
		System.out.println("Unbound method: "+collect);
		
	}

}
