package com.strings;

public class MyImmutabale {

	int x;
	String name;

	MyImmutabale(int x, String name) {
		this.x = x;
		this.name = name;
	}

	public MyImmutabale change(int x, String name) {
		if (this.x == x) {
			if (this.name == name) {

			}
			return this;
		} else {
			return new MyImmutabale(x, name);
		}
	}

	public static void main(String[] args) {
		MyImmutabale m1 = new MyImmutabale(20, "ram");
		MyImmutabale m2 = m1.change(20, "krishna");
		System.out.println(m1 == m2);
		MyImmutabale m3 = m2.change(30, "krishna");
		System.out.println(m3 == m2);

	}

}
