package Basic_of_Programming;

import java.util.Scanner;

public class DataTypesAndVariables1 {
//	To calculate the area of a rectangle given its length and width, you can use the formula: 
//		Area=Length×Width 
//		Here's how to solve it: 
//		Input: Obtain the length and width of the rectangle from the user. 
//		Calculate: Use the formula mentioned above to calculate the area by multiplying the length and 
//		width. 
//		Output: Display the calculated area. 
//		Let's demonstrate this with an example: 
//		Default Input: 
//		Length of the rectangle: 10 units 
//		Width of the rectangle: 5 units 
//		Calculation: 
//		Area=Length×Width 
//		Area=10×5 
//		Area=50square units 
//		Default Output: 
//		Area of the rectangle: 50 square units

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Length of the rectangle: ");
		int Lenght = scanner.nextInt();

		System.out.println("Width of the rectangle: ");
		int Width = scanner.nextInt();

		int Area = Lenght * Width;

		System.out.println("Area of the rectangle: " + Area + " square units");

	}

}
