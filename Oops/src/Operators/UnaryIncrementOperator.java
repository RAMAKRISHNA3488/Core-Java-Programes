package Operators;

public class UnaryIncrementOperator {
	public static void main(String[] args) {
		int x = 10;
		System.out.println("Present Value: x is " + x);
		int y = 10;
		System.out.println("Present Value: y is " + y);
		int b = y--;
		System.out.println("Post Decrement Value: y is " + x);
		int a = --x;
		System.out.println("Pre Decrement Value: x is " + x);

	}

}
