package SuperKeyWord;

import accessmodifier.A;

public class Goat extends Dog {
	public Goat() {
		System.out.println("This is Goat..!");
	}

	public void AnimalMethod() {
		super.AnimalMethod();
		System.out.println("This is Animal method in Goat Class.!");
		
	}
}
