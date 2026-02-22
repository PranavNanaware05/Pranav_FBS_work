package assignment_5;
class Employee
{
	int id;
	String name;
	double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee()
	{
		this.id=0;
		this.name="not given";
		this.salary=1000;
	}
	public Employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	 void display() {
		System.out.println("Employee ID    :"+this.id);
		System.out.println("Employee Name  :"+this.name);
		System.out.println("Employee Salary:"+this.salary);
		
	}
	
}//Employee class Ends here

class HR extends Employee
{
    
    
    double commission;

    // Default Constructor
    HR()
    {
        super();
        
        this.commission = 3000.0;

    }

    // Parameterized Constructor
    
    public HR(int id, String name, double salary, double commission) {
		
		super(id,name,salary);
		
		this.commission = commission;
	}
    
   
    void setCommission(double c)
    {
        this.commission=c;
    }

    double getCommission()
    {
        return this.commission;
    }

    void display()
    {
        super.display();
        System.out.println("Commission :" + this.commission);
        System.out.println();
        
    }

}//class HR ends here


class Admin extends Employee
{
    double result;
    double allowance;

    // Default Constructor
    Admin()
    {
        super();
        this.allowance = 5000.0;

   
    }

    // Parameterized Constructor
    Admin(int i, String n, double s, double a)
    {
    	super(i,n,s);
        this.id = i;
        this.name = n;
        this.salary = s;
        this.allowance = a;

        
    }

    
    void setAllowance(double a)
    {
        this.allowance=a;
    }

    double getAllowance()
    {
        return this.allowance;
    }
    
       void display()
    {
        
        super.display();
        System.out.println("Allowance :" + allowance);
        System.out.println();
    }

}//class Admin ends here


class SalesManager extends Employee
{
    
    double incentive;
    int target;

    // Default Constructor
    SalesManager()
    {
        super();
        this.incentive = 5000.0;
        this.target = 10;

        
    }

    // Parameterized Constructor
    SalesManager(int i, String n, double s, double in, int t)
    {
        super(i,n,s);
        this.incentive = in;
        this.target = t;

       
    }

    

    void setIncentive(double i)
    {
        this.incentive=i;
    }

    double getIncentive()
    {
        return this.incentive;
    }

    void setTarget(int t)
    {
        this.target=t;
    }

    int getTarget()
    {
        return this.target;
    }

    void display()
    {
       super.display();
        System.out.println("Incentive :" + this.incentive);
        System.out.println("Target    :" + this.target);
    }

}//class SalesManager ends here

public class Test_Employee {
	
	public static void main(String args[])
	{
		HR h1=new HR(101,"Pritesh",10000,2000);
		System.out.println("======HR=====");
		h1.display();
		
		Admin a1=new Admin(102,"Surykant",10000,2000);
		System.out.println("======Admin=====");
		a1.display();
		
		SalesManager s1=new SalesManager(301,"Shreya",10000,1000,50);
		System.out.println("======SalesManager=====");
		s1.display();
		
	}

}
