class Date
{
  int day,month,year;
  String dow;
}//class Date ends here

class Test_Date
 {
   public static void main(String args[])
    {
      Date d1=new Date();
      
      System.out.println("HashCode :"+d1);
      System.out.println("Day:"+d1.day);
      System.out.println("Day:"+d1.month);
      System.out.println("Day:"+d1.year);
      System.out.println("Day:"+d1.dow);
    }
}