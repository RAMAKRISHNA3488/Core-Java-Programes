package com.collection;

public class Employee implements Comparable<Employee> {
	
	int id;
	String name;
	String mobilenumber;
	
	Employee(int id,String name,String mobilenumber){
		this.id=id;
		this.name=name;
		this.mobilenumber=mobilenumber;
	}

	@Override
	public int compareTo(Employee o) {
		int id1=this.id;
		int id2=o.id;
		
		if(id1<id2) {
			return -1;
		}else if(id1>id2) {
			return 1;
			
		}return 0;
	}

}
