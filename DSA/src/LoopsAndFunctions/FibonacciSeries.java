package LoopsAndFunctions;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of terms you want to print: ");
        int n=scanner.nextInt();
        fibonacci(n);
    }
    public static void fibonacci(int n){
        int a=0,b=1,c;
        System.out.print(a+" "+b);
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
