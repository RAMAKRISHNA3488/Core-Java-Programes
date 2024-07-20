package com.java8and11;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<LocalDateTime> now=LocalDateTime::now;
		System.out.println(now.get());
	}

} 
/* use the supplier fundamental interface to create a reusable 
function that returns a value without taking any input*/
