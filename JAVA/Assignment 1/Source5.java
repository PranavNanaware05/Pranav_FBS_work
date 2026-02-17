class HR
{
    int id;
    String name;
    double salary;
    double commission;
}//class HR ends here


class Test_HR
{
    public static void main(String args[])
    {
        HR h1 = new HR();//reference

        System.out.println("HashCode   :" + h1);
        System.out.println("ID         :" + h1.id);
        System.out.println("Name       :" + h1.name);
        System.out.println("Salary     :" + h1.salary);
        System.out.println("Commission :" + h1.commission);

        h1.id = 201;
        h1.name = "Pranav Nanaware";
        h1.salary = 60000.00;
        h1.commission = 8000.00;

        System.out.println("======== After Assigning values ========");
        System.out.println("ID         :" + h1.id);
        System.out.println("Name       :" + h1.name);
        System.out.println("Salary     :" + h1.salary);
        System.out.println("Commission :" + h1.commission);
    }
}
