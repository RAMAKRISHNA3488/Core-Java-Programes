package Simpleprogram;

public class Splitdemo {

	public static void main(String[] args) {
		String s = "I am Ram";
		String[] word = s.split(" ");
		for (String string : word) {
			System.out.println(string);
		}
	}

}
