package Simpleprogram;

public class ASCII {

	public static void main(String[] args) {
		int i = 'a';
		char c = 'q';
		int i1 = c;
		System.out.println(i1);
		System.out.println(i);

		for (int j = 0; j <= 10000; j++) {
			System.out.println("The ASCII values of " + (char) j + "=" + j);
		}
		char ch=9992;
		System.out.println((char) ch);
	}

}
