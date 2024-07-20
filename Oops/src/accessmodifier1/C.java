package accessmodifier1;

import accessmodifier.A;

public class C extends A {

	public static void main(String[] args) {
        A aobject =new A();
        System.out.println(aobject.d);
        
        C cobject=new C();
        System.out.println(cobject.c);
        System.out.println(cobject.d);
	}

}
