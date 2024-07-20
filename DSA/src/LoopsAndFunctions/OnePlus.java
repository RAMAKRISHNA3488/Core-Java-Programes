package LoopsAndFunctions;

import java.util.Scanner;

public class OnePlus {

    public static int[] onePlus(int[] arr) {
        // Your code here
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }else{
            arr[i] = 0;
            }
        }
        arr = new int[arr.length + 1];
        arr[0] = 1;
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {

            arr[i] = scanner.nextInt();

        }

        int[] result = onePlus(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
