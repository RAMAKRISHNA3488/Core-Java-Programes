package LoopsAndFunctions;

import java.util.Scanner;

public class largeIntegerPlusOne {
//     Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Thus, the result should be [4,3,2,2].
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int[] arr=new int[scanner.nextInt()];
    for (int i = 0; i < arr.length; i++) {
        arr[i]=scanner.nextInt();

    }
    for (int i = arr.length-1; i >=0 ; i--) {
        if(arr[i]<9){
            arr[i]++;
            break;
        }
        else {
            arr[i]=0;
        }
    }

    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}
}
