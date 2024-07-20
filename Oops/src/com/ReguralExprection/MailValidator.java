package com.ReguralExprection;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$");
		Matcher matcher = pattern.matcher(s);
		if (matcher.matches()) {
			System.out.println("Valid Gmail");
		} else {
			System.out.println("Invalid Gmail");
		}

	}

}
