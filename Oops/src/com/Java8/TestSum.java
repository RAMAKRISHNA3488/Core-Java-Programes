package com.Java8;

public class TestSum {

	public static void main(String[] args) {
		Sum s=(x,y)->System.out.println("Sum is: "+(x+y));
		s.sum(10, 20);

	}

}
