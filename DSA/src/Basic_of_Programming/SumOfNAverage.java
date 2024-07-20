package Basic_of_Programming;

import java.util.Scanner;

public class SumOfNAverage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.println("Enter the number "+ i+" : ");
            int num=scanner.nextInt();
            sum+=num;
        }

        System.out.println("The sum of the numbers is: "+sum);
        float avg=sum/n;
        double per=sum/n*100;
        System.out.println(per);
        per=per/100;
        System.out.println("The average of the numbers is: "+per);
        System.out.println("The sum of the numbers is: "+avg);
    }
}
