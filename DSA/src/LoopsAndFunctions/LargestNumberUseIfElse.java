package LoopsAndFunctions;

import java.util.Scanner;

public class LargestNumberUseIfElse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b=scanner.nextInt();
        System.out.println("Enter the third number: ");
        int c=scanner.nextInt();

        if(a>b && a>c){
            System.out.println("The largest number is: "+a);
        }else if(b>a && b>c){
            System.out.println("The largest number is: "+b);
        }else{
            System.out.println("The largest number is: "+c);
        }
    }
}
