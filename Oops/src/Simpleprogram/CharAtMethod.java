package Simpleprogram;

public class CharAtMethod {
	public static void main(String[] args) {
		String s = "ramakrishnaFromkurnool";
		int s1 = s.length() - 1;
		for (int i = 0; i < s1; i++) {
			if (i % 2 != 0) {
				System.out.println("char " + i + "=" + s.charAt(i));
			} else {
				for (int j = 0; j < s1; j++) {
					if (j % 2 == 0) {
						System.out.println("char " + j + "=" + s.charAt(j));
					}else {
						if(s.isEmpty()) {
							System.out.println("Empty");
						}
					}

				}
			}

		}
	}
}