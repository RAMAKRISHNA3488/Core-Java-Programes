package Abstraction;

public  class Dell implements TouchScreenLaptop {
     
	
	@Override
	 public void Scroll() {
     System.out.println("Scroll Screan Dell");
	}

	@Override
	 public void Click() {
     System.out.println("Click on the Dell");
	}
}
