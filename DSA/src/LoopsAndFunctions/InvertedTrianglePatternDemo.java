package LoopsAndFunctions;

import java.util.Scanner;

public class InvertedTrianglePatternDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=scanner.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
