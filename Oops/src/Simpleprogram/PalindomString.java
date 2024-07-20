package Simpleprogram;

public class PalindomString {

	public static void main(String[] args) {
		String input ="my nitin is speeks in malayalam";
		String[]words=input.split(" ");
		for (String word : words) {
			if(isPalindom(word)) {
				System.out.println(word);
			}
		}
		

	}
	// nitin    121   
	public static boolean isPalindom(String input) {
		int i1=0;  //n i
		int i2=input.length()-1; //n i 
		while(i2>i1) {
			if(input.charAt(i1)!=input.charAt(i2)) {
				return false;
				
			}
			i1++;
			i2--;
		}
		return true;
		
	}

}
