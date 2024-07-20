package Simpleprogram;

import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			String s=scanner.next();
			String even="",odd="";
			for(int j=0;j<s.length();j++) {
				if(j%2==0) 
					even=s.substring(j,j+1);
				else
					odd=s.substring(j,j+1);
				
			}
			System.out.println(even+" "+odd);
		}

	}

}
