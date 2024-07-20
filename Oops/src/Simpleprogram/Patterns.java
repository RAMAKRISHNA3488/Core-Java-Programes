package Simpleprogram;

public class Patterns {
	public static void pattern1(int n) {
		int x=n;
		for(int i=1;i<n;i++) {
			for(int j=1;j<2*n;j++) {
				if((j>=x&&j<=2*n-x)||(j<=n-x+1)||(j>=n+x-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				x--;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=16;
		pattern1(n);
	}

}
