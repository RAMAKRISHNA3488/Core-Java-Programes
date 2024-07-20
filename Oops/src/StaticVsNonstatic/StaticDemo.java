package StaticVsNonstatic;

public class StaticDemo {
	static {
  	  System.out.println("Static block 2");
    }
	static {
  	  System.out.println("Static block 3");
    }
	public static void main(String[] args) {
     System.out.println("hello World");
    	 
	}
      static {
    	  System.out.println("Static block 1");
      }
}
