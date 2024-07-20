package FlowControlStatement;

import java.util.Scanner;

public class SwitchStatementDemo {

	public static void main(String[] args) {
		System.out.println("Enter the DAY Nummber");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for (int a1 = 1; a1 <= 31; a1++) {
			if (a == a1)
				switch (a1) {
				case 1:
					System.out.println("Today is SUNDAY: " + a1 + " Day");
					break;
				case 2:
					System.out.println("Today is MONDAY: " + a1 + " Day");
					break;
				case 3:
					System.out.println("Today is THUSDAY: " + a1 + " Day");
					break;
				case 4:
					System.out.println("It is case 4");
					break;
				case 5:
					System.out.println("It is case 5");
					break;
				default:
					System.out.println("you are enter wront number.please check your number");
				}
		}
	}
}