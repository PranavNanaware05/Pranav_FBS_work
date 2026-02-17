class Admin
{
    int id;
    String name;
    double salary;
    double allowance;
}//class Admin ends here


class Test_Admin
{
    public static void main(String args[])
    {
        Admin a1 = new Admin();//reference

        System.out.println("HashCode  :" + a1);
        System.out.println("ID        :" + a1.id);
        System.out.println("Name      :" + a1.name);
        System.out.println("Salary    :" + a1.salary);
        System.out.println("Allowance :" + a1.allowance);

        a1.id = 401;
        a1.name = "Pranav Nanaware";
        a1.salary = 65000.00;
        a1.allowance = 9000.00;

        System.out.println("======== After Assigning values ========");
        System.out.println("ID        :" + a1.id);
        System.out.println("Name      :" + a1.name);
        System.out.println("Salary    :" + a1.salary);
        System.out.println("Allowance :" + a1.allowance);
    }
}
