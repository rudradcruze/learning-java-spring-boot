package ac.dia.cf;

import java.util.Comparator;

public class TwoComparator implements Comparator<Exam> {

	@Override
	public int compare(Exam o1, Exam o2) {
		if(o1.getMarks() == o2.getMarks())
			return o2.getName().compareTo(o1.getName());
		return o1.getMarks()-o2.getMarks();
	}

}
