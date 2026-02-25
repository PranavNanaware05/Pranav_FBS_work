package Assignment_6;

class Employee
{
	int id;
	String name;
	double salary;
	public int getId() {
		return id;
	}
	 void setId(int id) {
		this.id = id;
	}
    String getName() {
		return name;
	}
	 void setName(String name) {
		this.name = name;
	}
	 double getSalary() {
		return salary;
	}
	 void setSalary(double salary) {
		this.salary = salary;
	}
	
	 Employee()
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
	double calSal()
	{
		return salary;
	}
	
	 @Override
	public String toString() {
		return "id=" + id + "\nname=" + name + "\nsalary=" + salary ;
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
    
    HR(int id, String name, double salary, double commission) {
		
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

    double calSal()
	{
		return salary+commission;
	}

	@Override
	public String toString() {
		return super.toString()+"commission=" + commission ;
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
    
    double calSal()
	{
		return salary+allowance;
	}

	@Override
	public String toString() {
		return super.toString()+"\nresult=" + result + ", \nallowance=" + allowance ;
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
    double calSal()
	{
		return salary+incentive;
	}

	@Override
	public String toString() {
		return super.toString()+"\nincentive=" + incentive + "\n target=" + target ;
	}

    

}//class SalesManager ends here

 class Test_Employee {
	
	public static void main(String args[])
	{
		
		Employee e1=new Employee(101,"Pritesh",10000);
		System.out.println("======Employee=====");
		System.out.println(e1);
		
		e1=new HR(101,"Sachin",10000,2000);
		System.out.println("======HR=====");
		System.out.println(e1);
		System.out.println("Total Salary:"+e1.calSal());
		
		e1=new Admin(102,"Surykant",10000,2000);
		System.out.println("======Admin=====");
		System.out.println(e1);
		System.out.println("Total Salary:"+e1.calSal());
		e1=new SalesManager(301,"Shreya",10000,1000,50);
		System.out.println("======SalesManager=====");
		System.out.println(e1);
		System.out.println("Total Salary:"+e1.calSal());
	}

}
