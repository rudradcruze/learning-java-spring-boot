package ac.dia.loop;

public class ForLoop {
	
	static int i = 1; // default value
	
	static void ini() {
		// i = 1;	// for odd
		i = 2;	// for even
		System.out.println("INI loop " + i);
	}
	
	static boolean check() {
		System.out.println("loop condition " + (i<=10));
		return i <= 10;
	}
	
	static void control() {
//		i++;	// increment by only 1
		i+=2;	// to print odd numbers without condition
		System.out.println("control loop " + i);
	}

	public static void main(String[] args) {
		System.out.println("............Loop............");
		
		for(ini(); check(); control()) {
			System.out.println("loop body " + i);
		}
		
		/* Infinity Loop
		for (;;) {
			System.out.println("Hello ");
			
		}
		*/
		
		/*
		int i = 1;
		for (; ; ) {
			System.out.println("test " + i++);
		}
		*/
		
		/*
		for(initialize; condition; increment/decrement) {
			loop body
		}
		*/
		
		/*
		int i = 1;
		for(;i<10;) {
			System.out.println("print " + i);
		}
		*/

	}

}
