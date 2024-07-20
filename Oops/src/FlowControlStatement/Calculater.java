package FlowControlStatement;

import java.util.Scanner;

public class Calculater {
	static double result ;

	public static void main(String[] args) {
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter two numbers");
		Double First=reader.nextDouble();
		Double Second=reader.nextDouble();
		System.out.println("Enter any Operator(+,-,*,%,/)");
		char operator=reader.next().charAt(0);
		
		
		
		switch(operator) {
		case '+':
			 result=First+Second;
			break;
		case '-':
			 result=First-Second;
			break;
		case '*':
			 result=First*Second;
			break;
		case '/':
			 result=First/Second;
			break;
		
		}
		
		System.out.printf("%1f %c %1f = %2f",First,operator,Second,result);

	}

}
