package com.strings;

public class ImmutableTest {

	public static void main(String[] args) {
		Immutable im=new Immutable(1, "join");
		System.out.println(im);
		
		String s=new String("ram");
		System.out.println(s);
		
		Integer i=new Integer(50);
		System.out.println(i);

	}

}
