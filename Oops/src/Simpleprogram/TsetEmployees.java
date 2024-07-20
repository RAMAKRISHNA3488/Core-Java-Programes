package Simpleprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TsetEmployees {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		Employee e = new Employee(111, "Ram", 28, 10000, "7554856214", 01, "Software");
		Employee e1 = new Employee(222, "riya", 15, 10000, "966302210", 02, "developer");
		Employee e2 = new Employee(333, "tej", 20, 10000, "96011414514", 03, "Executive Assitance");
		Employee e3 = new Employee(444, "ravi", 30, 10000, "9685424514", 04, "Software");
		Employee e4 = new Employee(555, "kalyan", 26, 10000, "9923015489", 05, "Software");
		Employee e5 = new Employee(666, "pavan", 36, 10000, "9875645645", 06, "Software");
		Employee e6 = new Employee(777, "venkatesh", 19, 10000, "78954454154", 07, "Software");
		Employee e7 = new Employee(888, "vikram", 98, 10000, "8158882011", 8, "Software");
		Employee e8 = new Employee(999, "vamsi", 32, 10000, "75554214555", 9, "Software");

		employees.add(e);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);

		System.out.println("Original salary");
		System.out.println(employees);

		List<Employee> incrementsalaries = employees.stream().map(ee -> {
			if (ee.getAge() < 25) {
				ee.setSalary(ee.getSalary() * 1.10);
			}
			return ee;
		}).collect(Collectors.toList());
		System.out.println("Incremented salaries");
		System.out.println(incrementsalaries);

	}

}
