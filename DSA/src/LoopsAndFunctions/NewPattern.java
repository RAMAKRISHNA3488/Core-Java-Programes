package LoopsAndFunctions;

public class NewPattern {
	public static void main(String[] args) {
		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = num; k >= i; k--) {
				System.out.print("*");
			}
			for (int x = num; x > i; x--) {
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
