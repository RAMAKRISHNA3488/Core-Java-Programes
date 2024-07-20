package Basic_of_Programming;

import java.util.Scanner;

public class FirstNEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");

        int n=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n*2;i++){

            if(i%2==0){
               sum+=i;
            }
            
        }
        System.out.println("Sum of first "+n+" even numbers is: "+sum);

    }
}
