package com.java8and11;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Apple");
		sb.append(" ");
		sb.append("Banana");
		sb.append(" ");
		sb.append("Kiwi");    //this StringBuilder key word is used to concatenation
		sb.append(" ");
		sb.append("carrot");
		sb.append(" ");
		sb.append("Mango");
		System.out.println(sb.toString());

	}

}
