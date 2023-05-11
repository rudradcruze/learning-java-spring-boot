package ac.dia.cf;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	
	public static void main(String[] args) {
		Set list = new HashSet();
		System.out.println("Size " + list.size());
		
		list.add("Dipon");
		list.add("Anamul");
		list.add("123");
		list.add("34.23");
		list.add("123");
		list.add(new Exam(1, "Rudra", 200));
		
		System.out.println(list);
		System.out.println("Size " + list.size());
	}
	
}
