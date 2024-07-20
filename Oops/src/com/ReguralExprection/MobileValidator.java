
package com.ReguralExprection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileValidator {

	public static void main(String[] args) {

		Pattern pattern= Pattern.compile("[0-9]+");
		Matcher matcher = pattern.matcher("9949920819");
		if(matcher.matches()) {
			System.out.println("Valid Mobile Number");
		}else {
			System.out.println("Invalid Mobile Number");
		}
		
		
	}

}
