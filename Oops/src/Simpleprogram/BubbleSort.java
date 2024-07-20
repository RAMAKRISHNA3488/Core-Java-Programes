package Simpleprogram;

import java.util.Arrays;

public class BubbleSort {
	static void bubbleSort(int array[]) {
		int size = array.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int tem = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tem;

				}
			}
		}
	}

	public static void main(String[] args) {
		int data[] = { 5, 3, 1, 2 };
		BubbleSort.bubbleSort(data);
		System.out.println(Arrays.toString(data));
		//System.out.println("\uD83E\uDD84");

	}

}
