package com.simpleprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ram1 {

	public static void main(String args[]) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());
		while (t-- > 0) {
			String S = read.readLine();
			System.out.println(S.toLowerCase());
		}
	}
}