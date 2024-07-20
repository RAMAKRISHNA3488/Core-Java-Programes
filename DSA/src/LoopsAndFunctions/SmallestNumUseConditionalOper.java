package LoopsAndFunctions;

import java.util.Scanner;

public class SmallestNumUseConditionalOper {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum=scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum=scanner.nextInt();
        System.out.println("Enter the third number: ");
        int thirdNum=scanner.nextInt();

        System.out.println("Smallest Number is "+(firstNum<secondNum?(firstNum<thirdNum?firstNum:thirdNum):(secondNum<thirdNum?secondNum:thirdNum)));
    }
}
