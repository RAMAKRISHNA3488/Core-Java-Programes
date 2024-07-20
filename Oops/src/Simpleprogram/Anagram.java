package Simpleprogram;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "Ram", s2 = "Mar";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if (s1.length() != s2.length()) {
			System.out.println("Both the Strings are not Angram");
		} else {
			char[] string1 = s1.toCharArray();
			char[] string2 = s2.toCharArray();
			Arrays.sort(string1);
			Arrays.sort(string2);
			if (Arrays.equals(string1, string2) == true) {
				System.out.println("Both the string are Angram");
			} else {
				System.out.println("Both the Strings are not Angram");
			}
		}

	}

}
