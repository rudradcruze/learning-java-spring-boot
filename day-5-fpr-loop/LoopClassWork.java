package ac.dia.loop;

public class LoopClassWork {

	public static void main(String[] args) {
		/*
		 * Sum series
		 * i =>				1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
		 * Output Series: 	1   3   6   10  15  21  28  36  45  55  
		 */
		int sum = 0;
		for(int i=0; i<=10; i++) {
			sum += i;
			System.out.print(sum + " ");
		}

	}
}