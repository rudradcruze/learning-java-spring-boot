package ac.dia.oop;

public class Cawa extends Bird {
	
	public Cawa() {
		super("Cawa", "Pink");
	}

	public Cawa(String species, String color) {
		super(species, color);
	}

	@Override
	public void makeSound() {
		System.out.println("I can ka ka ka ka");
	}
	
	
}
