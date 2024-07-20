package com.Hanoipuzzle;

public class TowerSolver {
	private int count = 0;
	private Towers t;

	TowerSolver(Towers t) {
		this.t = t;
	}

	public void slove(int towerHeight, int sourse, int destination, int aux) {
		if (towerHeight == 1) {
			t.move(sourse, destination);
			System.out.println("STEP " + (++count));
			t.printTowers();
			

		} else {
			slove(towerHeight - 1, sourse, aux, destination);
			t.move(sourse, destination);
			System.out.println("STEP " + (++count));
			t.printTowers();
			slove(towerHeight - 1, aux, destination, sourse);
			
			}
		}

	}

