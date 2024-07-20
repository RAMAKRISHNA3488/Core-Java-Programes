package WrapperClasses;

public class PrimitiveToObjectDemo {
	public static void main(String[] args) {
		int a=100;byte b=50;
	     Integer y=Integer.valueOf(a);//this line is wrapper class.it's converts to primitive to object.this is called boxing
         int x=y.intValue();//this line is wrapper class.it's converts to object to primitive.this is called unboxing
         System.out.println(x);
         Byte c = Byte.valueOf(b);
         byte d=c.byteValue();
         System.out.println(d);
	}
}
