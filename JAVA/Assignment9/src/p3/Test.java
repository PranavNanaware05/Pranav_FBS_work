package p3;
public class Test {
	public static void main(String args[])
	{
		p1.Employee[] emp=new p1.Employee[3];
		emp[0]=new p2.HR(1, "Rahul", 30000, 5000);
		emp[1] = new p2.Admin(2, "Priya", 25000, 3000);
        emp[2] = new p2.SalesManager(3, "Amit", 40000, 7000, 2000);
        
        for(int i=0;i<emp.length;i++)
        {
        	System.out.println(emp[i]);
        	System.out.println("Total Salary="+emp[i].CalSal());
        	System.out.println();
        }
	}

}
