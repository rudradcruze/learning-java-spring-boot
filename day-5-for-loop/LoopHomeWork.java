package ac.dia.loop;

public class LoopHomeWork {

	public static void main(String[] args) {
		
		// For fibonacci series
		System.out.println("======= Fibonacci Series =======");
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b);
		
		for(int c = a + b; c<= 100; ) {
			System.out.print(" " + c);
			a = b;
			b = c;			
			c = a + b;
		}
		
		// Pattern
		System.out.println("\n\n======= Pattern 1 =======");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		

		System.out.println("\n======= Pattern 2 =======");
		for(int i=5; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print(1 + " ");
			}
			System.out.println();
		}
		
		/*
		    1
		   212
		  32123
		 4321234
		543212345
	     4321234
	      32123
	       212
	        1
		
		*/
		System.out.println("\n======= Pattern 3 =======");
		int counter = 9;
		
		for(int i=1; i<=counter; i++) {
			for(int j=counter-i; j>=1; j--)
				System.out.print(" ");
			
			for(int k=i; k>=1; k--)
				System.out.print(k);
			
			for(int m = 2; m<=i; m++)
				System.out.print(m);
			
			System.out.println();
		}
		
		for(int i=1; i<=counter; i++) {
			for(int j=0; j<i; j++)
				System.out.print(" ");
			
			for(int k=counter-i; k>=1; k--)
				System.out.print(k);
			
			for(int m = 2; m<=counter-i; m++)
				System.out.print(m);
			 
			System.out.println();
		}

	}

}
