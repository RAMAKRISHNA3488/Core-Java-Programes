package com.ram.Reservation;

public class Reservation {
	private int id;
	private String name;
	private String date;
	private int numberOfGuests;

	public Reservation(int id, String name, String date, int numberOfGuests) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.numberOfGuests = numberOfGuests;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getNumberOfGuests() {
		return numberOfGuests;
	}

	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}

}
