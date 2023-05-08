package ac.dia.oop;

public abstract class Bird {
	
	private String species;
	private int wings = 2;
	private String color;
	
	public Bird() {
		super();
	}

	public Bird(String species, String color) {
		super();
		this.species = species;
		this.wings = 2;
		this.color = color;
	}

	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public int getWings() {
		return wings;
	}
	
	public void setWings(int wings) {
		this.wings = wings;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void show() {
		System.out.println("====== Bird Details ======");
		System.out.println("Bird Species: " + getSpecies());
		System.out.println("Bird Wings: " + getWings());
		System.out.println("Bird Color: " + getColor());
	}
	
	public void makeSound() {
		System.out.println("I can make sound");
	}
	
}
