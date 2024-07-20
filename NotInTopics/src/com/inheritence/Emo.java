package com.inheritence;

public class Emo {
	int id;
	String name;
    Address address;
    
    public Emo(int id,String name,Address address) {
    	this.id=id;
    	this.name=name;
    	this.address=address;
    }
	void display() {
		System.out.print(id+" "+name);
		System.out.println(  " "+address.city+ " " +address.state+" "+address.country);
	}
	


	public static void main(String[] args) {
		Address a1=new Address("kurnool", "ap", "Indian");
		Address a2=new Address("kallur", "ap", "Indian");
		Emo e1=new Emo(111, "ram", a1);
		Emo e2=new Emo(222, "krishna", a2);
		Emo e3=new Emo(333, "priya", a2);
		
		e1.display();
		e2.display();
		e3.display();
	}
}
