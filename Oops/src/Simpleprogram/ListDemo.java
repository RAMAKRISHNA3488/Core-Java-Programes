package Simpleprogram;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

final class ListDemo {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			int v = sc.nextInt();
			list.add(v);
		}
		int m = sc.nextInt();
		while (m-- > 0) {
			String s = sc.next();
			if (s.equals("Insert")) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				list.add(a, b);
			} else {
				int x = sc.nextInt();
				list.remove(x);
			}
		}
		for (Integer i : list) {
			System.out.println(i);
		}
	}

}
