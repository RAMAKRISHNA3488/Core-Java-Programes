package testproject; 

import inheritanceproject.Manager;
import inheritanceproject.Developer;
import inheritanceproject.Tester;
public class TestInhe{
	
	public static  void main(String[] args ) {
		String[] project=new String[] {"Flight Reservation","Check in"};
		Manager manager=new Manager(1,"john","Travel",1000000,project);
		System.out.println(manager.id);
		System.out.println(manager.name);
		System.out.println(manager.salary);
		manager.work();
		  
		String[] technology=new String[] {"Developing"};
		Developer developer= new Developer(2, "ram","Travel",20000000,"full stack java developer");
	    System.out.println(developer.id);
	    System.out.println(developer.name);
	    System.out.println(developer.salary);
	    developer.work();
	    
	    
	    String[] tools=new String[] {"Testing"};
	    Tester tester=new Tester(3, "krishna", "Travel",900000, tools);
	    System.out.println(tester.id);
	    System.out.println(tester.name);
	    System.out.println(tester.salary);
	    tester.work();
	    
	    
	    
	    
	}}
