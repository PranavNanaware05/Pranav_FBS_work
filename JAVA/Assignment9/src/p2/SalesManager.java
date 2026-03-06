package p2;


public class SalesManager extends p1.Employee
{
    private double incentive;
    private double target;

    public SalesManager(int id, String name, double salary, double incentive, double target)
    {
        super(id, name, salary);
        this.incentive = incentive;
        this.target = target;
    }

    public double getIncentive()
    {
        return incentive;
    }

    public void setIncentive(double incentive)
    {
        this.incentive = incentive;
    }

    public double getTarget()
    {
        return target;
    }

    public void setTarget(double target)
    {
        this.target = target;
    }

    @Override
    public double CalSal()
    {
        return salary + incentive + target;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n incentive=" + incentive + "\n target=" + target;
    }
}