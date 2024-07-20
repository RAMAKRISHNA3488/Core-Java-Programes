package Simpleprogram;

public class ReverseInteger {
	public static int reverse(int num) {
		long ans=0;
	while(num!=0) {
		 ans=ans*10+num%10;
		 num/=10;
	}
		
		return (int) ((ans<Integer.MIN_VALUE||ans>Integer.MAX_VALUE)? 0:ans);
	}
	public static void main(String[] args) {
		int num=12345;
		System.out.println(num);
		System.out.println(reverse(num));
		
		
	}

}
