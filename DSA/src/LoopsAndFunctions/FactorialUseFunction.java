package LoopsAndFunctions;

import java.util.Scanner;

public class FactorialUseFunction {

    /*
     * Enter the number:
     * 5
     * Factorial of 5 is: 120
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }

}