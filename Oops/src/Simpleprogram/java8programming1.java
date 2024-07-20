package Simpleprogram;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class java8programming1 {

	public static void main(String[] args) {
		System.out.println("How many numbers you want print:");

		Scanner scanner =new Scanner(System.in);
		int n=scanner.nextInt();
		Random random=new Random();
		random.ints(10, 99).limit(n).forEach(System.out::println);
		
	}

}
