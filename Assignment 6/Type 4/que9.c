#include<stdio.h>
int sumfl(int);
void main()
{
	int n;
	printf("Enter number=");
	scanf("%d",&n);
	
	 printf("\n sum of first and last digit is=%d",sumfl(n));
}//end of main()

int sumfl(int n)
{
	int rem,sum=0;
	int last,first;
	last=n%10;
	 
	 while(n>=10)
	 {
	 	n=n/10;
	 
	 }
	 printf("\n last=%d",last);
	 printf("\n first=%d",n);
	 sum=last+n;
	return sum;
	 
}//end of sumfl()