package com.interveiw;

public class MinAndMax {
	public static void FindMinAndMax(int []num) {
		if(num==null||num.length==0) {
			return;
		}
		int min=num[0];
		int max=num[0];
		for(int i=1;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
	public static void main(String[] args) {
		int[]num= {54,546,548,60};
		FindMinAndMax(num);
		
	}

}
