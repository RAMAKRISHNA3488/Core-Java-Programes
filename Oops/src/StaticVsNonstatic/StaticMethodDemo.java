package StaticVsNonstatic;

public class StaticMethodDemo {

	public static void main(String[] args) {
     System.out.println("My Famliy");
     StaticMethodDemo.method1();
	}
	  	static void method1() {
	  System.out.println("Frist person in my family is k.shankar");
	  StaticMethodDemo.method2();
	    }
		static void method2() {
	  	  System.out.println(" Second person in my family is k.parvathamma");
	  	StaticMethodDemo.method3();
	    }
		static void method3() {
		  	  System.out.println(" third person in my family is k.ramakrishna");
		  	StaticMethodDemo.method4(); 
		}
		static void method4() {
		  		  System.out.println(" fourth person in my family is k.balaji");
		  	}
		}


