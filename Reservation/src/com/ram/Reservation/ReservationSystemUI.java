package com.ram.Reservation;

import java.util.Random;
import java.util.Scanner;

public class ReservationSystemUI {
	private static ReservationSystem reservationSystem = new ReservationSystem();

	public static void start() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1. Make a Reservation. ");
			System.out.println("2. View all Reservations.");
			System.out.println("3. cancel a Reservation.");
			System.out.println("4. Exit.");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Name: ");
				String name = scanner.nextLine();
				System.out.println("Date: ");
				String date = scanner.nextLine();
				System.out.println("Number of Guests:");
				int numberOfGuests = scanner.nextInt();

				Reservation reservation = reservationSystem.makeReservation(name, date, numberOfGuests);
				System.out.println("Reservation made with ID : " + reservation.getId());
				break;

			case 2:
				System.out.println("Reservations.");

				for (Reservation reservation2 : reservationSystem.getReservations()) {
					System.out.println(reservation2.getId() + "-" + reservation2.getName() + "-"
							+ reservation2.getDate() + "-" + reservation2.getNumberOfGuests());
				}
				break;

			case 3:
				System.out.println("Reservation ID to cancel: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				if (reservationSystem.cancelReservation(id)) {
					System.out.println("Reservation canceled.");
				} else {
					System.out.println("Reservation not found.");
				}
				break;

			case 4:
				return;

			default:
				System.out.println("Invalid choice.");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		start();

	}

}
