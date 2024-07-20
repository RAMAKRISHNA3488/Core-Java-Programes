package Simpleprogram;

public class FactorialDemo {

	public static void factorial(int num) {
		int fac = 1;
		for (int i = 1; i <= num; i++) {
			fac = fac * i;
			System.out.println(fac);
		}

	}
	
	public static void sum(int num) {
		int fac = 1;
		for (int i = 1; i <= num; i++) {
			fac +=i;
			System.out.println(fac);
		}

	}

	public static void main(String[] args) {
		int num = 15;

		//factorial(num);
		
		sum(num);

	}

}
