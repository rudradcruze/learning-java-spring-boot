package ac.dia.cf;

import java.util.Comparator;

public class NameComprator implements Comparator<Exam> {

	@Override
	public int compare(Exam o1, Exam o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
