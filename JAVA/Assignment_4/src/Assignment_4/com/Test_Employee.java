package Assignment_4.com;
class Employee
{
	String e_name;
	double basic_salary;
	double total_salary;
	static double bonus_rate=5;
	 Employee(String e_name, double basic_salary) {
		super();
		this.e_name = e_name;
		this.basic_salary = basic_salary;
	}
	 static double getBonus_rate() {
		return bonus_rate;
	}
	 static void setBonus_rate(double bonus_rate) {
		Employee.bonus_rate = bonus_rate;
	}
	
	double calculate_Salary()
	{
		total_salary=basic_salary+(basic_salary*bonus_rate/100);
		return total_salary;
	}
	void display()
	{
		System.out.println("Employee Name:"+this.e_name);
		System.out.println("Basic Salary :"+this.basic_salary);
		System.out.println("Bonus Rate   :"+Employee.bonus_rate+"%");
		System.out.println("Total salary :"+this.total_salary);
		System.out.println();
	}
}
public class Test_Employee {

	public static void main(String[] args) {
		Employee e1=new Employee("pranav", 10000);
		Employee e2=new Employee("rahul", 20000);
		e1.calculate_Salary();
		e2.calculate_Salary();
		e1.display();
		e2.display();
		
		
		System.out.println("after updateing bonus rate");
		Employee.setBonus_rate(10);

		 
		e1.calculate_Salary();
		e2.calculate_Salary();
		e1.display();
		e2.display();
	}

}
