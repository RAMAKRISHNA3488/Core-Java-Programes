package com.ram.Scaler;

import java.util.Arrays;

public class Demo {
	public static int[] convertNumberToArray(int num) {
		String numberString=String.valueOf(num);
		int[]array=new int[numberString.length()];
		for(int i=0;i<numberString.length();i++) {
			array[i]=Character.getNumericValue(numberString.charAt(i));
		}
		
		return array;
	}
	public static void main(String[] args) {
		int num=12345;
		int []arr=convertNumberToArray(num);
		
		
		for(int digit:arr) {
			System.out.print(digit+" ");
		}
	}

}
