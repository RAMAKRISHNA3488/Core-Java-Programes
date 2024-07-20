package FlowControlStatement;

import java.util.Scanner;

public class PrimeNoOrNot {
	static int num;

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		boolean flag=false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
			if (!flag) {
				System.out.println(num + " is  a prime number");
			} else {
				System.out.println(num + "is not  a prime number");
			}
		}
	}

}
