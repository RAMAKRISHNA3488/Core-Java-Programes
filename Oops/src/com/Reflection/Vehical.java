package com.Reflection;

public class Vehical {
	private int id;
	private String Name;

	private Vehical() {

	}

	private Vehical(int id, String name) {
		this.id = id;
		this.Name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
