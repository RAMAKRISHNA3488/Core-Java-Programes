package com.medium;

public class ReverseTheSentence {
	public static void main(String[] args) {
		String word = "My name is Bob";
		char ch;
		String[] stringArrya = word.split(" ");
		String ReverseWord = "";
		for (int i = 0; i < stringArrya.length; i++) {
			for (int j = stringArrya[i].length() - 1; j >= 0; j--) {
				ch = stringArrya[i].charAt(j);
				ReverseWord = ReverseWord + ch;
			}
			ReverseWord = ReverseWord + " ";
		}
		System.out.println(ReverseWord);
	}
}
