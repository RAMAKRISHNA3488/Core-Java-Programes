package Com.Ram.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]
public class ReverseString {

	public static String ReverseString(String s) {
		char[] word = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			char temp = word[i];
			word[i] = word[j];
			word[j] = temp;
			i++;
			j--;
		}
		return new String(word);
	}

	public static void main(String[] args) {
		/*
		 * List<String> list = Arrays.asList("h", "e", "l", "l", "o");
		 * Collections.reverse(list); System.out.println(list);
		 * 
		 * String s = String.valueOf(list);
		 * 
		 * for (int i = 0; i < s.length(); i++) { char c = s.charAt(i);
		 * System.out.print(c); } System.out.println(); String s2 =
		 * String.valueOf(list); StringBuffer sb=new StringBuffer(s2); sb.reverse();
		 * System.out.println(sb);
		 * 
		 * }
		 */
		String s = "hello rk";
		System.out.println(ReverseString(s));

	}
}
