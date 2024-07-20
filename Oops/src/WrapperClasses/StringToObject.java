package WrapperClasses;

public class StringToObject {

	public static void main(String[] args) {
		int a = 20;
		String d = "20000";
		String i = "my name is ram";
		// int h=Integer.parseInt(i);
		int b = Integer.valueOf(a);// after the line is come to String g=b.to String();
		System.out.println(b);
		// System.out.println(h);
		System.out.println(d);

		int x = 100;
		String y = Integer.toString(x);
		System.out.println("Primitive to String: " + y);
		Integer i1 = new Integer(y);
		System.out.println("String to Object: " + i1);
		int z = i1.intValue();
		System.out.println("Object to primitive: " + z);
		Integer c = new Integer(z);
		System.out.println("primitive to Object:" + c);
		String d1 = c.toString();
		System.out.println("Object to String: " + d1);
		int e = Integer.parseInt(d1);
		System.out.println("String to primitive: " + e);

	}
}
