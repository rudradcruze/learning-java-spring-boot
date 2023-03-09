package ac.dia.condition;

import java.util.Scanner;

public class SwitchCaseWork {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String choice = "";
		double number1 = 0;
		double number2 = 0;
		
		do {
			
			System.out.println("\n===== Menu =====");
			System.out.println("  A  Input");
			System.out.println("  +  Addition");
			System.out.println("  -  Substraction");
			System.out.println("  /  Divition");
			System.out.println("  %  Modulas");
			System.out.print("  Enter your choice: ");
			
			choice = scan.next();
			
			switch (choice) {
				case "A": {
					System.out.print("\nEnter number 1: ");
					number1 = scan.nextDouble();
					System.out.print("Enter number 2: ");
					number2 = scan.nextDouble();
					break;
				}
				
				case "+":
					System.out.println(" Answer is: " + number1 + " + " + number2 + " =  " + (number1+number2));
					break;
					
				case "*":
					System.out.println(" Answer is: " + number1 + " * " + number2 + " =  " + (number1*number2));
					break;

				case "-":
					System.out.println(" Answer is: " + number1 + " - " + number2 + " =  " + (number1-number2));
					break;
					
				case "/":
					System.out.println(" Answer is: " + number1 + " / " + number2 + " =  " +( number1/number2));
					break;
				
				case "%":
					System.out.println(" Answer is: " + number1 + " % " + number2 + " =  " + (number1%number2));
					
				default:
					break;
			}
			
			// To break form the loop.
			System.out.print("\npress y for next operation: ");
			choice = scan.next();
			
		}while(choice.equals("y") || choice.equals("Y"));
	}

}
