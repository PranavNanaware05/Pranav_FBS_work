class Employee
{
    int id;
    String name;
    double salary;
}//class Employee ends here


class Test_Employee
{
    public static void main(String args[])
    {
        Employee e1 = new Employee();//reference

        System.out.println("HashCode :" + e1);
        System.out.println("ID       :" + e1.id);
        System.out.println("Name     :" + e1.name);
        System.out.println("Salary   :" + e1.salary);

        e1.id = 101;
        e1.name = "Pranav Nanaware";
        e1.salary = 55000.50;

        System.out.println("======== After Assigning values ========");
        System.out.println("ID       :" + e1.id);
        System.out.println("Name     :" + e1.name);
        System.out.println("Salary   :" + e1.salary);
    }
}
