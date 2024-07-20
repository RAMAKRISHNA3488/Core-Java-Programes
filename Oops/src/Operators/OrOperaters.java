package Operators;

public class OrOperaters {
	public static void main(String[] args) {
		int x = 1, y = 2, z = 5;
		//this condition is true
		if (x == 1 || x > y || x > z) {
			System.out.println("one");
		}
		//this condition is true
		if (x == y || y == 2 || z == 5) {
			System.out.println("Two");
		}
		//this condition is false.because there are not condition at least one true
		if (x == y || y == z || z == x) {
			System.out.println( "Three");
		}
		System.out.println("x: "+(!((x+2)==(1+2))));
		
		if(!(x==y)&&((y+5)>z)&&(!((z-3==0)))) {
			System.out.println("Hello");
		}
	}
}
