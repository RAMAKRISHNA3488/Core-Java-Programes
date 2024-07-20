package LeetCode;

import java.util.Scanner;

public class PerfectNumber {
    public static String isPerfect(int num){
        if(num==1){
            return "Not a Perfect Number";
        }
        int sum=1;
        for(int i=2;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            return "Perfect Number";
        }else{
            return "Not a Perfect Number";
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
        System.out.println(isPerfect(num));
        
        
    }
}
