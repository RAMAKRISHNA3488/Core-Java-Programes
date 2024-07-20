package com.simpleprogram;

public class Simplebox {
	public static void main(String[] args) {
		Box box=new Box();
		box.height=10;
		box.weight=10;
		box.depth=15;
		int volume =box.height*box.weight*box.depth;
		System.out.println("Volume is: "+volume);
	}

}
