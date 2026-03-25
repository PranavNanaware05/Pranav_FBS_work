package TreeSet;

import java.util.TreeSet;

class Student implements Comparable<Student>
{
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "\nid=" + id + "\nname=" + name + "\nmarks=" + marks;
	}
	@Override
	public int compareTo(Student s1) {
		
		return this.id-s1.id;
	}
	
}
public class TreeSet_test2 {

	public static void main(String[] args) {
		TreeSet<Student> t1=new TreeSet<Student>();
		t1.add(new Student(10,"Sachin",100));
		t1.add(new Student(18,"virat",85));
		t1.add(new Student(7,"Dhoni",16));
        System.out.println(t1);
  
	}

}
