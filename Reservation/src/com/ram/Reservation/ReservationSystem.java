package com.ram.Reservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReservationSystem {
	private List<Reservation> reservations = new ArrayList<Reservation>();
	private int nextId = 1;
	
	
	Random random=new Random(10);
	

	public Reservation makeReservation(String name, String date, int numberOfGuests) {
		Reservation reservation = new Reservation(nextId++, name, date, numberOfGuests);
		reservations.add(reservation);
		return reservation;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public Reservation getReservationById(int id) {
		for (Reservation reservation1 : reservations) {
			if (reservation1.getId() == id) {
				return reservation1;
			}

		}
		return null;
	}

	public boolean cancelReservation(int id) {
		Reservation reservation1 = getReservationById(id);
		if (reservation1 != null) {
			reservations.remove(reservation1);
			return true;
		}
		return false;
	}

}
