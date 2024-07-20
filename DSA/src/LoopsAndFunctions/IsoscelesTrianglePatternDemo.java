package LoopsAndFunctions;

import java.util.Scanner;

public class IsoscelesTrianglePatternDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Ask the user for the number of rows
        System.out.println("Enter the number of rows: ");
        int n=scanner.nextInt();
        //int i=1;
        for(int i=1;i<=n;i++){
            //Print spaces before printing stars
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            //Print stars
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
          
            //Print a new line
            System.out.println();
        }
    }
}
