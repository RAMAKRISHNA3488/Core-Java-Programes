package LoopsAndFunctions;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");

        int num=scanner.nextInt();

        if(isPrime(num)){
            System.out.println("Prime number"); 
        }else{
            System.out.println("Not a prime number");
        }
    }
}
