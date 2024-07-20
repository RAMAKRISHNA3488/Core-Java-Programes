package inheritance;

public class SingleInheritance {
    void m1() {
    	System.out.println("In side m1");
    }
	public static void main(String[] args) {
		SingleInheritance s=new SingleInheritance();
		s.m1();
		s.getClass();
		s.hashCode();
		System.out.println(s.hashCode());
		System.out.println(s.getClass());
	}

}
