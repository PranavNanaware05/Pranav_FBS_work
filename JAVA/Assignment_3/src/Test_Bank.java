class Student
{
    int rollNo;
    String name;
    double percentage;
    Student(int roll,String str,double per)
    {
        this.rollNo=roll;
        this.name=str;
        this.percentage=per;
    }
}
class Employee
{
    int id;
    String name;
    double annualSalary;
    Employee(int id,String nm,double salary)
    {
       this.id=id;
       this.name=nm;
       this.annualSalary=salary;
    }
}

class Bank
{
    double loanAmount;

    //  approval for Student
    double approveLoan(Student s)
    {
        if (s.percentage > 80)
            loanAmount = 200000;
        else if (s.percentage >= 60)
            loanAmount = 100000;
        else if (s.percentage >= 40)
            loanAmount = 50000;
        else
            loanAmount = 0;

        return loanAmount;
    }


    double approveLoan(Employee e)
    {
        if (e.annualSalary > 1200000)
            loanAmount = 700000;
        else if (e.annualSalary >= 1000000)
            loanAmount = 600000;
        else if (e.annualSalary >= 600000)
            loanAmount = 500000;
        else if (e.annualSalary >= 400000)
            loanAmount = 400000;
        else
            loanAmount = 0;

        return loanAmount;
    }
}

class Test_Bank
{
    public static void main(String[] args)
    {
        Bank b = new Bank();

        Student s1 = new Student(101, "Rahul", 85.00);
        Employee e1 = new Employee(201, "Amit", 1100000);

        System.out.println("Student Loan Approved: " + b.approveLoan(s1));
        System.out.println("Employee Loan Approved: " + b.approveLoan(e1));
    }
}