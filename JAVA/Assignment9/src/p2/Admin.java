package p2;

public class Admin extends p1.Employee
{
    private double allowance;

    public Admin(int id, String name, double salary, double allowance)
    {
        super(id, name, salary);
        this.allowance = allowance;
    }

    public double getAllowance()
    {
        return allowance;
    }

    public void setAllowance(double allowance)
    {
        this.allowance = allowance;
    }

    @Override
    public double CalSal()
    {
        return salary + allowance;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n allowance=" + allowance;
    }
}