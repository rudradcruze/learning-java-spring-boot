package ac.dia.condition;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
	 	int a=10;
	    int b=2;
		int c=0;
		char op='+';
		String ch;
		
		Scanner keyboard=new Scanner(System.in);
		ch=keyboard.next();
		
		switch(ch){
			case "+":
			   c=a+b;
			   System.out.println(a+" + "+b+"="+c);
			   break;
			case "-":
			   c=a-b;
			   System.out.println(a+" - "+b+"="+c);
			   break;
			case "*":
			   c=a+b;
			   System.out.println(a+" * "+b+"="+c);
			   break;
			case "/":
			   c=a+b;
			   System.out.println(a+" / "+b+"="+c);
			   break;
			default:
			   System.out.println(" ch has wrong value ");			
		}
	}
}
