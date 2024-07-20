package SuperKeyWord;

public class Demo2 extends Demo1{
	String color="Yellow";
	
	public Demo2() {
		super();
		System.out.println(color);
	}
	
	@Override
	public void colorMethod() {
		super.colorMethod();
		System.out.println("This is the color Method in sub child class....");
	}

}
