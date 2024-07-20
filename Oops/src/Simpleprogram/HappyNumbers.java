package Simpleprogram;

public class HappyNumbers {
	public static int happynumbers(int num) {
		int rem, sum = 0;
		while (num > 0) {
			rem = num % 10;
			sum = sum * 10 + rem * rem;
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			int result = i;

			while (result != 0 && result != 4) {
				result = happynumbers(result);

			}
			if (result == 1) 
				System.out.println(i + " ");
			
		}
	}
}
