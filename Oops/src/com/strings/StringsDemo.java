package com.strings;

public class StringsDemo {

	public static void main(String[] args) {
		String s1="One";
		char c='/';
		String s2=new String("Two");
		byte b[]= {65,66,67};
		String s4=new String(b);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s4);
		
		
		String s6=new String("ram");
		String s5="ram";
		String s7=s6.intern();
				
		System.out.println(s6==s5);
		System.out.println(s5==s7);
		
		
	}

}
