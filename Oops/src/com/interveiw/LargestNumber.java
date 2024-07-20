package com.interveiw;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
	public static String largestNumber(int[] num) {
		Comparator<String>comparator=(str1, str2) ->{
			String a=str1+str2;
			String b=str2+str1;
			return b.compareTo(a);
		};
		String[] stringNum=new String[num.length];
		for(int i=0;i<num.length;i++) {
			stringNum[i]=Integer.toString(num[i]);
		}
		Arrays.sort(stringNum,comparator);
		
		if(stringNum[0].equals("0")) {
			return "0";
		}
		StringBuilder result=new StringBuilder();
		for(String largestStr:stringNum) {
			result.append(largestStr);
		}
		return result.toString();
	}
	public static void main(String[] args) {
		int[] num= {54,546,548,60};
		String output=largestNumber(num);
		System.out.println(output);
		
	}

}
