package Simpleprogram;

public class PrintNumWithoutLoop {

	/*public static void method(int num) {
		if (num <= 100) {
			System.out.print(num + " ");
			method(num + 1);
		}
	}

	public static void main(String[] args) {
		method(1);

	}*/
	public static void method2(int num) {
		if(0<=num) {
			method2(num-1);
			System.out.print(num+" ");
			
		}
	}
	
	public static void main(String[] args) {
		method2(10);
	}
}
