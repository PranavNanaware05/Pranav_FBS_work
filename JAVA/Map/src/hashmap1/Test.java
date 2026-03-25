package hashmap1;

import java.util.HashMap;

import TreeMap.Employee;
import TreeMap.MyKey;

public class Test {
	public static void main(String args[])
	{
		HashMap<MyKey,Employee> m1=new HashMap<MyKey, Employee>();
		m1.put(new MyKey(3),new Employee("Dhiraj",15000));
		  m1.put(new MyKey(2),new Employee("Pranav",35000));
		  m1.put(new MyKey(1),new Employee("Pritish",25000));
		  m1.put(new MyKey(4),new Employee("utkarsh",5000));
		  
		
	}

}
