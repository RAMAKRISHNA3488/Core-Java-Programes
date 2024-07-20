package Simpleprogram;

public class PronicNumber {
	public static boolean pronic(int num) {
		boolean flag=false;
		for(int j=1;j<num;j++) {
			if(j*(j+1)==num) {
				flag=true;
				break;
				
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		for(int i=1;i<100;i++) {
			if(pronic(i))
			System.out.print(i+" ");
		}
	}

}
