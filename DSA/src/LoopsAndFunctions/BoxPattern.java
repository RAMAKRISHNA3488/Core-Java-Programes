package LoopsAndFunctions;

public class BoxPattern {
	public static void main(String[] args) {
		int num = 5;
		int temp1 = 4, temp2 = 0;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - temp1; j++) {
				System.out.print("*");
			}

			temp1--;
			temp2++;
			System.out.println();

		}
	}

}
