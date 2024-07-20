package Simpleprogram;

import java.util.Scanner;

public class PersonHR {
	private int age;

	public PersonHR(int initialAge) {
		this.age = initialAge;
	}

	public void amIOld() {
		if (this.age < 0) {
			System.out.println("Age is not valid, setting age to 0.");
			this.age = 0;
			amIOld();

		} else if (this.age < 13)
			System.out.println("You are young.");
		else if (this.age < 18)
			System.out.println("You are a teenager.");
		else if (this.age >= 18)
			System.out.println("You are old.");

	}

	public void yearPasses() {
		// Increment this person's age.
		this.age += 1;
	}

	public static void main(String[] args) {
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			PersonHR p = new PersonHR(age);
			p.amIOld();
			/*for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();*/
		}
		sc.close();
	}

}
