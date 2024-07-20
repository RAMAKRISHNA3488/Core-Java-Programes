package LoopsAndFunctions;

public class PalindromString {

	public static boolean isPalindrom(String item) {
		int start = 0;
		int end = item.length() - 1;
		while (start < end) {
			if (item.charAt(start) != item.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		String items = "i Am ramakrishna ramar";
		String item[]=items.split(" ");
		for(String s:item) {
			if(isPalindrom(s)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}

	}

}
