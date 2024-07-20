package TypeCasting;

public class TypeCastingExplicitDemo {

	public static void main(String[] args) {
		int a = 100;
		byte b = (byte) a; // this line is primitive explicit type.this is used to higher to lower
		System.out.println(b);
		byte r = 20;
		int s = (int) r; // this line is primitive implicit type.this is used to lower to higher
		System.out.println(s);
		int c = 97;
		char d = (char) c;
		System.out.println(d);
		char f = 'h';
		double g = (double) f;
		System.out.println(g);
		int z = 100;
		System.out.println(z);
		
	}
}