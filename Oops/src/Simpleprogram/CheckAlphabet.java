package Simpleprogram;

import java.util.Scanner;

public class CheckAlphabet {

	public static int checkAlphabet(char ch) {
		if (ch >= 'A' && ch <= 'Z') {
			return 1;
		} else if (ch >= 'a' && ch <= 'z') {
			return 0;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr a Character: ");
		char userInput = scanner.next().charAt(0);
		int result = checkAlphabet(userInput);
		System.out.println(result);

	}

}
