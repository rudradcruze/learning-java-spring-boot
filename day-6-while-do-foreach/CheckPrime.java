package ac.dia.loop;

public class CheckPrime {

	public static void main(String[] args) {
		
		// Static approach
		/*
			int n = 121;
			int i = 2;
			for(; i<n; i++) {
				if(n%i==0)
					break;
			}
			if(i==n)
				System.out.println(n + " is a prime number");
			else 
				System.out.println(n + " is not a prime number");
		*/
		
		// Looping approach
		int n = 211;
		for(n=2; n<=100; n++) {
			int j = 2;
			for(; j<n; j++) {
				if(n%j == 0)
					break;
			}
			if(j==n)
				System.out.println(n + " is prime.");
			else
				System.out.println(n + " is not prime.");
		}
	}

}
