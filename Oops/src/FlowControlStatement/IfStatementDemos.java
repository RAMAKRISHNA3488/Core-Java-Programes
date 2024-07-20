package FlowControlStatement;

public class IfStatementDemos {
	public static void main(String[] args) {
		int a = 102, b = 109, c = 150;
		String d = "i am ram";
		String e = "i"; // combination of if and for statement as well as If statement
		if (a > b) {
			if (a > c) {
				System.out.println("A = Greater");

			} else {
				System.out.println("B = Greater");

			}
		} else if (b < c) {
			System.out.println("C = Greater");
		} else {
			System.out.println("B = Greater");
		}
	}
}
