package com.ram.Reservation;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		int numberOfRandomNumbers = 10; // Change this value to the desired number of random numbers

		Random random = new Random();

		/*for (int i = 0; i < numberOfRandomNumbers; i++) {
			int randomNumber = random.nextInt(); // Generates a random integer
			System.out.println(randomNumber);

		}*/
		int ran=random.nextInt();
		System.out.println(ran);
	}

}
