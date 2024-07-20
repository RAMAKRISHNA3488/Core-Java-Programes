package com.encapsulate;

public class Test {

	public static void main(String[] args) {
		Encapsulate e=new Encapsulate();
		e.setId("74647");
		e.setName("ram");
		e.setSsn("police");
		
		
		System.out.println("Id is:"+e.getid());
		System.out.println("Name is:"+e.getName());
		System.out.println("SSN is:"+e.getSsn());

}
}