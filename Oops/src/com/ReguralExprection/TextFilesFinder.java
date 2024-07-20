package com.ReguralExprection;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFilesFinder {

	public static void main(String[] args) {
		File directory=new File("C:/Users/ramak/OneDrive/Documents/javanotes");
		String[] filesNames=directory.list();
		Pattern pattern=Pattern.compile("[a-zA-Z0-9]+[.]vtt");
		int count=0;
		
		for (String fileName : filesNames) {
			Matcher mather=pattern.matcher(fileName);
			if(mather.matches()) {
				count++;
				System.out.println(fileName);
			}
			
		}
    System.out.println("Number of Vtt Files is: "+count);
	}

}
