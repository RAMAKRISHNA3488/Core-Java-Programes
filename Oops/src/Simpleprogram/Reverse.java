package Simpleprogram;

public class Reverse {

	public static void main(String[] args) {
		String s = "Ramakrishna";
		String sr = "";
		s = s.toUpperCase();
		for (int i = s.length() - 1; i >= 0; i--) {
			sr = sr + s.charAt(i);
		}
			System.out.println("Original String is: " + s);
			System.out.println("Reverse: " + sr);
		
	}

}
