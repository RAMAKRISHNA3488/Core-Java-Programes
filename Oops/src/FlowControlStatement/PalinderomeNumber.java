package FlowControlStatement;

public class PalinderomeNumber {

	public static void main(String[] args) {
		int n =121;
		int ch=n;
		int sum=0;
		while(n!=0) {
			sum= sum*10+n%10;
			n=n/10;
		}
       if(ch==sum) {
    	   System.out.println("Palinderome number");
       }else {
    	   System.out.println("not Palinderome number ");
       }
	}

}
