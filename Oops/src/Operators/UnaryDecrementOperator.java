package Operators;

public class UnaryDecrementOperator {
	public static void main(String[] args) {
		int x = 10;
		System.out.println("Present Value: x is " + x);
		int y = 10;
		System.out.println("Present Value: y is " + y);
		int b = y++;
		System.out.println("Post Increment Value: y is " + x);
		int a = ++x;
		System.out.println("Pre Increment Value: x is " + x);

	}

}
