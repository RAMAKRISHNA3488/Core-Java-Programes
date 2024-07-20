package FlowControlStatement;

import java.util.Scanner;

public class AlphabetsDemo {
	public void display(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if ((j == 0 || j == n / 2) && i != 0 || i == 0 && j != n / 2 || i == n / 2)
					System.out.print("*");
				else
					System.out.print("");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		
		AlphabetsDemo a = new AlphabetsDemo();
		a.display(7);
	}

}
