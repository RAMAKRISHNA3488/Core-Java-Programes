package Simpleprogram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = 153, temp, rem, sum = 0;
		temp = n;

		while (n != 0) {
			rem = n % 10;
			sum = sum + (rem * rem * rem);
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("no");
		}

	}

}
