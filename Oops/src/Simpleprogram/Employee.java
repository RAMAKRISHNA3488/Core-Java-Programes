package Simpleprogram;

public class Employee {
	private int Id;
	private int RollNumber;
	private String Name;
	private int Age;
	private String Dept;
	private double salary;
	private String MobileNumber;

	public Employee(int Id, String Name, int Age, double salary, String MobileNumber, int RollNumber, String Dept) {
		this.Id = Id;
		this.Name = Name;
		this.Age = Age;
		this.salary = salary;
		this.MobileNumber = MobileNumber;
		this.RollNumber = RollNumber;
		this.Dept = Dept;

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

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public int getRollNumber() {
		return RollNumber;
	}

	public void setRollNumber(int rollNumber) {
		RollNumber = rollNumber;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		this.Dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Age=" + Age + ", salary=" + salary + "]";
	}

}
