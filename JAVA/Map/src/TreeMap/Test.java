package TreeMap;

import java.util.TreeMap;

public class Test {
	public static void main(String args[])
	{
  TreeMap<MyKey, Employee> t1=new TreeMap<MyKey, Employee>();
  
  t1.put(new MyKey(3),new Employee("Dhiraj",15000));
  t1.put(new MyKey(2),new Employee("Pranav",35000));
  t1.put(new MyKey(1),new Employee("Pritish",25000));
  t1.put(new MyKey(4),new Employee("utkarsh",5000));
  
    System.out.println(t1);
    if(t1.containsKey(new MyKey(3)))
    {
    	System.out.println("Found...");
    }
    else
    {
    	System.out.println("Not Found...");
    }
	}
}
