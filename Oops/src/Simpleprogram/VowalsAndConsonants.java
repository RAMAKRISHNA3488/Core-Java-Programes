package Simpleprogram;

public class VowalsAndConsonants {

	public static void main(String[] args) {
		String s = "I am Kummari Ramakrishna From Kurnool Andhra Pradesh.I graduated at sri sai krishna degree college";
		s = s.toLowerCase();
		int vCount = 0, cCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				vCount++;
			} else if (s.charAt(i) > 'a' && s.charAt(i) < 'z') {
				cCount++;
			}
		}
		System.out.println("vowels: " + vCount);
		System.out.println("Consonant: " + cCount);
	}

}
