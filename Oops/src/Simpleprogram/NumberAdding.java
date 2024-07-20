package Simpleprogram;

import java.util.Scanner;

public class NumberAdding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), rem, sum = 0, temp;
		temp = n;
		if (n == 0) {
			System.out.println("Not Adding");
		}else {
			
			while (n != 0) {
				rem = n % 10;
				sum = sum + 0 + rem;
				n = n / 10;
			}
			System.out.println(sum);
		}
	}

}
