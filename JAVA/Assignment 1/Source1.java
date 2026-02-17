class Date
{
  int day,month,year;
  String dow;
}//class Date ends here

class Test_Date
 {
   public static void main(String args[])
    {
      Date d1=new Date(); //reference
      
      System.out.println("HashCode :"+d1);
      System.out.println("Date:"+d1.day);
      System.out.println("Month:"+d1.month);
      System.out.println("Year:"+d1.year);
      System.out.println("Day:"+d1.dow);
      
     d1.day=07;
     d1.month=02;
     d1.year=2026;
     d1.dow="Saturday";
      System.out.println("========After Assigning values=======");
      System.out.println("Date:"+d1.day);
      System.out.println("Month:"+d1.month);
      System.out.println("Year:"+d1.year);
      System.out.println("Day:"+d1.dow);
      

    }
}