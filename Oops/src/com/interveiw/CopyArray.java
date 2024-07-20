package com.interveiw;

public class CopyArray {
	public static void main(String[] args) {
		int []A= {1,8,3};
		int []B= A.clone();
		//B[0]++;
		System.out.println("Content of a[]:");
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println();
		System.out.println("Content of B[] ");
		for(int i=0;i<B.length;i++) {
			System.out.print(B[i]+" ");
		}
	}

}
