package com.medium;

public class Stream1 {
	private int id;
	private String name;
	private double salary;
	public Stream1(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void increamentSalary(double percentge) {
		this.salary+=(this.salary*percentge)/100;
	}

}
