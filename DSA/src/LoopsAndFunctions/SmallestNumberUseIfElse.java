package LoopsAndFunctions;

import java.util.Scanner;

public class SmallestNumberUseIfElse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=scanner.nextInt();
        System.out.println("Enter b number: ");
        int b=scanner.nextInt();
        System.out.println("Enter c number: ");
        int c=scanner.nextInt();
        if(a<b && a<c){
            System.out.println("a is smallest");
        }else if(b<a && b<c){
            System.out.println("b is smallest");
        }else{
            System.out.println("c is smallest");
        }

    }
}
