package Simpleprogram;

public class CountCharacters {

	public static void main(String[] args) {
		String s = "I am Ram";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Total number of Characters: " + count);
	}

}
