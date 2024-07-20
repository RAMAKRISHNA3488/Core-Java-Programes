package com.inheritance.Super;

public class Subchild extends Child {
       int c;
	Subchild(int z ,int x,int y) {
		super(x,y);
		c=z;
	}
		
		void show() {
			System.out.println("a: "+a +"b: "+b +"c:"+c);
			System.out.println("this is end");
		}
	}


