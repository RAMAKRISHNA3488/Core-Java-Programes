package com.collection;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTest {

	public static void main(String[] args) {
		Set<Employee> set= new TreeSet<>(new EmployeeNameComparator());
		set.add(new Employee(500, "Obama", "9949920819"));
		set.add(new Employee(222, "tom","7995819781"));
		set.add(new Employee(300, "ram","1023654785"));
		
		for (Employee employee : set) {
			System.out.println( employee.id);
			System.out.print(employee.name+" ");
			System.out.println(employee.mobilenumber);
		}

	}

}
