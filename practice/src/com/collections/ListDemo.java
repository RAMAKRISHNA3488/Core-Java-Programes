package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	static int n = 10, i, j;

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(100);
		for (i = n; i >= 1; i--) {
			for (j = n; j >= 1; j--) {
				if (i >= j) {
					System.out.print(i);
					} else {
						System.out.println();
					}
			}

		}
      list.add(i);
      System.out.println(list);
	}

}
