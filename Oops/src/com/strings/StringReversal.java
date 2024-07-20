package com.strings;

public class StringReversal {

	public String fiestway(String actual) {
		String reversed = "";
		for (int i = actual.length(); i > 0; i--) {
			reversed = reversed += actual.charAt(i - 1);

		}
		return reversed;

	}

	public String secondway(String actual) {
		byte[] s1 = actual.getBytes();
		byte[] s2 = new byte[s1.length];
		for (int i = 0; i < s1.length; i++) {
			s2[i] = s1[s1.length];
		}
		String reversed = new String(s2);
		return reversed;

	}

	public static void main(String[] args) {
		String srr = "ram";
		StringReversal sr = new StringReversal();
		System.out.println(sr.fiestway(srr));
	}
}
