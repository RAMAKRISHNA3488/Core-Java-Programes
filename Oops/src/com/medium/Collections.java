package com.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Collections {
	public static <T extends Comparable<? super T>> void sort(List<T> list) {
		Object[] a = list.toArray();
		Arrays.sort(a);
		ListIterator<T> i = list.listIterator();
		for (int j = 0; j < a.length; j++) {
			i.next();
			i.set((T) a[j]);
		}
	}

	public static <T> void sort(List<T> list, Comparator<? super T> c) {
		Object[] a = list.toArray();
		Arrays.sort(a);
		ListIterator<T> i = list.listIterator();
		for (int j = 0; j < a.length; j++) {
			i.next();
			i.set((T) a[j]);
		}
	}
}
