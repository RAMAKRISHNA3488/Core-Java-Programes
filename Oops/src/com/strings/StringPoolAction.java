package com.strings;

public class StringPoolAction {

	public static void main(String[] args) {
		Immutable im = new Immutable(1, "abc");
		Immutable im1 = new Immutable(2, "deg");
		System.out.println(im);
		System.out.println(im1);
		
		
		String s1="abc";
		String s2="xyz";
		String s3="abc";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		

	}

}
