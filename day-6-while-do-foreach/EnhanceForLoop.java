package ac.dia.loop;

public class EnhanceForLoop {

	public static void main(String[] args) {
		

		int data[] = {20,30,34,24,99,354};
		
//		Regular for loop
		System.out.println("This is regular for loop");
		for(int i=0;i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
//		Enhance for loop (collection for)
		System.out.println("\n\nThis is for each loop (collection for)");
		for(int i : data) {
			System.out.print(i + " ");
		}

	}

}
