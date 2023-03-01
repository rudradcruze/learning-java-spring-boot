package ac.dia.condition;
// It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+.  
public class ElseIfStatement {

	public static void main(String[] args) {
		
		int marks = 50;
		
		if(marks >= 90 && marks <=100)
			System.out.println("A+ Grade");
		else if(marks >= 80)
			System.out.println("A Grade");
		else if(marks >= 70)
			System.out.println("B Grade");
		else if(marks >= 60)
			System.out.println("C Grade");
		else if(marks >= 50)
			System.out.println("D Grade");
		else if(marks >= 0)
			System.out.println("Fail Grade");
		else
			System.out.println("Invalid");
		
	}

}
