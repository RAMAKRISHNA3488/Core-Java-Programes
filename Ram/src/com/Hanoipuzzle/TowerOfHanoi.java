package com.Hanoipuzzle;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ring count: ");
		int height;
		height = sc.nextInt();
		Towers t = new Towers(height);
		t.printTowers();
		TowerSolver solver = new TowerSolver(t);
		solver.slove(height, 1, 3, 2);

		long end = System.currentTimeMillis();
		System.out.print("the total time is: " + (end - start) / 1000 + " seounds");

	}

}
