package Simpleprogram;


public final class Immutable {

	private final int id;
	private String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Immutable(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public static void main(String[] args) {

		int id = 10;
		String name = "original";

		Immutable im = new Immutable(id, name);
		System.out.println(im.getId());
		System.out.println(im.getName());

		id = 20;
		name = "dublicate";

		System.out.println(im.getId());
		System.out.println(im.getName());

	}

}
