package Simpleprogram;

import java.util.Scanner;

public class InterfaceHR implements AdvancedInterface {

	@Override
	public int divisorSum(int n) {
		if(n==1) {
			return n;
		}
		int ans=n;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				ans+=n;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.close();
		
		AdvancedInterface ai=new InterfaceHR();
		int sum=ai.divisorSum(n);
		System.out.println("I implemented: "+ai.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}

}
