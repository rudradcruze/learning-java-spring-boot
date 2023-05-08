package ac.dia.oop;

public class Main {
	public static void main(String[] args) {
		
		// Bird bird = new Bird();
		
		//bird.show();
		//bird.makeSound();
		
		//Bird bird1 = new Bird("Chil", "Brown");
		
		//bird1.show();
		//bird.makeSound();
		
		Cawa bird2 = new Cawa();
	
		bird2.show();
		bird2.makeSound();
	

		Bird b = new Cawa();
		b.show();
		b.makeSound();
		
		Penguine p = new Penguine();
		b = p;	// Pole Form (Polymorphisum)
		b.show();
		b.makeSound();
		
	}
}
