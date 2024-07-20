package Simpleprogram;

public class OverLoadingDemo {

	public static int add(int a,int b) {
		return a+b;
	}
	public static double add(float a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(add(11, 10));		
		System.out.println(add(10, 020, 100));
	}
}
