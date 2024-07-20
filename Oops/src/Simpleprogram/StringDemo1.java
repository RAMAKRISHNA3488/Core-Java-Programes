package Simpleprogram;

public class StringDemo1 {
	public static void main(String[] args) {
        //instance variable 
		String string_Name = "Ramakrishna";
		//finding the length of the string
		int Length_of_the_String = string_Name.length();

		System.out.println("Length of the String: " + Length_of_the_String);
		System.out.println("Displaying the First Character: " + string_Name.charAt(0));
		System.out.println("Displaying the Last Character: " + string_Name.charAt(Length_of_the_String - 1));
		char[] converting_character = string_Name.toCharArray();

		for (Character c : converting_character) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("The String is replaceing the characters: " + string_Name.replace("R", "G"));

	}

}
