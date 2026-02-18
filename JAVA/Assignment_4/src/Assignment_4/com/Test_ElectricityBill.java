package Assignment_4.com;

class ElectricityBill
{
	static double rate=10; //static variable
    String c_name;
    double no_of_units;
    double bill;
    
	public ElectricityBill(String c_name, double no_of_units) //Parameterized constructor
	{
		
		this.c_name = c_name;
		this.no_of_units = no_of_units;
	}
	
	 double calculate_Bill()
	{
		bill=no_of_units*rate;
		return bill;
	}
	
	void display()
	{
		System.out.println("Customer Name: " + this.c_name);
        System.out.println("Units Consumed: " + this.no_of_units);
        System.out.println("Rate Per Unit: " + ElectricityBill.rate);
        System.out.println("Total Bill: " + this.bill);
        System.out.println();
	}
}//class ElectricityBill ends here
public class Test_ElectricityBill {
	public static void main(String args[])
	{
		ElectricityBill e1=new ElectricityBill("Pranav", 10);	
		ElectricityBill e2=new ElectricityBill("rahul", 7);
		e1.calculate_Bill();
		e2.calculate_Bill();
		e1.display();
		e2.display();
	}

	
    
    
}
