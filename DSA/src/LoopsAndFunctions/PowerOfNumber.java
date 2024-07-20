package LoopsAndFunctions;

import java.util.Scanner;

public class PowerOfNumber {
    //This method takes two parameters, a number and its power
    public static int power(int num,int power){
        //Initialize the result to 1
        int result=1;
        //Loop through the power
        for(int i=0;i<power;i++){
            //Multiply the result by the number
            result=result*num;
        }
        //Return the result
        return result;
    }
    public static void main(String[] args) {
        //Create a Scanner object to read input from the user
        Scanner scanner=new Scanner(System.in);
        //Prompt the user to enter a number
        System.out.println("Enter the number");
        //Read the number from the user and store it in the num variable
        int num=scanner.nextInt();
        //Prompt the user to enter a power
        System.out.println("Enter the power");  
        //Read the power from the user and store it in the power variable
        int power=scanner.nextInt();

        //Print the power of the number
        System.out.println("The power of the number is "+power(num,power));
    }
}
