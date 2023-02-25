public class TestOperator {

	public static void main(String[] args) {
		
		// cannot possible
		/*
		byte a;
		short b = 10;
		byte c = 127; 
		a = b + c
		*/
		
		// Possible case
		/*
		int a;
		short b = 10;
		byte c = 127; 
		a = b + c;
		*/
		

		// Possible case
		/*
		long a;
		short b = 10;
		long c = 127; 
		a = b + c;
		*/

		// cannot possible
		/*
		long a;
		short b = 10;
		float c = 127; 
		a = b + c;
		*/

		// Possible case
		double a;
		short b = 10;
		float c = 127; 
		a = b + c;
		
	}

}
