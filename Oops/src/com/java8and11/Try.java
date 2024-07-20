package com.java8and11;

import java.io.BufferedReader;
import java.io.FileReader;

public class Try {

	public static void main(String[] args) {
		try(BufferedReader buffer=new BufferedReader(new FileReader("C:/Users/ramak/OneDrive/Documents/ram.text"))){
			
		}catch(Exception e) {
			System.out.println(e);
			
		}

	}

}
