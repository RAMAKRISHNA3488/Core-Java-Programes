package Simpleprogram;

public class Replace {

	public static void main(String[] args) {

		int t=(int) (Math.random()*9999)+1000;
		System.out.println("Otp: "+t);
		
		String pn="9949920819";
		String replace=pn.replaceAll(".(?=.{5})", "x");
		System.out.println(replace);
	}

}
