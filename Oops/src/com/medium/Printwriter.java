package com.medium;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Printwriter {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw=new PrintWriter("output.txt");
		String Name="Ram";
		int age=21;
		pw.println("My name is: "+Name+"my age is: "+age);
		pw.close();
		
	}

}
