package com.medium;

public class Car {
	private String Name;
	private int Years;

	public Car(String Name, int Years) {
		this.Name = Name;
		this.Years = Years;
	}

	public String getName() {
		return Name;
	}

	public int getYears() {
		return Years;
	}

	public void StartEngian() {
		System.out.println("Starting the Engian is " + Name + "....");
	}

}
