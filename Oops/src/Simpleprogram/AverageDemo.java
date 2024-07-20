package Simpleprogram;

import java.util.Scanner;

public class AverageDemo {
	static double sum;

	public static void main(String[] args) {
		int count = 1;
		System.out.println("Enter 'N' Numbers");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while (count <= num) {
			System.out.println("Enter " + count + " number");
			int one_by_one_numbers = scanner.nextInt();
			sum += one_by_one_numbers;
			count++;
		}
		double Average = sum / num;
		System.out.println("Average " + Average);

	}

}
