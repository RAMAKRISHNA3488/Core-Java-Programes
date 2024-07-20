package LoopsAndFunctions;

import java.util.Scanner;

public class MinAndMaxInArray {
    //This method will return the minimum element in the array
    public static int min(int[] arr) {
        int min = arr[0];
        //Loop through the array to find the minimum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //This method will return the maximum element in the array
    public static int max(int[] arr) {

        int max = arr[0];
        //Loop through the array to find the maximum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompt the user to enter the size of the array
        System.out.println("Enter the size of array: ");
        //Declare an array of the size entered by the user
        int[] arr = new int[scanner.nextInt()];
        //Loop through the array and prompt the user to enter each element
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();

        }

        //Print the minimum and maximum elements in the array
        System.out.println("Minimum element in array is: " + min(arr));
        System.out.println("Maximum element in array is: " + max(arr));

    }
}
