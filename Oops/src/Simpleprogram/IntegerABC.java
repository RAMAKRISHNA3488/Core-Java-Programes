package Simpleprogram;

import java.util.Scanner;

public class IntegerABC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		for (int i = 0; i < test; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int n = scanner.nextInt();
			int sum=a;
			for(int j=0;j<n;j++) {
				sum+=b*Math.pow(2, j);
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}

}
