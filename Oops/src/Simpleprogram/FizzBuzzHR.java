package Simpleprogram;

import java.util.Scanner;

public class FizzBuzzHR {

	public void print(int n) {
		for (int i = 1; i <= n; i++) {
			String s = "" + i;
			if (i % 15 == 0) {
				s = "FizzBuzz" + i;
			} else if (i % 3 == 0) {
				s = "Fizz" + i;
			} else if (i % 5 == 0) {
				s = "Buzz" + i;
			} else if (i % 2 == 0) {
				s = "Divisable by 2: " + i;
			}else {
				System.out.println("not use: "+i);
			}
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		new FizzBuzzHR().print(n);

	}

}
