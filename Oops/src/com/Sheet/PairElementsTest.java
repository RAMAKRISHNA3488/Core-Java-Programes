package com.Sheet;

import java.util.Arrays;

public class PairElementsTest {
	public static PairElements Elements(int[] arr,int n) {
		PairElements pair=new PairElements();
		Arrays.sort(arr);
		pair.min=arr[0];
		pair.max=arr[n-1];
		return pair;
	}
	
	public static void ElementsPair(int[]arr,int n) {
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			if(arr[i]==arr[0]) {
				System.out.println("Mininum: "+arr[i]);
			}else if(arr[i]==arr[n-1]){
				System.out.println("Maxinum: "+arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {100,10,20,30,40,50};
		int n=arr.length;
		PairElements elements = PairElementsTest.Elements(arr, n);
		System.out.println("Mininum Element: "+elements.min);
		System.out.println("Maxinum Element: "+elements.max);

		PairElementsTest.ElementsPair(arr, n);
	}

}
