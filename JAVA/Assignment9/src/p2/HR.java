package p2;

public class HR extends p1.Employee
{
    double commission;

    public HR(int id,String name,double salary,double commission)
    {
        super(id,name,salary);
        this.commission=commission;
    }

    public double getCommission()
    {
        return commission;
    }

    public void setCommission(double commission)
    {
        this.commission=commission;
    }

    @Override
    public double CalSal()
    {
        return salary + commission;
    }

    @Override
    public String toString()
    {
        return super.toString()+"\n Commission:"+commission;
    }
}




