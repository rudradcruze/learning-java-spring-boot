package ac.dia.cf;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
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
