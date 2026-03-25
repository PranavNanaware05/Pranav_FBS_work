package TreeSet;

import java.util.Comparator;

public class myMarksComparator implements Comparator<Student1> 
{

	@Override
	public int compare(Student1 s1, Student1 s2) {
		
		return s1.marks-s2.marks;
	}

}
