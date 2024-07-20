package com.innerclass;

public class StaticInnerClass {
	private static int x = 80;
	private int y;

	StaticInnerClass(int y) {
		this.y = y;
	}

	void f1() {
		System.out.println("outside the static method ");
	}

	static class inner {

		private int y;

		inner(int y) {

			this.y = y;

		}

		static void f2() {
			System.out.println(" Outsize: " + StaticInnerClass.x);
			System.out.println("inside the staic method");
		}

	}

	public static void main(String[] args) {
		StaticInnerClass si = new StaticInnerClass(50);
		si.f1();

		StaticInnerClass.inner.f2();

	}

}
