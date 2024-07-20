package Simpleprogram;

public class RemoveDigit {

	static String remDigit(String s) {

		// return s.replaceAll("//d", "");
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) {
				result = result + s.charAt(i);
			}
		}
		return result;
	}

	static String remStrig(String n) {
		String num = "";
		for (int i = 0; i < n.length(); i++) {
			if (Character.isDigit(n.charAt(i))) {
				num = num + n.charAt(i);
			}
		}

		return num;
	}

	public static void main(String[] args) {

		String p = "Java123Program12";
		System.out.println(remDigit(p));

		String r = "Java123Program12";
		System.out.println(remStrig(r));
	}

}
