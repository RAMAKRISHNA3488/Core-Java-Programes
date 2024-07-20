package com.Constructor;

public class No_Arg_Constructor {
	private int id;
	private String name;
	private int age;

	public No_Arg_Constructor() {
		this.id = 1;
		this.name = "Ram";
		this.age = 22;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
