package com.medium;

public class CarTest {
	public static void main(String[] args) {

		Car car = new Car("kia", 2000);
		car.StartEngian();
		System.out.println("Modal Name:" + car.getName());
		System.out.println("Car Modal Year:" + car.getYears());

	}
}
