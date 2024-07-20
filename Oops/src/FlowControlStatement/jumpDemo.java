package FlowControlStatement;

public class jumpDemo {
	public static void main(String[] args) {
		loop1:for(int i=0;i<=100;i++) {
			System.out.println(" ");
			if(i>=10)
				break;
		
		for(int j=0;j<=100;j++) {
			System.out.print("(*)");
			if(j==i)continue loop1;
		}
	}

}
}