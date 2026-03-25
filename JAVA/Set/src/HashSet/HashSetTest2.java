package HashSet;

import java.util.HashSet;



class Student
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
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		
		Student s=(Student)obj;
		if(this.id==s.id)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
}
public class HashSetTest2 {

	public static void main(String[] args) {
		HashSet<Student> h1=new HashSet<Student>();

		h1.add(new Student(10,"Sachin",100));
		h1.add(new Student(18,"virat",85));
		h1.add(new Student(7,"Dhoni",16));
		System.out.println(h1);
		if(h1.contains(new Student(18,"virat",85)))
		{
			System.out.println("found");
		}
		else
		{
			System.out.print("not Found");
		}
		
	}

}
