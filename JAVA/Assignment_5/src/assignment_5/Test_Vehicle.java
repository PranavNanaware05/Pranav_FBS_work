package assignment_5;

class Vehicle
{
	String vehicleNumber;
	String model;
	String companyName;
	int noOfWheels;
	double price;
	
	public Vehicle() {
		
		this.vehicleNumber = "mh 11 cf 5762";
		this.model = "v4";
		this.companyName = "Hero";
		this.noOfWheels = 4;
		this.price = 150000;
	}
	public Vehicle(String vehicleNumber, String model, String companyName, int noOfWheels, double price) {


		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.companyName = companyName;
		this.noOfWheels = noOfWheels;
		this.price = price;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	void Display()
	{
		System.out.println("Vehicle No  :"+this.vehicleNumber);
		System.out.println("Model Name  :"+this.model);
		System.out.println("Company Name:"+this.companyName);
		System.out.println("No of Wheels:"+this.noOfWheels);
		System.out.println("Price       :"+this.price);
	}
}

class Bike extends Vehicle
{
	int noOfStands;
	int noOfHelmets;
	String bikeCategory;
	public Bike() {
    super();

	}
	public Bike(String vehicleNumber, String model, String companyName,
            int noOfWheels, double price,
            int noOfStands, int noOfHelmets, String bikeCategory)
	{
		super(vehicleNumber,model,companyName,noOfWheels,price);
		this.noOfStands = noOfStands;
		this.noOfHelmets = noOfHelmets;
		this.bikeCategory = bikeCategory;
	}
	
    void Display()
    {
    	super.Display();
    	System.out.println("No of Stands :"+this.noOfStands);
    	System.out.println("No of Helmets:"+this.noOfHelmets);
    	System.out.println("Bike Category:"+this.bikeCategory);
    }
}

class Car extends Vehicle
{
	String hasPowerSteering;
	String driveMode;
	int parkingAssistSensors;
	public Car() {
		super();
		this.hasPowerSteering="not given";
		this.driveMode="no define";
		this.parkingAssistSensors=3;
	}
	public Car(String vehicleNumber, String model, String companyName, int noOfWheels, double price, String hasPowerSteering, String driveMode, int parkingAssistSensors) {
		super(vehicleNumber, model, companyName, noOfWheels, price);
		this.hasPowerSteering=hasPowerSteering;
		this.driveMode=driveMode;
		this.parkingAssistSensors=parkingAssistSensors;
	}
	void display()
	{
		super.Display();
		System.out.println("hasPowerSteering:"+this.hasPowerSteering);
		System.out.println("driveMode:"+this.driveMode);
		System.out.println("parkingAssistSensors:"+this.parkingAssistSensors);
		
	}
	
}

class Bus extends Vehicle
{
	int passengerCapacity;
	int standingCapacity;
	public Bus() {
		super();
		this.passengerCapacity=00;
		this.standingCapacity=00;
	}
	public Bus(String vehicleNumber, String model, String companyName, int noOfWheels, double price, int passengerCapacity, int standingCapacity) {
		super(vehicleNumber, model, companyName, noOfWheels, price);
		this.passengerCapacity=passengerCapacity;
		this.standingCapacity=standingCapacity;
	}
	void display()
	{
		super.Display();
		System.out.println("passengerCapacity:"+this.passengerCapacity);
		System.out.println("standingCapacity:"+this.standingCapacity);
	}
	
}
public class Test_Vehicle {

    public static void main(String[] args) {

        
        // ---------- Bike ----------
        System.out.println("\n----- Bike -----");
        Bike b1 = new Bike("MH12 AB 1234", "Apache", "TVS", 2, 120000,
                1, 2, "Sports");
        b1.Display();

        // ---------- Car ----------
        System.out.println("\n----- Car -----");
        Car c1 = new Car("MH14 XY 4567", "Creta", "Hyundai", 4, 1500000,
                "Yes", "Sport", 6);
        c1.display();

        // ---------- Bus ----------
        System.out.println("\n----- Bus -----");
        Bus bus1 = new Bus("MH20 ZZ 9999", "Volvo", "Volvo", 6, 5000000,
                50, 20);
        bus1.display();
    }
}