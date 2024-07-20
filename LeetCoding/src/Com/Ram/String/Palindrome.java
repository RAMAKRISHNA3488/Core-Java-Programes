package Com.Ram.String;

public class Palindrome {
	static boolean isPalindrom(String string) {
		int first=0;
		int second=string.length()-1;
		while(first<second) {
			if(string.charAt(first)!=string.charAt(second)) {
				return false;
		}
		first++;
		second--;
		}
		return true;
		
	}
	public static void main(String[] args) {
		String string = "rama";
		if(isPalindrom(string)) {
			System.out.println("ture");
		}else {
			System.out.println("false");
		}
	}

}
