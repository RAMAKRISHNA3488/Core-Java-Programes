package LoopsAndFunctions;

import java.util.Scanner;

public class RightAngleTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Loop to print each row
        for (int i = 1; i <= n; i++) {
            // Loop to print each column in the row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
    
}
