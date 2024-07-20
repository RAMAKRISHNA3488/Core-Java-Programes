package polymorphism;

public class PolymarphismDemo {
	
	 void add(int a,int b) {
		int Result=a+b;
		System.out.println("Result is: "+Result);
		
	 }
     
	 void add(double d, double e,double f) {
		double Result=d+e+f;
		System.out.println("Result is: "+Result);
	 }
	 void add(long o) {
		 System.out.println("Result is:"+o);
	 }
	public static void main(String[] args) {
      
		PolymarphismDemo obj=new PolymarphismDemo();
		obj.add(13, 90);
		obj.add(15.90,34.9, 45.87);
		obj.add(100);
	}

		
	}


