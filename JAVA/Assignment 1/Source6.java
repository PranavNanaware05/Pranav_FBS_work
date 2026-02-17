class SalesManager
{
    int id;
    String name;
    double salary;
    double incentive;
    int target;
}//class SalesManager ends here


class Test_SalesManager
{
    public static void main(String args[])
    {
        SalesManager s1 = new SalesManager();//reference

        System.out.println("HashCode  :" + s1);
        System.out.println("ID        :" + s1.id);
        System.out.println("Name      :" + s1.name);
        System.out.println("Salary    :" + s1.salary);
        System.out.println("Incentive :" + s1.incentive);
        System.out.println("Target    :" + s1.target);

        s1.id = 301;
        s1.name = "Pranav Nanaware";
        s1.salary = 70000.00;
        s1.incentive = 12000.00;
        s1.target = 50;

        System.out.println("======== After Assigning values ========");
        System.out.println("ID        :" + s1.id);
        System.out.println("Name      :" + s1.name);
        System.out.println("Salary    :" + s1.salary);
        System.out.println("Incentive :" + s1.incentive);
        System.out.println("Target    :" + s1.target);
    }
}
