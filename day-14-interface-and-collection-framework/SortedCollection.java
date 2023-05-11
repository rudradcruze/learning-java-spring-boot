package ac.dia.cf;

import java.util.ArrayList;
import java.util.TreeSet;

public class SortedCollection {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(50);
		list.add(45);
		list.add(5);
		list.add(55);
		list.add(65);
		list.add(40);
		
		System.out.println(list);
		
		TreeSet set = new TreeSet(list);
		System.out.println(set);
		
//		TreeSet<Exam> set2 = new TreeSet<Exam>(new TwoComparator());
		TreeSet<Exam> set2 = new TreeSet<Exam>(new ThreeComparator());
		
		set2.add(new Exam(15, "Rudra", 30));
		set2.add(new Exam(14, "Rudra", 30));
		set2.add(new Exam(10, "Megdelina", 54));
		set2.add(new Exam(9, "Sobuj", 37));
		set2.add(new Exam(7, "Fahad", 84));
		set2.add(new Exam(7, "Fahad", 63));
		
		
		System.out.println(set2);
	}
}
