#include<stdio.h>

struct student{
	int roll;
	char name[20];
	int mk;
};
void main()
{
	struct student s1,s2,s3;
	s1.roll=10;
	strcpy(s1.name,"pranav");
	s1.mk=51;
	
	s2.roll=11;
	strcpy(s2.name,"Ram");
	s2.mk=41;
	
	s3.roll=12;
	strcpy(s3.name,"Sham");
	s3.mk=76;
   
   printf("\n Student 1");
   printf("\nroll=%d",s1.roll);
   printf("\nname=%s",s1.name);
   printf("\nmarks=%d",s1.mk);
   
   printf("\n Student 2");
   printf("\nroll=%d",s2.roll);
   printf("\nname=%s",s2.name);
   printf("\nmarks=%d",s2.mk);
   
   printf("\n Student 3");
   printf("\nroll=%d",s3.roll);
   printf("\nname=%s",s3.name);
   printf("\nmarks=%d",s3.mk);
}