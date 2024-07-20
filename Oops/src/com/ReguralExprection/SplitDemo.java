package com.ReguralExprection;

import java.util.regex.Pattern;

public class SplitDemo {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("[.]");
		String[] words = pattern.split("How.are.you");
		
		String s="ram.krishna.rama";
		String[] split = s.split("[.]");
		for (String word : split) {
			System.out.println(word);
			
		}
		
	}

}
