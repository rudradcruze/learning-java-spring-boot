package ac.dia.oop;

public class Penguine extends Bird {

	public Penguine() {
		super("Penguine", "Black & Yellow");
	}

	public Penguine(String species, String color) {
		super(species, color);
	}
	
	@Override
	public void makeSound() {
		System.out.println("I can peg peg");
	}
	
}
