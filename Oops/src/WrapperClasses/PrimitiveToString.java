package WrapperClasses;

public class PrimitiveToString {

	public static void main(String[] args) {
		int a = 100;
		String b = Integer.toString(a);// Or string b= String.valueof(a);this line is primitive to String
		int c = Integer.valueOf(b);// Or int c=Integer.parse Integer(b);this line is String to primitive
		System.out.println(c);
		System.out.println(a);
		int number = 42;
		String text = "Hello, Java!";

		// Getting data type using reflection
//		Class<?> numberType = number.
		Class<?> textType = text.getClass();

//		System.out.println("Data type of 'number': " + numberType.getName());
		System.out.println("Data type of 'text': " + textType.getName());
		System.out.println("Data type of 'text': " + textType.getSimpleName());
		System.out.println(textType);
		
		
		
	}
}
