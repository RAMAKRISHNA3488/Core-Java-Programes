package LoopsAndFunctions;

import java.util.Scanner;

public class StringReverse {

    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String str=scanner.nextLine();

        //calling the function  
        System.out.println("The reversed string is: "+reverseString(str));
       // reverseString(str);
    }
}
