package com.Static;

public class VariablesDemo {

		
		int id;
		String name;
		int actnumber;
		static String bank="ICICI";
		public VariablesDemo(int id, String name, int actnumber) {
			super();
			this.id = id;
			this.name = name;
			this.actnumber = actnumber;
		}
		
		public void show() {
			System.out.println("ID: "+id+" "+"Name: "+name+" "+"AccountNumber: "+actnumber+" "+"Bank: "+bank);
		}

				

	}


