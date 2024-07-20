package LoopsAndFunctions;

import java.util.Scanner;

public class FibonacciNumber {
    public static boolean isPerfetNumber(int num){
        int perfetnum=(int)Math.sqrt(num);
         return (perfetnum*perfetnum==num);

    }

    public static boolean fibonacciNumber(int n){
        return isPerfetNumber(5*n*n+4)||isPerfetNumber(5*n*n-4);
    }
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the number of terms");
       int n=scanner.nextInt();
       if(fibonacciNumber(n)){
           System.out.println("fibonacci number");
       }else{
        System.out.println("Not a fibonacci number");
       }

    }
    
}
