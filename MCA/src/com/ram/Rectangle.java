package com.ram;

import java.util.Scanner;

public class Rectangle extends Shape {

	@Override
	public void getArea(int length, int width) {
		int result = length * width;
		System.out.println("Area of the Rectangle is " + result);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of the Rectangel: ");
		int length = scanner.nextInt();
		System.out.println("Enter width of the Rectangle: ");
		int width = scanner.nextInt();
		Rectangle areaOfTheRectangle = new Rectangle();
		areaOfTheRectangle.getArea(length, width);
	}

}
