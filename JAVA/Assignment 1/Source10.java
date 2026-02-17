class Mobile
{
    String brand;
    String model;
    double price;
}//class mobile ends here

class Test_Mobile
{
    public static void main(String args[])
    {
        Mobile m1 = new Mobile();//reference

        System.out.println("HashCode :" + m1);
        System.out.println("Brand    :" + m1.brand);
        System.out.println("Model    :" + m1.model);
        System.out.println("Price    :" + m1.price);

        m1.brand = "Vivo";
        m1.model = "Y73";
        m1.price = 20000.00;

        System.out.println("======== After Assigning values ========");
        System.out.println("Brand    :" + m1.brand);
        System.out.println("Model    :" + m1.model);
        System.out.println("Price    :" + m1.price);
    }
}
