package accessmodifier;

public class A {
	private int a=30;
	        int b=40;
	protected int c=50;
	public int d=60;
	 public static void main(String[] args) {
		 A aobject=new A();
		 System.out.println(aobject.b);
		 System.out.println(aobject.c);
		 System.out.println(aobject.d);
	}

}
