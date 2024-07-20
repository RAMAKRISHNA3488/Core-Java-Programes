package SuperKeyWord;

public class Demo1 extends Demo {
	String demo = "Blue.....";

	Demo1() {
		// super();
		System.out.println(demo);
	}

	@Override
	public void colorMethod() {
		//super.colorMethod();
		System.out.println("This is the color Method in child..");
	}

}
