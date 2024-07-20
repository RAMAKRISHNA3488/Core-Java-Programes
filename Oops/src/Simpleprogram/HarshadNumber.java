package Simpleprogram;

public class HarshadNumber {
	/*
	 * int r, sum = 0, tem; int n = 258; tem = n; while (0 < n) { r = n % 10; sum =
	 * sum * 10 + r; n = n / 10;
	 */
	public static void main(String[] args) {
		int rem, sum = 0;
		int num = 121;
		int temp = num;
		while (0 < num) {
			rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println(num + " is a Harshad Number");
		} else {
			System.out.println(num + " is not a harshad Number");
		}
	}

}
