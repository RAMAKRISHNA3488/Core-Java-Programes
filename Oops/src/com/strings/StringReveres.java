package com.strings;

public class StringReveres {

	public static void main(String[] args) {

		/*String s="SuryaNarayana",n="";
		char c;
		
		for(int i=0;i<s.length();i++) {
			c=s.charAt(i);
			n=c+n;
		}
		System.out.println(n);*/
		
		String s="SuryaNarayana";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		
	}

}
