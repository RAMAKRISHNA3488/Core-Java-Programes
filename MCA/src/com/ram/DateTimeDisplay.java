package com.ram;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDisplay {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");

		String formattedDate = dateTime.format(formatter);

		System.out.println("Current Data and Time: " + formattedDate);

	}
}
