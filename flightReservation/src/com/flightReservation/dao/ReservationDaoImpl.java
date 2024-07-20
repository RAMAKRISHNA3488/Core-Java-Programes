package com.flightReservation.dao;

import java.util.HashMap;

import com.flightReservation.model.Flight;
import com.flightReservation.model.Reservation;

public class ReservationDaoImpl implements ReservationDao {
 
	HashMap<Long, Flight> flights;
	HashMap<Long, Reservation> reservations;
	Long reservationId;
	public ReservationDaoImpl() {
		flights=new HashMap<>();
		reservations=new HashMap<>();
		Flight flight1 = new Flight();
		flight1.setId(1l);
		flight1.setFlightNumber("123");
		flight1.setOperatingAirlines("American");
		flight1.setDepartureCity("Austin");
		flight1.setArrivalCity("NewYork");
		flight1.setDateandTimeofDeparture("12/05/2023 9PM");
		flights.put(flight1.getId(), flight1);
		
		
		Flight flight2 = new Flight();
		flight2.setId(2l);
		flight2.setFlightNumber("456");
		flight2.setOperatingAirlines("Indian");
		flight2.setDepartureCity("AP");
		flight2.setArrivalCity("Hydrabad");
		flight2.setDateandTimeofDeparture("13/05/2023 9PM");
		flights.put(flight2.getId(), flight2);
	}
	@Override
	public Reservation bookFlight(Reservation reservation) {
		Flight flight=flights.get(reservation.getId());
		reservation.setFlight(flight);
		reservationId=reservationId+1;
		reservation.setId(reservationId);
		reservations.put(reservationId, reservation);
		return reservation;
	}
	
}
