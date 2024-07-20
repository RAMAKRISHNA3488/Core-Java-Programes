package FlowControlStatement;

import java.util.Scanner;

public class Nnumbers {
	
	
	/*static void method1(int n) {
		if(0<=n) {
			method1(n-1);
			System.out.print(n+" ");
		}
	}

	public static void main(String[] args) {
		/*int num=1;
		while(num<=100) {
			System.out.print(num+" ");
			num++;
		}*/
     // method1(100);"
	/*	System.out.println("Enter any Number");
      Scanner scanner=new Scanner(System.in);
      int n=scanner.nextInt();
      method1(n);
	}*/

	public static void method2(int n) {
		if(0<=n) {
			method2(n-1);
			System.out.print(n+" ");
			
		}
	}
	
	public static void main(String[] args) {
		method2(10);
	}
	
}
