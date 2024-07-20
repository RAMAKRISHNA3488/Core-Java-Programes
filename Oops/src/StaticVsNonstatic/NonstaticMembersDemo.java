package StaticVsNonstatic;

public class NonstaticMembersDemo  {
	int num;//this line is variables//
		 
			NonstaticMembersDemo(){ //this line is constructor while to write and like
			System.out.println("In size the constructor");
		}

	{
     System.out.println("In size the non static block");//this line is non-static block.this line will be execution of after the main the method
	}
	public static void main(String[] args) {
		System.out.println("In size the main");//this line is main method//
		new NonstaticMembersDemo();//creation of object//

	}

}
