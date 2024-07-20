package com.collection;

public class Products {
	int Id;
	String Name;
	float Prize;

	public Products(int Id, String Name, float Prize) {
		this.Id = Id;
		this.Name = Name;
		this.Prize = Prize;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public float getPrize() {
		return Prize;
	}

	
}
