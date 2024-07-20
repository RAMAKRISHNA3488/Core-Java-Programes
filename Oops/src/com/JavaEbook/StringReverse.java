package com.JavaEbook;

public class StringReverse {
	public static void main(String[] args) {
		String string = "I am Ram";
		// String Reverse using 1. StringBuilder/StringBuffer
		StringBuilder builder = new StringBuilder(string);
		builder.reverse();
		System.out.println(builder);
		// 2.charArray
		char[] char1 = string.toCharArray();
		for (int index = 0, mirroredIndex = char1.length - 1; index < mirroredIndex; index++, mirroredIndex--) {
			char temp = char1[index];
			char1[index] = char1[mirroredIndex];
			char1[mirroredIndex] = temp;
		}
		System.out.println(new String(char1));
	}

}
