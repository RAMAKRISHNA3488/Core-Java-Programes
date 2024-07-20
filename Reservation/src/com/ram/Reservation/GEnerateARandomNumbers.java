package com.ram.Reservation;

import java.util.Random;

public class GEnerateARandomNumbers {
	public static void main(String[] args) {
		
		Random r=new Random();
		for(int i=0;i<5;i++) {
			int number=r.nextInt(5);
			System.out.print(number);
		}
	
	}

}
