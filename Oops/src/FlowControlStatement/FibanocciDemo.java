package FlowControlStatement;

public class FibanocciDemo {

	public static void main(String[] args) {
		int n=100,t1=0,t2=1;
		System.out.print("Upto "+n+":");
		while(t1<=n) {
			int sum=t1+t2;
			System.out.print(t1+" ");
			
			t1=t2;
			t2=sum;
		}

	}

}
