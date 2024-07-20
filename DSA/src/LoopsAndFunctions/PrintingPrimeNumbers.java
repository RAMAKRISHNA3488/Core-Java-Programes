package LoopsAndFunctions;

import java.util.Scanner;

public class PrintingPrimeNumbers {
    public static boolean isPrime(int n){
        // Write your code here
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=scanner.nextInt();
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
