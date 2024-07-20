package LoopsAndFunctions;

import java.util.Scanner;

public class ReverseString {
    // public static void reverseString(String str) {
    // for(int i=str.length()-1; i>=0; i--){
    // System.out.print(str.charAt(i));
    // }
    // }

    // public static void reverseString(String str) {

    //     StringBuilder sb = new StringBuilder(str);
    //     sb.reverse();
    //     System.out.println(sb);
    // }

    public static void reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {

        // String str = "Ram";
        // // System.out.println(reverseString(str));
        // reverseString(str);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=scanner.nextLine();
        reverseString(str);


    }
}
