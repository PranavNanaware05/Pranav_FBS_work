class PlacedStudent
{
    int frn;
    String studentName;
    double distanceCovered;
    String companyName;
    String designation;
}//class PlacedStudents ends here


class Test_PlacedStudent
{
    public static void main(String args[])
    {
        PlacedStudent p1 = new PlacedStudent();//reference

        System.out.println("HashCode        :" + p1);
        System.out.println("FRN             :" + p1.frn);
        System.out.println("Name            :" + p1.studentName);
        System.out.println("Distance Covered:" + p1.distanceCovered);
        System.out.println("Company Name    :" + p1.companyName);
        System.out.println("Designation     :" + p1.designation);

        p1.frn = 11;
        p1.studentName = "Pranav Nanaware";
        p1.distanceCovered = 12.5;
        p1.companyName = "TCS";
        p1.designation = "Software Engineer";

        System.out.println("======== After Assigning values ========");
        System.out.println("FRN             :" + p1.frn);
        System.out.println("Name            :" + p1.studentName);
        System.out.println("Distance Covered:" + p1.distanceCovered);
        System.out.println("Company Name    :" + p1.companyName);
        System.out.println("Designation     :" + p1.designation);
    }
}
