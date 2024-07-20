package com.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeTest {
	// counting males and females
	public static void getCountOfMaleFemale(List<Employee> emplList) {
		Map<String, Long> noOfMaleAndFemale = emplList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("> > > > >Counting male and female: " + noOfMaleAndFemale);
	}

	// printing the all Departments
	public static void getDepartmentNames(List<Employee> employeeList) {
		System.out.println("> > > > >All DepartmentNames : ");
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
	}

	// Average of the Male and Female
	public static void getGender(List<Employee> employeelist) {
		Map<String, Double> avgAge = employeelist.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgAge);
	}

	// Printing the Names
	public static void getNames(List<Employee> employeeList) {
		System.out.println("> > > > >Printing the Names: ");
		employeeList.stream().map(Employee::getName).forEach(System.out::println);
	}

	// get name of employees who joined after 2015
	public static void getAfter2015(List<Employee> emplList) {
		System.out.println("> > > > >get name of employees who joined after 2015: ");
		emplList.stream().filter(e -> e.getYearOfjoining() > 2015).map(Employee::getName).forEach(System.out::println);
	}

	// Count the number of employees in each department
	public static void getCountByDept(List<Employee> countEmployees) {
		System.out.println("> > > > >Count the number of employees in each department:");
		Map<String, Long> countByDept = countEmployees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		Set<Entry<String, Long>> entryset = countByDept.entrySet();

		for (Entry<String, Long> entry : entryset) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	// Finding the Average salary of each Department
	public static void getavgSalary(List<Employee> avgEmployee) {
		System.out.println("> > > > >Average salary of each Department:");
		Map<String, Double> avgSalary = avgEmployee.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		Set<Entry<String, Double>> entrySet = avgSalary.entrySet();
		for (Entry<String, Double> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
//Finding the max Employee
	public static void getOldestEmp(List<Employee> employee) {
		System.out.println("> > > > > Oldest Employee: ");
		Optional<Employee> oldestEmp = employee.stream().max(Comparator.comparingInt(Employee::getAge));
		Employee oldest = oldestEmp.get();

		System.out.println("Name: " + oldest.getName());
		System.out.println("Age: " + oldest.getAge());
		System.out.println("Department: " + oldest.getDepartment());
	}
	
	public static void getavgandtotalsalary(List<Employee>employeeList) {
		System.out.println("Average and total Salary: ");
		DoubleSummaryStatistics summaryStatistics=employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average of Salary: "+summaryStatistics.getAverage());
		System.out.println("Total of Salary: "+summaryStatistics.getSum());
	}
	
	public static void listdowndepartment(List<Employee>employees) {
		Map<String, List<Employee>>mapemployee=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		Set<Entry<String, List<Employee>>>enSet=mapemployee.entrySet();
		for(Entry<String, List<Employee>>entry :enSet) {
		   System.out.println("--------------------------------");
		   System.out.println("Employee in "+entry.getKey()+" : ");
		   System.out.println("--------------------------------");
		   List<Employee>list=entry.getValue();
		   for(Employee e:list) {
			   System.out.println(e.getName());
		   }
		}
	}

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// counting males and females
		getCountOfMaleFemale(employeeList);
		// printing the all Departments
		getDepartmentNames(employeeList);
		// Average of the Male and Female
		getGender(employeeList);
		// Printing the Names
		getNames(employeeList);
		// get name of employees who joined after 2015
		getAfter2015(employeeList);
		// Count the number of employees in each department
		getCountByDept(employeeList);
		// Finding the Average salary of each Department
		getavgSalary(employeeList);
		//oldest Employee
		getOldestEmp(employeeList);
		
		getavgandtotalsalary(employeeList);
		
		listdowndepartment(employeeList);
	}

}
