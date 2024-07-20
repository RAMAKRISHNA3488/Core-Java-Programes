package Basic_of_Programming;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");

        int n=scanner.nextInt();

        int sum=0;

        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println("Sum of odd numbers up to "+n+" is: "+sum);
    }
}
