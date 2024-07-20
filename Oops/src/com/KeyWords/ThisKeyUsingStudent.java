package com.KeyWords;

public class ThisKeyUsingStudent {
	int rollNo;
	String name;
	float fee;
   
	public ThisKeyUsingStudent(int rollNo2, String name2, double d) {
		rollNo=rollNo;
		name=name;
		fee=fee;
	}

	public void Display() {
    	System.out.println(rollNo+" "+name+" "+fee);
    }
    public static void main(String[] args) {
		ThisKeyUsingStudent t=new ThisKeyUsingStudent(1,"ram",1000.0);
		t.Display();
	}

}
