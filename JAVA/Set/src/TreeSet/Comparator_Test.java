package TreeSet;

import java.util.ArrayList;
import java.util.Collections;



class Student1
{
	int roll;
	String name;
	int marks;
	public Student1(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "\nroll=" + roll + "\nname=" + name + "\nmarks=" + marks;
	}
	
}
public class Comparator_Test {
 public static void main(String args[])
 {
	 ArrayList<Student1> h1=new ArrayList<Student1>();
	 myMarksComparator mmc=new myMarksComparator();
	 
	 
	   h1.add(new Student1(10,"Sachin",100));
		h1.add(new Student1(18,"virat",85));
		h1.add(new Student1(7,"Dhoni",16));
		
		Collections.sort(h1, mmc);
		System.out.println(h1);
 }
}
