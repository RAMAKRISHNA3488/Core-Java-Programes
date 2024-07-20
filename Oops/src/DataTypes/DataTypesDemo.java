package DataTypes;

public class DataTypesDemo {

	public static void main(String[] args) {
		byte a = -50;
		int b = 1000;
		short f = 500;
		long g = 1000; // both lines are date types
		char c = 'x';
		float d = 98.09f;
		double e = 765.657;
		float rc = d + f;
		int r = a + b;
		int ra = (int) a + b + c;// this line is type casting//
		double rb = e + d;
		long log = g + f;
		System.out.println("Result is: " + a);
		System.out.println("Result is: " + b);
		System.out.println("Result is: " + f);
		System.out.println("Result is: " + g);
		System.out.println("Result is: " + c);
		System.out.println("Result is: " + r);
		System.out.println("Result is: " + ra);
		System.out.println("Result is: " + rb);
		System.out.println("Result is: " + rc);
		System.out.println("Result is: " + log);
	}

}
