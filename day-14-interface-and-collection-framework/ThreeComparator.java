package ac.dia.cf;

import java.util.Comparator;

public class ThreeComparator implements Comparator<Exam> {

	@Override
	public int compare(Exam o1, Exam o2) {
		int compare = 0;
        compare = (int)(o1.getMarks()-o2.getMarks());

        if(compare == 0) {
            compare = o1.getName().compareTo(o2.getName());
            if (compare == 0)
                compare = o1.getId()-o2.getId();
        }
        return compare;
	}
}
