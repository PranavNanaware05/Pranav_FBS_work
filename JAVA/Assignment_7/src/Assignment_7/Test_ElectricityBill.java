package Assignment_7;

import java.util.Scanner;

abstract class ElectricityBill
{ 
	String customerName;
	int units;
	
	public ElectricityBill(String customerName, int units) {
		this.customerName=customerName;
		this.units=units;
	}
	void showUsage() {
		System.out.println("Name of Customer:"+this.customerName);
		System.out.println("no of Units     :"+this.units);
	}
	abstract double calculateBill();
	
	final void generateBill()
	{
		showUsage();

        double bill = calculateBill();

        double tax = bill * 0.05;   // 5% tax
        double fixedCharge = 50;

        double finalBill = bill + tax + fixedCharge;

        System.out.println("Tax (5%)      : ₹" + tax);
        System.out.println("Fixed Charge  : ₹" + fixedCharge);
        System.out.println("Final Bill    : ₹" + finalBill);
	}
}

class ResidentialBill extends ElectricityBill
{
	
	
	public ResidentialBill(String customerName,int units) {
		super(customerName,units);
		
	}

	double calculateBill()
	{
		double amount;
		 if (units <= 100) {
	            amount = units * 2.5;
	        }
	        else if (units <= 300) {
	            amount = units * 3.5;
	        }
	        else {
	            amount = units * 5;
	        }

	        if (units > 500) {
	            amount += 150;   
	        }

	        System.out.println("Residential Charges: ₹" + amount);
	        return amount;
	}
}

class CommercialBill extends ElectricityBill
{
	public CommercialBill(String customerName, int units) {
		super(customerName, units);
	}

	double calculateBill() {
        double unitCharges = units * 6.5;

        // Minimum bill condition
        if (units < 200 && unitCharges < 1500) {
            unitCharges = 1500;
        }

        // Energy surcharge (only on unit charges)
        if (units > 1000) {
            double surcharge = unitCharges * 0.08;
            unitCharges += surcharge;
            System.out.println("Energy Surcharge (8%): ₹" + surcharge);
        }

        System.out.println("Commercial Charges: ₹" + unitCharges);
        return unitCharges;
		
	}
}
public class Test_ElectricityBill {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ElectricityBill bill = null;//reference of base class
		 System.out.println("Select Customer Type:");
	        System.out.println("1. Residential");
	        System.out.println("2. Commercial");
	        System.out.print("Enter choice: ");
	        int choice = sc.nextInt();
	        
	        System.out.print("Enter Customer Name: ");
	        String name = sc.next();

	        System.out.print("Enter Units Consumed: ");
	        int units = sc.nextInt();
	        sc.nextLine();
	        if(choice==1)
	        {
	        	 bill = new ResidentialBill(name,  units);
	        }
	        else if(choice==2)
	        {
	        	bill=new CommercialBill(name,units);
	        }
	        else
	        {
	        	System.out.println("Enter Correct Choice");
	        }
	        bill.generateBill();
	}

}
