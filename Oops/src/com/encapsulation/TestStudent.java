package com.encapsulation;

public class TestStudent {
	public static void main(String[] args) {
		// creating instance of the encapsulated class
		Student s = new Student();
		// Setting the values
		s.setId(1);
		s.setName("John");
		s.setRank(11504);
		s.setAddress("USA");
		// Getting the values
		System.out.println("Id: "+s.getId());
		System.out.println("Name: "+s.getName());
		System.out.println("Rank: "+s.getRank());
		System.out.println("Address: "+s.getAddress());
	}

}
