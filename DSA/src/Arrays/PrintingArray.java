package Arrays;

import java.util.Scanner;

public class PrintingArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.print("The elements of the array are: ");
        //printing the array
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
