package LoopsAndFunctions;

import java.util.ArrayList;
import java.util.Scanner;

public class NPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of prime numbers you want to print: ");
        int n=scanner.nextInt();
        ArrayList<Integer> primeNumbers=getPrimeNumbers(n);
        System.out.println("The first "+n+" prime numbers are: "+primeNumbers);
    }
    //function to return an arraylist of first n prime numbers
    public static ArrayList<Integer> getPrimeNumbers(int n){
        ArrayList<Integer> primeNumbers1=new ArrayList<>();
        int num=2;
        while (primeNumbers1.size()<n) {
            if(isPrime(num)){
                primeNumbers1.add(num);
            }
            num++;
            
        }

        return primeNumbers1;
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
