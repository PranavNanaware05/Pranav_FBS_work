class Car
{
    int carId;
    String carName;
    double price;
}//class car ends here


class Test_Car
{
    public static void main(String args[])
    {
        Car c1 = new Car();//reference

        System.out.println("HashCode :" + c1);
        System.out.println("Car ID   :" + c1.carId);
        System.out.println("Car Name :" + c1.carName);
        System.out.println("Price    :" + c1.price);

        c1.carId = 501;
        c1.carName = "Hyundai Creta";
        c1.price = 1500000.00;

        System.out.println("======== After Assigning values ========");
        System.out.println("Car ID   :" + c1.carId);
        System.out.println("Car Name :" + c1.carName);
        System.out.println("Price    :" + c1.price);
    }
}
