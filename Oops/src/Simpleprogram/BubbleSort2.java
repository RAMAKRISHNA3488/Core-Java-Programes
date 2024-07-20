package Simpleprogram;

import java.util.Arrays;

public class BubbleSort2 {

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

	public static void sort(int array[]) {
		int size = array.length;
		int tem;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (array[j] > array[j + 1]) {
					tem = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tem;
				}
			}
		}

	}

	public static void main(String[] args) {
		int[] data1 = { 20, 10, 11, 55, 12, 13, 15, 16, 14, 19, 18, 15 };
		BubbleSort2.sort(data1);
		System.out.println(Arrays.toString(data1));
		int data[] = { 5, 4, 3, 1, 2 };
		BubbleSort2.bubbleSort(data);
		System.out.println(Arrays.toString(data));
		System.out.println("\uD83E\uDD84");

	}

}
