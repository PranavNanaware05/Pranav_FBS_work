package Assignment_4.com;
class LibraryUser
{
	String u_name;
	int daysLate;
	static double finePerDay=10;
	double totalfine;
	
	LibraryUser(String u_name,int daysLate)
	{
		this.u_name=u_name;
		this.daysLate=daysLate;
		
	}
	 double total_fine()
	 {
		 
		 return totalfine=daysLate*finePerDay;
	 }
	 
	 void display()
	 {
		 System.out.println("User Name                               :"+this.u_name);
		 System.out.println("Number of days the book is returned late:"+this.daysLate+" Days");
		 System.out.println("Fine charged per day                    :"+LibraryUser.finePerDay+" Rupees");
		 System.out.println("Total Fine                              :"+this.totalfine+" Rupees");
		 System.out.println();
	 }
	  
}
public class Test_LibraryUser {
	public static void main(String args[])
	{
		LibraryUser l1=new LibraryUser("pranav", 10);
		LibraryUser l2=new LibraryUser("Rahul", 4);
		l1.total_fine();
		l2.total_fine();
		l1.display();
		l2.display();
	}

}
