class Student
 {
   int frn;
   String StudentName;
   double distanceCovered;
 }//class Student ends here

 
 class Test_Student
  {
    public static void main(String args[])
     {
       Student d1=new Student();//reference
  
      System.out.println("HashCode       :"+d1);
      System.out.println("FRN             :"+d1.frn);
      System.out.println("Name            :"+d1.StudentName);
      System.out.println("Distance Covered:"+d1.distanceCovered);
      
      
     d1.frn=11;
     d1.StudentName="Pranav Nanaware";
     d1.distanceCovered=12.5;
     
      System.out.println("========After Assigning values=======");
      System.out.println("FRN             :"+d1.frn);
      System.out.println("Name            :"+d1.StudentName);
      System.out.println("Distance Covered:"+d1.distanceCovered);
      }
}
