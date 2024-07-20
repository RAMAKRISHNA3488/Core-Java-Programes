package SuperKeyWord;

public class Dog extends Animal {

	private Animal animal;

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Dog() {
		super();
		System.out.println("This is Dog..! ");
	}

	@Override
	public void AnimalMethod() {
		System.out.println("This is Animal Method in Dod Class..!");
	}

	{
		super.AnimalMethod();
		System.out.println("Default method");

	}

}
