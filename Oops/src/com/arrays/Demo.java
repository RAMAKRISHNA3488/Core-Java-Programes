package com.arrays;

public class Demo {
	public static void main(String[] args) {
		int[] arraya_vai = { 11, 13, 14, 15, 11, 12, 13, 14, 15, 12 };
		int lengthOfTheArray = arraya_vai.length;
		int uniqueelCount = 0;
		for (int i = 0; i < lengthOfTheArray; i++) {
			boolean isDublicate = false;
			for (int j = 0; j < i; j++) {
				if (arraya_vai[i] == arraya_vai[j]) {
					isDublicate = true;
					break;
				}
			}
			if (!isDublicate) {
				uniqueelCount++;

			}

		}
		int[] uniquearray = new int[uniqueelCount];
		int index = 0;
		for (int i = 0; i < lengthOfTheArray; i++) {
			boolean isDublicate = false;
			for (int j = 0; j < i; j++) {
				if (arraya_vai[i] == arraya_vai[j]) {
					isDublicate = true;
					break;
				}
			}
			if (!isDublicate) {
				uniquearray[index++] = arraya_vai[i];
			}

		}

		for (Integer num : uniquearray) {
			System.out.print(num + " ");
		}

	}

}
