package testlambda;

public class LamdaExpressionExampleWithOut {

	public static void main(String[] args) {
		
		int width = 20;
		
		Drawable d1 = new Drawable() {
			
			@Override
			public void draw() {
				System.out.println("Draw from default " + width);
				
			}
		};
		
		d1.draw();
		
		// using lambda
		Drawable d2=() -> {
			System.out.println("Draw from lambda " + width);
		};
		
		d2.draw();

	}

}
